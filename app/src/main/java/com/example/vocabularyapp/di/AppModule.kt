package com.example.vocabularyapp.di

import android.content.Context
import androidx.room.Room
import com.example.vocabularyapp.data.VocabularyDao
import com.example.vocabularyapp.data.VocabularyDatabase
import com.example.vocabularyapp.repository.VocabularyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule{
    @Provides
    @Singleton
    fun provideVocabularyDatabase(
        @ApplicationContext context: Context
    ): VocabularyDatabase {
        return Room.databaseBuilder(
            context,
            VocabularyDatabase::class.java,
            "vocabulary.db"
        ).createFromAsset("vocabulary.db").build()
    }

    @Provides
    @Singleton
    fun provideVocabularyDao(database: VocabularyDatabase): VocabularyDao {
        return database.vocabularyDao()
    }

    @Provides
    @Singleton
    fun provideVocabularyRepository(
        dao: VocabularyDao
    ): VocabularyRepository{
        return VocabularyRepository(dao)
    }
}