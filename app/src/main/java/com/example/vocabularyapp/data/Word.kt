package com.example.vocabularyapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey


// 単語テーブル
@Entity(tableName = "words")
data class WordEntity(
    @PrimaryKey
    @ColumnInfo(name = "word_id")
    val wordId: Int,

    @ColumnInfo(name = "level")
    val level: String,

    @ColumnInfo(name = "word")
    val word: String
)


// 意味テーブル
@Entity(
    tableName = "meanings"
)
data class MeaningEntity(
    @PrimaryKey
    @ColumnInfo(name = "meaning_id")
    val meaningId: Int,

    @ColumnInfo(name = "meaning")
    val meaning: String,

    @ColumnInfo(name = "category")
    val category: String
)


// 単語と意味の中間テーブル
@Entity(
    tableName = "word_meanings",
    primaryKeys = ["word_id", "meaning_id"],
    foreignKeys = [
        ForeignKey(
            entity = WordEntity::class,
            parentColumns = ["word_id"],
            childColumns = ["word_id"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = MeaningEntity::class,
            parentColumns = ["meaning_id"],
            childColumns = ["meaning_id"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class WordMeaningCrossRef(
    @ColumnInfo(name = "word_id")
    val wordId: Int,

    @ColumnInfo(name = "meaning_id")
    val meaningId: Int
)


// 音声テーブル
@Entity(
    tableName = "word_audio",
    foreignKeys = [
        ForeignKey(
            entity = WordEntity::class,
            parentColumns = ["word_id"],
            childColumns = ["id"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class WordAudioEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int,

    @ColumnInfo(name = "type")
    val type: String,

    @ColumnInfo(name = "path")
    val path: String
)