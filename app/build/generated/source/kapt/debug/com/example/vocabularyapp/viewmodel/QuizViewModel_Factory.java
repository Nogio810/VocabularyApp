package com.example.vocabularyapp.viewmodel;

import com.example.vocabularyapp.repository.VocabularyRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class QuizViewModel_Factory implements Factory<QuizViewModel> {
  private final Provider<VocabularyRepository> repositoryProvider;

  public QuizViewModel_Factory(Provider<VocabularyRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public QuizViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static QuizViewModel_Factory create(Provider<VocabularyRepository> repositoryProvider) {
    return new QuizViewModel_Factory(repositoryProvider);
  }

  public static QuizViewModel newInstance(VocabularyRepository repository) {
    return new QuizViewModel(repository);
  }
}
