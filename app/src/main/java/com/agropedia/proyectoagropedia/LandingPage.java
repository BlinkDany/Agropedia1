package com.agropedia.proyectoagropedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LandingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
    }

    public void SiguientePantalla(View view){

        Intent intent = new Intent(this, ActivityVerProducto.class);
        startActivity(intent);
    }

    public void SiguientePantallaCarrito(View view){

        Intent intent = new Intent(this, ActivityCarrito.class);
        startActivity(intent);
    }
}