package com.example.vocabularyapp.data;

import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteStatement;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class VocabularyDao_Impl implements VocabularyDao {
  private final RoomDatabase __db;

  public VocabularyDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
  }

  @Override
  public Object getRandomWordWithLevel(final List<String> levels,
      final Continuation<? super Word> $completion) {
    final StringBuilder _stringBuilder = new StringBuilder();
    _stringBuilder.append("SELECT * FROM vocabulary WHERE レベル IN(");
    final int _inputSize = levels.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(") ORDER BY RANDOM() LIMIT 1");
    final String _sql = _stringBuilder.toString();
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        for (String _item : levels) {
          if (_item == null) {
            _stmt.bindNull(_argIndex);
          } else {
            _stmt.bindText(_argIndex, _item);
          }
          _argIndex++;
        }
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "単語番号");
        final int _columnIndexOfLevel = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "レベル");
        final int _columnIndexOfWord = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "単語");
        final int _columnIndexOfNoun1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "名詞1");
        final int _columnIndexOfNoun2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "名詞2");
        final int _columnIndexOfNoun3 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "名詞3");
        final int _columnIndexOfNoun4 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "名詞4");
        final int _columnIndexOfNoun5 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "名詞5");
        final int _columnIndexOfVerb1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "動詞1");
        final int _columnIndexOfVerb2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "動詞2");
        final int _columnIndexOfVerb3 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "動詞3");
        final int _columnIndexOfVerb4 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "動詞4");
        final int _columnIndexOfVerb5 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "動詞5");
        final int _columnIndexOfVerb6 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "動詞6");
        final int _columnIndexOfAdj1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "形容詞1");
        final int _columnIndexOfAdj2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "形容詞2");
        final int _columnIndexOfAdj3 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "形容詞3");
        final int _columnIndexOfAdj4 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "形容詞4");
        final int _columnIndexOfAdj5 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "形容詞5");
        final int _columnIndexOfAdj6 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "形容詞6");
        final int _columnIndexOfAdv1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "副詞1");
        final int _columnIndexOfAdv2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "副詞2");
        final int _columnIndexOfAdv3 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "副詞3");
        final int _columnIndexOfAdv4 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "副詞4");
        final int _columnIndexOfPrep1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "前置詞1");
        final int _columnIndexOfPrep2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "前置詞2");
        final int _columnIndexOfConj1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "接続詞1");
        final int _columnIndexOfConj2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "接続詞2");
        final int _columnIndexOfIdiom1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "熟語1");
        final int _columnIndexOfIdiom2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "熟語2");
        final Word _result;
        if (_stmt.step()) {
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_columnIndexOfId));
          final String _tmpLevel;
          if (_stmt.isNull(_columnIndexOfLevel)) {
            _tmpLevel = null;
          } else {
            _tmpLevel = _stmt.getText(_columnIndexOfLevel);
          }
          final String _tmpWord;
          if (_stmt.isNull(_columnIndexOfWord)) {
            _tmpWord = null;
          } else {
            _tmpWord = _stmt.getText(_columnIndexOfWord);
          }
          final String _tmpNoun1;
          if (_stmt.isNull(_columnIndexOfNoun1)) {
            _tmpNoun1 = null;
          } else {
            _tmpNoun1 = _stmt.getText(_columnIndexOfNoun1);
          }
          final String _tmpNoun2;
          if (_stmt.isNull(_columnIndexOfNoun2)) {
            _tmpNoun2 = null;
          } else {
            _tmpNoun2 = _stmt.getText(_columnIndexOfNoun2);
          }
          final String _tmpNoun3;
          if (_stmt.isNull(_columnIndexOfNoun3)) {
            _tmpNoun3 = null;
          } else {
            _tmpNoun3 = _stmt.getText(_columnIndexOfNoun3);
          }
          final String _tmpNoun4;
          if (_stmt.isNull(_columnIndexOfNoun4)) {
            _tmpNoun4 = null;
          } else {
            _tmpNoun4 = _stmt.getText(_columnIndexOfNoun4);
          }
          final String _tmpNoun5;
          if (_stmt.isNull(_columnIndexOfNoun5)) {
            _tmpNoun5 = null;
          } else {
            _tmpNoun5 = _stmt.getText(_columnIndexOfNoun5);
          }
          final String _tmpVerb1;
          if (_stmt.isNull(_columnIndexOfVerb1)) {
            _tmpVerb1 = null;
          } else {
            _tmpVerb1 = _stmt.getText(_columnIndexOfVerb1);
          }
          final String _tmpVerb2;
          if (_stmt.isNull(_columnIndexOfVerb2)) {
            _tmpVerb2 = null;
          } else {
            _tmpVerb2 = _stmt.getText(_columnIndexOfVerb2);
          }
          final String _tmpVerb3;
          if (_stmt.isNull(_columnIndexOfVerb3)) {
            _tmpVerb3 = null;
          } else {
            _tmpVerb3 = _stmt.getText(_columnIndexOfVerb3);
          }
          final String _tmpVerb4;
          if (_stmt.isNull(_columnIndexOfVerb4)) {
            _tmpVerb4 = null;
          } else {
            _tmpVerb4 = _stmt.getText(_columnIndexOfVerb4);
          }
          final String _tmpVerb5;
          if (_stmt.isNull(_columnIndexOfVerb5)) {
            _tmpVerb5 = null;
          } else {
            _tmpVerb5 = _stmt.getText(_columnIndexOfVerb5);
          }
          final String _tmpVerb6;
          if (_stmt.isNull(_columnIndexOfVerb6)) {
            _tmpVerb6 = null;
          } else {
            _tmpVerb6 = _stmt.getText(_columnIndexOfVerb6);
          }
          final String _tmpAdj1;
          if (_stmt.isNull(_columnIndexOfAdj1)) {
            _tmpAdj1 = null;
          } else {
            _tmpAdj1 = _stmt.getText(_columnIndexOfAdj1);
          }
          final String _tmpAdj2;
          if (_stmt.isNull(_columnIndexOfAdj2)) {
            _tmpAdj2 = null;
          } else {
            _tmpAdj2 = _stmt.getText(_columnIndexOfAdj2);
          }
          final String _tmpAdj3;
          if (_stmt.isNull(_columnIndexOfAdj3)) {
            _tmpAdj3 = null;
          } else {
            _tmpAdj3 = _stmt.getText(_columnIndexOfAdj3);
          }
          final String _tmpAdj4;
          if (_stmt.isNull(_columnIndexOfAdj4)) {
            _tmpAdj4 = null;
          } else {
            _tmpAdj4 = _stmt.getText(_columnIndexOfAdj4);
          }
          final String _tmpAdj5;
          if (_stmt.isNull(_columnIndexOfAdj5)) {
            _tmpAdj5 = null;
          } else {
            _tmpAdj5 = _stmt.getText(_columnIndexOfAdj5);
          }
          final String _tmpAdj6;
          if (_stmt.isNull(_columnIndexOfAdj6)) {
            _tmpAdj6 = null;
          } else {
            _tmpAdj6 = _stmt.getText(_columnIndexOfAdj6);
          }
          final String _tmpAdv1;
          if (_stmt.isNull(_columnIndexOfAdv1)) {
            _tmpAdv1 = null;
          } else {
            _tmpAdv1 = _stmt.getText(_columnIndexOfAdv1);
          }
          final String _tmpAdv2;
          if (_stmt.isNull(_columnIndexOfAdv2)) {
            _tmpAdv2 = null;
          } else {
            _tmpAdv2 = _stmt.getText(_columnIndexOfAdv2);
          }
          final String _tmpAdv3;
          if (_stmt.isNull(_columnIndexOfAdv3)) {
            _tmpAdv3 = null;
          } else {
            _tmpAdv3 = _stmt.getText(_columnIndexOfAdv3);
          }
          final String _tmpAdv4;
          if (_stmt.isNull(_columnIndexOfAdv4)) {
            _tmpAdv4 = null;
          } else {
            _tmpAdv4 = _stmt.getText(_columnIndexOfAdv4);
          }
          final String _tmpPrep1;
          if (_stmt.isNull(_columnIndexOfPrep1)) {
            _tmpPrep1 = null;
          } else {
            _tmpPrep1 = _stmt.getText(_columnIndexOfPrep1);
          }
          final String _tmpPrep2;
          if (_stmt.isNull(_columnIndexOfPrep2)) {
            _tmpPrep2 = null;
          } else {
            _tmpPrep2 = _stmt.getText(_columnIndexOfPrep2);
          }
          final String _tmpConj1;
          if (_stmt.isNull(_columnIndexOfConj1)) {
            _tmpConj1 = null;
          } else {
            _tmpConj1 = _stmt.getText(_columnIndexOfConj1);
          }
          final String _tmpConj2;
          if (_stmt.isNull(_columnIndexOfConj2)) {
            _tmpConj2 = null;
          } else {
            _tmpConj2 = _stmt.getText(_columnIndexOfConj2);
          }
          final String _tmpIdiom1;
          if (_stmt.isNull(_columnIndexOfIdiom1)) {
            _tmpIdiom1 = null;
          } else {
            _tmpIdiom1 = _stmt.getText(_columnIndexOfIdiom1);
          }
          final String _tmpIdiom2;
          if (_stmt.isNull(_columnIndexOfIdiom2)) {
            _tmpIdiom2 = null;
          } else {
            _tmpIdiom2 = _stmt.getText(_columnIndexOfIdiom2);
          }
          _result = new Word(_tmpId,_tmpLevel,_tmpWord,_tmpNoun1,_tmpNoun2,_tmpNoun3,_tmpNoun4,_tmpNoun5,_tmpVerb1,_tmpVerb2,_tmpVerb3,_tmpVerb4,_tmpVerb5,_tmpVerb6,_tmpAdj1,_tmpAdj2,_tmpAdj3,_tmpAdj4,_tmpAdj5,_tmpAdj6,_tmpAdv1,_tmpAdv2,_tmpAdv3,_tmpAdv4,_tmpPrep1,_tmpPrep2,_tmpConj1,_tmpConj2,_tmpIdiom1,_tmpIdiom2);
        } else {
          _result = null;
        }
        return _result;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @Override
  public Object getRandomWord(final Continuation<? super Word> $completion) {
    final String _sql = "SELECT * FROM vocabulary ORDER BY RANDOM() LIMIT 1";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "単語番号");
        final int _columnIndexOfLevel = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "レベル");
        final int _columnIndexOfWord = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "単語");
        final int _columnIndexOfNoun1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "名詞1");
        final int _columnIndexOfNoun2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "名詞2");
        final int _columnIndexOfNoun3 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "名詞3");
        final int _columnIndexOfNoun4 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "名詞4");
        final int _columnIndexOfNoun5 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "名詞5");
        final int _columnIndexOfVerb1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "動詞1");
        final int _columnIndexOfVerb2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "動詞2");
        final int _columnIndexOfVerb3 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "動詞3");
        final int _columnIndexOfVerb4 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "動詞4");
        final int _columnIndexOfVerb5 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "動詞5");
        final int _columnIndexOfVerb6 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "動詞6");
        final int _columnIndexOfAdj1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "形容詞1");
        final int _columnIndexOfAdj2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "形容詞2");
        final int _columnIndexOfAdj3 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "形容詞3");
        final int _columnIndexOfAdj4 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "形容詞4");
        final int _columnIndexOfAdj5 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "形容詞5");
        final int _columnIndexOfAdj6 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "形容詞6");
        final int _columnIndexOfAdv1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "副詞1");
        final int _columnIndexOfAdv2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "副詞2");
        final int _columnIndexOfAdv3 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "副詞3");
        final int _columnIndexOfAdv4 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "副詞4");
        final int _columnIndexOfPrep1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "前置詞1");
        final int _columnIndexOfPrep2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "前置詞2");
        final int _columnIndexOfConj1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "接続詞1");
        final int _columnIndexOfConj2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "接続詞2");
        final int _columnIndexOfIdiom1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "熟語1");
        final int _columnIndexOfIdiom2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "熟語2");
        final Word _result;
        if (_stmt.step()) {
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_columnIndexOfId));
          final String _tmpLevel;
          if (_stmt.isNull(_columnIndexOfLevel)) {
            _tmpLevel = null;
          } else {
            _tmpLevel = _stmt.getText(_columnIndexOfLevel);
          }
          final String _tmpWord;
          if (_stmt.isNull(_columnIndexOfWord)) {
            _tmpWord = null;
          } else {
            _tmpWord = _stmt.getText(_columnIndexOfWord);
          }
          final String _tmpNoun1;
          if (_stmt.isNull(_columnIndexOfNoun1)) {
            _tmpNoun1 = null;
          } else {
            _tmpNoun1 = _stmt.getText(_columnIndexOfNoun1);
          }
          final String _tmpNoun2;
          if (_stmt.isNull(_columnIndexOfNoun2)) {
            _tmpNoun2 = null;
          } else {
            _tmpNoun2 = _stmt.getText(_columnIndexOfNoun2);
          }
          final String _tmpNoun3;
          if (_stmt.isNull(_columnIndexOfNoun3)) {
            _tmpNoun3 = null;
          } else {
            _tmpNoun3 = _stmt.getText(_columnIndexOfNoun3);
          }
          final String _tmpNoun4;
          if (_stmt.isNull(_columnIndexOfNoun4)) {
            _tmpNoun4 = null;
          } else {
            _tmpNoun4 = _stmt.getText(_columnIndexOfNoun4);
          }
          final String _tmpNoun5;
          if (_stmt.isNull(_columnIndexOfNoun5)) {
            _tmpNoun5 = null;
          } else {
            _tmpNoun5 = _stmt.getText(_columnIndexOfNoun5);
          }
          final String _tmpVerb1;
          if (_stmt.isNull(_columnIndexOfVerb1)) {
            _tmpVerb1 = null;
          } else {
            _tmpVerb1 = _stmt.getText(_columnIndexOfVerb1);
          }
          final String _tmpVerb2;
          if (_stmt.isNull(_columnIndexOfVerb2)) {
            _tmpVerb2 = null;
          } else {
            _tmpVerb2 = _stmt.getText(_columnIndexOfVerb2);
          }
          final String _tmpVerb3;
          if (_stmt.isNull(_columnIndexOfVerb3)) {
            _tmpVerb3 = null;
          } else {
            _tmpVerb3 = _stmt.getText(_columnIndexOfVerb3);
          }
          final String _tmpVerb4;
          if (_stmt.isNull(_columnIndexOfVerb4)) {
            _tmpVerb4 = null;
          } else {
            _tmpVerb4 = _stmt.getText(_columnIndexOfVerb4);
          }
          final String _tmpVerb5;
          if (_stmt.isNull(_columnIndexOfVerb5)) {
            _tmpVerb5 = null;
          } else {
            _tmpVerb5 = _stmt.getText(_columnIndexOfVerb5);
          }
          final String _tmpVerb6;
          if (_stmt.isNull(_columnIndexOfVerb6)) {
            _tmpVerb6 = null;
          } else {
            _tmpVerb6 = _stmt.getText(_columnIndexOfVerb6);
          }
          final String _tmpAdj1;
          if (_stmt.isNull(_columnIndexOfAdj1)) {
            _tmpAdj1 = null;
          } else {
            _tmpAdj1 = _stmt.getText(_columnIndexOfAdj1);
          }
          final String _tmpAdj2;
          if (_stmt.isNull(_columnIndexOfAdj2)) {
            _tmpAdj2 = null;
          } else {
            _tmpAdj2 = _stmt.getText(_columnIndexOfAdj2);
          }
          final String _tmpAdj3;
          if (_stmt.isNull(_columnIndexOfAdj3)) {
            _tmpAdj3 = null;
          } else {
            _tmpAdj3 = _stmt.getText(_columnIndexOfAdj3);
          }
          final String _tmpAdj4;
          if (_stmt.isNull(_columnIndexOfAdj4)) {
            _tmpAdj4 = null;
          } else {
            _tmpAdj4 = _stmt.getText(_columnIndexOfAdj4);
          }
          final String _tmpAdj5;
          if (_stmt.isNull(_columnIndexOfAdj5)) {
            _tmpAdj5 = null;
          } else {
            _tmpAdj5 = _stmt.getText(_columnIndexOfAdj5);
          }
          final String _tmpAdj6;
          if (_stmt.isNull(_columnIndexOfAdj6)) {
            _tmpAdj6 = null;
          } else {
            _tmpAdj6 = _stmt.getText(_columnIndexOfAdj6);
          }
          final String _tmpAdv1;
          if (_stmt.isNull(_columnIndexOfAdv1)) {
            _tmpAdv1 = null;
          } else {
            _tmpAdv1 = _stmt.getText(_columnIndexOfAdv1);
          }
          final String _tmpAdv2;
          if (_stmt.isNull(_columnIndexOfAdv2)) {
            _tmpAdv2 = null;
          } else {
            _tmpAdv2 = _stmt.getText(_columnIndexOfAdv2);
          }
          final String _tmpAdv3;
          if (_stmt.isNull(_columnIndexOfAdv3)) {
            _tmpAdv3 = null;
          } else {
            _tmpAdv3 = _stmt.getText(_columnIndexOfAdv3);
          }
          final String _tmpAdv4;
          if (_stmt.isNull(_columnIndexOfAdv4)) {
            _tmpAdv4 = null;
          } else {
            _tmpAdv4 = _stmt.getText(_columnIndexOfAdv4);
          }
          final String _tmpPrep1;
          if (_stmt.isNull(_columnIndexOfPrep1)) {
            _tmpPrep1 = null;
          } else {
            _tmpPrep1 = _stmt.getText(_columnIndexOfPrep1);
          }
          final String _tmpPrep2;
          if (_stmt.isNull(_columnIndexOfPrep2)) {
            _tmpPrep2 = null;
          } else {
            _tmpPrep2 = _stmt.getText(_columnIndexOfPrep2);
          }
          final String _tmpConj1;
          if (_stmt.isNull(_columnIndexOfConj1)) {
            _tmpConj1 = null;
          } else {
            _tmpConj1 = _stmt.getText(_columnIndexOfConj1);
          }
          final String _tmpConj2;
          if (_stmt.isNull(_columnIndexOfConj2)) {
            _tmpConj2 = null;
          } else {
            _tmpConj2 = _stmt.getText(_columnIndexOfConj2);
          }
          final String _tmpIdiom1;
          if (_stmt.isNull(_columnIndexOfIdiom1)) {
            _tmpIdiom1 = null;
          } else {
            _tmpIdiom1 = _stmt.getText(_columnIndexOfIdiom1);
          }
          final String _tmpIdiom2;
          if (_stmt.isNull(_columnIndexOfIdiom2)) {
            _tmpIdiom2 = null;
          } else {
            _tmpIdiom2 = _stmt.getText(_columnIndexOfIdiom2);
          }
          _result = new Word(_tmpId,_tmpLevel,_tmpWord,_tmpNoun1,_tmpNoun2,_tmpNoun3,_tmpNoun4,_tmpNoun5,_tmpVerb1,_tmpVerb2,_tmpVerb3,_tmpVerb4,_tmpVerb5,_tmpVerb6,_tmpAdj1,_tmpAdj2,_tmpAdj3,_tmpAdj4,_tmpAdj5,_tmpAdj6,_tmpAdv1,_tmpAdv2,_tmpAdv3,_tmpAdv4,_tmpPrep1,_tmpPrep2,_tmpConj1,_tmpConj2,_tmpIdiom1,_tmpIdiom2);
        } else {
          _result = null;
        }
        return _result;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @Override
  public Object getOtherTranslationsWithLevel(final List<String> levels, final int excludeWordId,
      final Continuation<? super List<Word>> $completion) {
    final StringBuilder _stringBuilder = new StringBuilder();
    _stringBuilder.append("SELECT * FROM vocabulary WHERE レベル IN(");
    final int _inputSize = levels.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(") AND 単語番号 != ");
    _stringBuilder.append("?");
    _stringBuilder.append(" ORDER BY RANDOM() LIMIT 3");
    final String _sql = _stringBuilder.toString();
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        for (String _item : levels) {
          if (_item == null) {
            _stmt.bindNull(_argIndex);
          } else {
            _stmt.bindText(_argIndex, _item);
          }
          _argIndex++;
        }
        _argIndex = 1 + _inputSize;
        _stmt.bindLong(_argIndex, excludeWordId);
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "単語番号");
        final int _columnIndexOfLevel = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "レベル");
        final int _columnIndexOfWord = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "単語");
        final int _columnIndexOfNoun1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "名詞1");
        final int _columnIndexOfNoun2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "名詞2");
        final int _columnIndexOfNoun3 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "名詞3");
        final int _columnIndexOfNoun4 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "名詞4");
        final int _columnIndexOfNoun5 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "名詞5");
        final int _columnIndexOfVerb1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "動詞1");
        final int _columnIndexOfVerb2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "動詞2");
        final int _columnIndexOfVerb3 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "動詞3");
        final int _columnIndexOfVerb4 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "動詞4");
        final int _columnIndexOfVerb5 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "動詞5");
        final int _columnIndexOfVerb6 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "動詞6");
        final int _columnIndexOfAdj1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "形容詞1");
        final int _columnIndexOfAdj2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "形容詞2");
        final int _columnIndexOfAdj3 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "形容詞3");
        final int _columnIndexOfAdj4 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "形容詞4");
        final int _columnIndexOfAdj5 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "形容詞5");
        final int _columnIndexOfAdj6 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "形容詞6");
        final int _columnIndexOfAdv1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "副詞1");
        final int _columnIndexOfAdv2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "副詞2");
        final int _columnIndexOfAdv3 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "副詞3");
        final int _columnIndexOfAdv4 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "副詞4");
        final int _columnIndexOfPrep1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "前置詞1");
        final int _columnIndexOfPrep2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "前置詞2");
        final int _columnIndexOfConj1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "接続詞1");
        final int _columnIndexOfConj2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "接続詞2");
        final int _columnIndexOfIdiom1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "熟語1");
        final int _columnIndexOfIdiom2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "熟語2");
        final List<Word> _result = new ArrayList<Word>();
        while (_stmt.step()) {
          final Word _item_1;
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_columnIndexOfId));
          final String _tmpLevel;
          if (_stmt.isNull(_columnIndexOfLevel)) {
            _tmpLevel = null;
          } else {
            _tmpLevel = _stmt.getText(_columnIndexOfLevel);
          }
          final String _tmpWord;
          if (_stmt.isNull(_columnIndexOfWord)) {
            _tmpWord = null;
          } else {
            _tmpWord = _stmt.getText(_columnIndexOfWord);
          }
          final String _tmpNoun1;
          if (_stmt.isNull(_columnIndexOfNoun1)) {
            _tmpNoun1 = null;
          } else {
            _tmpNoun1 = _stmt.getText(_columnIndexOfNoun1);
          }
          final String _tmpNoun2;
          if (_stmt.isNull(_columnIndexOfNoun2)) {
            _tmpNoun2 = null;
          } else {
            _tmpNoun2 = _stmt.getText(_columnIndexOfNoun2);
          }
          final String _tmpNoun3;
          if (_stmt.isNull(_columnIndexOfNoun3)) {
            _tmpNoun3 = null;
          } else {
            _tmpNoun3 = _stmt.getText(_columnIndexOfNoun3);
          }
          final String _tmpNoun4;
          if (_stmt.isNull(_columnIndexOfNoun4)) {
            _tmpNoun4 = null;
          } else {
            _tmpNoun4 = _stmt.getText(_columnIndexOfNoun4);
          }
          final String _tmpNoun5;
          if (_stmt.isNull(_columnIndexOfNoun5)) {
            _tmpNoun5 = null;
          } else {
            _tmpNoun5 = _stmt.getText(_columnIndexOfNoun5);
          }
          final String _tmpVerb1;
          if (_stmt.isNull(_columnIndexOfVerb1)) {
            _tmpVerb1 = null;
          } else {
            _tmpVerb1 = _stmt.getText(_columnIndexOfVerb1);
          }
          final String _tmpVerb2;
          if (_stmt.isNull(_columnIndexOfVerb2)) {
            _tmpVerb2 = null;
          } else {
            _tmpVerb2 = _stmt.getText(_columnIndexOfVerb2);
          }
          final String _tmpVerb3;
          if (_stmt.isNull(_columnIndexOfVerb3)) {
            _tmpVerb3 = null;
          } else {
            _tmpVerb3 = _stmt.getText(_columnIndexOfVerb3);
          }
          final String _tmpVerb4;
          if (_stmt.isNull(_columnIndexOfVerb4)) {
            _tmpVerb4 = null;
          } else {
            _tmpVerb4 = _stmt.getText(_columnIndexOfVerb4);
          }
          final String _tmpVerb5;
          if (_stmt.isNull(_columnIndexOfVerb5)) {
            _tmpVerb5 = null;
          } else {
            _tmpVerb5 = _stmt.getText(_columnIndexOfVerb5);
          }
          final String _tmpVerb6;
          if (_stmt.isNull(_columnIndexOfVerb6)) {
            _tmpVerb6 = null;
          } else {
            _tmpVerb6 = _stmt.getText(_columnIndexOfVerb6);
          }
          final String _tmpAdj1;
          if (_stmt.isNull(_columnIndexOfAdj1)) {
            _tmpAdj1 = null;
          } else {
            _tmpAdj1 = _stmt.getText(_columnIndexOfAdj1);
          }
          final String _tmpAdj2;
          if (_stmt.isNull(_columnIndexOfAdj2)) {
            _tmpAdj2 = null;
          } else {
            _tmpAdj2 = _stmt.getText(_columnIndexOfAdj2);
          }
          final String _tmpAdj3;
          if (_stmt.isNull(_columnIndexOfAdj3)) {
            _tmpAdj3 = null;
          } else {
            _tmpAdj3 = _stmt.getText(_columnIndexOfAdj3);
          }
          final String _tmpAdj4;
          if (_stmt.isNull(_columnIndexOfAdj4)) {
            _tmpAdj4 = null;
          } else {
            _tmpAdj4 = _stmt.getText(_columnIndexOfAdj4);
          }
          final String _tmpAdj5;
          if (_stmt.isNull(_columnIndexOfAdj5)) {
            _tmpAdj5 = null;
          } else {
            _tmpAdj5 = _stmt.getText(_columnIndexOfAdj5);
          }
          final String _tmpAdj6;
          if (_stmt.isNull(_columnIndexOfAdj6)) {
            _tmpAdj6 = null;
          } else {
            _tmpAdj6 = _stmt.getText(_columnIndexOfAdj6);
          }
          final String _tmpAdv1;
          if (_stmt.isNull(_columnIndexOfAdv1)) {
            _tmpAdv1 = null;
          } else {
            _tmpAdv1 = _stmt.getText(_columnIndexOfAdv1);
          }
          final String _tmpAdv2;
          if (_stmt.isNull(_columnIndexOfAdv2)) {
            _tmpAdv2 = null;
          } else {
            _tmpAdv2 = _stmt.getText(_columnIndexOfAdv2);
          }
          final String _tmpAdv3;
          if (_stmt.isNull(_columnIndexOfAdv3)) {
            _tmpAdv3 = null;
          } else {
            _tmpAdv3 = _stmt.getText(_columnIndexOfAdv3);
          }
          final String _tmpAdv4;
          if (_stmt.isNull(_columnIndexOfAdv4)) {
            _tmpAdv4 = null;
          } else {
            _tmpAdv4 = _stmt.getText(_columnIndexOfAdv4);
          }
          final String _tmpPrep1;
          if (_stmt.isNull(_columnIndexOfPrep1)) {
            _tmpPrep1 = null;
          } else {
            _tmpPrep1 = _stmt.getText(_columnIndexOfPrep1);
          }
          final String _tmpPrep2;
          if (_stmt.isNull(_columnIndexOfPrep2)) {
            _tmpPrep2 = null;
          } else {
            _tmpPrep2 = _stmt.getText(_columnIndexOfPrep2);
          }
          final String _tmpConj1;
          if (_stmt.isNull(_columnIndexOfConj1)) {
            _tmpConj1 = null;
          } else {
            _tmpConj1 = _stmt.getText(_columnIndexOfConj1);
          }
          final String _tmpConj2;
          if (_stmt.isNull(_columnIndexOfConj2)) {
            _tmpConj2 = null;
          } else {
            _tmpConj2 = _stmt.getText(_columnIndexOfConj2);
          }
          final String _tmpIdiom1;
          if (_stmt.isNull(_columnIndexOfIdiom1)) {
            _tmpIdiom1 = null;
          } else {
            _tmpIdiom1 = _stmt.getText(_columnIndexOfIdiom1);
          }
          final String _tmpIdiom2;
          if (_stmt.isNull(_columnIndexOfIdiom2)) {
            _tmpIdiom2 = null;
          } else {
            _tmpIdiom2 = _stmt.getText(_columnIndexOfIdiom2);
          }
          _item_1 = new Word(_tmpId,_tmpLevel,_tmpWord,_tmpNoun1,_tmpNoun2,_tmpNoun3,_tmpNoun4,_tmpNoun5,_tmpVerb1,_tmpVerb2,_tmpVerb3,_tmpVerb4,_tmpVerb5,_tmpVerb6,_tmpAdj1,_tmpAdj2,_tmpAdj3,_tmpAdj4,_tmpAdj5,_tmpAdj6,_tmpAdv1,_tmpAdv2,_tmpAdv3,_tmpAdv4,_tmpPrep1,_tmpPrep2,_tmpConj1,_tmpConj2,_tmpIdiom1,_tmpIdiom2);
          _result.add(_item_1);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @Override
  public Object getOtherTranslations(final int excludeWordId,
      final Continuation<? super List<Word>> $completion) {
    final String _sql = "SELECT * FROM vocabulary WHERE 単語番号 != ? ORDER BY RANDOM() LIMIT 3";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, excludeWordId);
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "単語番号");
        final int _columnIndexOfLevel = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "レベル");
        final int _columnIndexOfWord = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "単語");
        final int _columnIndexOfNoun1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "名詞1");
        final int _columnIndexOfNoun2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "名詞2");
        final int _columnIndexOfNoun3 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "名詞3");
        final int _columnIndexOfNoun4 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "名詞4");
        final int _columnIndexOfNoun5 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "名詞5");
        final int _columnIndexOfVerb1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "動詞1");
        final int _columnIndexOfVerb2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "動詞2");
        final int _columnIndexOfVerb3 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "動詞3");
        final int _columnIndexOfVerb4 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "動詞4");
        final int _columnIndexOfVerb5 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "動詞5");
        final int _columnIndexOfVerb6 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "動詞6");
        final int _columnIndexOfAdj1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "形容詞1");
        final int _columnIndexOfAdj2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "形容詞2");
        final int _columnIndexOfAdj3 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "形容詞3");
        final int _columnIndexOfAdj4 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "形容詞4");
        final int _columnIndexOfAdj5 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "形容詞5");
        final int _columnIndexOfAdj6 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "形容詞6");
        final int _columnIndexOfAdv1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "副詞1");
        final int _columnIndexOfAdv2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "副詞2");
        final int _columnIndexOfAdv3 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "副詞3");
        final int _columnIndexOfAdv4 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "副詞4");
        final int _columnIndexOfPrep1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "前置詞1");
        final int _columnIndexOfPrep2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "前置詞2");
        final int _columnIndexOfConj1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "接続詞1");
        final int _columnIndexOfConj2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "接続詞2");
        final int _columnIndexOfIdiom1 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "熟語1");
        final int _columnIndexOfIdiom2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "熟語2");
        final List<Word> _result = new ArrayList<Word>();
        while (_stmt.step()) {
          final Word _item;
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_columnIndexOfId));
          final String _tmpLevel;
          if (_stmt.isNull(_columnIndexOfLevel)) {
            _tmpLevel = null;
          } else {
            _tmpLevel = _stmt.getText(_columnIndexOfLevel);
          }
          final String _tmpWord;
          if (_stmt.isNull(_columnIndexOfWord)) {
            _tmpWord = null;
          } else {
            _tmpWord = _stmt.getText(_columnIndexOfWord);
          }
          final String _tmpNoun1;
          if (_stmt.isNull(_columnIndexOfNoun1)) {
            _tmpNoun1 = null;
          } else {
            _tmpNoun1 = _stmt.getText(_columnIndexOfNoun1);
          }
          final String _tmpNoun2;
          if (_stmt.isNull(_columnIndexOfNoun2)) {
            _tmpNoun2 = null;
          } else {
            _tmpNoun2 = _stmt.getText(_columnIndexOfNoun2);
          }
          final String _tmpNoun3;
          if (_stmt.isNull(_columnIndexOfNoun3)) {
            _tmpNoun3 = null;
          } else {
            _tmpNoun3 = _stmt.getText(_columnIndexOfNoun3);
          }
          final String _tmpNoun4;
          if (_stmt.isNull(_columnIndexOfNoun4)) {
            _tmpNoun4 = null;
          } else {
            _tmpNoun4 = _stmt.getText(_columnIndexOfNoun4);
          }
          final String _tmpNoun5;
          if (_stmt.isNull(_columnIndexOfNoun5)) {
            _tmpNoun5 = null;
          } else {
            _tmpNoun5 = _stmt.getText(_columnIndexOfNoun5);
          }
          final String _tmpVerb1;
          if (_stmt.isNull(_columnIndexOfVerb1)) {
            _tmpVerb1 = null;
          } else {
            _tmpVerb1 = _stmt.getText(_columnIndexOfVerb1);
          }
          final String _tmpVerb2;
          if (_stmt.isNull(_columnIndexOfVerb2)) {
            _tmpVerb2 = null;
          } else {
            _tmpVerb2 = _stmt.getText(_columnIndexOfVerb2);
          }
          final String _tmpVerb3;
          if (_stmt.isNull(_columnIndexOfVerb3)) {
            _tmpVerb3 = null;
          } else {
            _tmpVerb3 = _stmt.getText(_columnIndexOfVerb3);
          }
          final String _tmpVerb4;
          if (_stmt.isNull(_columnIndexOfVerb4)) {
            _tmpVerb4 = null;
          } else {
            _tmpVerb4 = _stmt.getText(_columnIndexOfVerb4);
          }
          final String _tmpVerb5;
          if (_stmt.isNull(_columnIndexOfVerb5)) {
            _tmpVerb5 = null;
          } else {
            _tmpVerb5 = _stmt.getText(_columnIndexOfVerb5);
          }
          final String _tmpVerb6;
          if (_stmt.isNull(_columnIndexOfVerb6)) {
            _tmpVerb6 = null;
          } else {
            _tmpVerb6 = _stmt.getText(_columnIndexOfVerb6);
          }
          final String _tmpAdj1;
          if (_stmt.isNull(_columnIndexOfAdj1)) {
            _tmpAdj1 = null;
          } else {
            _tmpAdj1 = _stmt.getText(_columnIndexOfAdj1);
          }
          final String _tmpAdj2;
          if (_stmt.isNull(_columnIndexOfAdj2)) {
            _tmpAdj2 = null;
          } else {
            _tmpAdj2 = _stmt.getText(_columnIndexOfAdj2);
          }
          final String _tmpAdj3;
          if (_stmt.isNull(_columnIndexOfAdj3)) {
            _tmpAdj3 = null;
          } else {
            _tmpAdj3 = _stmt.getText(_columnIndexOfAdj3);
          }
          final String _tmpAdj4;
          if (_stmt.isNull(_columnIndexOfAdj4)) {
            _tmpAdj4 = null;
          } else {
            _tmpAdj4 = _stmt.getText(_columnIndexOfAdj4);
          }
          final String _tmpAdj5;
          if (_stmt.isNull(_columnIndexOfAdj5)) {
            _tmpAdj5 = null;
          } else {
            _tmpAdj5 = _stmt.getText(_columnIndexOfAdj5);
          }
          final String _tmpAdj6;
          if (_stmt.isNull(_columnIndexOfAdj6)) {
            _tmpAdj6 = null;
          } else {
            _tmpAdj6 = _stmt.getText(_columnIndexOfAdj6);
          }
          final String _tmpAdv1;
          if (_stmt.isNull(_columnIndexOfAdv1)) {
            _tmpAdv1 = null;
          } else {
            _tmpAdv1 = _stmt.getText(_columnIndexOfAdv1);
          }
          final String _tmpAdv2;
          if (_stmt.isNull(_columnIndexOfAdv2)) {
            _tmpAdv2 = null;
          } else {
            _tmpAdv2 = _stmt.getText(_columnIndexOfAdv2);
          }
          final String _tmpAdv3;
          if (_stmt.isNull(_columnIndexOfAdv3)) {
            _tmpAdv3 = null;
          } else {
            _tmpAdv3 = _stmt.getText(_columnIndexOfAdv3);
          }
          final String _tmpAdv4;
          if (_stmt.isNull(_columnIndexOfAdv4)) {
            _tmpAdv4 = null;
          } else {
            _tmpAdv4 = _stmt.getText(_columnIndexOfAdv4);
          }
          final String _tmpPrep1;
          if (_stmt.isNull(_columnIndexOfPrep1)) {
            _tmpPrep1 = null;
          } else {
            _tmpPrep1 = _stmt.getText(_columnIndexOfPrep1);
          }
          final String _tmpPrep2;
          if (_stmt.isNull(_columnIndexOfPrep2)) {
            _tmpPrep2 = null;
          } else {
            _tmpPrep2 = _stmt.getText(_columnIndexOfPrep2);
          }
          final String _tmpConj1;
          if (_stmt.isNull(_columnIndexOfConj1)) {
            _tmpConj1 = null;
          } else {
            _tmpConj1 = _stmt.getText(_columnIndexOfConj1);
          }
          final String _tmpConj2;
          if (_stmt.isNull(_columnIndexOfConj2)) {
            _tmpConj2 = null;
          } else {
            _tmpConj2 = _stmt.getText(_columnIndexOfConj2);
          }
          final String _tmpIdiom1;
          if (_stmt.isNull(_columnIndexOfIdiom1)) {
            _tmpIdiom1 = null;
          } else {
            _tmpIdiom1 = _stmt.getText(_columnIndexOfIdiom1);
          }
          final String _tmpIdiom2;
          if (_stmt.isNull(_columnIndexOfIdiom2)) {
            _tmpIdiom2 = null;
          } else {
            _tmpIdiom2 = _stmt.getText(_columnIndexOfIdiom2);
          }
          _item = new Word(_tmpId,_tmpLevel,_tmpWord,_tmpNoun1,_tmpNoun2,_tmpNoun3,_tmpNoun4,_tmpNoun5,_tmpVerb1,_tmpVerb2,_tmpVerb3,_tmpVerb4,_tmpVerb5,_tmpVerb6,_tmpAdj1,_tmpAdj2,_tmpAdj3,_tmpAdj4,_tmpAdj5,_tmpAdj6,_tmpAdv1,_tmpAdv2,_tmpAdv3,_tmpAdv4,_tmpPrep1,_tmpPrep2,_tmpConj1,_tmpConj2,_tmpIdiom1,_tmpIdiom2);
          _result.add(_item);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
