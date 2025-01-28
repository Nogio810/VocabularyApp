package com.example.vocabularyapp.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
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
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.compose.VocabularyAppTheme
import com.example.vocabularyapp.ui.components.CloseButton
import com.example.vocabularyapp.ui.components.CorrectQuizOptionButton
import com.example.vocabularyapp.ui.components.ErrorQuizOptionButton
import com.example.vocabularyapp.ui.components.LinearDeterminateIndicator
import com.example.vocabularyapp.ui.components.MoreHorizonButton
import com.example.vocabularyapp.ui.components.QuizCard
import com.example.vocabularyapp.ui.components.QuizOptionButton
import com.example.vocabularyapp.ui.components.RelativePosition
import com.example.vocabularyapp.ui.components.SkipButton
import com.example.vocabularyapp.viewmodel.QuizViewModel
import kotlinx.coroutines.delay

@Composable
fun QuizScreen(
    viewModel: QuizViewModel = hiltViewModel()
) {
    val quizList by viewModel.quizList.observeAsState(initial = emptyList())
    var currentQuizIndex by remember { mutableIntStateOf(0) }
    var showResult by remember { mutableStateOf(false) }
    var selectedChoiceIndex by remember { mutableIntStateOf(-1) }
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
                if (quizList.isNotEmpty() && currentQuizIndex < quizList.size) {
                    val currentQuiz = quizList[currentQuizIndex]
                    item {
                        RelativePosition(
                            indent = currentQuizIndex + 1,
                            size = quizList.size
                        )
                    }
                    item {
                        QuizCard(
                            englishWord = currentQuiz.question
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
                            SkipButton {
                                currentQuizIndex =
                                    (currentQuizIndex + 1).coerceAtMost(quizList.size - 1)
                                selectedChoiceIndex = -1
                            }
                        }
                    }
                    itemsIndexed(currentQuiz.choices) { index, choice ->
                        val isCorrect = choice.isCorrect
                        val isClicked = selectedChoiceIndex == index
                        AnimatedVisibility(
                            visible = !showResult || isClicked,
                            enter = fadeIn(),
                            exit = fadeOut()
                        ) {
                            when {
                                isCorrect && isClicked -> CorrectQuizOptionButton(
                                    indent = index + 1,
                                    word = choice.questionText
                                )
                                !isCorrect && isClicked -> ErrorQuizOptionButton(
                                    indent = index + 1,
                                    word = choice.questionText
                                )
                                else -> QuizOptionButton(
                                    indent = index + 1,
                                    word = choice.questionText,
                                ) {
                                    if (!showResult) {
                                        selectedChoiceIndex = index
                                        showResult = true

                                    }
                                }
                            }
                        }
                        LaunchedEffect(Pair(currentQuizIndex, selectedChoiceIndex)) {
                            if (showResult) {
                                delay(2000)
                                showResult = false
                                selectedChoiceIndex = -1
                                currentQuizIndex =
                                    (currentQuizIndex + 1).coerceAtMost(quizList.size - 1)
                            }
                        }
                    }
                }else if(quizList.isNotEmpty() && currentQuizIndex >= quizList.size){
                    item {
                        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                            Text("お疲れさまでした")
                        }
                    }
                }else{
                    item {
                        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                            CircularProgressIndicator()
                        }
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun QuizScreenPreview() {
    VocabularyAppTheme(darkTheme = false) {
        QuizScreen()
    }
}

@Preview
@Composable
fun DarkQuizScreenPreview() {
    VocabularyAppTheme(darkTheme = true) {
        QuizScreen()
    }
}