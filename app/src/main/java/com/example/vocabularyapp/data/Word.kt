package com.example.vocabularyapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "vocabulary")
data class Word(
    @PrimaryKey @ColumnInfo(name = "単語番号") val id: Int,       // 単語番号（PK）
    @ColumnInfo(name = "レベル") val level: String,               // レベル (TEXT)
    @ColumnInfo(name = "単語") val word: String,                  // 英単語
    @ColumnInfo(name = "名詞1") val noun1: String?,               // 名詞1
    @ColumnInfo(name = "名詞2") val noun2: String?,               // 名詞2
    @ColumnInfo(name = "名詞3") val noun3: String?,               // 名詞3
    @ColumnInfo(name = "名詞4") val noun4: String?,               // 名詞4
    @ColumnInfo(name = "名詞5") val noun5: String?,               // 名詞5
    @ColumnInfo(name = "動詞1") val verb1: String?,               // 動詞1
    @ColumnInfo(name = "動詞2") val verb2: String?,               // 動詞2
    @ColumnInfo(name = "動詞3") val verb3: String?,               // 動詞3
    @ColumnInfo(name = "動詞4") val verb4: String?,               // 動詞4
    @ColumnInfo(name = "動詞5") val verb5: String?,               // 動詞5
    @ColumnInfo(name = "動詞6") val verb6: String?,               // 動詞6
    @ColumnInfo(name = "形容詞1") val adj1: String?,              // 形容詞1
    @ColumnInfo(name = "形容詞2") val adj2: String?,              // 形容詞2
    @ColumnInfo(name = "形容詞3") val adj3: String?,              // 形容詞3
    @ColumnInfo(name = "形容詞4") val adj4: String?,              // 形容詞4
    @ColumnInfo(name = "形容詞5") val adj5: String?,              // 形容詞5
    @ColumnInfo(name = "形容詞6") val adj6: String?,              // 形容詞6
    @ColumnInfo(name = "副詞1") val adv1: String?,                // 副詞1
    @ColumnInfo(name = "副詞2") val adv2: String?,                // 副詞2
    @ColumnInfo(name = "副詞3") val adv3: String?,                // 副詞3
    @ColumnInfo(name = "副詞4") val adv4: String?,                // 副詞4
    @ColumnInfo(name = "前置詞1") val prep1: String?,              // 前置詞1
    @ColumnInfo(name = "前置詞2") val prep2: String?,              // 前置詞2
    @ColumnInfo(name = "接続詞1") val conj1: String?,              // 接続詞1
    @ColumnInfo(name = "接続詞2") val conj2: String?,              // 接続詞2
    @ColumnInfo(name = "熟語1") val idiom1: String?,               // 熟語1
    @ColumnInfo(name = "熟語2") val idiom2: String?                // 熟語2
)