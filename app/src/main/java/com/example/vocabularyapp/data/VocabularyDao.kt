package com.example.vocabularyapp.data

import androidx.room.Dao
import androidx.room.Query


@Dao
interface VocabularyDao {
    // レベル指定あり
    @Query("SELECT * FROM vocabulary WHERE レベル IN(:levels) ORDER BY RANDOM() LIMIT 1")
    suspend fun getRandomWordWithLevel(levels: List<String>): Word

    // レベル指定なし（従来のクエリ）
    @Query("SELECT * FROM vocabulary ORDER BY RANDOM() LIMIT 1")
    suspend fun getRandomWord(): Word

    // 他の選択肢を取得（レベル指定あり）
    @Query("SELECT * FROM vocabulary WHERE レベル IN(:levels) AND 単語番号 != :excludeWordId ORDER BY RANDOM() LIMIT 3")
    suspend fun getOtherTranslationsWithLevel(levels: List<String>, excludeWordId: Int): List<Word>

    // 他の選択肢を取得（レベル指定なし）
    @Query("SELECT * FROM vocabulary WHERE 単語番号 != :excludeWordId ORDER BY RANDOM() LIMIT 3")
    suspend fun getOtherTranslations(excludeWordId: Int): List<Word>
}