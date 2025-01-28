package com.example.vocabularyapp.data;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class VocabularyDao_Impl implements VocabularyDao {
  private final RoomDatabase __db;

  public VocabularyDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
  }

  @Override
  public Object getRandomWord(final Continuation<? super Word> $completion) {
    final String _sql = "SELECT * FROM vocabulary1 ORDER BY RANDOM() LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Word>() {
      @Override
      @NonNull
      public Word call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "単語番号");
          final int _cursorIndexOfLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "レベル");
          final int _cursorIndexOfWord = CursorUtil.getColumnIndexOrThrow(_cursor, "単語");
          final int _cursorIndexOfNoun1 = CursorUtil.getColumnIndexOrThrow(_cursor, "名詞1");
          final int _cursorIndexOfNoun2 = CursorUtil.getColumnIndexOrThrow(_cursor, "名詞2");
          final int _cursorIndexOfNoun3 = CursorUtil.getColumnIndexOrThrow(_cursor, "名詞3");
          final int _cursorIndexOfNoun4 = CursorUtil.getColumnIndexOrThrow(_cursor, "名詞4");
          final int _cursorIndexOfVerb1 = CursorUtil.getColumnIndexOrThrow(_cursor, "動詞1");
          final int _cursorIndexOfVerb2 = CursorUtil.getColumnIndexOrThrow(_cursor, "動詞2");
          final int _cursorIndexOfVerb3 = CursorUtil.getColumnIndexOrThrow(_cursor, "動詞3");
          final int _cursorIndexOfAdj1 = CursorUtil.getColumnIndexOrThrow(_cursor, "形容詞1");
          final int _cursorIndexOfAdj2 = CursorUtil.getColumnIndexOrThrow(_cursor, "形容詞2");
          final int _cursorIndexOfAdj3 = CursorUtil.getColumnIndexOrThrow(_cursor, "形容詞3");
          final int _cursorIndexOfAdj4 = CursorUtil.getColumnIndexOrThrow(_cursor, "形容詞4");
          final int _cursorIndexOfAdv1 = CursorUtil.getColumnIndexOrThrow(_cursor, "副詞1");
          final int _cursorIndexOfAdv2 = CursorUtil.getColumnIndexOrThrow(_cursor, "副詞2");
          final int _cursorIndexOfPrep1 = CursorUtil.getColumnIndexOrThrow(_cursor, "前置詞1");
          final int _cursorIndexOfPrep2 = CursorUtil.getColumnIndexOrThrow(_cursor, "前置詞2");
          final int _cursorIndexOfConj = CursorUtil.getColumnIndexOrThrow(_cursor, "接続詞");
          final Word _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final int _tmpLevel;
            _tmpLevel = _cursor.getInt(_cursorIndexOfLevel);
            final String _tmpWord;
            if (_cursor.isNull(_cursorIndexOfWord)) {
              _tmpWord = null;
            } else {
              _tmpWord = _cursor.getString(_cursorIndexOfWord);
            }
            final String _tmpNoun1;
            if (_cursor.isNull(_cursorIndexOfNoun1)) {
              _tmpNoun1 = null;
            } else {
              _tmpNoun1 = _cursor.getString(_cursorIndexOfNoun1);
            }
            final String _tmpNoun2;
            if (_cursor.isNull(_cursorIndexOfNoun2)) {
              _tmpNoun2 = null;
            } else {
              _tmpNoun2 = _cursor.getString(_cursorIndexOfNoun2);
            }
            final String _tmpNoun3;
            if (_cursor.isNull(_cursorIndexOfNoun3)) {
              _tmpNoun3 = null;
            } else {
              _tmpNoun3 = _cursor.getString(_cursorIndexOfNoun3);
            }
            final String _tmpNoun4;
            if (_cursor.isNull(_cursorIndexOfNoun4)) {
              _tmpNoun4 = null;
            } else {
              _tmpNoun4 = _cursor.getString(_cursorIndexOfNoun4);
            }
            final String _tmpVerb1;
            if (_cursor.isNull(_cursorIndexOfVerb1)) {
              _tmpVerb1 = null;
            } else {
              _tmpVerb1 = _cursor.getString(_cursorIndexOfVerb1);
            }
            final String _tmpVerb2;
            if (_cursor.isNull(_cursorIndexOfVerb2)) {
              _tmpVerb2 = null;
            } else {
              _tmpVerb2 = _cursor.getString(_cursorIndexOfVerb2);
            }
            final String _tmpVerb3;
            if (_cursor.isNull(_cursorIndexOfVerb3)) {
              _tmpVerb3 = null;
            } else {
              _tmpVerb3 = _cursor.getString(_cursorIndexOfVerb3);
            }
            final String _tmpAdj1;
            if (_cursor.isNull(_cursorIndexOfAdj1)) {
              _tmpAdj1 = null;
            } else {
              _tmpAdj1 = _cursor.getString(_cursorIndexOfAdj1);
            }
            final String _tmpAdj2;
            if (_cursor.isNull(_cursorIndexOfAdj2)) {
              _tmpAdj2 = null;
            } else {
              _tmpAdj2 = _cursor.getString(_cursorIndexOfAdj2);
            }
            final String _tmpAdj3;
            if (_cursor.isNull(_cursorIndexOfAdj3)) {
              _tmpAdj3 = null;
            } else {
              _tmpAdj3 = _cursor.getString(_cursorIndexOfAdj3);
            }
            final String _tmpAdj4;
            if (_cursor.isNull(_cursorIndexOfAdj4)) {
              _tmpAdj4 = null;
            } else {
              _tmpAdj4 = _cursor.getString(_cursorIndexOfAdj4);
            }
            final String _tmpAdv1;
            if (_cursor.isNull(_cursorIndexOfAdv1)) {
              _tmpAdv1 = null;
            } else {
              _tmpAdv1 = _cursor.getString(_cursorIndexOfAdv1);
            }
            final String _tmpAdv2;
            if (_cursor.isNull(_cursorIndexOfAdv2)) {
              _tmpAdv2 = null;
            } else {
              _tmpAdv2 = _cursor.getString(_cursorIndexOfAdv2);
            }
            final String _tmpPrep1;
            if (_cursor.isNull(_cursorIndexOfPrep1)) {
              _tmpPrep1 = null;
            } else {
              _tmpPrep1 = _cursor.getString(_cursorIndexOfPrep1);
            }
            final String _tmpPrep2;
            if (_cursor.isNull(_cursorIndexOfPrep2)) {
              _tmpPrep2 = null;
            } else {
              _tmpPrep2 = _cursor.getString(_cursorIndexOfPrep2);
            }
            final String _tmpConj;
            if (_cursor.isNull(_cursorIndexOfConj)) {
              _tmpConj = null;
            } else {
              _tmpConj = _cursor.getString(_cursorIndexOfConj);
            }
            _result = new Word(_tmpId,_tmpLevel,_tmpWord,_tmpNoun1,_tmpNoun2,_tmpNoun3,_tmpNoun4,_tmpVerb1,_tmpVerb2,_tmpVerb3,_tmpAdj1,_tmpAdj2,_tmpAdj3,_tmpAdj4,_tmpAdv1,_tmpAdv2,_tmpPrep1,_tmpPrep2,_tmpConj);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getOtherTranslations(final int excludeWordId,
      final Continuation<? super List<Word>> $completion) {
    final String _sql = "SELECT * FROM vocabulary1 WHERE 単語番号 != ? ORDER BY RANDOM() LIMIT 3";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, excludeWordId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Word>>() {
      @Override
      @NonNull
      public List<Word> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "単語番号");
          final int _cursorIndexOfLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "レベル");
          final int _cursorIndexOfWord = CursorUtil.getColumnIndexOrThrow(_cursor, "単語");
          final int _cursorIndexOfNoun1 = CursorUtil.getColumnIndexOrThrow(_cursor, "名詞1");
          final int _cursorIndexOfNoun2 = CursorUtil.getColumnIndexOrThrow(_cursor, "名詞2");
          final int _cursorIndexOfNoun3 = CursorUtil.getColumnIndexOrThrow(_cursor, "名詞3");
          final int _cursorIndexOfNoun4 = CursorUtil.getColumnIndexOrThrow(_cursor, "名詞4");
          final int _cursorIndexOfVerb1 = CursorUtil.getColumnIndexOrThrow(_cursor, "動詞1");
          final int _cursorIndexOfVerb2 = CursorUtil.getColumnIndexOrThrow(_cursor, "動詞2");
          final int _cursorIndexOfVerb3 = CursorUtil.getColumnIndexOrThrow(_cursor, "動詞3");
          final int _cursorIndexOfAdj1 = CursorUtil.getColumnIndexOrThrow(_cursor, "形容詞1");
          final int _cursorIndexOfAdj2 = CursorUtil.getColumnIndexOrThrow(_cursor, "形容詞2");
          final int _cursorIndexOfAdj3 = CursorUtil.getColumnIndexOrThrow(_cursor, "形容詞3");
          final int _cursorIndexOfAdj4 = CursorUtil.getColumnIndexOrThrow(_cursor, "形容詞4");
          final int _cursorIndexOfAdv1 = CursorUtil.getColumnIndexOrThrow(_cursor, "副詞1");
          final int _cursorIndexOfAdv2 = CursorUtil.getColumnIndexOrThrow(_cursor, "副詞2");
          final int _cursorIndexOfPrep1 = CursorUtil.getColumnIndexOrThrow(_cursor, "前置詞1");
          final int _cursorIndexOfPrep2 = CursorUtil.getColumnIndexOrThrow(_cursor, "前置詞2");
          final int _cursorIndexOfConj = CursorUtil.getColumnIndexOrThrow(_cursor, "接続詞");
          final List<Word> _result = new ArrayList<Word>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Word _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final int _tmpLevel;
            _tmpLevel = _cursor.getInt(_cursorIndexOfLevel);
            final String _tmpWord;
            if (_cursor.isNull(_cursorIndexOfWord)) {
              _tmpWord = null;
            } else {
              _tmpWord = _cursor.getString(_cursorIndexOfWord);
            }
            final String _tmpNoun1;
            if (_cursor.isNull(_cursorIndexOfNoun1)) {
              _tmpNoun1 = null;
            } else {
              _tmpNoun1 = _cursor.getString(_cursorIndexOfNoun1);
            }
            final String _tmpNoun2;
            if (_cursor.isNull(_cursorIndexOfNoun2)) {
              _tmpNoun2 = null;
            } else {
              _tmpNoun2 = _cursor.getString(_cursorIndexOfNoun2);
            }
            final String _tmpNoun3;
            if (_cursor.isNull(_cursorIndexOfNoun3)) {
              _tmpNoun3 = null;
            } else {
              _tmpNoun3 = _cursor.getString(_cursorIndexOfNoun3);
            }
            final String _tmpNoun4;
            if (_cursor.isNull(_cursorIndexOfNoun4)) {
              _tmpNoun4 = null;
            } else {
              _tmpNoun4 = _cursor.getString(_cursorIndexOfNoun4);
            }
            final String _tmpVerb1;
            if (_cursor.isNull(_cursorIndexOfVerb1)) {
              _tmpVerb1 = null;
            } else {
              _tmpVerb1 = _cursor.getString(_cursorIndexOfVerb1);
            }
            final String _tmpVerb2;
            if (_cursor.isNull(_cursorIndexOfVerb2)) {
              _tmpVerb2 = null;
            } else {
              _tmpVerb2 = _cursor.getString(_cursorIndexOfVerb2);
            }
            final String _tmpVerb3;
            if (_cursor.isNull(_cursorIndexOfVerb3)) {
              _tmpVerb3 = null;
            } else {
              _tmpVerb3 = _cursor.getString(_cursorIndexOfVerb3);
            }
            final String _tmpAdj1;
            if (_cursor.isNull(_cursorIndexOfAdj1)) {
              _tmpAdj1 = null;
            } else {
              _tmpAdj1 = _cursor.getString(_cursorIndexOfAdj1);
            }
            final String _tmpAdj2;
            if (_cursor.isNull(_cursorIndexOfAdj2)) {
              _tmpAdj2 = null;
            } else {
              _tmpAdj2 = _cursor.getString(_cursorIndexOfAdj2);
            }
            final String _tmpAdj3;
            if (_cursor.isNull(_cursorIndexOfAdj3)) {
              _tmpAdj3 = null;
            } else {
              _tmpAdj3 = _cursor.getString(_cursorIndexOfAdj3);
            }
            final String _tmpAdj4;
            if (_cursor.isNull(_cursorIndexOfAdj4)) {
              _tmpAdj4 = null;
            } else {
              _tmpAdj4 = _cursor.getString(_cursorIndexOfAdj4);
            }
            final String _tmpAdv1;
            if (_cursor.isNull(_cursorIndexOfAdv1)) {
              _tmpAdv1 = null;
            } else {
              _tmpAdv1 = _cursor.getString(_cursorIndexOfAdv1);
            }
            final String _tmpAdv2;
            if (_cursor.isNull(_cursorIndexOfAdv2)) {
              _tmpAdv2 = null;
            } else {
              _tmpAdv2 = _cursor.getString(_cursorIndexOfAdv2);
            }
            final String _tmpPrep1;
            if (_cursor.isNull(_cursorIndexOfPrep1)) {
              _tmpPrep1 = null;
            } else {
              _tmpPrep1 = _cursor.getString(_cursorIndexOfPrep1);
            }
            final String _tmpPrep2;
            if (_cursor.isNull(_cursorIndexOfPrep2)) {
              _tmpPrep2 = null;
            } else {
              _tmpPrep2 = _cursor.getString(_cursorIndexOfPrep2);
            }
            final String _tmpConj;
            if (_cursor.isNull(_cursorIndexOfConj)) {
              _tmpConj = null;
            } else {
              _tmpConj = _cursor.getString(_cursorIndexOfConj);
            }
            _item = new Word(_tmpId,_tmpLevel,_tmpWord,_tmpNoun1,_tmpNoun2,_tmpNoun3,_tmpNoun4,_tmpVerb1,_tmpVerb2,_tmpVerb3,_tmpAdj1,_tmpAdj2,_tmpAdj3,_tmpAdj4,_tmpAdv1,_tmpAdv2,_tmpPrep1,_tmpPrep2,_tmpConj);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
