package com.example.philip.myapplication2;

import android.app.Instrumentation;
import android.content.Context;
import android.test.InstrumentationTestCase;

/**
 * Created by philip on 1/3/16.
 */
public class UnabridgedDictionaryTests extends InstrumentationTestCase {
    public void testDataLoaded() {
        Instrumentation instrumentation = getInstrumentation();
        Context context = instrumentation.getTargetContext();
        UnabridgedDictionary unabridgedDictionary = UnabridgedDictionary.GetInstance(context);

        int size = unabridgedDictionary.wordList.size();

        assertEquals(size, 10000);
    }
}
