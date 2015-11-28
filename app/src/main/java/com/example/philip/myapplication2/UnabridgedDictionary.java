package com.example.philip.myapplication2;

/**
 * Created by philip on 11/28/15.
 */
public class UnabridgedDictionary {
    private static UnabridgedDictionary instance;

    String[] GetPossibleWords(Word word) {
        return null;
    }
    int GetRank(Word word) {
        return -1;
    }

    String GetPronounciation(Word word) {
        return null;
    }

    String GetDefinition(Word word) {
        return null;
    }

    public static UnabridgedDictionary GetInstance() {
        if (instance == null)
            instance = new UnabridgedDictionary();
        return  instance;
    }
}
