package com.example.toni.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, boton0;
    private Button botonmas, botonmenos, botonpor, botonmult, botonpunto, botonigual;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = (Button) findViewById(R.id.button1);
        boton2 = (Button) findViewById(R.id.button2);
        boton3 = (Button) findViewById(R.id.button3);
        boton4 = (Button) findViewById(R.id.button4);
        boton5 = (Button) findViewById(R.id.button5);
        boton6 = (Button) findViewById(R.id.button6);
        boton7 = (Button) findViewById(R.id.button7);
        boton8 = (Button) findViewById(R.id.button8);
        boton9 = (Button) findViewById(R.id.button9);
        boton0 = (Button) findViewById(R.id.button0);
        botonmas = (Button) findViewById(R.id.buttonmas);
        botonmenos = (Button) findViewById(R.id.buttonmenos);
        botonpor = (Button) findViewById(R.id.buttonpor);
        botonmult = (Button) findViewById(R.id.buttonmult);
        botonpunto = (Button) findViewById(R.id.buttonpunto);
        botonigual = (Button) findViewById(R.id.buttonigual);

        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
        boton4.setOnClickListener(this);
        boton5.setOnClickListener(this);
        boton6.setOnClickListener(this);
        boton7.setOnClickListener(this);
        boton8.setOnClickListener(this);
        boton9.setOnClickListener(this);
        boton0.setOnClickListener(this);
        botonmas.setOnClickListener(this);
        botonmenos.setOnClickListener(this);
        botonpor.setOnClickListener(this);
        botonmult.setOnClickListener(this);
        botonpunto.setOnClickListener(this);
        botonigual.setOnClickListener(this);

        texto = (TextView) findViewById(R.id.textView);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                texto.setText("1");
                break;
            case R.id.button2:
                texto.setText("2");
                break;
            case R.id.button3:
                texto.setText("3");
                break;
            case R.id.button4:
                texto.setText("4");
                break;
            case R.id.button5:
                texto.setText("5");
                break;
            case R.id.button6:
                texto.setText("6");
                break;
            case R.id.button7:
                texto.setText("7");
                break;
            case R.id.button8:
                texto.setText("8");
                break;
            case R.id.button9:
                texto.setText("9");
                break;
            case R.id.button0:
                texto.setText("0");
                break;
            case R.id.buttonmas:
                texto.setText("+");
                break;
            case R.id.buttonmenos:
                texto.setText("-");
                break;
            case R.id.buttonpor:
                texto.setText("%");
                break;
            case R.id.buttonmult:
                texto.setText("X");
                break;
            case R.id.buttonpunto:
                texto.setText(".");
                break;
            case R.id.buttonigual:
                texto.setText("=");
                break;
        }

    }
}
