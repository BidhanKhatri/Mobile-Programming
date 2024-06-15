package com.example.myfirstapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {

    //logic for equals btn by using static class and static method
    //public static class ExpressionEvaluator{
//        public static double evaluate(String expression){
//
//            expression = expression.replaceAll("\\s+", "");
//
//            String[] numbers = expression.split("[+-/*]");
//            String[] operators = expression.split("[0-9.]+");
//
//            double result = Double.parseDouble(numbers[0]);
//
//            int index = 1;
//
//            for(int i = 1; i < operators.length; i++){
//                if(operators[i].equals("+")){
//                    result = result + Double.parseDouble(numbers[index++]);
//                }else if(operators[i].equals("-")){
//                    result = result - Double.parseDouble(numbers[index++]);
//                }else if(operators[i].equals("*")){
//                    result = result * Double.parseDouble(numbers[index++]);
//                }else if(operators[i].equals("/")){
//                    result = result / Double.parseDouble(numbers[index++]);
//                }
//            }
//            return result;
//
//        }
//
//    }


    TextView result; //obj
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAdd, btnSub,
            btnDiv, btnMul, btnClr, btnPoint, btnEq; //obj
    boolean dotFlag = false;
    int operatorFlag = 0;   //1 for add 2 for sub 3 for mul and 4 for div
    double firstValue = 0, secondValue = 0, thirdValue=0, finalValue = 0 ;
    int plusFlag = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator); //UI

        result = findViewById(R.id.result); // assigning id from calculator.xml or UI
        result.setText("0");
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnDiv = findViewById(R.id.btnDiv);
        btnMul = findViewById(R.id.btnMul);
        btnClr = findViewById(R.id.btnClr);
        btnPoint = findViewById(R.id.btnPoint);
        btnEq = findViewById(R.id.btnEq);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("0");          //concat vayera aaucha
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("1");          //concat vayera aaucha
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("9");
            }
        });

        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dotFlag == false) {
                    result.append(".");
                    dotFlag = true;
                }
            }
        });

        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("0");
                dotFlag = false;
                firstValue = 0;
                secondValue = 0;
                thirdValue = 0;
                finalValue = 0;
                operatorFlag = 0;
                plusFlag = 0;
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorFlag = 1;
                plusFlag++;

                if(plusFlag == 1) {
                    firstValue = Double.parseDouble(result.getText().toString()); //getting string to double
                }
                if(plusFlag == 2){
                    thirdValue = Double.parseDouble(result.getText().toString());
                }


                result.setText("0");


            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorFlag = 2;
                firstValue = Double.parseDouble(result.getText().toString());
                thirdValue = Double.parseDouble(result.getText().toString());
                result.setText("0");
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorFlag = 3;
                firstValue = Double.parseDouble(result.getText().toString());
                thirdValue = Double.parseDouble(result.getText().toString());
                result.setText("0");
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorFlag = 4;
                firstValue = Double.parseDouble(result.getText().toString());
                thirdValue = Double.parseDouble(result.getText().toString());
                result.setText("0");
            }
        });

        btnEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                String expression = result.getText().toString();
////                double evaluatedResult = ExpressionEvaluator.evaluate(expression); // from static class
////                result.setText(String.valueOf(evaluatedResult));

                if (operatorFlag == 1) {
                    secondValue = Double.parseDouble(result.getText().toString());

                        if(plusFlag == 1){
                            finalValue = firstValue + secondValue;
                        }
                        else if(plusFlag == 2){

                            finalValue = firstValue + secondValue + thirdValue;
                        }
                        else if(plusFlag >=3){
                            plusFlag = 0;
                        }


                   // thirdValue = Double.parseDouble(result.getText().toString());


//                    Log.e("firstValue",String.valueOf(firstValue));
//                    Log.e("secondValue",String.valueOf(secondValue));
//                    Log.e("finalValue",String.valueOf(finalValue));
                    result.setText(String.valueOf(finalValue));
                    operatorFlag = 0;
                } else if (operatorFlag == 2) {
                    secondValue = Double.parseDouble(result.getText().toString());
                    finalValue = firstValue - secondValue;
                    result.setText(String.valueOf(finalValue));
                    operatorFlag = 0;
                } else if (operatorFlag == 3) {
                    secondValue = Double.parseDouble(result.getText().toString());
                    finalValue = firstValue * secondValue;
                    result.setText(String.valueOf(finalValue));
                    operatorFlag = 0;
                } else if (operatorFlag == 4) {
                    try {
                        secondValue = Double.parseDouble(result.getText().toString());
                        if (secondValue == 0) {
                            throw new ArithmeticException("Ma Err");
                        }
                        finalValue = firstValue / secondValue;
                        result.setText(String.valueOf(finalValue));
                    }catch(ArithmeticException error){
                        result.setText(error.getMessage());
                    }
                    operatorFlag = 0;
                }

            }
        });


    }


}


