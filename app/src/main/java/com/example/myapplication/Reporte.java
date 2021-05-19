package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Reporte extends AppCompatActivity {
    EditText placa;
    EditText nombre;
    EditText fecha;
    EditText hora;
    EditText lugar;
    Button continuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte);
        placa = (EditText) findViewById(R.id.placa2);
        nombre = (EditText) findViewById(R.id.nombre2);
        fecha = (EditText) findViewById(R.id.fecha2);
        hora = (EditText) findViewById(R.id.hora2);
        lugar = (EditText) findViewById(R.id.lugar2);
        continuar = (Button) findViewById(R.id.button2);
        Intent sit = new Intent(this,Situacion.class);

        continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 if((placa.getText().length()!=0 || nombre.getText().length()!=0)){
                     if(hora.getText().toString().isEmpty() && fecha.getText().toString().isEmpty() && lugar.getText().toString().isEmpty()){
                         Toast.makeText(Reporte.this, "Rellene los campos porfavor", Toast.LENGTH_SHORT).show();
                     } else if((placa.getText().length()!=6 || placa.getText().length()!=0)  && (nombre.getText().length()==0) && !(hora.getText().toString().isEmpty()) && !(fecha.getText().toString().isEmpty()) && !(lugar.getText().toString().isEmpty()) ){
                        Toast.makeText(Reporte.this, "Placa incorrecta", Toast.LENGTH_SHORT).show();
                     } else if((placa.getText().length()==6 || placa.getText().length()==0) && (hora.getText().toString().isEmpty()) && !(fecha.getText().toString().isEmpty()) && !(lugar.getText().toString().isEmpty())) {
                         Toast.makeText(Reporte.this, "Hora incorrecta", Toast.LENGTH_SHORT).show();
                     }else if((placa.getText().length()==6 || placa.getText().length()==0) && (fecha.getText().toString().isEmpty()) && !(hora.getText().toString().isEmpty()) && !(lugar.getText().toString().isEmpty())) {
                         Toast.makeText(Reporte.this, "Fecha incorrecta", Toast.LENGTH_SHORT).show();
                     } else if((placa.getText().length()==6 || placa.getText().length()==0) && (lugar.getText().toString().isEmpty()) && !(fecha.getText().toString().isEmpty()) && !(hora.getText().toString().isEmpty())) {
                         Toast.makeText(Reporte.this, "Lugar incorrecto", Toast.LENGTH_SHORT).show();
                     } else if((placa.getText().length()==6 || placa.getText().length()==0) && !(lugar.getText().toString().isEmpty()) && !(fecha.getText().toString().isEmpty()) && !(hora.getText().toString().isEmpty())){
                         startActivity(sit);
                     }
                 } else if((placa.getText().length()==0 && nombre.getText().length()==0)) {
                     Toast.makeText(Reporte.this, "Cédula incorrecta", Toast.LENGTH_SHORT).show();
                     if (hora.getText().toString().isEmpty() && fecha.getText().toString().isEmpty() && lugar.getText().toString().isEmpty()) {
                         Toast.makeText(Reporte.this, "Rellene los campos porfavor", Toast.LENGTH_SHORT).show();
                     } else if ((hora.getText().toString().isEmpty()) && !(fecha.getText().toString().isEmpty()) && !(lugar.getText().toString().isEmpty())) {
                         Toast.makeText(Reporte.this, "Hora incorrecta", Toast.LENGTH_SHORT).show();
                     } else if ((fecha.getText().toString().isEmpty()) && !(hora.getText().toString().isEmpty()) && !(lugar.getText().toString().isEmpty())) {
                         Toast.makeText(Reporte.this, "Fecha incorrecta", Toast.LENGTH_SHORT).show();
                     } else if ((lugar.getText().toString().isEmpty()) && !(fecha.getText().toString().isEmpty()) && !(hora.getText().toString().isEmpty())) {
                         Toast.makeText(Reporte.this, "Lugar incorrecto", Toast.LENGTH_SHORT).show();
                     } else if (!(lugar.getText().toString().isEmpty()) && !(fecha.getText().toString().isEmpty()) && !(hora.getText().toString().isEmpty())) {
                         startActivity(sit);
                     }
                 }
            }
        });
    }

    public void regreso(View c){
        Intent civ = new Intent(this,FuncionesC.class);
        startActivity(civ);
    }


}