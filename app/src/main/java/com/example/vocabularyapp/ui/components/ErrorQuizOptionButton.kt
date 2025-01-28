package com.example.vocabularyapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun ErrorQuizOptionButton(
    word: String
) {
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))  // 形状を角丸に
            .border(
                2.dp,
                color = colorScheme.error,
                RoundedCornerShape(8.dp)
            )
            .padding(
                start = 16.dp,
                end = 16.dp,
                top = 8.dp,
                bottom = 8.dp
            )
            .fillMaxWidth()
            .background(colorScheme.surfaceVariant)
    ) {
        Icon(
            Icons.Filled.Close,
            contentDescription = null,
            tint = colorScheme.error
        )
        Text(
            text = word,
            textAlign = TextAlign.Start,
            color = colorScheme.error
        )
    }
}