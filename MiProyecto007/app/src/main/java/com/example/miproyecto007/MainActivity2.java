package com.example.miproyecto007;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private TextView tv1;
    private ImageButton btnSuma, btnResta, btnMulti, btnDivision;
    private EditText et1, et2;


    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        btnSuma = findViewById(R.id.btnSuma);
        btnResta = findViewById(R.id.btnResta);
        btnMulti = findViewById(R.id.btnMulti);
        btnDivision = findViewById(R.id.btnDivision);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);

    }

    //Este método se ejecutará cuando se presione el ImageButton
    public void llamar(View view) {

        btnSuma.onClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(et1.getText().toString());
                int num2 = Integer.parseInt(et2.getText().toString());
                int suma = num1 + num2;
                String resultado = String.valueOf(suma);
                tv1.setText(resultado);

            }
        });



        if (btnSuma.isSelected()) {
            int num1 = Integer.parseInt(et1.getText().toString());
            int num2 = Integer.parseInt(et2.getText().toString());
            int suma = num1 + num2;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);
        }
        if (btnResta.isSelected()) {
            int num1 = Integer.parseInt(et1.getText().toString());
            int num2 = Integer.parseInt(et2.getText().toString());
            int resta = num1 - num2;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);
        }
        if (btnMulti.isSelected()) {
            int num1 = Integer.parseInt(et1.getText().toString());
            int num2 = Integer.parseInt(et2.getText().toString());
            int multi = num1 * num2;
            String resultado = String.valueOf(multi);
            tv1.setText(resultado);
        }
        if (btnDivision.isSelected()) {
            int num1 = Integer.parseInt(et1.getText().toString());
            int num2 = Integer.parseInt(et2.getText().toString());
            int division = num1 / num2;
            String resultado = String.valueOf(division);
        }
    }
}
