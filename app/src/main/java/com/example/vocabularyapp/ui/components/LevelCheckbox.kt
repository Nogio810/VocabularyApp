package com.example.vocabularyapp.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LevelCheckbox(
    level: String,
    selectedLevels: List<String>,
    onLevelToggle: (String) -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 4.dp)
    ) {
        Checkbox(
            checked = level in selectedLevels,
            onCheckedChange = { onLevelToggle(level) }
        )
        Text(text = "$level 点レベル")
    }
}