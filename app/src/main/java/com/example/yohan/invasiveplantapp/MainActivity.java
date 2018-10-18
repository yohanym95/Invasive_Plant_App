package com.example.yohan.invasiveplantapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

     Spinner spinner1,spinner2,spinner3,spinner4;
     EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner1 = findViewById(R.id.spinner);
        spinner2 = findViewById(R.id.spinner3);
        spinner3 = findViewById(R.id.spinner4);
        spinner4 = findViewById(R.id.spinner5);
        editText = findViewById(R.id.editText2);
    }
}
