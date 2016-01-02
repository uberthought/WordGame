package com.example.philip.myapplication2;

import android.content.Context;

/**
 * Created by philip on 11/28/15.
 */
public class WordGame {

    User user;
    OriginalWord originalWord;
    UnabridgedDictionary unabridgedDictionary;

    public WordGame(Context context) {
        user = new User();
        originalWord = new OriginalWord();
        unabridgedDictionary = UnabridgedDictionary.GetInstance(context);
    }
}
