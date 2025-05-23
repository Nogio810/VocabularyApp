package com.example.vocabularyapp.viewmodel;

import androidx.lifecycle.ViewModel;
import com.example.vocabularyapp.model.Quiz;
import com.example.vocabularyapp.model.QuizGenerator;
import com.example.vocabularyapp.repository.VocabularyRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\u0016\u001a\u00020\u0017R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/vocabularyapp/viewmodel/QuizViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/vocabularyapp/repository/VocabularyRepository;", "(Lcom/example/vocabularyapp/repository/VocabularyRepository;)V", "_isLoading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_quizList", "", "Lcom/example/vocabularyapp/model/Quiz;", "isLoading", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "quizGenerator", "Lcom/example/vocabularyapp/model/QuizGenerator;", "quizList", "getQuizList", "loadQuizzes", "", "levels", "", "count", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class QuizViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.vocabularyapp.repository.VocabularyRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.vocabularyapp.model.QuizGenerator quizGenerator = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.vocabularyapp.model.Quiz>> _quizList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.vocabularyapp.model.Quiz>> quizList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isLoading = null;
    
    @javax.inject.Inject()
    public QuizViewModel(@org.jetbrains.annotations.NotNull()
    com.example.vocabularyapp.repository.VocabularyRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.vocabularyapp.model.Quiz>> getQuizList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void loadQuizzes(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> levels, int count) {
    }
}