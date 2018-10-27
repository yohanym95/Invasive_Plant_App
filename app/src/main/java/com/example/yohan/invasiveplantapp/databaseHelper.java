package com.example.yohan.invasiveplantapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class databaseHelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "plantData.DB";
    public static final String Table_Name = "PlantDetails";
    public static final String Col_1 = "Date";
    public static final String Col_2 = "Weather";
    public static final String Col_3 = "SamplingTrail";
    public static final String Col_4 = "GPSStart";
    public static final String Col_5 = "GPSEnd";
    public static final String Col_6 = "plant";
    public static final String Col_7 = "DistrubutionCode";
    public static final String Col_8 = "DestinyCode";
    public static final String Col_9 = "Flowers";
    public static final String Col_10 = "Canopy";
    public static final String Col_11 = " Sheded";
    public static final String Col_12= "SoilType";
    public static final String Col_13 ="GrowthStages";




    public databaseHelper(Context context) {
        super(context, DB_NAME, null, 1 );
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
