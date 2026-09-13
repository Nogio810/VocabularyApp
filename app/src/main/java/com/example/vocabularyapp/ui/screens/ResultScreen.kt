package com.example.vocabularyapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.vocabularyapp.ui.components.AnswerResultCard
import com.example.vocabularyapp.model.AnswerResult // 👈 importを忘れずに！
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.systemBars
import androidx.compose.material3.MaterialTheme.colorScheme

@Composable
fun ResultScreen(
    correctAnswers: Int,
    totalQuestions: Int,
    isLoading: Boolean,
    answerHistory: List<AnswerResult>, // 👈 修正1：これが抜けていたのでエラーになっていました！
    onRetry: () -> Unit,
    onBackToHome: () -> Unit,
    onCopyAiData: () -> Unit
) {
    // 👈 修正2：Boxではなく全体を「Column」にして、上から下に順番に並べるようにしました！
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                WindowInsets.systemBars
                    .only(WindowInsetsSides.Top + WindowInsetsSides.Bottom)
                    .asPaddingValues()
            )
            .padding(horizontal = 24.dp, vertical = 16.dp), // 横の余白と少しの縦余白
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // --- 上半分の結果発表とボタン ---
        Text(text = "結果発表", color = colorScheme.onSurface, style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "正解数：$correctAnswers / $totalQuestions",
            style = MaterialTheme.typography.titleLarge,
            color = colorScheme.onSurface
        )

        Spacer(modifier = Modifier.height(32.dp))

        // もう一度挑戦ボタン
        Button(
            onClick = onRetry,
            enabled = !isLoading,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        ) {
            Text(if (isLoading) "準備中..." else "もう一度挑戦", style = MaterialTheme.typography.titleMedium)
        }

        Spacer(modifier = Modifier.height(16.dp))

        // ホームに戻るボタン
        OutlinedButton(
            onClick = onBackToHome,
            enabled = !isLoading,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        ) {
            Text("設定画面に戻る", style = MaterialTheme.typography.titleMedium)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = onCopyAiData,
            enabled = answerHistory.isNotEmpty() && !isLoading,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        ) {
            Text(
                text = "AI分析用データをコピー",
                style = MaterialTheme.typography.titleMedium
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        Text(text = "復習リスト", style = MaterialTheme.typography.titleMedium, color = colorScheme.onSurface)
        Spacer(modifier = Modifier.height(8.dp))

        // --- 下半分の復習リスト ---
        LazyColumn(
            // 👈 修正3：weight(1f)を付けることで「画面の下の余ったスペースを全部リストに使う」という魔法がかかります！
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentPadding = PaddingValues(bottom = 48.dp)
        ) {
            itemsIndexed(answerHistory) { index, result ->
                AnswerResultCard(
                    index = index,
                    result = result
                )
            }
        }
    }
}