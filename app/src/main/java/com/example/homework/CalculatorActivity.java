package com.example.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    android.widget.TextView res;
    android.widget.EditText num1,num2;
    android.widget.Button add,sub,div,mult;

    float result_num;
    int number1,number2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_main);
        res = (TextView)findViewById(R.id.res);
        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);
        add = (Button)findViewById(R.id.add);
        sub = (Button)findViewById(R.id.sub);
        div = (Button)findViewById(R.id.div);
        mult = (Button)findViewById(R.id.mult);

        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());
                result_num = number1 + number2;
                res.setText(String.valueOf(result_num));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());
                result_num = number1 - number2;
                res.setText(String.valueOf(result_num));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());
                result_num = number1 / number2;
                res.setText(String.valueOf(result_num));
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());
                result_num = number1 * number2;
                res.setText(String.valueOf(result_num));
            }
        });



    }

}
