package com.example.vocabularyapp.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import kotlin.math.roundToInt

@Composable
fun TimeLimitSelector(
    timeLimit: Int,
    onTimeChange: (Int) -> Unit
) {
    Text("制限時間を選択してください", color = colorScheme.onSurface, style = MaterialTheme.typography.titleMedium)

    Slider(
        value = timeLimit.toFloat(),
        onValueChange = {
            // Sliderの値をInt（整数）に丸めて返す
            onTimeChange(it.roundToInt())
        },
        valueRange = 1f..60f // 1秒〜60秒の範囲
    )

    Text("制限時間: ${timeLimit}秒", color = colorScheme.onSurface)
}