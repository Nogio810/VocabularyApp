package com.example.vocabularyapp.data;

import androidx.room.Dao;
import androidx.room.Query;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/example/vocabularyapp/data/VocabularyDao;", "", "getOtherTranslations", "", "Lcom/example/vocabularyapp/data/Word;", "excludeWordId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRandomWord", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface VocabularyDao {
    
    @androidx.room.Query(value = "SELECT * FROM vocabulary1 ORDER BY RANDOM() LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRandomWord(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.vocabularyapp.data.Word> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM vocabulary1 WHERE \u5358\u8a9e\u756a\u53f7 != :excludeWordId ORDER BY RANDOM() LIMIT 3")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getOtherTranslations(int excludeWordId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.vocabularyapp.data.Word>> $completion);
}