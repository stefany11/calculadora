package com.facci.calculadorasp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

public class MainActivitySP extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {

    Double numero1, numero2,resultado;
    String operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_sp);
    }
    public void acerca(View v){
        Intent acercar = new Intent(this, AcercaActivitySP.class);
        startActivity(acercar);
    }
    public void igual(View miView){
        EditText tv = (EditText) findViewById(R.id.idresultado);
        numero2 = Double.parseDouble(tv.getText().toString());
        if (operacion.equals("+")){
            resultado= numero1+numero2;
        }
        else
              if (operacion.equals("-")){
                resultado=numero1-numero2;

            }
        else
                  if (operacion.equals("*")){
                      resultado=numero1*numero2;
                  }
         tv.setText(resultado.toString());


    }

    public void onClickOperacion1(View miView){
        EditText tv =(EditText) findViewById(R.id.idresultado);
        numero1=Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }
    public void suma (View miView){
        operacion="+";
        onClickOperacion1(miView);
    }
    public void resta(View miView){
        operacion="-";
        onClickOperacion1(miView);
    }
    public void multiplica(View miView){
        operacion="*";
        onClickOperacion1(miView);
    }
    public void uno(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresultado) ;
        tv.setText(tv.getText() + "1");
    }
    public void dos(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresultado) ;
        tv.setText(tv.getText() + "2");
    }
    public void tres(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresultado) ;
        tv.setText(tv.getText() + "3");
    }
    public void cuatro(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresultado) ;
        tv.setText(tv.getText() + "4");
    }
    public void cinco(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresultado) ;
        tv.setText(tv.getText() + "5");
    }
    public void seis(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresultado) ;
        tv.setText(tv.getText() + "6");
    }
    public void siete(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresultado) ;
        tv.setText(tv.getText() + "7");
    }
    public void ocho(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresultado) ;
        tv.setText(tv.getText() + "8");
    }
    public void nueve(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresultado) ;
        tv.setText(tv.getText() + "9");
    }
    public void cero(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresultado) ;
        tv.setText(tv.getText() + "0");
    }

    @Override
    public void onClick(View view) {
        EditText pantalla =(EditText) findViewById(R.id.idresultado);
        int press = view.getId();
        String alt = pantalla.getText().toString();

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }
}
