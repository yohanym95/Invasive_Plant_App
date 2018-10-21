package com.example.yohan.invasiveplantapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

     Spinner spinner1,spinner2,spinner3,spinner4,spinner5,spinner6,spinner7;
     EditText editText,editText2,editText3;
     Button start,end,enter;
     String day, month, year,weather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner1 = findViewById(R.id.spinner);
        spinner2 = findViewById(R.id.spinner3);
        spinner3 = findViewById(R.id.spinner4);
        spinner4 = findViewById(R.id.spinner5);
        spinner5 =  findViewById(R.id.spinner2);
        spinner6 = findViewById(R.id.spinner6);
        spinner7 = findViewById(R.id.spinner7);
        editText = findViewById(R.id.editText2);
        editText2 = findViewById(R.id.editText);
        editText3 = findViewById(R.id.editText3);
        start = findViewById(R.id.button);
        end = findViewById(R.id.button2);
        enter = findViewById(R.id.Enter);
        enterclick();


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.day,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
       /* spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              day = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(),day,Toast.LENGTH_SHORT).show();

            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        }); */

        day = spinner1.getSelectedItem().toString();


        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.month,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter1);
       /* spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                month = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(),month,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        */
        month = spinner2.getSelectedItem().toString();



        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.year,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter2);
       /* spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                year = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(),year,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        }); */
       year = spinner3.getSelectedItem().toString();

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,R.array.weather,android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter3);
       /* spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                weather = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(),weather,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });*/

       weather = spinner4.getSelectedItem().toString();




    }

    public void enterclick(){
        enter.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this,datapage.class);
                        startActivity(i);
                    }
                }
        );
    }


 /*   public void onItemSelected(AdapterView<?> parent, View view, int position1, long id) {
       String day = parent.getItemAtPosition(position1).toString();

    }



    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    } */


}
