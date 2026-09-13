package com.example.vocabularyapp.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun QuizOptionButton(
    indent: Int,
    word: String,
    onClick: () -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp) // ← paddingの書き方をスッキリさせました
            .clip(RoundedCornerShape(8.dp))
            .border(2.dp, color = colorScheme.outline, RoundedCornerShape(8.dp))
            .clickable { onClick() }
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        // 🌟 ここが魔法の共通Box！幅を固定して数字を中央に置く
        Box(
            modifier = Modifier.width(28.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(text = indent.toString(), color = colorScheme.onSurface)
        }

        // 🌟 絶妙なバランスの共通余白！
        Spacer(modifier = Modifier.width(14.dp))

        Text(text = word, color = colorScheme.onSurface)
    }
}