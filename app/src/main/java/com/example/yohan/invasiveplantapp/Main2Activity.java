package com.example.yohan.invasiveplantapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button button1,button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button1 = findViewById(R.id.angry_btn);
        button2 = findViewById(R.id.angry_btn2);

         datacollection();

    }

    public void details(){
        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                      //  Intent i = new Intent(Main2Activity.this,  )

                    }
                }
        );
    }

    public void datacollection(){
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent i1 = new Intent(Main2Activity.this,MainActivity.class);
                        startActivity(i1);

                    }
                }
        );
    }
}
