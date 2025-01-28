package com.example.vocabularyapp.di;

import android.content.Context;
import androidx.room.Room;
import com.example.vocabularyapp.data.VocabularyDao;
import com.example.vocabularyapp.data.VocabularyDatabase;
import com.example.vocabularyapp.repository.VocabularyRepository;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0007\u00a8\u0006\r"}, d2 = {"Lcom/example/vocabularyapp/di/AppModule;", "", "()V", "provideVocabularyDao", "Lcom/example/vocabularyapp/data/VocabularyDao;", "database", "Lcom/example/vocabularyapp/data/VocabularyDatabase;", "provideVocabularyDatabase", "context", "Landroid/content/Context;", "provideVocabularyRepository", "Lcom/example/vocabularyapp/repository/VocabularyRepository;", "dao", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.vocabularyapp.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.vocabularyapp.data.VocabularyDatabase provideVocabularyDatabase(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.vocabularyapp.data.VocabularyDao provideVocabularyDao(@org.jetbrains.annotations.NotNull()
    com.example.vocabularyapp.data.VocabularyDatabase database) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.vocabularyapp.repository.VocabularyRepository provideVocabularyRepository(@org.jetbrains.annotations.NotNull()
    com.example.vocabularyapp.data.VocabularyDao dao) {
        return null;
    }
}