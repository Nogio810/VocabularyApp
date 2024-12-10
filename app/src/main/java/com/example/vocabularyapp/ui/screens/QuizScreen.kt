package com.example.vocabularyapp.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsBottomHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.vocabularyapp.model.Choice
import com.example.vocabularyapp.ui.components.CloseButton
import com.example.vocabularyapp.ui.components.CorrectQuizOptionButton
import com.example.vocabularyapp.ui.components.ErrorQuizOptionButton
import com.example.vocabularyapp.ui.components.LinearDeterminateIndicator
import com.example.vocabularyapp.ui.components.MoreHorizonButton
import com.example.vocabularyapp.ui.components.QuizCard
import com.example.vocabularyapp.ui.components.QuizOptionButton
import com.example.vocabularyapp.ui.components.RelativePosition
import com.example.vocabularyapp.ui.components.SkipButton

@Composable
fun QuizScreen(choices: List<Choice>) {
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
                itemsIndexed(choices) { index, choice ->
                    if(choice.isCorrect){
                        CorrectQuizOptionButton(index + 1, choice.questionText)
                    }else if (choice.isFalse){
                        ErrorQuizOptionButton(index + 1, choice.questionText)
                    }else{
                        QuizOptionButton(index + 1, choice.questionText)
                    }
                }
            }
        }
    }
}