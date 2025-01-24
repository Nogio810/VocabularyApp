package com.example.vocabularyapp.di

import com.example.vocabularyapp.data.VocabularyDao
import com.example.vocabularyapp.repository.VocabularyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule{
    @Provides
    fun provideVocabularyRepository(
        dao: VocabularyDao
    ): VocabularyRepository{
        return VocabularyRepository(dao)
    }
}