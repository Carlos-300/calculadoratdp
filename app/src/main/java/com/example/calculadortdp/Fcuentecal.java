package com.example.calculadortdp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;



public class Fcuentecal extends AppCompatActivity {
    Button btnenviar;
    Button btncancelar;
    Spinner spnWatts;
    TextView resultados;
    private RadioButton r1, r2, r3, r4, r5, r6, r7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fcuentecal);
        btnenviar = findViewById(R.id.btnenviar);
        btncancelar = findViewById(R.id.btncancelar);
        r1 = (RadioButton) findViewById(R.id.r1);
        r2 = (RadioButton) findViewById(R.id.r2);
        r3 = (RadioButton) findViewById(R.id.r3);
        r4 = (RadioButton) findViewById(R.id.r4);
        r5 = (RadioButton) findViewById(R.id.r5);
        r6 = (RadioButton) findViewById(R.id.r6);
        r7 = (RadioButton) findViewById(R.id.r7);
        spnWatts = findViewById(R.id.spnWatts);
        resultados = findViewById(R.id.resultados);
        ArrayAdapter<CharSequence> voltajes = ArrayAdapter.createFromResource(Fcuentecal.this, R.array.spnWatts_items, android.R.layout.simple_spinner_item);
        spnWatts.setAdapter(voltajes);

        btnenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int porcentaje = certificacion();
                int cantidadW =  Integer.parseInt(spnWatts.getSelectedItem().toString());
                int resolver =(porcentaje*cantidadW)/100;
                String miString = Integer.toString(resolver);
                resultados.setText(miString);
            }
        });




    }


    public int certificacion (){

        if (r1.isChecked()==true){
            return 60;
        }
        if (r2.isChecked()==true){
            return 80;
        }
        if (r3.isChecked()==true){
            return 85;
        }
        if (r4.isChecked()==true){
            return 88;
        }
        if (r5.isChecked()==true){
            return 90;
        }
        if (r6.isChecked()==true){
            return 92;
        }
        if (r7.isChecked()==true){
            return 95;
        }
        return 0;

    }
}
