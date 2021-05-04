package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    //instanciar objetos
    //lectura y escritura de archivos en andriod (persistencia)
    //crear otro objeto, llamado civil que tiene get y set cedula, crear metodos save data.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void civil(View c){
        Intent log1 = new Intent(this, SesionP.class);
        startActivity(log1);

    }



    public void policia(View p){

        Intent log2 = new Intent(this, SettingsActivity.class);
        startActivity(log2);
    }





}