package com.example.vocabularyapp.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
    word: String,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .padding(
                start = 16.dp,
                end = 16.dp,
                top = 8.dp,
                bottom = 8.dp
            )
            .clip(RoundedCornerShape(8.dp))  // 形状を角丸に
            .border(
                2.dp,
                color = colorScheme.outline,
                RoundedCornerShape(8.dp)
            )
            .padding(16.dp)
            .fillMaxWidth()
            .clickable { onClick() }
    ) {
        Text(
            text = indent.toString(),
            textAlign = TextAlign.Center,
            color = colorScheme.outline,
            modifier = Modifier.width(24.dp)
        )
        Text(
            text = word,
            textAlign = TextAlign.Start,
            color = colorScheme.onSurface
        )
    }
}