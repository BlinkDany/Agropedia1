package com.agropedia.proyectoagropedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PantallaDatos extends AppCompatActivity {

    private EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_datos);
    }

    public void SiguientePantalla(View view){

        Intent intent = new Intent(this, LandingPage.class);
        startActivity(intent);
    }
}