package com.example.vocabularyapp.data

import androidx.room.Dao
import androidx.room.Query

@Dao
interface VocabularyDao {

    // 指定されたレベルからランダムに1単語取得
    @Query("""
        SELECT *
        FROM words
        WHERE level IN (:levels)
        ORDER BY RANDOM()
        LIMIT 1
    """)
    suspend fun getRandomWordWithLevel(
        levels: List<String>
    ): WordEntity


    // レベル指定なしでランダムに1単語取得
    @Query("""
        SELECT *
        FROM words
        ORDER BY RANDOM()
        LIMIT 1
    """)
    suspend fun getRandomWord(): WordEntity


    // 指定した単語が持つ意味をすべて取得
    @Query("""
        SELECT m.*
        FROM meanings m
        INNER JOIN word_meanings wm
            ON m.meaning_id = wm.meaning_id
        WHERE wm.word_id = :wordId
    """)
    suspend fun getCorrectMeanings(
        wordId: Int
    ): List<MeaningEntity>


    // 指定したレベルの単語をすべて取得
    @Query("""
        SELECT *
        FROM words
        WHERE level IN (:levels)
    """)
    suspend fun getWordsByLevels(
        levels: List<String>
    ): List<WordEntity>

    @Query("""
        SELECT w.*
        FROM words w
        WHERE w.level IN (:levels)
          AND w.word_id != :excludeWordId
          AND NOT EXISTS (
              SELECT 1
              FROM word_meanings wm
              WHERE wm.word_id = w.word_id
                AND wm.meaning_id IN (:correctMeaningIds)
          )
        ORDER BY RANDOM()
        LIMIT :limit
    """)
    suspend fun getSafeDummyWords(
        levels: List<String>,
        excludeWordId: Int,
        correctMeaningIds: List<Int>,
        limit: Int
    ): List<WordEntity>
}