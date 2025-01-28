package com.example.vocabularyapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "vocabulary1")
data class Word(
    @PrimaryKey @ColumnInfo(name = "単語番号") val id: Int,          // 単語番号（PK）
    @ColumnInfo(name = "レベル") val level: Int,                    // レベル
    @ColumnInfo(name = "単語") val word: String,                   // 英単語
    @ColumnInfo(name = "名詞1") val noun1: String?,                // 名詞1
    @ColumnInfo(name = "名詞2") val noun2: String?,                // 名詞2
    @ColumnInfo(name = "名詞3") val noun3: String?,                // 名詞3
    @ColumnInfo(name = "名詞4") val noun4: String?,                // 名詞4
    @ColumnInfo(name = "動詞1") val verb1: String?,                // 動詞1
    @ColumnInfo(name = "動詞2") val verb2: String?,                // 動詞2
    @ColumnInfo(name = "動詞3") val verb3: String?,                // 動詞3
    @ColumnInfo(name = "形容詞1") val adj1: String?,                // 形容詞1
    @ColumnInfo(name = "形容詞2") val adj2: String?,                // 形容詞2
    @ColumnInfo(name = "形容詞3") val adj3: String?,                // 形容詞3
    @ColumnInfo(name = "形容詞4") val adj4: String?,                // 形容詞4
    @ColumnInfo(name = "副詞1") val adv1: String?,                 // 副詞1
    @ColumnInfo(name = "副詞2") val adv2: String?,                 // 副詞2
    @ColumnInfo(name = "前置詞1") val prep1: String?,               // 前置詞1
    @ColumnInfo(name = "前置詞2") val prep2: String?,               // 前置詞2
    @ColumnInfo(name = "接続詞") val conj: String?                  // 接続詞
)