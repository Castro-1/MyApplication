package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SesionP extends AppCompatActivity {
    EditText celular;
    EditText cedula;
    Button ingresar;

    String ced = cedula.getText().toString();
    int cedu = Integer.parseInt(ced);
    String cel = celular.getText().toString();
    int celu = Integer.parseInt(cel);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion_p);

        celular = (EditText) findViewById(R.id.celular2);
        cedula = (EditText) findViewById(R.id.cedula2);
        ingresar = (Button) findViewById(R.id.button2);
        Intent i2 = new Intent(this,FuncionesC.class);

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(celular.getText().toString().isEmpty() && cedula.getText().toString().isEmpty()){
                    Toast.makeText(SesionP.this, "Rellene los campos porfavor", Toast.LENGTH_SHORT).show();
                } else if((celular.getText().length()!=10) && (cedula.getText().length()>=7 || cedula.getText().length()<=10)){
                    Toast.makeText(SesionP.this, "Número incorrecto", Toast.LENGTH_SHORT).show();
                } else if((celular.getText().length()==10) && (cedula.getText().length()<7 || cedula.getText().length()>10)) {
                    Toast.makeText(SesionP.this, "Cédula incorrecta", Toast.LENGTH_SHORT).show();
                } else if((celular.getText().length()==10) && (cedula.getText().length()>=7 || cedula.getText().length()<=10)) {
                    Ciudadano ciudadano = new Ciudadano(cedu,celu);
                    Toast.makeText(SesionP.this, "Bienvenido/a", Toast.LENGTH_SHORT).show();
                    startActivity(i2);
                }
            }
        });
    }


}