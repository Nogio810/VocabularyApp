package com.example.vocabularyapp.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Word :: class], version = 1)
abstract class VocabularyDatabase : RoomDatabase(){
    abstract fun vocabularyDao(): VocabularyDao

    companion object{
        @Volatile
        private var INSTANCE: VocabularyDatabase? = null

        fun getDatabase(context: Context): VocabularyDatabase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    VocabularyDatabase::class.java,
                    "kinfure.db"
                )
                    .createFromAsset("kinfure.db")
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}