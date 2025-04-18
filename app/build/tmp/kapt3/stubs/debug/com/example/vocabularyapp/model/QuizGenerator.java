package com.example.vocabularyapp.model;

import com.example.vocabularyapp.data.Word;
import com.example.vocabularyapp.repository.VocabularyRepository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0082@\u00a2\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\u00102\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0086@\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/vocabularyapp/model/QuizGenerator;", "", "repository", "Lcom/example/vocabularyapp/repository/VocabularyRepository;", "(Lcom/example/vocabularyapp/repository/VocabularyRepository;)V", "arrangeChoices", "", "word", "Lcom/example/vocabularyapp/data/Word;", "generateChoices", "", "Lcom/example/vocabularyapp/model/Choice;", "correctWord", "levels", "(Lcom/example/vocabularyapp/data/Word;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateQuiz", "Lcom/example/vocabularyapp/model/Quiz;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class QuizGenerator {
    @org.jetbrains.annotations.NotNull()
    private final com.example.vocabularyapp.repository.VocabularyRepository repository = null;
    
    public QuizGenerator(@org.jetbrains.annotations.NotNull()
    com.example.vocabularyapp.repository.VocabularyRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object generateQuiz(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> levels, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.vocabularyapp.model.Quiz> $completion) {
        return null;
    }
    
    private final java.lang.Object generateChoices(com.example.vocabularyapp.data.Word correctWord, java.util.List<java.lang.String> levels, kotlin.coroutines.Continuation<? super java.util.List<com.example.vocabularyapp.model.Choice>> $completion) {
        return null;
    }
    
    private final java.lang.String arrangeChoices(com.example.vocabularyapp.data.Word word) {
        return null;
    }
}