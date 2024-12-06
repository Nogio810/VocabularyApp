package com.example.vocabularyapp.ui.components

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun LinearDeterminateIndicator() {
    val progress = remember { Animatable(1f) }
    val isAnimating by remember { mutableStateOf(false) }

    LaunchedEffect(isAnimating) {
        if (isAnimating) {
            progress.animateTo(0f, animationSpec = tween(durationMillis = 10000))
        }
    }

    LinearProgressIndicator(
        progress = { progress.value },
        modifier = Modifier.fillMaxWidth(),
        color = colorScheme.primary,
        trackColor = colorScheme.primaryContainer
    )
}