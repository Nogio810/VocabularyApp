package com.example.vocabularyapp.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ResultScreen(
    correctAnswers: Int,
    totalQuestions: Int,
    onRetry: () -> Unit,
    onBackToHome: () -> Unit
){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "結果発表")
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "正解数：$correctAnswers / $totalQuestions")
            Spacer(modifier = Modifier.height(24.dp))
            Row {
                Button(onClick = onRetry) {
                    Text(text = "もう一度挑戦")
                }
                Spacer(modifier = Modifier.width(16.dp))
                Button(onClick = onBackToHome){
                    Text(text = "ホームへ戻る")
                }
            }
        }
    }
}