package com.example.vocabularyapp.data

import androidx.room.Dao
import androidx.room.Query


@Dao
interface VocabularyDao {
    @Query("SELECT * FROM vocabulary ORDER BY RANDOM() LIMIT 1")
    suspend fun getRandomWord(): Word

    @Query("SELECT * FROM vocabulary WHERE id != :excludeWordId ORDER BY RANDOM() LIMIT 3")
    suspend fun getOtherTranslations(excludeWordId: Int): List<Word>
}