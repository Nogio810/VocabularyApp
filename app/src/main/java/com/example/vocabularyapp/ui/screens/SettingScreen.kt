package com.example.vocabularyapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.vocabularyapp.ui.components.LevelCheckbox
import com.example.vocabularyapp.ui.components.QuestionCountSelector
import com.example.vocabularyapp.viewmodel.QuizViewModel
import com.example.vocabularyapp.viewmodel.SettingViewModel

@Composable
fun SettingScreen(
    onStartClick: () -> Unit,
    settingViewModel: SettingViewModel,
    quizViewModel: QuizViewModel
) {
    val selectedLevels by settingViewModel.selectedLevels.collectAsState()
    val questionCount by settingViewModel.questionCount.collectAsState()

    val isLoading by quizViewModel.isLoading.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                WindowInsets.systemBars
                    .only(WindowInsetsSides.Top + WindowInsetsSides.Bottom)
                    .asPaddingValues()
            )
            .padding(16.dp)
    ) {
        Text("レベルを選択してください", style = MaterialTheme.typography.titleMedium)

        listOf("600", "730", "860", "990").forEach { level ->
            LevelCheckbox(
                level = level,
                selectedLevels = selectedLevels,
                onLevelToggle = { settingViewModel.toggleLevel(level) }
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        QuestionCountSelector(
            questionCount = questionCount,
            onCountChange = { settingViewModel.setQuestionCount(it) }
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = onStartClick,
            enabled = selectedLevels.isNotEmpty() && !isLoading,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text("START")
        }
    }
}