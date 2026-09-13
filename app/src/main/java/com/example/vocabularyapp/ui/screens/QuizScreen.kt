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
import com.example.vocabularyapp.model.AnswerResult
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
import androidx.compose.foundation.clickable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import android.media.MediaPlayer
import androidx.compose.ui.platform.LocalContext

@Composable
fun QuizScreen(
    viewModel: QuizViewModel,
    navController: NavController
) {
    val quizList by viewModel.quizList.collectAsState()
    val timeLimit by viewModel.timeLimit.collectAsState()
    val isEnglishToJapanese by viewModel.isEnglishToJapanese.collectAsState()
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

                    val context = LocalContext.current

                    // ファイルの有無をチェック
                    val audioResId = remember(currentQuiz.wordId) {
                        context.resources.getIdentifier(
                            "word_${currentQuiz.wordId}",
                            "raw",
                            context.packageName
                        )
                    }

                    val hasAudio = audioResId != 0

                    val playSound = {
                        if (hasAudio) {
                            MediaPlayer.create(context, audioResId)?.apply {
                                setOnCompletionListener { release() }
                                start()
                            }
                        }
                    }

                    // 🔊 変更：自動再生は「英⇒和」の時だけ！
                    LaunchedEffect(currentQuiz.wordId) {
                        if (isEnglishToJapanese) {
                            playSound()
                        }
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        CloseButton(
                            onClick = {
                                // 設定画面に戻りつつ、現在のクイズ画面の履歴（バックスタック）を消去する
                                // ※もし Routes.SETTINGS という定数を作っていたら、"settings" の代わりにそれを使ってください
                                navController.navigate("settings") {
                                    popUpTo("settings") { inclusive = true }
                                }
                            }
                        )
                        LinearDeterminateIndicator(
                            modifier = Modifier.weight(1f),
                            isAnimating = isAnimating,
                            timeLimitSeconds = timeLimit,
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
                        englishWord = currentQuiz.question,
                        hasAudio = hasAudio && isEnglishToJapanese,
                        onClick = { playSound() }
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
                            val correctAnswerText = currentQuiz.choices.find { it.isCorrect }?.questionText ?: ""

                            // 👇 2. 履歴に「スキップしたよ」として保存
                            viewModel.addAnswerResult(
                                AnswerResult(
                                    word = currentQuiz.question,
                                    correctMeaning = correctAnswerText,
                                    userAnswer = "スキップ", // 何でもOKですが、一応文字を入れておく
                                    isCorrect = false,
                                    isSkipped = true // 👈 ここを true にする！
                                )
                            )
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
                                    // 1. その問題の「正解のテキスト」を探し出す
                                    val correctAnswerText = currentQuiz.choices.find { it.isCorrect }?.questionText ?: ""

                                    // 2. ViewModelに結果を送信して保存する！
                                    viewModel.addAnswerResult(
                                        AnswerResult(
                                            word = currentQuiz.question,       // 英単語
                                            correctMeaning = correctAnswerText,// 正解の訳
                                            userAnswer = choice.questionText,  // 自分がタップした訳
                                            isCorrect = choice.isCorrect       // 合ってたかどうか
                                        )
                                    )
                                    if (choice.isCorrect) {
                                        correctAnswers += 1
                                    }
                                }
                            }
                        }
                    }
                    LaunchedEffect(showResult) {
                        if (showResult) {
                            delay(1000)
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

