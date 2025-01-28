package com.example.vocabularyapp.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b;\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u00bd\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0017J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u00e7\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010D\u001a\u00020\u0003H\u00d6\u0001J\t\u0010E\u001a\u00020\u0006H\u00d6\u0001R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0019R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0019\u00a8\u0006F"}, d2 = {"Lcom/example/vocabularyapp/data/Word;", "", "id", "", "level", "word", "", "noun1", "noun2", "noun3", "noun4", "verb1", "verb2", "verb3", "adj1", "adj2", "adj3", "adj4", "adv1", "adv2", "prep1", "prep2", "conj", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdj1", "()Ljava/lang/String;", "getAdj2", "getAdj3", "getAdj4", "getAdv1", "getAdv2", "getConj", "getId", "()I", "getLevel", "getNoun1", "getNoun2", "getNoun3", "getNoun4", "getPrep1", "getPrep2", "getVerb1", "getVerb2", "getVerb3", "getWord", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
@androidx.room.Entity(tableName = "vocabulary1")
public final class Word {
    @androidx.room.PrimaryKey()
    @androidx.room.ColumnInfo(name = "\u5358\u8a9e\u756a\u53f7")
    private final int id = 0;
    @androidx.room.ColumnInfo(name = "\u30ec\u30d9\u30eb")
    private final int level = 0;
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
    @androidx.room.ColumnInfo(name = "\u52d5\u8a5e1")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String verb1 = null;
    @androidx.room.ColumnInfo(name = "\u52d5\u8a5e2")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String verb2 = null;
    @androidx.room.ColumnInfo(name = "\u52d5\u8a5e3")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String verb3 = null;
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
    @androidx.room.ColumnInfo(name = "\u526f\u8a5e1")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String adv1 = null;
    @androidx.room.ColumnInfo(name = "\u526f\u8a5e2")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String adv2 = null;
    @androidx.room.ColumnInfo(name = "\u524d\u7f6e\u8a5e1")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String prep1 = null;
    @androidx.room.ColumnInfo(name = "\u524d\u7f6e\u8a5e2")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String prep2 = null;
    @androidx.room.ColumnInfo(name = "\u63a5\u7d9a\u8a5e")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String conj = null;
    
    public Word(int id, int level, @org.jetbrains.annotations.NotNull()
    java.lang.String word, @org.jetbrains.annotations.Nullable()
    java.lang.String noun1, @org.jetbrains.annotations.Nullable()
    java.lang.String noun2, @org.jetbrains.annotations.Nullable()
    java.lang.String noun3, @org.jetbrains.annotations.Nullable()
    java.lang.String noun4, @org.jetbrains.annotations.Nullable()
    java.lang.String verb1, @org.jetbrains.annotations.Nullable()
    java.lang.String verb2, @org.jetbrains.annotations.Nullable()
    java.lang.String verb3, @org.jetbrains.annotations.Nullable()
    java.lang.String adj1, @org.jetbrains.annotations.Nullable()
    java.lang.String adj2, @org.jetbrains.annotations.Nullable()
    java.lang.String adj3, @org.jetbrains.annotations.Nullable()
    java.lang.String adj4, @org.jetbrains.annotations.Nullable()
    java.lang.String adv1, @org.jetbrains.annotations.Nullable()
    java.lang.String adv2, @org.jetbrains.annotations.Nullable()
    java.lang.String prep1, @org.jetbrains.annotations.Nullable()
    java.lang.String prep2, @org.jetbrains.annotations.Nullable()
    java.lang.String conj) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final int getLevel() {
        return 0;
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
    public final java.lang.String getAdv1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAdv2() {
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
    public final java.lang.String getConj() {
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
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
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
    public final com.example.vocabularyapp.data.Word copy(int id, int level, @org.jetbrains.annotations.NotNull()
    java.lang.String word, @org.jetbrains.annotations.Nullable()
    java.lang.String noun1, @org.jetbrains.annotations.Nullable()
    java.lang.String noun2, @org.jetbrains.annotations.Nullable()
    java.lang.String noun3, @org.jetbrains.annotations.Nullable()
    java.lang.String noun4, @org.jetbrains.annotations.Nullable()
    java.lang.String verb1, @org.jetbrains.annotations.Nullable()
    java.lang.String verb2, @org.jetbrains.annotations.Nullable()
    java.lang.String verb3, @org.jetbrains.annotations.Nullable()
    java.lang.String adj1, @org.jetbrains.annotations.Nullable()
    java.lang.String adj2, @org.jetbrains.annotations.Nullable()
    java.lang.String adj3, @org.jetbrains.annotations.Nullable()
    java.lang.String adj4, @org.jetbrains.annotations.Nullable()
    java.lang.String adv1, @org.jetbrains.annotations.Nullable()
    java.lang.String adv2, @org.jetbrains.annotations.Nullable()
    java.lang.String prep1, @org.jetbrains.annotations.Nullable()
    java.lang.String prep2, @org.jetbrains.annotations.Nullable()
    java.lang.String conj) {
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