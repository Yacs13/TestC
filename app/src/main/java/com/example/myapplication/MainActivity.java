package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String cadena33 = "Hola mundo";

        Integer contador3 = 10;
        Integer num = calcularSuma();
        Integer count = 0;
        contador3 += 2;


    }


    Integer calcularSuma(){
        //funcion calcular sum
        return 2;
    }
}
