package com.example.surveytrackerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GestRelevActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gest_relev);

    }

    public void btnvolver2 (View view){
        Intent mibtnVolver = new Intent(this, MainActivity.class);
        startActivity(mibtnVolver);
        finish();
    }

}