package com.example.vocabularyapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.vocabularyapp.model.Quiz
import com.example.vocabularyapp.repository.VocabularyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuizViewModel @Inject constructor(
    private val repository: VocabularyRepository
) : ViewModel(){
    private val _quizList = MutableLiveData<List<Quiz>>()
    val quizList: LiveData<List<Quiz>> get() = _quizList

    init {
        loadQuizzes(10)
    }

    private fun loadQuizzes(count: Int){
        viewModelScope.launch {
            val quizzes = List(count){repository.generateQuiz()}
            _quizList.value = quizzes
        }
    }
}