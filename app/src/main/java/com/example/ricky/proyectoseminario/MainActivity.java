package com.example.ricky.proyectoseminario;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText num1,num2;
    Button suma,resta,mult,divi,cua,ele;
    TextView resultado;

     private TextView Texto1;
     private Typeface Uni;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String fuente1 = "fuentes/Uni.otf";
        this.Uni = Typeface.createFromAsset(getAssets(),fuente1);

        Texto1 = (TextView) findViewById(R.id.num1);
        Texto1.setTypeface(Uni);

        Texto1 = (TextView) findViewById(R.id.num2);
        Texto1.setTypeface(Uni);

        Texto1 = (TextView) findViewById(R.id.sumar);
        Texto1.setTypeface(Uni);

        Texto1 = (TextView) findViewById(R.id.restar);
        Texto1.setTypeface(Uni);

        Texto1 = (TextView) findViewById(R.id.div);
        Texto1.setTypeface(Uni);

        Texto1 = (TextView) findViewById(R.id.mul);
        Texto1.setTypeface(Uni);

        Texto1 = (TextView) findViewById(R.id.cuadrado);
        Texto1.setTypeface(Uni);


        Texto1 = (TextView) findViewById(R.id.elev);
        Texto1.setTypeface(Uni);

        Texto1 = (TextView) findViewById(R.id.resultado);
        Texto1.setTypeface(Uni);


        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);

        suma=findViewById(R.id.sumar);
        resta=findViewById(R.id.restar);
        mult=findViewById(R.id.mul);
        divi=findViewById(R.id.div);
        cua=findViewById(R.id.cuadrado);
        ele=findViewById(R.id.elev);

        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        mult.setOnClickListener(this);
        divi.setOnClickListener(this);
        cua.setOnClickListener(this);
        ele.setOnClickListener(this);

        resultado=findViewById(R.id.resultado);

    }

    @Override
    public void onClick(View view) {
        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        int entero1=Integer.parseInt(n1);
        int entero2=Integer.parseInt(n2);
        int rta=0;
        switch (view.getId()){
            case R.id.sumar:
                rta=entero1+entero2;
                break;
            case R.id.restar:
                rta=entero1-entero2;
                break;
            case R.id.mul:
                rta=entero1*entero2;
                break;
            case R.id.div:
                rta=entero1/entero2;
                break;
            case R.id.cuadrado:
                    rta=entero1*entero1;
                break;
            case R.id.elev:
                rta=entero1*entero1*entero1;


        }
        resultado.setText(""+rta);
    }
}
