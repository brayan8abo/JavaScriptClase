package com.example.mi;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private EditText numeroUno, numeroDos;
    private TextView textResultado;
    private RadioButton r1, r2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        numeroUno = findViewById(R.id.numeroUno);
        numeroDos = findViewById(R.id.numeroDos);
        textResultado = findViewById(R.id.textResultado);
        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);

    }

    public void operar(View view) {
        int num1 = Integer.parseInt(numeroUno.getText().toString());
        int num2 = Integer.parseInt(numeroDos.getText().toString());

        if (r1.isChecked()==true) {
            int suma = num1 + num2;
            textResultado.setText(suma);
        } else if (r2.isChecked()==true) {
            int resta = num1 - num2;
            textResultado.setText(resta);
        }

    }
}