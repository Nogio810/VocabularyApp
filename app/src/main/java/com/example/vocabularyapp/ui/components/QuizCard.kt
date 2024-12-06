package com.example.vocabularyapp.ui.components

import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign

@Composable
fun QuizCard(
    englishWord: String = englishWord
){
    Text(
        text = englishWord,
        color = colorScheme.onSurface,
        textAlign = TextAlign.Center
    )
}