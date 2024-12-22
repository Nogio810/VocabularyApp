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
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.VocabularyAppTheme
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
                    RelativePosition(indent = 1)
                }
                item {
                    QuizCard(englishWord = "This")
                }
                item {
                    SkipButton()
                }
                itemsIndexed(choices) { index, choice ->
                    if(choice.isCorrect){
                        CorrectQuizOptionButton(indent = index + 1, word = choice.questionText)
                    }else if (choice.isFalse){
                        ErrorQuizOptionButton(indent = index + 1, word = choice.questionText)
                    }else{
                        QuizOptionButton(indent = index + 1, word = choice.questionText)
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun QuizScreenPreview(){
    val choices = listOf(
        Choice("これ", false, false),
        Choice("あれ", false, false),
        Choice("それ", false, false),
        Choice("どれ", false, false)
    )
    VocabularyAppTheme {
        QuizScreen(choices = choices)
    }
}