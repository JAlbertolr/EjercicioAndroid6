package com.example.ejercicio6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;


import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //1. Crear objetos y variables
    private  Button aumentar;
private Button reducir;
    private Button toast;
private Button cambiarColor;
private TextView texto;


private ConstraintLayout layout2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2. Asociar  objetos Java(creados arriba) a id de componentes gráficos XML
        aumentar=findViewById(R.id.button);
        reducir=findViewById(R.id.button5);
        cambiarColor=findViewById(R.id.button4);
        texto=findViewById(R.id.textView);
        layout2=findViewById(R.id.cambio);
        toast=findViewById(R.id.buttonToast);

        // 3. Eventos, lógica, conexiones a BBDD
        aumentar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            texto.setTextSize(TypedValue.COMPLEX_UNIT_PX,texto.getTextSize()+2);

            }
        });
        reducir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texto.setTextSize(TypedValue.COMPLEX_UNIT_PX,texto.getTextSize()-2);
            }
        });
        cambiarColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int randomColor=Color.rgb((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
            //texto.setTextColor(randomColor);
            layout2.setBackgroundColor(randomColor);
            }
        });
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "¡¡HOLA!!",Toast.LENGTH_SHORT).show();


            }
        });

    }

}