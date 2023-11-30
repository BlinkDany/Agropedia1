package com.agropedia.proyectoagropedia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityCarrito extends AppCompatActivity {

    private int number = 1;
    private TextView numberTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecciona_producto);

        numberTextView = findViewById(R.id.number_text_view);
    }

   /* public void enviarMensaje (View view){
        EditText editText=(EditText) findViewById(R.id.editTextText);
        String mensaje=editText.getText().toString();
        Intent.put
    }
    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intentMainActivity.getStringExtra(mensaje);
        TextView textView=findViewById(R.id.)

    }*/

    public void incrementNumber(View view) {
        if (number < 99) {
            number++;
            numberTextView.setText(String.valueOf(number));
        }
    }

    public void decrementNumber(View view) {
        if (number > 1) {
            number--;
            numberTextView.setText(String.valueOf(number));
        }
    }

}
