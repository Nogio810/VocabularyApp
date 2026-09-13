package com.example.vocabularyapp.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.runtime.Composable

@Composable
fun CloseButton(
    onClick: () -> Unit // 👈 追加：外から「押したときの処理」を受け取る
){
    IconButton(
        onClick = onClick // 👈 変更：受け取った処理をここで実行する
    ) {
        Icon(
            Icons.Filled.Close,
            contentDescription = "閉じる", // 読み上げ機能(アクセシビリティ)用に文字を入れておくと丁寧です
            tint = colorScheme.secondary
        )
    }
}