package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {
    EditText celular;
    EditText cedula;
    EditText placa;
    Button ingresar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        celular = (EditText) findViewById(R.id.celular2);
        cedula = (EditText) findViewById(R.id.cedula2);
        placa = (EditText) findViewById(R.id.placa);
        ingresar = (Button) findViewById(R.id.button2);
        Intent i = new Intent(this,FuncionesP.class);

       /* String ced = cedula.getText().toString();
        int cedu = Integer.parseInt(ced);
        String cel = celular.getText().toString();
        int celu = Integer.parseInt(cel);
        String pla = placa.getText().toString();
        int  plac= Integer.parseInt(pla);/*/

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(celular.getText().toString().isEmpty() && cedula.getText().toString().isEmpty() && placa.getText().toString().isEmpty()){
                    Toast.makeText(SettingsActivity.this, "Rellene los campos porfavor", Toast.LENGTH_SHORT).show();
                } else if((celular.getText().length()!=10) && (cedula.getText().length()>=7 || cedula.getText().length()<=10) && (placa.getText().length()==6)){
                    Toast.makeText(SettingsActivity.this, "Número incorrecto", Toast.LENGTH_SHORT).show();
                } else if((celular.getText().length()==10) && (cedula.getText().length()<7 || cedula.getText().length()>10) && (placa.getText().length()==6)) {
                    Toast.makeText(SettingsActivity.this, "Cédula incorrecta", Toast.LENGTH_SHORT).show();
                } else if((celular.getText().length()==10) && (cedula.getText().length()>=7 || cedula.getText().length()<=10) && (placa.getText().length()!=6)) {
                    Toast.makeText(SettingsActivity.this, "Placa incorrecta", Toast.LENGTH_SHORT).show();
                } else if((celular.getText().length()==10) && (cedula.getText().length()>=7 || cedula.getText().length()<=10) && (placa.getText().length()==6)) {
                    //Policia policia = new Policia(celu,cedu,plac);
                    Toast.makeText(SettingsActivity.this, "Bienvenido/a", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                }
            }
        });
    }

}