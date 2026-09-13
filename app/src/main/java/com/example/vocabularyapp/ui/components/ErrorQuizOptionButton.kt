package com.example.vocabularyapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun ErrorQuizOptionButton(
    word: String
) {
    Row(
        verticalAlignment = Alignment.CenterVertically, // 👈 追加：縦のズレを解消！
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .clip(RoundedCornerShape(8.dp))
            .border(2.dp, color = colorScheme.error, RoundedCornerShape(8.dp))
            .background(colorScheme.surfaceVariant)
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        // 🌟 全く同じ幅！
        Box(
            modifier = Modifier.width(28.dp),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                Icons.Filled.Close,
                contentDescription = null,
                tint = colorScheme.error
            )
        }

        // 🌟 全く同じ余白！
        Spacer(modifier = Modifier.width(14.dp))

        Text(
            text = word,
            color = colorScheme.error
        )
    }
}