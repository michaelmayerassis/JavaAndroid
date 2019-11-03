package com.example.combustivel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Combustivel a =  new Combustivel();
    private EditText kmAlcool;
    private EditText kmGasolina;
    private EditText valorAlcool;
    private EditText valorGasolina;
    private EditText km;
    private TextView melhor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View view){
        kmAlcool = (EditText) findViewById(R.id.kmAlcool);
        kmGasolina = (EditText) findViewById(R.id.kmGasolina);
        valorAlcool = (EditText) findViewById(R.id.valorAlcool);
        valorGasolina = (EditText) findViewById(R.id.valorGasolina);
        km = (EditText) findViewById(R.id.km);
        a.setkmAlcool(String.valueOf(kmAlcool.getText()));
        a.setKmGasolina(String.valueOf(kmGasolina.getText()));
        a.setvalorAlcool(String.valueOf(valorAlcool.getText()));
        a.setvalorGasolina(String.valueOf(valorGasolina.getText()));
        a.setKm(String.valueOf(km.getText()));
        melhor = (TextView) findViewById(R.id.melhor);
        melhor.setText(a.melhor());
    }
}
