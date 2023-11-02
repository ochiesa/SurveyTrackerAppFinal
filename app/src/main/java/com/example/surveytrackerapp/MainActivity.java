package com.example.surveytrackerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtProy,edtNombre,edtCliente;
    Button btnAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtProy=(EditText)findViewById(R.id.);

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Cierra la actividad actual
                System.exit(0); // Cierra completamente la aplicación
            }
        });
    }

    public void irProyExist(View view) {
        Intent mibtnProyExis = new Intent(this, ProyExistActivity.class);
        startActivity(mibtnProyExis);
        finish();
    }

    public void irGestRelev(View view) {
        Intent mibtnGestRelev = new Intent(this, GestRelevActivity.class);
        startActivity(mibtnGestRelev);
        finish();
    }
}
