package com.example.vocabularyapp.ui.components

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun LinearDeterminateIndicator(
    modifier: Modifier,
    isAnimating: Boolean,
    onAnimationEnd: () -> Unit
) {
    val progress = remember { Animatable(1f) }

    LaunchedEffect(isAnimating) {
        if (isAnimating) {
            progress.snapTo(1f)
            progress.animateTo(
                0f,
                animationSpec = tween(
                    durationMillis = 10000,
                    easing = LinearEasing
                    )
            )
            onAnimationEnd()
        }
    }

    LinearProgressIndicator(
        progress = { progress.value },
        modifier = modifier,
        color = colorScheme.primary,
        trackColor = colorScheme.primaryContainer
    )
}