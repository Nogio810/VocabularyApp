package com.example.vocabularyapp.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp

@Composable
fun QuizCard(
    englishWord: String,
    hasAudio: Boolean = false, // 👈 追加（デフォルトはfalse）
    onClick: () -> Unit = {}   // 👈 追加（デフォルトは空の処理）
){

    // 既存の一番外側のレイアウト（BoxやCardなど）の Modifier に追加します
    Box(
        modifier = Modifier
            // 〜 既存の修飾子 〜
            .clip(RoundedCornerShape(8.dp)) // 波紋を丸くする
            .clickable(
                enabled = hasAudio, // 音声がある時だけタップ可能にする！
                onClick = onClick
            )
            .padding(16.dp)
    ) {
        // 〜 既存の英単語TextなどのUI 〜
        Text(
            text = englishWord,
            color = colorScheme.onSurface,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth(),
            fontSize = 48.sp,
            // 👇 追加：行の高さをフォントサイズ(48.sp)より少し大きめに設定し、上下のめり込みを防ぐ
            lineHeight = 56.sp,
            // 👇 追加：文字と文字の間に少しだけ余白を作り、横の被りを防ぐ
            letterSpacing = 2.sp
        )
    }
}