package com.example.vocabularyapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun AppScreen(){
    val navController = rememberNavController()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorScheme.background)
    ){
        NavHost(navController, startDestination = "quiz") {
            composable("quiz"){
                QuizScreen(navController = navController)
            }
            composable(
                "result/{correct}/{total}",
                arguments = listOf(
                    navArgument("correct") {type = NavType.IntType},
                    navArgument("total") { type = NavType.IntType}
                )
            ){backStackEntry ->
                val correct = backStackEntry.arguments?.getInt("correct") ?: 0
                val total = backStackEntry.arguments?.getInt("total") ?: 0
                ResultScreen(
                    correctAnswers = correct,
                    totalQuestions = total,
                    onRetry = {navController.navigate("quiz") {popUpTo("quiz") {inclusive = true} } },
                    onBackToHome = {}
                )
            }
        }
    }
}