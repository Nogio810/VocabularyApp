package com.example.vocabularyapp.data;

import androidx.annotation.NonNull;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class VocabularyDatabase_Impl extends VocabularyDatabase {
  private volatile VocabularyDao _vocabularyDao;

  @Override
  @NonNull
  protected RoomOpenDelegate createOpenDelegate() {
    final RoomOpenDelegate _openDelegate = new RoomOpenDelegate(1, "91724a93eaf9ba30c17170fbb8c839f6", "bb23775cf93e7e3cf1364478cb4c7bf9") {
      @Override
      public void createAllTables(@NonNull final SQLiteConnection connection) {
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `vocabulary` (`単語番号` INTEGER NOT NULL, `レベル` TEXT NOT NULL, `単語` TEXT NOT NULL, `名詞1` TEXT, `名詞2` TEXT, `名詞3` TEXT, `名詞4` TEXT, `名詞5` TEXT, `動詞1` TEXT, `動詞2` TEXT, `動詞3` TEXT, `動詞4` TEXT, `動詞5` TEXT, `動詞6` TEXT, `形容詞1` TEXT, `形容詞2` TEXT, `形容詞3` TEXT, `形容詞4` TEXT, `形容詞5` TEXT, `形容詞6` TEXT, `副詞1` TEXT, `副詞2` TEXT, `副詞3` TEXT, `副詞4` TEXT, `前置詞1` TEXT, `前置詞2` TEXT, `接続詞1` TEXT, `接続詞2` TEXT, `熟語1` TEXT, `熟語2` TEXT, PRIMARY KEY(`単語番号`))");
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '91724a93eaf9ba30c17170fbb8c839f6')");
      }

      @Override
      public void dropAllTables(@NonNull final SQLiteConnection connection) {
        SQLite.execSQL(connection, "DROP TABLE IF EXISTS `vocabulary`");
      }

      @Override
      public void onCreate(@NonNull final SQLiteConnection connection) {
      }

      @Override
      public void onOpen(@NonNull final SQLiteConnection connection) {
        internalInitInvalidationTracker(connection);
      }

      @Override
      public void onPreMigrate(@NonNull final SQLiteConnection connection) {
        DBUtil.dropFtsSyncTriggers(connection);
      }

      @Override
      public void onPostMigrate(@NonNull final SQLiteConnection connection) {
      }

      @Override
      @NonNull
      public RoomOpenDelegate.ValidationResult onValidateSchema(
          @NonNull final SQLiteConnection connection) {
        final Map<String, TableInfo.Column> _columnsVocabulary = new HashMap<String, TableInfo.Column>(30);
        _columnsVocabulary.put("単語番号", new TableInfo.Column("単語番号", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("レベル", new TableInfo.Column("レベル", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("単語", new TableInfo.Column("単語", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("名詞1", new TableInfo.Column("名詞1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("名詞2", new TableInfo.Column("名詞2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("名詞3", new TableInfo.Column("名詞3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("名詞4", new TableInfo.Column("名詞4", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("名詞5", new TableInfo.Column("名詞5", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("動詞1", new TableInfo.Column("動詞1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("動詞2", new TableInfo.Column("動詞2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("動詞3", new TableInfo.Column("動詞3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("動詞4", new TableInfo.Column("動詞4", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("動詞5", new TableInfo.Column("動詞5", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("動詞6", new TableInfo.Column("動詞6", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("形容詞1", new TableInfo.Column("形容詞1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("形容詞2", new TableInfo.Column("形容詞2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("形容詞3", new TableInfo.Column("形容詞3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("形容詞4", new TableInfo.Column("形容詞4", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("形容詞5", new TableInfo.Column("形容詞5", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("形容詞6", new TableInfo.Column("形容詞6", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("副詞1", new TableInfo.Column("副詞1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("副詞2", new TableInfo.Column("副詞2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("副詞3", new TableInfo.Column("副詞3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("副詞4", new TableInfo.Column("副詞4", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("前置詞1", new TableInfo.Column("前置詞1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("前置詞2", new TableInfo.Column("前置詞2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("接続詞1", new TableInfo.Column("接続詞1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("接続詞2", new TableInfo.Column("接続詞2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("熟語1", new TableInfo.Column("熟語1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVocabulary.put("熟語2", new TableInfo.Column("熟語2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final Set<TableInfo.ForeignKey> _foreignKeysVocabulary = new HashSet<TableInfo.ForeignKey>(0);
        final Set<TableInfo.Index> _indicesVocabulary = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoVocabulary = new TableInfo("vocabulary", _columnsVocabulary, _foreignKeysVocabulary, _indicesVocabulary);
        final TableInfo _existingVocabulary = TableInfo.read(connection, "vocabulary");
        if (!_infoVocabulary.equals(_existingVocabulary)) {
          return new RoomOpenDelegate.ValidationResult(false, "vocabulary(com.example.vocabularyapp.data.Word).\n"
                  + " Expected:\n" + _infoVocabulary + "\n"
                  + " Found:\n" + _existingVocabulary);
        }
        return new RoomOpenDelegate.ValidationResult(true, null);
      }
    };
    return _openDelegate;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final Map<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final Map<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "vocabulary");
  }

  @Override
  public void clearAllTables() {
    super.performClear(false, "vocabulary");
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final Map<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(VocabularyDao.class, VocabularyDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final Set<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public VocabularyDao vocabularyDao() {
    if (_vocabularyDao != null) {
      return _vocabularyDao;
    } else {
      synchronized(this) {
        if(_vocabularyDao == null) {
          _vocabularyDao = new VocabularyDao_Impl(this);
        }
        return _vocabularyDao;
      }
    }
  }
}
