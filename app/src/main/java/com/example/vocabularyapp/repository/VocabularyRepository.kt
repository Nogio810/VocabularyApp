package com.example.vocabularyapp.repository

import com.example.vocabularyapp.data.VocabularyDao
import com.example.vocabularyapp.data.Word
import com.example.vocabularyapp.model.Choice
import com.example.vocabularyapp.model.Quiz

class VocabularyRepository(private val vocabularyDao: VocabularyDao){
    suspend fun getQuizWord(): Word{
        return vocabularyDao.getRandomWord()
    }

    suspend fun generateChoices(correctWord: Word): List<Choice>{
        val otherTranslations = vocabularyDao.getOtherTranslations(correctWord.id)
        val choiceTranslations = buildList {
            otherTranslations.mapTo(this){ Choice(questionText = arrangeChoices(it), isCorrect = false, isFalse = false, isClicked = false)}
            add(Choice(questionText = arrangeChoices(correctWord), isCorrect = true, isFalse = false, isClicked = false))
        }
        return choiceTranslations.shuffled()
    }

    private fun arrangeChoices(word: Word): String{
        val translations = listOfNotNull(
            word.noun1, word.noun2, word.noun3, word.noun4,
            word.verb1, word.verb2, word.verb3,
            word.adj1, word.adj2, word.adj3, word.adj4,
            word.adv1, word.adv2,
            word.prep1, word.prep2,
            word.conj
        )
        val stringTranslations = translations.joinToString(separator = ", ")
        return stringTranslations
    }

    suspend fun generateQuiz(): Quiz{
        val correctWord = getQuizWord()
        val choices = generateChoices(correctWord = correctWord)

        return Quiz(question = correctWord.word, choices = choices)
    }
}