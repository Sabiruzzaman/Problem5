package com.green_station_20.problem5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPlus, btnMinus, btnMultiply, btnDivision, btnEqual, btnClear, btnDell;
    TextView tvInput;
    String process = "0";

    double num1, num2, ans;
    char sign = '0';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnDivision = findViewById(R.id.btnDivision);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnEqual = findViewById(R.id.btnEqual);
        btnClear = findViewById(R.id.btnClear);
        btnDell = findViewById(R.id.btnDell);
        tvInput = findViewById(R.id.tvInput);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText("");
            }
        });

        btnDell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                process = tvInput.getText().toString();


                if (process.equals("")) {
                    process = "0";
                } else {
                    process = process.substring(0, process.length() - 1);
                    tvInput.setText(process);
                }


            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                if (process.length() != 0) {
                    tvInput.setText(process + "0");

                }

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "9");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process = tvInput.getText().toString();

                if (process.equals("")) {
                    process = "0";
                } else {
                    num1 = Double.parseDouble(process);
                    tvInput.setText("");
                    sign = '+';
                }

            }
        });


        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process = tvInput.getText().toString();

                if (process.equals("")) {
                    process = "0";
                } else {
                    num1 = Double.parseDouble(process);
                    tvInput.setText("");
                    sign = '-';
                }

            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process = tvInput.getText().toString();

                if (process.equals("")) {
                    process = "0";
                } else {
                    num1 = Double.parseDouble(process);
                    tvInput.setText("");
                    sign = '*';
                }


            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process = tvInput.getText().toString();

                if (process.equals("")) {
                    process = "0";
                } else {
                    num1 = Double.parseDouble(process);
                    tvInput.setText("");
                    sign = '/';
                }
            }
        });


        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sign != '0') {
                    process = tvInput.getText().toString();
                    num2 = Double.parseDouble(process);

                    if (sign == '+') {
                        ans = num1 + num2;
                        process = String.valueOf(ans);
                        tvInput.setText(process);
                        sign = '0';

                    }
                    if (sign == '-') {
                        ans = num1 - num2;
                        process = String.valueOf(ans);
                        tvInput.setText(process);
                        sign = '0';

                    }

                    if (sign == '*') {
                        ans = num1 * num2;
                        process = String.valueOf(ans);
                        tvInput.setText(process);
                        sign = '0';

                    }

                    if (sign == '/') {
                        ans = num1 / num2;
                        process = String.valueOf(ans);
                        tvInput.setText(process);
                        sign = '0';

                    }
                }
            }
        });

    }
}