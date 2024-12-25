package com.example.vocabularyapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "vocabulary")
data class Word(
    @PrimaryKey val id: Int,          // 単語番号（PK）
    val level: Int,                   // レベル
    val word: String,                 // 英単語
    val noun1: String?,               // 名詞1
    val noun2: String?,               // 名詞2
    val noun3: String?,               // 名詞3
    val noun4: String?,               // 名詞4
    val verb1: String?,               // 動詞1
    val verb2: String?,               // 動詞2
    val verb3: String?,               // 動詞3
    val adj1: String?,                // 形容詞1
    val adj2: String?,                // 形容詞2
    val adj3: String?,                // 形容詞3
    val adj4: String?,                // 形容詞4
    val adv1: String?,                // 副詞1
    val adv2: String?,                // 副詞2
    val prep1: String?,               // 前置詞1
    val prep2: String?,               // 前置詞2
    val conj: String?                 // 接続詞
)
