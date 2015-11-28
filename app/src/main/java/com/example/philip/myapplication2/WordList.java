package com.example.philip.myapplication2;

import java.util.HashSet;

/**
 * Created by philip on 11/28/15.
 */
public class WordList {
    public void Add(Word word) {}
    public void Remove(Word word) {}
    public int Length;
    public int MaximumLength;

    HashSet<Word> wordList;

    public WordList() {
        wordList = new HashSet<Word>();
    }
}
