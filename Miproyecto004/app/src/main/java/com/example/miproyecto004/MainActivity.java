package com.example.miproyecto004;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    private TextView tv1;
    private RadioButton r1, r2, r3, r4, r5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        tv1 = findViewById(R.id.tv1);
        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);
        r4 = findViewById(R.id.r4);
        r5 = findViewById(R.id.r5);
    }

    //Este método se ejecutará cuando se presione el botón
    public void operar(View view) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        if (r1.isChecked() == true) {
            int suma = nro1 + nro2;
            String resu = String.valueOf(suma);
            tv1.setText(resu);
        } else if (r2.isChecked() == true) {
            int resta = nro1 - nro2;
            String resu = String.valueOf(resta);
            tv1.setText(resu);
        }
        if (r3.isChecked() == true) {
            int multiplicacion = nro1 * nro2;
            String resu = String.valueOf(multiplicacion);
            tv1.setText(resu);
        } else if (r4.isChecked() == true) {
            double division = (double) nro1 / nro2;
            String resu = String.valueOf(division);
            tv1.setText(resu);
        }
        if (r5.isChecked() == true) {
            int modulo = nro1 % nro2;
            String resu = String.valueOf(modulo);
            tv1.setText(resu);
        }
    }
}