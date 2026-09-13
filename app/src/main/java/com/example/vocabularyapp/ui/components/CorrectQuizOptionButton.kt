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
import androidx.compose.material.icons.outlined.Circle
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CorrectQuizOptionButton(
    word: String
) {
    val correct = Color(0xff00cc33)
    Row(
        verticalAlignment = Alignment.CenterVertically, // 👈 追加：縦のズレを解消！
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .clip(RoundedCornerShape(8.dp))
            .border(2.dp, color = correct, RoundedCornerShape(8.dp))
            .background(colorScheme.surfaceVariant)
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        // 🌟 QuizOptionと全く同じ幅のBox！
        Box(
            modifier = Modifier.width(28.dp),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                Icons.Outlined.Circle,
                contentDescription = null,
                tint = correct
            )
        }

        // 🌟 全く同じ余白！
        Spacer(modifier = Modifier.width(14.dp))

        Text(
            text = word,
            color = correct
        )
    }
}