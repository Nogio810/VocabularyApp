package com.example.vocabularyapp.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class SettingViewModel @Inject constructor() : ViewModel() {
    private val _selectedLevels = MutableStateFlow<List<String>>(emptyList())
    val selectedLevels = _selectedLevels.asStateFlow()

    private val _questionCount = MutableStateFlow<Int>(10)
    val questionCount = _questionCount.asStateFlow()

    private val _timeLimit = MutableStateFlow<Int>(10)
    val timeLimit = _timeLimit.asStateFlow()

    private val _isEnglishToJapanese = MutableStateFlow<Boolean>(true)
    val isEnglishToJapanese = _isEnglishToJapanese.asStateFlow()

    fun toggleLevel(level: String) {
        _selectedLevels.value = _selectedLevels.value.toMutableList().apply {
            if (contains(level)) remove(level) else add(level)
        }
    }

    fun setQuestionCount(count: Int) {
        _questionCount.value = count
    }

    fun setTimeLimit(seconds: Int) {
        _timeLimit.value = seconds
    }

    fun setMode(isEnglishToJapanese: Boolean) {
        _isEnglishToJapanese.value = isEnglishToJapanese
    }
}