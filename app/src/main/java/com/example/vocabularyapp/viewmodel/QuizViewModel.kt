package com.example.vocabularyapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.vocabularyapp.model.Quiz
import com.example.vocabularyapp.model.QuizGenerator
import com.example.vocabularyapp.repository.VocabularyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuizViewModel @Inject constructor(
    private val repository: VocabularyRepository
) : ViewModel() {
    private val quizGenerator = QuizGenerator(repository)

    private val _quizList = MutableStateFlow<List<Quiz>>(emptyList())
    val quizList = _quizList.asStateFlow()

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> get() = _isLoading.asStateFlow()

    fun loadQuizzes(levels: List<String>, count: Int) {
        viewModelScope.launch {
            _isLoading.value = true
            val quizzes = List(count) { quizGenerator.generateQuiz(levels) }
            _quizList.value = quizzes
            _isLoading.value = false
        }
    }
}