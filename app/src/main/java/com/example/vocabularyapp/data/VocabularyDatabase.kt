package com.example.vocabularyapp.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [
        WordEntity::class,
        MeaningEntity::class,
        WordMeaningCrossRef::class,
        WordAudioEntity::class
    ],
    version = 1,
    exportSchema = true
)
abstract class VocabularyDatabase : RoomDatabase() {

    abstract fun vocabularyDao(): VocabularyDao

    companion object {

        @Volatile
        private var INSTANCE: VocabularyDatabase? = null

        fun getDatabase(
            context: Context
        ): VocabularyDatabase {

            return INSTANCE ?: synchronized(this) {

                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    VocabularyDatabase::class.java,
                    "vocabulary.db"
                )
                    .createFromAsset("vocabulary.db")
                    .build()

                INSTANCE = instance

                instance
            }
        }
    }
}