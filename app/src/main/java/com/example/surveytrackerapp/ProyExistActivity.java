package com.example.surveytrackerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProyExistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proy_exist);
    }

    public void btnvolver (View view){
        Intent mibtnVolver = new Intent(this, MainActivity.class);
        startActivity(mibtnVolver);
        finish();
    }
}