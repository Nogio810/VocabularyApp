package com.example.vocabularyapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.vocabularyapp.data.WordEntity
import com.example.vocabularyapp.model.AnswerResult // 👈 ① importを追加（modelパッケージから）
import com.example.vocabularyapp.model.Quiz
import com.example.vocabularyapp.model.QuizGenerator
import com.example.vocabularyapp.repository.VocabularyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update // 👈 ② これも追加
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuizViewModel @Inject constructor(
    private val repository: VocabularyRepository
) : ViewModel() {
    private val quizGenerator = QuizGenerator(repository)

    private val _quizList = MutableStateFlow<List<Quiz>>(emptyList())
    val quizList = _quizList.asStateFlow()

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> get() = _isLoading.asStateFlow()

    private val _timeLimit = MutableStateFlow(10)
    val timeLimit = _timeLimit.asStateFlow()

    private val _answerHistory = MutableStateFlow<List<AnswerResult>>(emptyList())
    val answerHistory = _answerHistory.asStateFlow()

    private val _isEnglishToJapanese = MutableStateFlow(true)
    val isEnglishToJapanese = _isEnglishToJapanese.asStateFlow()

    private val _selectedLevels = MutableStateFlow<List<String>>(emptyList())
    val selectedLevels = _selectedLevels.asStateFlow()

    fun loadQuizzes(
        levels: List<String>,
        count: Int,
        timeLimit: Int,
        isEnglishToJapanese: Boolean,
        onLoaded: () -> Unit
    ) {
        _selectedLevels.value = levels
        _timeLimit.value = timeLimit
        _isEnglishToJapanese.value = isEnglishToJapanese

        viewModelScope.launch {
            _isLoading.value = true
            _answerHistory.value = emptyList()
            _quizList.value = emptyList()

            val availableWords =
                repository.getWordsByLevels(levels)

            if (availableWords.isNotEmpty()) {

                val targetWords =
                    if (count <= availableWords.size) {
                        availableWords.shuffled().take(count)
                    } else {
                        buildList {
                            repeat(count) {
                                add(availableWords.random())
                            }
                        }
                    }

                val quizzes =
                    targetWords.map { word ->
                        quizGenerator.generateQuiz(
                            word = word,
                            isEnglishToJapanese = isEnglishToJapanese,
                            availableWords = availableWords
                        )
                    }

                _quizList.value = quizzes
            }

            _isLoading.value = false
            onLoaded()
        }
    }

    // 👇 ⑤ 追加：1問答えるたびに履歴を追加する関数
    fun addAnswerResult(result: AnswerResult) {
        _answerHistory.update { currentList ->
            currentList + result // 今のリストの末尾に新しい結果を追加
        }
    }

    fun createAiAnalysisText(): String {
        val results = answerHistory.value
        val levels = selectedLevels.value
        val direction = if (isEnglishToJapanese.value) {
            "英語 → 日本語"
        } else {
            "日本語 → 英語"
        }

        return buildString {
            appendLine("【英単語学習結果】")
            appendLine()

            appendLine("■ 今回の学習設定")
            appendLine("問題数: ${results.size}")
            appendLine("レベル: ${levels.joinToString("、")}")
            appendLine("出題方向: $direction")
            appendLine()

            appendLine("■ 解答結果")

            results.forEachIndexed { index, result ->
                appendLine("${index + 1}.")
                appendLine("単語: ${result.word}")
                appendLine("正解: ${result.correctMeaning}")

                if (result.isSkipped) {
                    appendLine("回答: スキップ")
                    appendLine("結果: スキップ")
                } else {
                    appendLine("回答: ${result.userAnswer}")
                    appendLine(
                        "結果: ${
                            if (result.isCorrect) "正解" else "不正解"
                        }"
                    )
                }

                appendLine()
            }

            appendLine("■ AIへの依頼")
            appendLine("上記の英単語学習結果を分析してください。")
            appendLine("特に以下の内容を分析してください。")
            appendLine("・間違えやすい単語")
            appendLine("・意味の取り違え方")
            appendLine("・多義語に対する弱点")
            appendLine("・今後優先して復習すべき内容")
        }
    }
}