package com.example.surveytrackerapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BDProy extends SQLiteOpenHelper {
    private static final String NOMBRE_BD="BDProy.bd";
    private static final int VERSION_BD=1;
    private static final String TABLA_PROY="CREATE TABLE PROY(ID_PROY TEXT PRIMARY KEY,NOMBRE_PROY TEXT, CLIENTE TEXT)";

    public BDProy(Context context) {
        super(context, NOMBRE_BD,null, VERSION_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLA_PROY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLA_PROY);
        sqLiteDatabase.execSQL(TABLA_PROY);
    }

    public void agregarProy(String idProy,String nomProy,String cliente){
        SQLiteDatabase bd=getWritableDatabase();
        if (bd!=null){
            bd.execSQL("INSERT INTO PROY VALUES ('"+idProy+"','"+nomProy+"'','"+cliente+"')");
            bd.close();
        }
    }
}
