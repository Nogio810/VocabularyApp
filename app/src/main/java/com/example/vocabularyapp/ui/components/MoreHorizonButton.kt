package com.example.vocabularyapp.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.runtime.Composable

@Composable
fun MoreHorizonButton(){
    IconButton(
        onClick = {}
    ) {
        Icon(
            Icons.Filled.MoreHoriz,
            contentDescription = null,
            tint = colorScheme.secondary
        )
    }
}