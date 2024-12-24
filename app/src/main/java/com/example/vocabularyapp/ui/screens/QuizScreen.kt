package com.example.vocabularyapp.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsBottomHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.VocabularyAppTheme
import com.example.vocabularyapp.model.Choice
import com.example.vocabularyapp.model.Quiz
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
fun QuizScreen(quizList: List<Quiz>) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column {
            Spacer(
                Modifier.windowInsetsBottomHeight(
                    WindowInsets.systemBars
                )
            )
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                item {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                        .fillMaxWidth()
                    ) {
                        CloseButton()
                        LinearDeterminateIndicator(modifier = Modifier.weight(1f))
                        MoreHorizonButton()
                    }
                }
                item {
                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                    )
                }
                quizList.forEachIndexed { quizIndex, quiz ->
                    item {
                        RelativePosition(
                            indent = quizIndex + 1,
                            size = quizList.size
                        )
                    }
                    item {
                        QuizCard(
                            englishWord = quiz.question
                        )
                    }
                    item {
                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f)
                        )
                    }
                    item {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(),
                            contentAlignment = Alignment.CenterEnd,
                        ) {
                            SkipButton()
                        }
                    }
                    itemsIndexed(quiz.choices) { index, choice ->
                        when {
                            choice.isCorrect -> CorrectQuizOptionButton(indent = index + 1, word = choice.questionText)
                            choice.isFalse -> ErrorQuizOptionButton(indent = index + 1, word = choice.questionText)
                            else -> QuizOptionButton(indent = index + 1, word = choice.questionText)
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun QuizScreenPreview(){
    val quizList = listOf(
        Quiz(
            question = "What does 'This' mean?",
            choices = listOf(
                Choice("これ", isCorrect = false, isFalse = false),
                Choice("あれ", isCorrect = false, isFalse = false),
                Choice("それ", isCorrect = false, isFalse = false),
                Choice("どれ", isCorrect = false, isFalse = false)
            )
        )
    )
    VocabularyAppTheme(darkTheme = false) {
        QuizScreen(quizList = quizList)
    }
}

@Preview
@Composable
fun DarkQuizScreenPreview(){
    val quizList = listOf(
        Quiz(
            question = "What does 'This' mean?",
            choices = listOf(
                Choice("これ", isCorrect = false, isFalse = false),
                Choice("あれ", isCorrect = false, isFalse = false),
                Choice("それ", isCorrect = false, isFalse = false),
                Choice("どれ", isCorrect = false, isFalse = false)
            )
        )
    )
    VocabularyAppTheme(darkTheme = true) {
        QuizScreen(quizList = quizList)
    }
}