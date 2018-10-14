package com.example.lodrickthomas.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView answerDisplay;
    private Button keyPad1, keyPad2, keyPad3,keyPad4,keyPad5,
            keyPad6,keyPad7,keyPad8,keyPad9, keyPad0;
    private Button keyPadAdd, keyPadMult,keyPadMinus,keyPadDivide,
            keyPadClear,keyPadEquals;
    private String number = "";
    private String symbol;
    private double num1 = 0;
    private double num2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerDisplay = findViewById(R.id.answer);
        keyPad0 = findViewById(R.id.button_zero);
        keyPad1 = findViewById(R.id.button_1);
        keyPad2 = findViewById(R.id.button_2);
        keyPad3 = findViewById(R.id.button_3);
        keyPad4 = findViewById(R.id.button_4);
        keyPad5 = findViewById(R.id.button_5);
        keyPad6 = findViewById(R.id.button_6);
        keyPad7 = findViewById(R.id.button_7);
        keyPad8 = findViewById(R.id.button_8);
        keyPad9 = findViewById(R.id.button_9);
        keyPadAdd = findViewById(R.id.button_add);
        keyPadMult = findViewById(R.id.button_multiply);
        keyPadAdd = findViewById(R.id.button_add);
        keyPadMinus = findViewById(R.id.button_minus);
        keyPadDivide = findViewById(R.id.button_divide);
        keyPadClear = findViewById(R.id.button_clear);
        keyPadEquals = findViewById(R.id.button_equal);

        keyPad0.setOnClickListener(this);
        keyPad1.setOnClickListener(this);
        keyPad2.setOnClickListener(this);
        keyPad3.setOnClickListener(this);
        keyPad4.setOnClickListener(this);
        keyPad5.setOnClickListener(this);
        keyPad6.setOnClickListener(this);
        keyPad7.setOnClickListener(this);
        keyPad8.setOnClickListener(this);
        keyPad9.setOnClickListener(this);
        keyPadAdd.setOnClickListener(this);
        keyPadMult.setOnClickListener(this);
        keyPadMinus.setOnClickListener(this);
        keyPadDivide.setOnClickListener(this);
        keyPadClear.setOnClickListener(this);
        keyPadEquals.setOnClickListener(this);










    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_1:
                number = number + "0";
                break;
        }

        switch (view.getId()){
            case R.id.button_zero:
                number = number + "0";
                answerDisplay.setText(number);
                break;

            case R.id.button_1:
                number = number + "1";
                answerDisplay.setText(number);
                break;
            case R.id.button_2:
                number = number + "2";
                answerDisplay.setText(number);
                break;

            case R.id.button_3:
                number = number + "3";
                answerDisplay.setText(number);
                break;
            case R.id.button_4:
                number = number + "4";
                answerDisplay.setText(number);
                break;
            case R.id.button_5:
                number = number + "5";
                answerDisplay.setText(number);
                break;
            case R.id.button_6:
                number = number + "6";
                answerDisplay.setText(number);
                break;
            case R.id.button_7:
                number = number + "7";
                answerDisplay.setText(number);
                break;
            case R.id.button_8:
                number = number + "8";
                answerDisplay.setText(number);
                break;
            case R.id.button_9:
                number = number + "9";
                answerDisplay.setText(number);
                break;

            case R.id.button_add:
                symbol = "+";
                num1 = Integer.parseInt(number);
                number = "";
                break;
            case R.id.button_multiply:
                symbol = "*";
                num1 = Integer.parseInt(number);
                number = "";
                break;
            case R.id.button_minus:
                symbol = "-";
                num1 = Integer.parseInt(number);
                number = "";
                break;
            case R.id.button_divide:
                symbol = "/";
                num1 = Integer.parseInt(number);
                number = "";
                break;
            case R.id.button_clear:
                symbol = "";
                num1 = 0;
                num2 = 0;
                number = "";
                answerDisplay.setText("");
                break;

            case R.id.button_equal:
                num2 = Integer.parseInt(number);
                if (symbol == "+"){
                    answerDisplay.setText("Answer: " + (num1 + num2));
                } else if (symbol == "-"){
                    answerDisplay.setText("Answer: " + (num1 - num2));
                } else if (symbol == "*"){
                    answerDisplay.setText("Answer: " + (num1 * num2));
                } else if (symbol == "/"){
                    answerDisplay.setText("Answer: " + (num1 / num2));

                    if (num2 == 0){
                        answerDisplay.setText("Can't divide by zero");
                    } else {
                        answerDisplay.setText("Answer: " + (num1 / num2));
                    }

                }
//                else {
//
//                    num1 = 0;
//                    num2 = 0;
//                    number = "";
//
//                }

                num1 = 0;
                num2 = 0;
                number = "";
                break;
        }



    }
}
