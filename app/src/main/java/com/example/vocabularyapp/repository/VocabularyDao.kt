package com.example.vocabularyapp.repository

import androidx.room.Dao
import androidx.room.Query


@Dao
interface VocabularyDao {
    @Query("SELECT * FROM ORDER BY RANDOM() LIMIT 1")

}