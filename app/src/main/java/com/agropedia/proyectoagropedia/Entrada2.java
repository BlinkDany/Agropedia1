package com.agropedia.proyectoagropedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Entrada2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada2);
    }

    public void SiguientePantalla(View view){

        Intent intent = new Intent(this, PantallaDatos.class);
        startActivity(intent);
    }

    public void SiguientePantallaRegistrarse(View view){

        Intent intent = new Intent(this, Entrada3.class);
        startActivity(intent);
    }
}