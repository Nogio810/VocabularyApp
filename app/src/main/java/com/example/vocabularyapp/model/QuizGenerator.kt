package com.example.vocabularyapp.model

import com.example.vocabularyapp.data.WordEntity
import com.example.vocabularyapp.repository.VocabularyRepository

class QuizGenerator(
    private val repository: VocabularyRepository
) {

    suspend fun generateQuiz(
        word: WordEntity,
        isEnglishToJapanese: Boolean,
        availableWords: List<WordEntity>
    ): Quiz {

        val correctMeanings =
            repository.getCorrectMeanings(word.wordId)

        val correctMeaningText =
            correctMeanings.joinToString(" / ") {
                it.meaning
            }

        val choices = mutableListOf<Choice>()

        // ========================================
        // 英語 → 日本語
        // ========================================
        if (isEnglishToJapanese) {

            val usedChoiceTexts = mutableSetOf<String>()

            usedChoiceTexts.add(correctMeaningText)

            choices.add(
                Choice(
                    questionText = correctMeaningText,
                    isCorrect = true
                )
            )

            while (choices.size < 4) {

                val randomWord = availableWords.random()

                // 正解と同じ単語ならやり直し
                if (randomWord.wordId == word.wordId) {
                    continue
                }

                val dummyMeanings =
                    repository.getCorrectMeanings(
                        randomWord.wordId
                    )

                val dummyText =
                    dummyMeanings.joinToString(" / ") {
                        it.meaning
                    }

                // 意味が存在し、同じ選択肢でなければ採用
                if (
                    dummyText.isNotEmpty() &&
                    usedChoiceTexts.add(dummyText)
                ) {
                    choices.add(
                        Choice(
                            questionText = dummyText,
                            isCorrect = false
                        )
                    )
                }
            }

            return Quiz(
                wordId = word.wordId,
                question = word.word,
                choices = choices.shuffled()
            )
        }

        // ========================================
        // 日本語 → 英語
        // ========================================

        choices.add(
            Choice(
                questionText = word.word,
                isCorrect = true
            )
        )

        // 正解単語に紐づく意味IDを取得
        val correctMeaningIds =
            correctMeanings.map {
                it.meaningId
            }

        // SQL側で意味が重複しないダミー単語を取得
        val safeDummyWords =
            repository.getSafeDummyWords(
                levels = availableWords
                    .map { it.level }
                    .distinct(),

                excludeWordId = word.wordId,

                correctMeaningIds = correctMeaningIds,

                limit = 3
            )

        // 同じ英単語が重複しないように管理
        val usedChoiceTexts =
            mutableSetOf(word.word)

        for (dummyWord in safeDummyWords) {

            if (usedChoiceTexts.add(dummyWord.word)) {
                choices.add(
                    Choice(
                        questionText = dummyWord.word,
                        isCorrect = false
                    )
                )
            }

            if (choices.size == 4) {
                break
            }
        }

        return Quiz(
            wordId = word.wordId,
            question = correctMeaningText,
            choices = choices.shuffled()
        )
    }
}