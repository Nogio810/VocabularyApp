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
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.vocabularyapp.ui.components.LevelCheckbox
import com.example.vocabularyapp.ui.components.QuestionCountSelector
import com.example.vocabularyapp.ui.components.TimeLimitSelector
import com.example.vocabularyapp.viewmodel.QuizViewModel
import com.example.vocabularyapp.viewmodel.SettingViewModel
import com.example.vocabularyapp.ui.components.ModeSelector

@Composable
fun SettingScreen(
    onStartClick: () -> Unit,
    settingViewModel: SettingViewModel,
    isQuizLoading: Boolean,
) {
    val selectedLevels by settingViewModel.selectedLevels.collectAsState()
    val questionCount by settingViewModel.questionCount.collectAsState()
    val timeLimit by settingViewModel.timeLimit.collectAsState()
    val isEnglishToJapanese by settingViewModel.isEnglishToJapanese.collectAsState()

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
        ModeSelector(
            isEnglishToJapanese = isEnglishToJapanese,
            onModeChange = { settingViewModel.setMode(it) }
        )

        Spacer(modifier = Modifier.height(32.dp))

        Text("レベルを選択してください", color = colorScheme.onSurface, style = MaterialTheme.typography.titleMedium)

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

        // 👇 追加：制限時間のスライダーを配置
        TimeLimitSelector(
            timeLimit = timeLimit,
            onTimeChange = { settingViewModel.setTimeLimit(it) }
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = onStartClick,
            enabled = selectedLevels.isNotEmpty() && !isQuizLoading, // 👈 ここで使用
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(if (isQuizLoading) "準備中..." else "スタート")
        }
    }
}