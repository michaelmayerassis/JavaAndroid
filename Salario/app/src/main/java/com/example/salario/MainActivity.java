package com.example.salario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.String.*;

public class MainActivity extends AppCompatActivity {
    Salario salario = new Salario();
    private EditText sal1;
    private EditText hor1;
    private EditText horg1;
    private TextView resultado1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eventoSair(View view){
        sal1 = (EditText) findViewById(R.id.salarios);
        hor1 = (EditText) findViewById(R.id.horas);
        horg1 = (EditText) findViewById(R.id.horasgasta);
        salario.setValor(String.valueOf(sal1.getText()));
        salario.setHoras(String.valueOf(hor1.getText()));
        salario.setHorasGasta(String.valueOf(horg1.getText()));
        resultado1 = (TextView) findViewById(R.id.resultado);
        resultado1.setText( "você ganha R$: "+salario.valorporHora()+" para ficar no banheiro");
    }
}
