package com.example.vocabularyapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.VocabularyAppTheme
import com.example.vocabularyapp.model.Choice
import com.example.vocabularyapp.model.Quiz
import com.example.vocabularyapp.ui.screens.AppScreen
import com.example.vocabularyapp.ui.screens.QuizScreen

class MainActivity : ComponentActivity() {
    val quizList = listOf(
        Quiz(
            question = "What does 'This' mean?",
            choices = listOf(
                Choice("これ", isCorrect = false, isFalse = false, isClicked = false),
                Choice("あれ", isCorrect = false, isFalse = false, isClicked = false),
                Choice("それ", isCorrect = false, isFalse = false, isClicked = false),
                Choice("どれ", isCorrect = false, isFalse = false, isClicked = false)
            )
        )
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VocabularyAppTheme {
                AppScreen()
            }
        }
    }
}