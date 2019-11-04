package com.example.bingomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView meuTextView = (TextView) findViewById(R.id.meuTextView);
        Button btnSortear = (Button) findViewById(R.id.btnSortear);
        btnSortear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sortearNumero(v);
            }
        });
        meuTextView.setVisibility(View.INVISIBLE);

    }

    public void sortearNumero(View view){
        Random numeroAleatorio = new Random();
        int numeroBingo = numeroAleatorio.nextInt(75);
        String numero = String.valueOf(numeroBingo);
        Toast.makeText(this, numero, Toast.LENGTH_LONG).show();
    }
}
