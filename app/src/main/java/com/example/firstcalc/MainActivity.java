package com.example.firstcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;
    Button plus;
    Button minus;
    Button multiply;
    Button divide;
    Button result;
    Button dot;
    Button clear;
    Button befor;
    Button forv;
    TextView resultArea;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /******************* Variables *********************/

        b0 = (Button)findViewById(R.id.button);
        b1 = (Button)findViewById(R.id.button2);
        b2 = (Button)findViewById(R.id.button3);
        b3 = (Button)findViewById(R.id.button4);
        b4 = (Button)findViewById(R.id.button5);
        b5 = (Button)findViewById(R.id.button6);
        b6 = (Button)findViewById(R.id.button7);
        b7 = (Button)findViewById(R.id.button8);
        b8 = (Button)findViewById(R.id.button9);
        b9 = (Button)findViewById(R.id.button10);

        plus = (Button)findViewById(R.id.button16);
        minus = (Button)findViewById(R.id.button15);
        multiply = (Button)findViewById(R.id.button14);
        divide = (Button)findViewById(R.id.button13);

        result = (Button)findViewById(R.id.button12);
        dot = (Button)findViewById(R.id.button11);
        clear = (Button)findViewById(R.id.button17);
        befor = (Button)findViewById(R.id.button19);
        forv = (Button)findViewById(R.id.button18);
        resultArea = (TextView)findViewById(R.id.textView);



        /******************* Buttons *********************/

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultArea.setText(resultArea.getText().toString() + '0');
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultArea.setText(resultArea.getText().toString() + '0');
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultArea.setText(resultArea.getText().toString() + '1');
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultArea.setText(resultArea.getText().toString() + '2');
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultArea.setText(resultArea.getText().toString() + '3');
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultArea.setText(resultArea.getText().toString() + '4');
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultArea.setText(resultArea.getText().toString() + '5');
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultArea.setText(resultArea.getText().toString() + '6');
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultArea.setText(resultArea.getText().toString() + '7');
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultArea.setText(resultArea.getText().toString() + '8');
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultArea.setText(resultArea.getText().toString() + '9');
            }
        });


        /******************* Functions *********************/

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultArea.setText(resultArea.getText().toString() + " * ");
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultArea.setText(resultArea.getText().toString() + " / ");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultArea.setText(resultArea.getText().toString() + " + ");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultArea.setText(resultArea.getText().toString() + " - ");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultArea.setText(resultArea.getText().toString() + ".");
            }
        });

        befor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultArea.setText(resultArea.getText().toString() + " ( ");
            }
        });

        forv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultArea.setText(resultArea.getText().toString() + " ) ");
            }
        });


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultArea.setText("");
            }
        });

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String var1 = resultArea.getText().toString();
                resultArea.setText(String.valueOf(EvaluateString.evaluate(var1)));
            }
        });


    }



}

