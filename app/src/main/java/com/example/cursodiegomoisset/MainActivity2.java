package com.example.cursodiegomoisset;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tw1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        //Para assignar los elemntos de la parte visual a la parte logica
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        tw1 = findViewById(R.id.tw1);

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
}