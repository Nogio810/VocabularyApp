package com.example.vocabularyapp.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class LevelSelectionViewModel @Inject constructor() : ViewModel() {
    private val _selectedLevels = MutableStateFlow<List<String>>(emptyList())
    val selectedLevels = _selectedLevels.asStateFlow()

    fun toggleLevel(level: String){
        _selectedLevels.value = _selectedLevels.value.toMutableList().apply {
            if(contains(level)) remove(level) else add(level)
        }
    }
}