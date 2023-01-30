package com.example.cursodiegomoisset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Este metodo es el que se ejecuta cuando presionamos el boton mostrar mensaje
    public void presion(View view) {

        Toast.makeText(this, "Se presiono el boton mostrar mensaje", Toast.LENGTH_LONG).show();

    }
}