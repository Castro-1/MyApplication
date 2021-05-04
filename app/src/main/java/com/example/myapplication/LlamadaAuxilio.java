package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LlamadaAuxilio extends AppCompatActivity {
    Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llamada_auxilio);

        cancel= (Button) findViewById(R.id.button7);

        Intent i4 = new Intent(this,FuncionesC.class);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(LlamadaAuxilio.this);

                builder.setMessage("¿Seguro/a que quiere cancelar la llamada?")
                        .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(i4);
                            }
                        }).setNegativeButton("No",null);
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }
}