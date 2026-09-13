package com.example.vocabularyapp.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ModeSelector(
    isEnglishToJapanese: Boolean,
    onModeChange: (Boolean) -> Unit
) {
    Text("出題モードを選択してください", color = colorScheme.onSurface, style = MaterialTheme.typography.titleMedium)
    Row(verticalAlignment = Alignment.CenterVertically) {
        RadioButton(
            selected = isEnglishToJapanese,
            onClick = { onModeChange(true) }
        )
        Text("英 ⇒ 日", color = colorScheme.onSurface, modifier = Modifier.clickable { onModeChange(true) })

        Spacer(modifier = Modifier.width(16.dp))

        RadioButton(
            selected = !isEnglishToJapanese,
            onClick = { onModeChange(false) }
        )
        Text("日 ⇒ 英", color = colorScheme.onSurface, modifier = Modifier.clickable { onModeChange(false) })
    }
}