package com.example.philip.myapplication2;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by philip on 11/28/15.
 */
public class UnabridgedDictionary {
    private static UnabridgedDictionary instance;
    ArrayList<String> wordList = new ArrayList<>();

    UnabridgedDictionary(Context context) {
        Resources resources = context.getResources();


        try {
            InputStream inputStream = resources.openRawResource(R.raw.google_10000_english);
            BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = r.readLine()) != null) {
                wordList.add(line);
            }
            inputStream.close();
        } catch (IOException exception) {
            Toast.makeText(context, "Exception when reading file", Toast.LENGTH_LONG).show();
        }
    }

    public static UnabridgedDictionary GetInstance(Context context) {
        if (instance == null)
            instance = new UnabridgedDictionary(context);
        return instance;
    }

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
}
