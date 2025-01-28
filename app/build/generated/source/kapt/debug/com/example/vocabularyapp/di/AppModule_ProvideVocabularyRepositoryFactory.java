package com.example.vocabularyapp.di;

import com.example.vocabularyapp.data.VocabularyDao;
import com.example.vocabularyapp.repository.VocabularyRepository;
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
public final class AppModule_ProvideVocabularyRepositoryFactory implements Factory<VocabularyRepository> {
  private final Provider<VocabularyDao> daoProvider;

  public AppModule_ProvideVocabularyRepositoryFactory(Provider<VocabularyDao> daoProvider) {
    this.daoProvider = daoProvider;
  }

  @Override
  public VocabularyRepository get() {
    return provideVocabularyRepository(daoProvider.get());
  }

  public static AppModule_ProvideVocabularyRepositoryFactory create(
      Provider<VocabularyDao> daoProvider) {
    return new AppModule_ProvideVocabularyRepositoryFactory(daoProvider);
  }

  public static VocabularyRepository provideVocabularyRepository(VocabularyDao dao) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideVocabularyRepository(dao));
  }
}
