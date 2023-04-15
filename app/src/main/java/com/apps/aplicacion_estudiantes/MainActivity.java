package com.apps.aplicacion_estudiantes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txt_matematicas);
        et2 = (EditText) findViewById(R.id.txt_fisica);
        et3 = (EditText) findViewById(R.id.txt_quimica);
        tv1 = (TextView) findViewById(R.id.tv_status);
    }

    public void estatus(View view){
        int mat = Integer.parseInt(et1.getText().toString());
        int fis = Integer.parseInt(et2.getText().toString());
        int qui = Integer.parseInt(et3.getText().toString());

        int promedio = (mat + fis + qui) / 3;

        if(promedio >= 6){
            tv1.setText("Alumno aprobado con " + promedio);
        }else if(promedio <= 5){
            tv1.setText("Alumno desaprobado con " + promedio);
        }
    }
}