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
    public static final String Col_11 = "Sheded";
    public static final String Col_12 = "SoilType";
    public static final String Col_13 ="GrowthStages";




    public databaseHelper(Context context) {
        super(context, DB_NAME, null, 1 );
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("Create Table "+Table_Name+" (Date VARCHAR(10), Weather VARCHAR(12), SamplingTrail VARCHAR(30), GPSStart VARCHAR(10), GPSEnd VARCHAR(10), plant VARCHAR(25),DistrubutionCode VARCHAR(8), DestinyCode VARCHAR(8),Flowers VARCHAR(5),Canopy VARCHAR(15),Sheded VARCHAR(10), SoilType VARCHAR(10), GrowthStages VARCHAR(10)  )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+Table_Name);
        onCreate(sqLiteDatabase);
    }
}
