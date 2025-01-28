package com.example.vocabularyapp.di;

import com.example.vocabularyapp.data.VocabularyDao;
import com.example.vocabularyapp.data.VocabularyDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class AppModule_ProvideVocabularyDaoFactory implements Factory<VocabularyDao> {
  private final Provider<VocabularyDatabase> databaseProvider;

  public AppModule_ProvideVocabularyDaoFactory(Provider<VocabularyDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public VocabularyDao get() {
    return provideVocabularyDao(databaseProvider.get());
  }

  public static AppModule_ProvideVocabularyDaoFactory create(
      Provider<VocabularyDatabase> databaseProvider) {
    return new AppModule_ProvideVocabularyDaoFactory(databaseProvider);
  }

  public static VocabularyDao provideVocabularyDao(VocabularyDatabase database) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideVocabularyDao(database));
  }
}
