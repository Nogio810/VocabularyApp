package com.example.vocabularyapp.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.vocabularyapp.model.AnswerResult

@Composable
fun AnswerResultCard(
    index: Int,
    result: AnswerResult
) {
    val bgColor = if (result.isCorrect) Color(0xFFE8F5E9) else Color(0xFFFFEBEE)
    val icon = when {
        result.isCorrect -> "⭕️"
        result.isSkipped -> "⏩" // スキップ用アイコン
        else -> "❌"
    }

    var expanded by rememberSaveable { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .clickable { expanded = !expanded },
        colors = CardDefaults.cardColors(containerColor = bgColor)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            // 【常に表示する部分】
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = icon, modifier = Modifier.padding(end = 12.dp))
                Text(
                    text = "Q${index + 1}. ${result.word}",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(1f)
                )
                Icon(
                    imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                    contentDescription = if (expanded) "閉じる" else "開く"
                )
            }

            // 【展開された時だけ表示する部分】
            AnimatedVisibility(visible = expanded) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 12.dp, start = 32.dp)
                ) {
                    if (result.isCorrect) {
                        Text(
                            text = result.correctMeaning,
                            style = MaterialTheme.typography.bodyMedium
                        )
                    } else if (result.isSkipped) { // 👈 追加：スキップだった時の表示
                        Text(
                            text = "⭕️ 正解: ${result.correctMeaning}",
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "⏩ スキップしました", // ユーザーの回答ではなくスキップしたことを明記
                            style = MaterialTheme.typography.bodyMedium,
                            color = Color.Gray // スキップはグレーにしておとなしくする
                        )
                    } else {
                        // 👈 今までの不正解の処理
                        Text(
                            text = "⭕️ 正解: ${result.correctMeaning}",
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "❌ 回答: ${result.userAnswer}",
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                }
            }
        }
    }
}