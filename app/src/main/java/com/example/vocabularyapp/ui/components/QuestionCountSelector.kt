package com.example.vocabularyapp.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import kotlin.math.roundToInt

@Composable
fun QuestionCountSelector(
    questionCount: Int,
    onCountChange: (Int) -> Unit
) {
    Text("問題数を選択してください", style = MaterialTheme.typography.titleMedium)

    Slider(
        value = (questionCount / 10).toFloat(),
        onValueChange = {
            val rounded = (it).roundToInt() * 10
            onCountChange(rounded)
        },
        valueRange = 1f..50f,
        steps = 49
    )

    Text("問題数: $questionCount")
}