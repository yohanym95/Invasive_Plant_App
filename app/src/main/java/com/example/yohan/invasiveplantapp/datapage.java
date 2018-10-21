package com.example.yohan.invasiveplantapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class datapage extends AppCompatActivity{

    Spinner spinner1,spinner2,spinner3,spinner4,spinner5,spinner6,spinner7,spinner8;
    String plant,distributioncode,destinycode,flowers,canopy,shaded,soiltype,growthstage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datapage);

        spinner1 = findViewById(R.id.spinner2);
        spinner2 = findViewById(R.id.spinner6);
        spinner3 = findViewById(R.id.spinner7);
        spinner4 = findViewById(R.id.spinner8);
        spinner5 = findViewById(R.id.spinner9);
        spinner6 = findViewById(R.id.spinner10);
        spinner7 = findViewById(R.id.spinner11);
        spinner8 = findViewById(R.id.spinner12);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.plant,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        /*spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String plant = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(),plant,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        }); */

        plant = spinner1.getSelectedItem().toString();


        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.Distributioncode,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
       /* spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String distributioncode = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(),distributioncode,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        }); */

       distributioncode = spinner2.getSelectedItem().toString();

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,R.array.DestinyCode,android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);
        /*spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String destinycode = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(),destinycode,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        }); */

        destinycode = spinner3.getSelectedItem().toString();

        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,R.array.flower,android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);
        flowers = spinner4.getSelectedItem().toString();


        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,R.array.Canopy,android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter5);
        canopy = spinner4.getSelectedItem().toString();

        ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(this,R.array.shaded,android.R.layout.simple_spinner_item);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6.setAdapter(adapter6);
        shaded = spinner6.getSelectedItem().toString();

        ArrayAdapter<CharSequence> adapter7 = ArrayAdapter.createFromResource(this,R.array.SoilType,android.R.layout.simple_spinner_item);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner7.setAdapter(adapter7);
        soiltype = spinner7.getSelectedItem().toString();

        ArrayAdapter<CharSequence> adapter8 = ArrayAdapter.createFromResource(this,R.array.GrowthStages,android.R.layout.simple_spinner_item);
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner8.setAdapter(adapter8);
        growthstage = spinner8.getSelectedItem().toString();


    }
}
