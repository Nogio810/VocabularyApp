package com.example.vocabularyapp.model

data class Choice(
    val questionText: String,
    val isCorrect: Boolean,
    val isFalse: Boolean
)