package com.example.vocabularyapp.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun QuizOptionButton(
    indent: Int,
    word: String
) {
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))  // 形状を角丸に
            .border(
                2.dp,
                color = colorScheme.outline,
                RoundedCornerShape(8.dp)
            )
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = indent.toString(),
            textAlign = TextAlign.Start,
            color = colorScheme.outline,
        )
        Text(
            text = word,
            textAlign = TextAlign.Start,
            color = colorScheme.onSurface
        )
    }
}