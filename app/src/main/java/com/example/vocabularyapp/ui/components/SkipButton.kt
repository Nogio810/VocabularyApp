package com.example.vocabularyapp.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.vocabularyapp.R

@Composable
fun SkipButton() {
    OutlinedButton(
        onClick = {},
        shape = CircleShape,
        border = BorderStroke(
            width = 2.dp,
            color = colorScheme.surfaceVariant
        )
    ) {
        Text(
            stringResource(R.string.skip),
            color = colorScheme.surfaceVariant
        )
    }
}