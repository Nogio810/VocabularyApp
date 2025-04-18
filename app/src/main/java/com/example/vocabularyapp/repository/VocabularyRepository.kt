package com.example.vocabularyapp.repository

import com.example.vocabularyapp.data.VocabularyDao
import com.example.vocabularyapp.data.Word

class VocabularyRepository(private val vocabularyDao: VocabularyDao) {

    suspend fun getQuizWord(levels: List<String>?): Word {
        return if (!levels.isNullOrEmpty()) {
            vocabularyDao.getRandomWordWithLevel(levels)
        } else {
            vocabularyDao.getRandomWord()
        }
    }

    suspend fun getOtherChoices(levels: List<String>?, excludeWordId: Int): List<Word> {
        return if (!levels.isNullOrEmpty()) {
            vocabularyDao.getOtherTranslationsWithLevel(levels, excludeWordId)
        } else {
            vocabularyDao.getOtherTranslations(excludeWordId)
        }
    }
}
