package com.example.cursodiegomoisset;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tw1;

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private Switch sw1;

    private RadioButton r1, r2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        //Para assignar los elemntos de la parte visual a la parte logica
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        tw1 = findViewById(R.id.tw1);
        r1 = findViewById(R.id.rb1);
        r2 = findViewById(R.id.rb2);
        sw1 = findViewById(R.id.sw1);

    }

    @SuppressLint("SetTextI18n")
    public void sumar(View view) {
        String s1 = et1.getText().toString();
        String s2 = et2.getText().toString();
        int v1 = Integer.parseInt(s1);
        int v2 = Integer.parseInt(s2);
        int suma = v1 + v2;
        tw1.setText("La suma es:" + suma);
    }

    @SuppressLint("SetTextI18n")
    public void operar(View view) {
        String s1 = et1.getText().toString();
        String s2 = et2.getText().toString();


        int v1 = Integer.parseInt(s1);
        int v2 = Integer.parseInt(s2);

        int operacion = 0;

        if (r1.isChecked()) {
            operacion = v1 + v2;
            tw1.setText("La operacion selecionada devuelve:" + operacion);
        } else {
            if (r2.isChecked()) {
                operacion = v1 - v2;
                tw1.setText("La operacion selecionada devuelve:" + operacion);
            }
        }


        if (sw1.isChecked()) {
            Toast.makeText(this, "El switch estaa activado", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "El switch esta desactivado", Toast.LENGTH_SHORT).show();
        }


    }


}