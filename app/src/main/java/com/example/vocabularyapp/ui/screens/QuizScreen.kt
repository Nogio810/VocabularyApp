package com.example.vocabularyapp.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsBottomHeight
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.vocabularyapp.ui.components.CloseButton
import com.example.vocabularyapp.ui.components.LinearDeterminateIndicator
import com.example.vocabularyapp.ui.components.MoreHorizonButton
import com.example.vocabularyapp.ui.components.QuizCard
import com.example.vocabularyapp.ui.components.QuizOptionButton
import com.example.vocabularyapp.ui.components.RelativePosition
import com.example.vocabularyapp.ui.components.SkipButton

@Composable
fun QuizScreen() {
    Box {
        Column {
            Spacer(
                Modifier.windowInsetsBottomHeight(
                    WindowInsets.systemBars
                )
            )
            LazyColumn {
                item {
                    Row {
                        CloseButton()
                        LinearDeterminateIndicator()
                        MoreHorizonButton()
                    }
                }
                item {
                    RelativePosition()
                }
                item {
                    QuizCard()
                }
                item {
                    SkipButton()
                }
                item {
                    Column {
                        QuizOptionButton()
                        QuizOptionButton()
                        QuizOptionButton()
                        QuizOptionButton()
                    }
                }
            }
        }
    }
}