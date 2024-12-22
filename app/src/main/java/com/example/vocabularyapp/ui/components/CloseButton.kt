package com.example.vocabularyapp.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CloseButton(){
    IconButton(
        onClick = {}
    ) {
        Icon(
            Icons.Filled.Close,
            contentDescription = null,
            tint = colorScheme.secondary
        )
    }
}