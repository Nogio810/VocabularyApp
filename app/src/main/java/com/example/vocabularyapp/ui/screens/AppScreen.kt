package com.example.vocabularyapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.vocabularyapp.ui.navigation.Routes // 👈 インポート
import com.example.vocabularyapp.viewmodel.QuizViewModel
import com.example.vocabularyapp.viewmodel.SettingViewModel
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import androidx.compose.ui.platform.LocalContext

@Composable
fun AppScreen() {
    val navController = rememberNavController()

    // 💡 画面を跨いでデータを保持するため、AppScreenでViewModelを持つ（共有ViewModel）設計は
    // この規模のアプリなら全然アリ（むしろ正解）です！
    val settingViewModel: SettingViewModel = hiltViewModel()
    val quizViewModel: QuizViewModel = hiltViewModel()

    val context = LocalContext.current

    val clipboardManager =
        context.getSystemService(Context.CLIPBOARD_SERVICE)
                as ClipboardManager

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorScheme.background)
    ) {
        NavHost(navController, startDestination = Routes.SETTINGS) {

            // 📌 1. 設定画面
            composable(Routes.SETTINGS) {
                // QuizViewModelのローディング状態だけを抽出して渡す
                val isQuizLoading by quizViewModel.isLoading.collectAsState()

                SettingScreen(
                    settingViewModel = settingViewModel,
                    isQuizLoading = isQuizLoading,
                    onStartClick = {
                        // 第3引数に「読み込み完了時の処理（画面遷移）」を渡す
                        quizViewModel.loadQuizzes(
                            settingViewModel.selectedLevels.value,
                            settingViewModel.questionCount.value,
                            settingViewModel.timeLimit.value,
                            settingViewModel.isEnglishToJapanese.value
                        ) {
                            // 👇 ここは裏側の準備が終わった後に呼ばれる
                            navController.navigate(Routes.QUIZ) {
                                popUpTo(Routes.QUIZ) { inclusive = true }
                            }
                        }
                    }
                )
            }

            // 📌 2. クイズ画面
            composable(Routes.QUIZ) {
                QuizScreen(
                    viewModel = quizViewModel,
                    navController = navController
                )
            }

            // 📌 3. 結果画面
            composable(
                route = Routes.RESULT,
                arguments = listOf(
                    navArgument("correct") { type = NavType.IntType },
                    navArgument("total") { type = NavType.IntType }
                )
            ) { backStackEntry ->
                val correct = backStackEntry.arguments?.getInt("correct") ?: 0
                val total = backStackEntry.arguments?.getInt("total") ?: 0
                val isQuizLoading by quizViewModel.isLoading.collectAsState() // 👈 追加
                val history by quizViewModel.answerHistory.collectAsState()

                ResultScreen(
                    correctAnswers = correct,
                    totalQuestions = total,
                    isLoading = isQuizLoading,
                    answerHistory = history,// 👈 追加
                    onRetry = {
                        quizViewModel.loadQuizzes(
                            settingViewModel.selectedLevels.value,
                            settingViewModel.questionCount.value,
                            settingViewModel.timeLimit.value,
                            settingViewModel.isEnglishToJapanese.value
                        ) {
                            // 👇 ここも準備が終わった後に遷移！
                            navController.navigate(Routes.QUIZ) {
                                popUpTo(Routes.QUIZ) { inclusive = true }
                            }
                        }
                    },
                    onBackToHome = {
                        navController.navigate(Routes.SETTINGS) {
                            popUpTo(Routes.SETTINGS) { inclusive = true }
                        }
                    },
                    onCopyAiData = {
                        val text = quizViewModel.createAiAnalysisText()

                        val clip = ClipData.newPlainText(
                            "AI分析用学習結果",
                            text
                        )

                        clipboardManager.setPrimaryClip(clip)
                    }
                )
            }
        }
    }
}