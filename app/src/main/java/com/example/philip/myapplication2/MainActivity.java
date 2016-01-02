package com.example.philip.myapplication2;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WordGame wordGame = new WordGame(this);
    }

    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = (EditText) findViewById(R.id.editText);
        final TextView mainWordText = (TextView) findViewById(R.id.mainWordText);

        mainWordText.setText("Hello");

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                String mainWordString = mainWordText.getText().toString().toUpperCase();

                ArrayList<Character> arrayList = new ArrayList<>();
                for (int i = 0; i < mainWordString.length(); i++) {
                    arrayList.add(mainWordString.charAt(i));
                }

                StringBuilder sb = new StringBuilder();

                boolean replace = false;
                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);

                    int index = -1;
                    for (int j = 0; j < arrayList.size(); j++) {
                        if (Character.toUpperCase(ch) == arrayList.get(j)) {
                            index = j;
                            break;
                        }
                    }

                    if (index != -1) {
                        sb.append(ch);
                        arrayList.remove(index);
                    } else {
                        replace = true;
                    }
                }

                if (replace)
                    s.replace(0, s.length(), sb, 0, sb.length());

                Log.d("addTextChangedListener", s.toString());
            }
        });
    }
*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
