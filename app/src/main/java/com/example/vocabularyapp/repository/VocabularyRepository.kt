package com.example.vocabularyapp.repository

import com.example.vocabularyapp.data.MeaningEntity
import com.example.vocabularyapp.data.VocabularyDao
import com.example.vocabularyapp.data.WordEntity
import javax.inject.Inject

class VocabularyRepository @Inject constructor(
    private val vocabularyDao: VocabularyDao
) {

    // 指定されたレベルからランダムな単語を取得
    suspend fun getQuizWord(
        levels: List<String>?
    ): WordEntity {
        return if (!levels.isNullOrEmpty()) {
            vocabularyDao.getRandomWordWithLevel(levels)
        } else {
            vocabularyDao.getRandomWord()
        }
    }


    // 指定した単語の意味をすべて取得
    suspend fun getCorrectMeanings(
        wordId: Int
    ): List<MeaningEntity> {
        return vocabularyDao.getCorrectMeanings(wordId)
    }


    // 指定されたレベルの単語をすべて取得
    suspend fun getWordsByLevels(
        levels: List<String>
    ): List<WordEntity> {
        return vocabularyDao.getWordsByLevels(levels)
    }

    suspend fun getSafeDummyWords(
        levels: List<String>,
        excludeWordId: Int,
        correctMeaningIds: List<Int>,
        limit: Int
    ): List<WordEntity> {
        return vocabularyDao.getSafeDummyWords(
            levels = levels,
            excludeWordId = excludeWordId,
            correctMeaningIds = correctMeaningIds,
            limit = limit
        )
    }
}