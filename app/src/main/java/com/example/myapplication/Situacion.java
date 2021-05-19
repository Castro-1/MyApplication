package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Situacion extends AppCompatActivity {
    EditText info;
    Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situacion);
        info = (EditText) findViewById(R.id.informacion);
        enviar = (Button) findViewById(R.id.buttonS);


    }

    public void volvamos(View c){
        Intent reg = new Intent(this,Reporte.class);
        startActivity(reg);
    }
}