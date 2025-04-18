package com.example.vocabularyapp.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class LevelSelectionViewModel_Factory implements Factory<LevelSelectionViewModel> {
  @Override
  public LevelSelectionViewModel get() {
    return newInstance();
  }

  public static LevelSelectionViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static LevelSelectionViewModel newInstance() {
    return new LevelSelectionViewModel();
  }

  private static final class InstanceHolder {
    private static final LevelSelectionViewModel_Factory INSTANCE = new LevelSelectionViewModel_Factory();
  }
}
