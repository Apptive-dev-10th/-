package com.example.scientificcal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    Button backspace, mod, one, two, three, four, five, six, seven, eight, nine, zero, doubleZero, clear, allClear;
    ImageButton add, subtract, multiply, divide, equal, root, dot;
    TextView formula;
    String operator = "";
    int count = 0;
    int operatorCount = 0;
    String midResult = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clear = findViewById(R.id.clear);
        allClear = findViewById(R.id.allClear);

        formula = findViewById(R.id.formula);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        doubleZero = findViewById(R.id.doubleZero);
        dot = findViewById(R.id.dot);

        add = findViewById(R.id.add);
        mod = findViewById(R.id.mod);
        subtract = findViewById(R.id.subtract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);

        root = findViewById(R.id.root);
        equal = findViewById(R.id.equal);


        View.OnClickListener numberButton = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = formula.getText().toString();
                operatorCount = 0;
                switch (v.getId()) {
                    case R.id.one:
                        if (operator != "") {
                            if (count == 0) {
                                formula.setText("1");
                                count++;
                            } else {
                                formula.append("1");
                            }
                        } else {
                            formula.append("1");
                        }

                        break;
                    case R.id.two:
                        if (operator != "") {
                            if (count == 0) {
                                formula.setText("2");
                                count++;
                            } else {
                                formula.append("2");
                            }
                        } else {
                            formula.append("2");
                        }
                        break;
                    case R.id.three:
                        if (operator != "") {
                            if (count == 0) {
                                formula.setText("3");
                                count++;
                            } else {
                                formula.append("3");
                            }
                        } else {
                            formula.append("3");
                        }
                        break;
                    case R.id.four:
                        if (operator != "") {
                            if (count == 0) {
                                formula.setText("4");
                                count++;
                            } else {
                                formula.append("4");
                            }
                        } else {
                            formula.append("4");
                        }
                        break;
                    case R.id.five:
                        if (operator != "") {
                            if (count == 0) {
                                formula.setText("5");
                                count++;
                            } else {
                                formula.append("5");
                            }
                        } else {
                            formula.append("5");
                        }
                        break;
                    case R.id.six:
                        if (operator != "") {
                            if (count == 0) {
                                formula.setText("6");
                                count++;
                            } else {
                                formula.append("6");
                            }
                        } else {
                            formula.append("6");
                        }
                        break;
                    case R.id.seven:
                        if (operator != "") {
                            if (count == 0) {
                                formula.setText("7");
                                count++;
                            } else {
                                formula.append("7");
                            }
                        } else {
                            formula.append("7");
                        }
                        break;
                    case R.id.eight:
                        if (operator != "") {
                            if (count == 0) {
                                formula.setText("8");
                                count++;
                            } else {
                                formula.append("8");
                            }
                        } else {
                            formula.append("8");
                        }
                        break;
                    case R.id.nine:
                        if (operator != "") {
                            if (count == 0) {
                                formula.setText("9");
                                count++;
                            } else {
                                formula.append("9");
                            }
                        } else {
                            formula.append("9");
                        }
                        break;
                    case R.id.zero:
                        if (operator != "") {
                            if (count == 0) {
                                formula.setText("0");
                                count++;
                            } else {
                                formula.append("0");
                            }
                        } else {
                            formula.append("0");
                        }
                        break;
                    case R.id.doubleZero:
                        if (operator != "") {
                            if (count == 0) {
                                formula.setText("00");
                                count++;
                            } else {
                                formula.append("00");
                            }
                        } else {
                            formula.append("00");
                        }
                        break;
                    case R.id.dot:
                        if (value.equals("")) {
                            formula.append("0.");
                        } else {
                            formula.append(".");
                        }
                }
            }
        };
        View.OnClickListener calButton = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = formula.getText().toString();
                if (value.equals("")) {
                    Toast.makeText(MainActivity.this, "숫자를 먼저 넣어야합니다.", Toast.LENGTH_SHORT).show();
                } else {
                    count = 0;
                    switch (v.getId()) {
                        case R.id.add:
                            if (operatorCount != 0) {
                                operator = "+";
                            } else {
                                setResult(value);
                            }
                            operatorCount++;
                            operator = "+";
                            break;
                        case R.id.subtract:
                            if (operatorCount != 0) {
                                operator = "-";
                            } else {
                                setResult(value);
                            }
                            operatorCount++;
                            operator = "-";
                            break;
                        case R.id.multiply:
                            if (operatorCount != 0) {
                                operator = "*";
                            } else {
                                setResult(value);
                            }
                            operatorCount++;
                            operator = "*";
                            break;
                        case R.id.divide:
                            if (operatorCount != 0) {
                                operator = "/";
                            } else {
                                setResult(value);
                            }
                            operatorCount++;
                            operator = "/";
                            break;
                        case R.id.mod:
                            if (operatorCount != 0) {
                                operator = "%";
                            } else {
                                setResult(value);
                            }
                            operatorCount++;
                            operator = "%";
                            break;
                        case R.id.root:
                            operator = "@";
                            setResult(value);
                            operatorCount++;
                            operator = "@";
                            break;
                    }
                }
            }
        };

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = formula.getText().toString();
                count = 0;
                setResult(value);
                operator = "";
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                formula.setText("");
                count = 0;

            }
        });

        allClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                formula.setText("");
                operator = "";
                midResult = "";
                count = 0;
            }
        });

        one.setOnClickListener(numberButton);
        two.setOnClickListener(numberButton);
        three.setOnClickListener(numberButton);
        four.setOnClickListener(numberButton);
        five.setOnClickListener(numberButton);
        six.setOnClickListener(numberButton);
        seven.setOnClickListener(numberButton);
        eight.setOnClickListener(numberButton);
        nine.setOnClickListener(numberButton);
        zero.setOnClickListener(numberButton);
        doubleZero.setOnClickListener(numberButton);
        dot.setOnClickListener(numberButton);

        add.setOnClickListener(calButton);
        subtract.setOnClickListener(calButton);
        multiply.setOnClickListener(calButton);
        divide.setOnClickListener(calButton);
        mod.setOnClickListener(calButton);
        root.setOnClickListener(calButton);
    }

    public void setResult(String value) {
        if (value.contains(".") || midResult.contains(".")) {
            if (operator == "+") {
                double result = parseDouble(midResult) + parseDouble(value);
                formula.setText(String.valueOf(result));
                midResult = String.valueOf(result);
            } else if (operator == "-") {
                double result = parseDouble(midResult) - parseDouble(value);
                formula.setText(String.valueOf(result));
                midResult = String.valueOf(result);
            } else if (operator == "*") {
                double result = parseDouble(midResult) * parseDouble(value);
                formula.setText(String.valueOf(result));
                midResult = String.valueOf(result);
            } else if (operator == "/") {
                double result = parseDouble(midResult) / parseDouble(value);
                formula.setText(String.valueOf(result));
                midResult = String.valueOf(result);
            } else if (operator == "%") {
                double result = parseDouble(midResult) % parseDouble(value);
                formula.setText(String.valueOf(result));
                midResult = String.valueOf(result);
            } else if (operator == "@") {
                double result = Math.sqrt(parseDouble(value));
                formula.setText(String.valueOf(result));
                midResult = String.valueOf(result);
            } else if (operator == "") {
                midResult = value;
            }
        } else {
            if (operator == "+") {
                double result = parseDouble(midResult) + parseDouble(value);
                formula.setText(String.valueOf(result));
                midResult = String.valueOf(result);
            } else if (operator == "-") {
                double result = parseDouble(midResult) - parseDouble(value);
                formula.setText(String.valueOf(result));
                midResult = String.valueOf(result);
            } else if (operator == "*") {
                double result = parseDouble(midResult) * parseDouble(value);
                formula.setText(String.valueOf(result));
                midResult = String.valueOf(result);
            } else if (operator == "/") {
                double result = parseDouble(midResult) / parseDouble(value);
                formula.setText(String.valueOf(result));
                midResult = String.valueOf(result);
            } else if (operator == "%") {
                int result = parseInt(midResult) % parseInt(value);
                formula.setText(String.valueOf(result));
                midResult = String.valueOf(result);
            } else if (operator == "@") {
                double result = Math.sqrt(parseDouble(value));
                formula.setText(String.valueOf(result));
                midResult = String.valueOf(result);
            } else if (operator == "") {
                midResult = value;
            }
        }
    }
}