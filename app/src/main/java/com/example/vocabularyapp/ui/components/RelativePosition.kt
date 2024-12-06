package com.example.vocabularyapp.ui.components

import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.example.vocabularyapp.R

@Composable
fun RelativePosition(
    indent: Int = indent
){
    Text(
        text = stringResource(R.string.relative_position, indent),
        color = colorScheme.surfaceVariant,
        textAlign = TextAlign.Center
    )
}