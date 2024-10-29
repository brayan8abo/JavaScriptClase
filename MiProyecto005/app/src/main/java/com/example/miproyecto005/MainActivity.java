package com.example.miproyecto005;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private CheckBox check1, check2, check3, check4;
    private TextView tv1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        check1 = findViewById(R.id.check1);
        check2 = findViewById(R.id.check2);
        check3 = findViewById(R.id.check3);
        check4 = findViewById(R.id.check3);
        tv1 = findViewById(R.id.tv1);


    }

    public void sumar(View view) {
        String resultado = "";
        if (check1.isChecked() == true) {
            double num1 = Double.parseDouble(et1.getText().toString());
            double num2 = Double.parseDouble(et2.getText().toString());
            double suma = num1 + num2;
            resultado = resultado + "La suma es: " + String.valueOf(suma) + "\n";
            tv1.setText(resultado);
        }
        if (check2.isChecked() == true) {
            double num1 = Double.parseDouble(et1.getText().toString());
            double num2 = Double.parseDouble(et2.getText().toString());
            double resta = num1 - num2;
            resultado = resultado + "La resta es: " + String.valueOf(resta) + "\n";
            tv1.setText(resultado);
        }
        if (check3.isChecked() == true) {
            double num1 = Double.parseDouble(et1.getText().toString());
            double num2 = Double.parseDouble(et2.getText().toString());
            double multiplicacion = num1 * num2;
            resultado = resultado + "La multiplicación es: " + String.valueOf(multiplicacion) + "\n";
            tv1.setText(resultado);
        }
        if (check4.isChecked() == true) {
            double num1 = Double.parseDouble(et1.getText().toString());
            double num2 = Double.parseDouble(et2.getText().toString());
            double division = num1 / num2;
            resultado = resultado + "La division es: " + String.valueOf(division) + "\n";
            tv1.setText(resultado);
        }


    }
}