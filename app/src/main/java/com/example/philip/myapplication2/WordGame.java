package com.example.philip.myapplication2;

/**
 * Created by philip on 11/28/15.
 */
public class WordGame {

    User user;
    OriginalWord originalWord;
    UnabridgedDictionary unabridgedDictionary;

    public WordGame() {
        user = new User();
        originalWord = new OriginalWord();
        unabridgedDictionary = UnabridgedDictionary.GetInstance();
    }
}
