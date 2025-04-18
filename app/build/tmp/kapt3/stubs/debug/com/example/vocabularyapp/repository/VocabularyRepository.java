package com.example.vocabularyapp.repository;

import com.example.vocabularyapp.data.VocabularyDao;
import com.example.vocabularyapp.data.Word;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006H\u0086@\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/vocabularyapp/repository/VocabularyRepository;", "", "vocabularyDao", "Lcom/example/vocabularyapp/data/VocabularyDao;", "(Lcom/example/vocabularyapp/data/VocabularyDao;)V", "getOtherChoices", "", "Lcom/example/vocabularyapp/data/Word;", "levels", "", "excludeWordId", "", "(Ljava/util/List;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuizWord", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class VocabularyRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.vocabularyapp.data.VocabularyDao vocabularyDao = null;
    
    public VocabularyRepository(@org.jetbrains.annotations.NotNull()
    com.example.vocabularyapp.data.VocabularyDao vocabularyDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getQuizWord(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> levels, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.vocabularyapp.data.Word> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOtherChoices(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> levels, int excludeWordId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.vocabularyapp.data.Word>> $completion) {
        return null;
    }
}