package com.agropedia.proyectoagropedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityVerProducto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos_detalle);
    }

    public void SiguientePantalla(View view){

        Intent intent = new Intent(this, ActivityCarrito.class);
        startActivity(intent);
    }
}