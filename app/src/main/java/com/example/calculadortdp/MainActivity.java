package com.example.calculadortdp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btncalculador;
    Button btnfuente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btncalculador = findViewById(R.id.btncalculador);
        btnfuente = findViewById(R.id.btnfuente);

        btncalculador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento = new Intent (MainActivity.this,Calculadora.class);
                startActivity(intento);
            }
        });
        btnfuente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento2 = new Intent (MainActivity.this,Fcuentecal.class);
                startActivity(intento2);
            }
        });
    }
}