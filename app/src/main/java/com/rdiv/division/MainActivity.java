package com.rdiv.division;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edNum1, edNum2;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edNum1 = findViewById(R.id.txtnumero);
        edNum2 = findViewById(R.id.txtnumerodos);
        tvResultado = findViewById(R.id.tvResultado);
    }

    public void calcularDivision(View v) {
        double num1 = Double.parseDouble(edNum1.getText().toString());
        int num2 = Integer.parseInt(edNum2.getText().toString());

        if (num2 != 0) {
            double resultado = num1 / num2;
            tvResultado.setText(String.valueOf(resultado));
        } else {
            tvResultado.setText("Error: División por cero");
        }
    }
}
