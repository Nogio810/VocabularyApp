package com.example.vocabularyapp.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsBottomHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
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
import androidx.navigation.NavController
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
    viewModel: QuizViewModel,
    navController: NavController
) {
    val quizList by viewModel.quizList.collectAsState()
    var currentQuizIndex by remember { mutableIntStateOf(0) }
    var showResult by remember { mutableStateOf(false) }
    var selectedChoiceIndex by remember { mutableIntStateOf(-1) }
    var isSkipped by remember { mutableStateOf(false) }
    var isAnimating by remember { mutableStateOf(true) }
    var correctAnswers by remember { mutableIntStateOf(0) }
    Log.d("QuizList", "List contents: $quizList")
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(WindowInsets.navigationBars.asPaddingValues())
    ) {
        Column {
            Spacer(
                Modifier.windowInsetsBottomHeight(
                    WindowInsets.systemBars
                )
            )
            if (quizList.isNotEmpty() && currentQuizIndex < quizList.size) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState()),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    val currentQuiz = quizList[currentQuizIndex]
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        CloseButton()
                        LinearDeterminateIndicator(
                            modifier = Modifier.weight(1f),
                            isAnimating = isAnimating,
                            onAnimationEnd = {
                                if (!showResult) {
                                    showResult = true
                                    isAnimating = false // アニメーション停止
                                }
                            }
                        )
                        MoreHorizonButton()
                    }
                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                    )
                    RelativePosition(
                        indent = currentQuizIndex + 1,
                        size = quizList.size
                    )
                    QuizCard(
                        englishWord = currentQuiz.question
                    )
                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                    )
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(),
                        contentAlignment = Alignment.CenterEnd,
                    ) {
                        SkipButton {
                            isSkipped = true
                            showResult = true
                            isAnimating = false
                        }
                    }
                    currentQuiz.choices.mapIndexed { index, choice ->
                        val isCorrect = choice.isCorrect
                        val isClicked = selectedChoiceIndex == index
                        when {
                            isCorrect && isClicked || isCorrect && showResult -> CorrectQuizOptionButton(
                                word = choice.questionText
                            )

                            !isCorrect && isClicked -> ErrorQuizOptionButton(
                                word = choice.questionText
                            )

                            else -> QuizOptionButton(
                                indent = index + 1,
                                word = choice.questionText,
                            ) {
                                if (!showResult) {
                                    selectedChoiceIndex = index
                                    showResult = true
                                    isAnimating = false
                                    if (choice.isCorrect) {
                                        correctAnswers += 1
                                    }
                                }
                            }
                        }
                    }
                    LaunchedEffect(showResult) {
                        if (showResult) {
                            delay(2000)
                            isSkipped = false
                            showResult = false
                            isAnimating = true
                            selectedChoiceIndex = -1
                            currentQuizIndex += 1
                            if (currentQuizIndex >= quizList.size) {
                                navController.navigate("result/$correctAnswers/${quizList.size}")
                            }
                        }
                    }
                }
            } else {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator()
                }
            }
        }
    }
}

