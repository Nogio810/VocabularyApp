package com.example.vocabularyapp.model

data class Quiz(
    val wordId: Int,
    val question: String,
    val choices: List<Choice>
)
