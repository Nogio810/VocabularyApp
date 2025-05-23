package com.example.vocabularyapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.vocabularyapp.viewmodel.QuizViewModel
import com.example.vocabularyapp.viewmodel.SettingViewModel

@Composable
fun AppScreen() {
    val navController = rememberNavController()

    val settingViewModel: SettingViewModel = hiltViewModel()
    val quizViewModel: QuizViewModel = hiltViewModel()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorScheme.background)
    ) {
        NavHost(navController, startDestination = "settings") {
            composable("settings") {
                SettingScreen(
                    onStartClick = {
                        quizViewModel.loadQuizzes(settingViewModel.selectedLevels.value, settingViewModel.questionCount.value)
                        navController.navigate("quiz") {
                            popUpTo("quiz") {
                                inclusive = true
                            }
                        }
                    },
                    settingViewModel = settingViewModel,
                    quizViewModel = quizViewModel
                )
            }
            composable("quiz") {
                QuizScreen(
                    viewModel = quizViewModel,
                    navController = navController
                )
            }
            composable(
                "result/{correct}/{total}",
                arguments = listOf(
                    navArgument("correct") { type = NavType.IntType },
                    navArgument("total") { type = NavType.IntType }
                )
            ) { backStackEntry ->
                val correct = backStackEntry.arguments?.getInt("correct") ?: 0
                val total = backStackEntry.arguments?.getInt("total") ?: 0
                ResultScreen(
                    correctAnswers = correct,
                    totalQuestions = total,
                    onRetry = {
                        quizViewModel.loadQuizzes(settingViewModel.selectedLevels.value, settingViewModel.questionCount.value)
                        navController.navigate("quiz") {
                            popUpTo("quiz") {
                                inclusive = true
                            }
                        }
                    },
                    onBackToHome = {
                        navController.navigate("settings") {
                            popUpTo("settings") {
                                inclusive = true
                            }
                        }
                    }
                )
            }
        }
    }
}