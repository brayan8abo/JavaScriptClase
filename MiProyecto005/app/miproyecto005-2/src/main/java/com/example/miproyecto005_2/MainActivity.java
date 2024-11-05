package com.example.miproyecto005_2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private Spinner spinner;
    private TextView resultado;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        spinner = findViewById(R.id.spinner);
        resultado = findViewById(R.id.resultado);

        //se añaden las opciones al spiner para tener opciones
        String[] opciones = {"SUMAR", "RESTAR", "MULTIPLICAR", "DIVIDIR"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner.setAdapter(adapter);

    }

    public void calcular(View view) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        String selec = spinner.getSelectedItem().toString();
        if (selec.equalsIgnoreCase("sumar")) {
            int suma = nro1 + nro2;
            String resu = String.valueOf(suma);
            resultado.setText(resu);
        } else if (selec.equalsIgnoreCase("restar")) {
            int resta = nro1 - nro2;
            String resu = String.valueOf(resta);
            resultado.setText(resu);
        } else if (selec.equalsIgnoreCase("multiplicar")) {
            int multi = nro1 * nro2;
            String resu = String.valueOf(multi);
            resultado.setText(resu);
        } else if (selec.equalsIgnoreCase("dividir")) {
            int divi = nro1 / nro2;
            String resu = String.valueOf(divi);
            resultado.setText(resu);
        }
    }

}

