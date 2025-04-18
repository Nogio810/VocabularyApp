package com.example.vocabularyapp.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b]\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u00ab\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\"J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010N\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00eb\u0002\u0010a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010b\u001a\u00020c2\b\u0010d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010e\u001a\u00020\u0003H\u00d6\u0001J\t\u0010f\u001a\u00020\u0005H\u00d6\u0001R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010$R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0018\u0010 \u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0018\u0010!\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010$R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010$R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010$R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010$R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010$R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010$R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010$R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010$R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010$R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010$R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010$R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010$R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010$R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010$R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010$\u00a8\u0006g"}, d2 = {"Lcom/example/vocabularyapp/data/Word;", "", "id", "", "level", "", "word", "noun1", "noun2", "noun3", "noun4", "noun5", "verb1", "verb2", "verb3", "verb4", "verb5", "verb6", "adj1", "adj2", "adj3", "adj4", "adj5", "adj6", "adv1", "adv2", "adv3", "adv4", "prep1", "prep2", "conj1", "conj2", "idiom1", "idiom2", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdj1", "()Ljava/lang/String;", "getAdj2", "getAdj3", "getAdj4", "getAdj5", "getAdj6", "getAdv1", "getAdv2", "getAdv3", "getAdv4", "getConj1", "getConj2", "getId", "()I", "getIdiom1", "getIdiom2", "getLevel", "getNoun1", "getNoun2", "getNoun3", "getNoun4", "getNoun5", "getPrep1", "getPrep2", "getVerb1", "getVerb2", "getVerb3", "getVerb4", "getVerb5", "getVerb6", "getWord", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
@androidx.room.Entity(tableName = "vocabulary")
public final class Word {
    @androidx.room.PrimaryKey()
    @androidx.room.ColumnInfo(name = "\u5358\u8a9e\u756a\u53f7")
    private final int id = 0;
    @androidx.room.ColumnInfo(name = "\u30ec\u30d9\u30eb")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String level = null;
    @androidx.room.ColumnInfo(name = "\u5358\u8a9e")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String word = null;
    @androidx.room.ColumnInfo(name = "\u540d\u8a5e1")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String noun1 = null;
    @androidx.room.ColumnInfo(name = "\u540d\u8a5e2")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String noun2 = null;
    @androidx.room.ColumnInfo(name = "\u540d\u8a5e3")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String noun3 = null;
    @androidx.room.ColumnInfo(name = "\u540d\u8a5e4")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String noun4 = null;
    @androidx.room.ColumnInfo(name = "\u540d\u8a5e5")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String noun5 = null;
    @androidx.room.ColumnInfo(name = "\u52d5\u8a5e1")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String verb1 = null;
    @androidx.room.ColumnInfo(name = "\u52d5\u8a5e2")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String verb2 = null;
    @androidx.room.ColumnInfo(name = "\u52d5\u8a5e3")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String verb3 = null;
    @androidx.room.ColumnInfo(name = "\u52d5\u8a5e4")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String verb4 = null;
    @androidx.room.ColumnInfo(name = "\u52d5\u8a5e5")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String verb5 = null;
    @androidx.room.ColumnInfo(name = "\u52d5\u8a5e6")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String verb6 = null;
    @androidx.room.ColumnInfo(name = "\u5f62\u5bb9\u8a5e1")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String adj1 = null;
    @androidx.room.ColumnInfo(name = "\u5f62\u5bb9\u8a5e2")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String adj2 = null;
    @androidx.room.ColumnInfo(name = "\u5f62\u5bb9\u8a5e3")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String adj3 = null;
    @androidx.room.ColumnInfo(name = "\u5f62\u5bb9\u8a5e4")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String adj4 = null;
    @androidx.room.ColumnInfo(name = "\u5f62\u5bb9\u8a5e5")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String adj5 = null;
    @androidx.room.ColumnInfo(name = "\u5f62\u5bb9\u8a5e6")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String adj6 = null;
    @androidx.room.ColumnInfo(name = "\u526f\u8a5e1")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String adv1 = null;
    @androidx.room.ColumnInfo(name = "\u526f\u8a5e2")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String adv2 = null;
    @androidx.room.ColumnInfo(name = "\u526f\u8a5e3")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String adv3 = null;
    @androidx.room.ColumnInfo(name = "\u526f\u8a5e4")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String adv4 = null;
    @androidx.room.ColumnInfo(name = "\u524d\u7f6e\u8a5e1")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String prep1 = null;
    @androidx.room.ColumnInfo(name = "\u524d\u7f6e\u8a5e2")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String prep2 = null;
    @androidx.room.ColumnInfo(name = "\u63a5\u7d9a\u8a5e1")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String conj1 = null;
    @androidx.room.ColumnInfo(name = "\u63a5\u7d9a\u8a5e2")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String conj2 = null;
    @androidx.room.ColumnInfo(name = "\u719f\u8a9e1")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String idiom1 = null;
    @androidx.room.ColumnInfo(name = "\u719f\u8a9e2")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String idiom2 = null;
    
    public Word(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String level, @org.jetbrains.annotations.NotNull()
    java.lang.String word, @org.jetbrains.annotations.Nullable()
    java.lang.String noun1, @org.jetbrains.annotations.Nullable()
    java.lang.String noun2, @org.jetbrains.annotations.Nullable()
    java.lang.String noun3, @org.jetbrains.annotations.Nullable()
    java.lang.String noun4, @org.jetbrains.annotations.Nullable()
    java.lang.String noun5, @org.jetbrains.annotations.Nullable()
    java.lang.String verb1, @org.jetbrains.annotations.Nullable()
    java.lang.String verb2, @org.jetbrains.annotations.Nullable()
    java.lang.String verb3, @org.jetbrains.annotations.Nullable()
    java.lang.String verb4, @org.jetbrains.annotations.Nullable()
    java.lang.String verb5, @org.jetbrains.annotations.Nullable()
    java.lang.String verb6, @org.jetbrains.annotations.Nullable()
    java.lang.String adj1, @org.jetbrains.annotations.Nullable()
    java.lang.String adj2, @org.jetbrains.annotations.Nullable()
    java.lang.String adj3, @org.jetbrains.annotations.Nullable()
    java.lang.String adj4, @org.jetbrains.annotations.Nullable()
    java.lang.String adj5, @org.jetbrains.annotations.Nullable()
    java.lang.String adj6, @org.jetbrains.annotations.Nullable()
    java.lang.String adv1, @org.jetbrains.annotations.Nullable()
    java.lang.String adv2, @org.jetbrains.annotations.Nullable()
    java.lang.String adv3, @org.jetbrains.annotations.Nullable()
    java.lang.String adv4, @org.jetbrains.annotations.Nullable()
    java.lang.String prep1, @org.jetbrains.annotations.Nullable()
    java.lang.String prep2, @org.jetbrains.annotations.Nullable()
    java.lang.String conj1, @org.jetbrains.annotations.Nullable()
    java.lang.String conj2, @org.jetbrains.annotations.Nullable()
    java.lang.String idiom1, @org.jetbrains.annotations.Nullable()
    java.lang.String idiom2) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWord() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNoun1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNoun2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNoun3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNoun4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNoun5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVerb1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVerb2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVerb3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVerb4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVerb5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVerb6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAdj1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAdj2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAdj3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAdj4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAdj5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAdj6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAdv1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAdv2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAdv3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAdv4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrep1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrep2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getConj1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getConj2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdiom1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdiom2() {
        return null;
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.vocabularyapp.data.Word copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String level, @org.jetbrains.annotations.NotNull()
    java.lang.String word, @org.jetbrains.annotations.Nullable()
    java.lang.String noun1, @org.jetbrains.annotations.Nullable()
    java.lang.String noun2, @org.jetbrains.annotations.Nullable()
    java.lang.String noun3, @org.jetbrains.annotations.Nullable()
    java.lang.String noun4, @org.jetbrains.annotations.Nullable()
    java.lang.String noun5, @org.jetbrains.annotations.Nullable()
    java.lang.String verb1, @org.jetbrains.annotations.Nullable()
    java.lang.String verb2, @org.jetbrains.annotations.Nullable()
    java.lang.String verb3, @org.jetbrains.annotations.Nullable()
    java.lang.String verb4, @org.jetbrains.annotations.Nullable()
    java.lang.String verb5, @org.jetbrains.annotations.Nullable()
    java.lang.String verb6, @org.jetbrains.annotations.Nullable()
    java.lang.String adj1, @org.jetbrains.annotations.Nullable()
    java.lang.String adj2, @org.jetbrains.annotations.Nullable()
    java.lang.String adj3, @org.jetbrains.annotations.Nullable()
    java.lang.String adj4, @org.jetbrains.annotations.Nullable()
    java.lang.String adj5, @org.jetbrains.annotations.Nullable()
    java.lang.String adj6, @org.jetbrains.annotations.Nullable()
    java.lang.String adv1, @org.jetbrains.annotations.Nullable()
    java.lang.String adv2, @org.jetbrains.annotations.Nullable()
    java.lang.String adv3, @org.jetbrains.annotations.Nullable()
    java.lang.String adv4, @org.jetbrains.annotations.Nullable()
    java.lang.String prep1, @org.jetbrains.annotations.Nullable()
    java.lang.String prep2, @org.jetbrains.annotations.Nullable()
    java.lang.String conj1, @org.jetbrains.annotations.Nullable()
    java.lang.String conj2, @org.jetbrains.annotations.Nullable()
    java.lang.String idiom1, @org.jetbrains.annotations.Nullable()
    java.lang.String idiom2) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}