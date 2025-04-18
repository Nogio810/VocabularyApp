package com.example.vocabularyapp.model

import com.example.vocabularyapp.data.Word
import com.example.vocabularyapp.repository.VocabularyRepository

class QuizGenerator(private val repository: VocabularyRepository) {

    suspend fun generateQuiz(levels: List<String>?): Quiz {
        val correctWord = repository.getQuizWord(levels)
        val choices = generateChoices(correctWord, levels)
        return Quiz(question = correctWord.word, choices = choices)
    }

    private suspend fun generateChoices(correctWord: Word, levels: List<String>?): List<Choice> {
        val otherTranslations = repository.getOtherChoices(levels, correctWord.id)
        val choiceTranslations = buildList {
            otherTranslations.mapTo(this) {
                Choice(
                    questionText = arrangeChoices(it),
                    isCorrect = false
                )
            }
            add(Choice(questionText = arrangeChoices(correctWord), isCorrect = true))
        }
        return choiceTranslations.shuffled()
    }

    private fun arrangeChoices(word: Word): String {
        val translations = listOfNotNull(
            word.noun1, word.noun2, word.noun3, word.noun4, word.noun5,
            word.verb1, word.verb2, word.verb3, word.verb4, word.verb5, word.verb6,
            word.adj1, word.adj2, word.adj3, word.adj4, word.adj5, word.adj6,
            word.adv1, word.adv2, word.adv3, word.adv4,
            word.prep1, word.prep2,
            word.conj1, word.conj2,
            word.idiom1, word.idiom2
        )
        return translations.joinToString(separator = ", ")
    }
}