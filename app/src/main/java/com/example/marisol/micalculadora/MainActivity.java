package com.example.marisol.micalculadora;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {
    private String resultado;
    private TextView tvResultado;
    private int sw=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        tvResultado = (TextView) findViewById(R.id.tvResultado);
    }

    public void uno(View view) {
        resultado = tvResultado.getText().toString();
        if (resultado.equals("0")) {
            resultado = "";
        }
        resultado = resultado + "1";
        tvResultado.setText(resultado);
    }

    public void dos(View view) {
        resultado = tvResultado.getText().toString();
        if (resultado.equals("0")) {
            resultado = "";
        }
        resultado = resultado + "2";
        tvResultado.setText(resultado);
    }

    public void tres(View view) {
        resultado = tvResultado.getText().toString();
        if (resultado.equals("0")) {
            resultado = "";
        }
        resultado = resultado + "3";
        tvResultado.setText(resultado);
    }

    public void cuatro(View view) {
        resultado = tvResultado.getText().toString();
        if (resultado.equals("0")) {
            resultado = "";
        }
        resultado = resultado + "4";
        tvResultado.setText(resultado);
    }

    public void cinco(View view) {
        resultado = tvResultado.getText().toString();
        if (resultado.equals("0")) {
            resultado = "";
        }
        resultado = resultado + "5";
        tvResultado.setText(resultado);
    }

    public void seis(View view) {
        resultado = tvResultado.getText().toString();
        if (resultado.equals("0")) {
            resultado = "";
        }
        resultado = resultado + "6";
        tvResultado.setText(resultado);
    }

    public void siete(View view) {
        resultado = tvResultado.getText().toString();
        if (resultado.equals("0")) {
            resultado = "";
        }
        resultado = resultado + "7";
        tvResultado.setText(resultado);
    }

    public void ocho(View view) {
        resultado = tvResultado.getText().toString();
        if (resultado.equals("0")) {
            resultado = "";
        }
        resultado = resultado + "8";
        tvResultado.setText(resultado);
    }

    public void nueve(View view) {
        resultado = tvResultado.getText().toString();
        if (resultado.equals("0")) {
            resultado = "";
        }
        resultado = resultado + "9";
        tvResultado.setText(resultado);
    }

    public void cero(View view) {
        resultado = tvResultado.getText().toString();
        if (resultado.equals("0")) {
            resultado = "";
        }
        resultado = resultado + "0";
        tvResultado.setText(resultado);
    }

    public void coma(View view) {
        resultado = tvResultado.getText().toString();
        if (resultado.equals("0")) {
            resultado = "";
        }
        resultado = resultado + ",";
        tvResultado.setText(resultado);
    }

    public void mas(View view) {
        sw=1;
        resultado = tvResultado.getText().toString();
        if (resultado.equals("0")) {
            resultado = "";

        }
        resultado = resultado + "+";
        tvResultado.setText(resultado);
    }

    public void menos(View view) {sw=2;
        resultado = tvResultado.getText().toString();
        if (resultado.equals("0")) {
            resultado = "";

        }
        resultado = resultado + "-";
        tvResultado.setText(resultado);
    }
    public void multiplicacion(View view) {sw=3;
        resultado = tvResultado.getText().toString();
        if (resultado.equals("0")) {
            resultado = "";

        }
        resultado = resultado + "*";
        tvResultado.setText(resultado);
    }
    public void division (View view) {sw=4;
        resultado = tvResultado.getText().toString();
        if (resultado.equals("0")) {
            resultado = "";

        }
        resultado = resultado + "/";
        tvResultado.setText(resultado);
    }
    public void igual(View view) {
        if (sw == 1)
        {
            resultado = tvResultado.getText().toString();
            int val1 = Integer.parseInt(resultado.substring(0, resultado.indexOf("+")));
            int val2 = Integer.parseInt(resultado.substring(resultado.indexOf("+") + 1, resultado.length()));

            System.out.println(Integer.parseInt(resultado.substring(0, resultado.indexOf("+"))));
            System.out.println(Integer.parseInt(resultado.substring(resultado.indexOf("+") + 1, resultado.length())));
            int res = val1 + val2;
            if (resultado.indexOf("+") != 0) {
                System.out.println("Encontro cero en: "+ resultado.indexOf("+"));
            } else {
                System.out.println("NO Encontro cero en: "+ resultado.indexOf("+"));
            }
            tvResultado.setText(res+"");
        }
        if(sw == 2){
            resultado = tvResultado.getText().toString();
            int val = Integer.parseInt(resultado.substring(0, resultado.indexOf("-")));
            int va2 = Integer.parseInt(resultado.substring(resultado.indexOf("-") + 1, resultado.length()));

            System.out.println(Integer.parseInt(resultado.substring(0, resultado.indexOf("-"))));
            System.out.println(Integer.parseInt(resultado.substring(resultado.indexOf("-") + 1, resultado.length())));
            int res1 = val - va2;
            if (resultado.indexOf("+") != 0) {
                System.out.println("Encontro cero en: "+ resultado.indexOf("+"));
            } else {
                System.out.println("NO Encontro cero en: "+ resultado.indexOf("+"));
            }
            tvResultado.setText(res1 + "");
        }


        if(sw == 3)
        {
            resultado = tvResultado.getText().toString();
            int val = Integer.parseInt(resultado.substring(0, resultado.indexOf("*")));
            int va2 = Integer.parseInt(resultado.substring(resultado.indexOf("*") + 1, resultado.length()));

            System.out.println(Integer.parseInt(resultado.substring(0, resultado.indexOf("*"))));
            System.out.println(Integer.parseInt(resultado.substring(resultado.indexOf("*") + 1, resultado.length())));
            int res = val * va2;
            if (resultado.indexOf("+") != 0) {
                System.out.println("Encontro cero en: "+ resultado.indexOf("+"));
            } else {
                System.out.println("NO Encontro cero en: "+ resultado.indexOf("+"));
            }
            tvResultado.setText(res + "");
        }
        if(sw == 4){
            resultado = tvResultado.getText().toString();
            int val = Integer.parseInt(resultado.substring(0, resultado.indexOf("/")));
            int va2 = Integer.parseInt(resultado.substring(resultado.indexOf("/") + 1, resultado.length()));

            System.out.println(Integer.parseInt(resultado.substring(0, resultado.indexOf("/"))));
            System.out.println(Integer.parseInt(resultado.substring(resultado.indexOf("/") + 1, resultado.length())));
            int res = val / va2;
        /*if (resultado.indexOf("+") != 0) {
            System.out.println("Encontro cero en: "+ resultado.indexOf("+"));
        } else {
            System.out.println("NO Encontro cero en: "+ resultado.indexOf("+"));
        }*/
            tvResultado.setText(res + "");
        }

    }
    public void borrar(View view)
    {

        tvResultado.setText("0");
    }
}

