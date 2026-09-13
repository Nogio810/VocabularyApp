package com.example.vocabularyapp.ui.navigation

object Routes {
    const val SETTINGS = "settings"
    const val QUIZ = "quiz"
    const val RESULT = "result/{correct}/{total}"

    // 引数付きのルートを安全に作るための関数
    fun createResultRoute(correct: Int, total: Int): String {
        return "result/$correct/$total"
    }
}