package com.example.distinct;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.WindowDecorActionBar;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    EditText strings1,strings2;
    Button button;
    private TextView resultTextView;
    private Object String;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        strings1=(EditText)findViewById(R.id.strings1);
        strings2=(EditText)findViewById(R.id.strings2);
        resultTextView = findViewById(R.id.resultTextView);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @RequiresApi(api = Build.VERSION_CODES.N_MR1)
            @Override
            public void onClick(View v) {
                String str1 = strings1.getText().toString().toLowerCase();
                String str2 = strings2.getText().toString().toLowerCase();
                String result = findDifferentCharacters(str1, str2);
                resultTextView.setText(result);
            }
        });
    }

    private String findDifferentCharacters(String str1, String str2) {
        Set<Character> uniqueChars1 = new HashSet<>();
        Set<Character> uniqueChars2 = new HashSet<>();

        for (char c : str1.toCharArray()) {
            uniqueChars1.add(c);
        }

        for (char c : str2.toCharArray()) {
            uniqueChars2.add(c);
        }

        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append("Different characters in the first string:\n");
        for (char c : uniqueChars1) {
            if (!uniqueChars2.contains(c)) {
                resultBuilder.append(c).append(" ");
            }
        }

        resultBuilder.append("\nDifferent characters in the second string:\n");
        for (char c : uniqueChars2) {
            if (!uniqueChars1.contains(c)) {
                resultBuilder.append(c).append(" ");
            }
        }

        return resultBuilder.toString();
    }
}
