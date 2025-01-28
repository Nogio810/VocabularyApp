package com.example.vocabularyapp.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.vocabularyapp.model.Quiz;
import com.example.vocabularyapp.repository.VocabularyRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/vocabularyapp/viewmodel/QuizViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/vocabularyapp/repository/VocabularyRepository;", "(Lcom/example/vocabularyapp/repository/VocabularyRepository;)V", "_quizList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/vocabularyapp/model/Quiz;", "quizList", "Landroidx/lifecycle/LiveData;", "getQuizList", "()Landroidx/lifecycle/LiveData;", "loadQuizzes", "", "count", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class QuizViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.vocabularyapp.repository.VocabularyRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.vocabularyapp.model.Quiz>> _quizList = null;
    
    @javax.inject.Inject()
    public QuizViewModel(@org.jetbrains.annotations.NotNull()
    com.example.vocabularyapp.repository.VocabularyRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.vocabularyapp.model.Quiz>> getQuizList() {
        return null;
    }
    
    private final void loadQuizzes(int count) {
    }
}