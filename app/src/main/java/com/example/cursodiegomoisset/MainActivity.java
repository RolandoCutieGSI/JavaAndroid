package com.example.cursodiegomoisset;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    Button buttonvD4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initUI();
        //Para ir a la segunda vista
        button.setOnClickListener((view) -> {
            startActivity(new Intent(MainActivity.this, MainActivity2.class));
        });
        buttonvD4.setOnClickListener((view) -> {
            startActivity(new Intent(MainActivity.this, MainActivity3.class));
        });

    }

    //Este metodo es el que se ejecuta cuando presionamos el boton mostrar mensaje
    public void presion(View view) {

        Toast.makeText(this, "Se presionó el boton mostrar mensaje", Toast.LENGTH_LONG).show();

    }

    public void botton2(View view) {
        Toast.makeText(this, "Se presionó el boton 2", Toast.LENGTH_LONG).show();
    }

    private void initUI() {
        button = findViewById(R.id.button2);
        buttonvD4 = findViewById(R.id.button3);
    }


    public void irVideo4(View view) {

    }
}