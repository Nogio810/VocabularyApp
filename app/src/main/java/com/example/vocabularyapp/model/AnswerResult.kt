package com.example.vocabularyapp.model

data class AnswerResult(
    val word: String,             // お題の単語
    val correctMeaning: String,   // 正解の意味
    val userAnswer: String,       // 👈 追加：ユーザーが実際に選んだ選択肢のテキスト
    val isCorrect: Boolean,
    val isSkipped: Boolean = false
)