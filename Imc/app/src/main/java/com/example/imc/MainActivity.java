package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CalcIMC calcIMC = new CalcIMC();
    private EditText altura;
    private EditText peso;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eventoSair(View view){
        altura = (EditText) findViewById(R.id.altura);
        peso = (EditText) findViewById(R.id.peso);
        calcIMC.setAltura(String.valueOf(altura.getText()));
        calcIMC.setPeso(String.valueOf(peso.getText()));
        resultado = (TextView) findViewById(R.id.resultado);
        resultado.setText(calcIMC.seuIMC());
    }
}
