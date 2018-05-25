package com.example.scientificcal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
    Button add, subtract, multiply, divide, one, two, three,
            four, five, six, seven, eight, nine, zero, zero_2,
            equal,del, clear;
    TextView result, note, midResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        note = findViewById(R.id.note);
        midResult = findViewById(R.id.midResult);
        result = findViewById(R.id.result);

        clear = findViewById(R.id.clear);
        del = findViewById(R.id.del);

        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        equal = findViewById(R.id.equal);

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
        zero_2 = findViewById(R.id.zero_2);

        View.OnClickListener numberButton = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId()){
                    case R.id.one: note.append("1");
                        break;
                    case R.id.two: note.append("2");
                        break;
                    case R.id.three: note.append("3");
                        break;
                    case R.id.four: note.append("4");
                        break;
                    case R.id.five: note.append("5");
                        break;
                    case R.id.six: note.append("6");
                        break;
                    case R.id.seven: note.append("7");
                        break;
                    case R.id.eight: note.append("8");
                        break;
                    case R.id.nine: note.append("9");
                        break;
                    case R.id.zero: note.append("0");
                        break;
                    case R.id.zero_2: note.append("00");
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"기능미구현",Toast.LENGTH_SHORT).show();

                }
            }
        };
        View.OnClickListener calButton = new View.OnClickListener() {
            //연산자를 두번째 사용하는 경우 처리 필요
            //연산자를 연속으로 사용할 경우 처리 필요

            @Override
            public void onClick(View v) {
                String midValue= midResult.getText().toString();
                String noteValue = note.getText().toString();
                if(noteValue.equals("")){
                    Toast.makeText(MainActivity.this, "숫자를 먼저 넣어야합니다.", Toast.LENGTH_SHORT).show();
                } else {
                    //Toast.makeText(MainActivity.this, "연산기능 미구현", Toast.LENGTH_SHORT).show();
                    switch (v.getId()) {
                        case R.id.add:
                            if(noteValue.contains("+")||noteValue.contains("-")||noteValue.contains("X")||noteValue.contains("/")){
                                Toast.makeText(MainActivity.this, "다중연산 미구현", Toast.LENGTH_SHORT).show();
                            } else {
                                midResult.setText(noteValue);
                                note.append("+");
                            }
                            break;
                        case R.id.subtract:
                            if(noteValue.contains("+")||noteValue.contains("-")||noteValue.contains("X")||noteValue.contains("/")){
                                Toast.makeText(MainActivity.this, "다중연산 미구현", Toast.LENGTH_SHORT).show();
                            } else {
                                midResult.setText(noteValue);
                                note.append("-");
                            }
                            break;
                        case R.id.multiply:
                            if(noteValue.contains("+")||noteValue.contains("-")||noteValue.contains("X")||noteValue.contains("/")){
                                Toast.makeText(MainActivity.this, "다중연산 미구현", Toast.LENGTH_SHORT).show();
                            } else {
                                midResult.setText(noteValue);
                                note.append("X");
                            }
                            break;
                        case R.id.divide:
                            if(noteValue.contains("+")||noteValue.contains("-")||noteValue.contains("X")||noteValue.contains("/")){
                                Toast.makeText(MainActivity.this, "다중연산 미구현", Toast.LENGTH_SHORT).show();
                            } else {
                                midResult.setText(noteValue);
                                note.append("/");
                            }
                            break;
                        case R.id.equal:
                            if(noteValue.contains("+")){
                                String curValue = noteValue.substring(noteValue.indexOf("+")+1);
                                int resultValue = parseInt(midValue) + parseInt(curValue);
                                result.setText(String.valueOf(resultValue));

                            } else if(noteValue.contains("-")){
                                String curValue = noteValue.substring(noteValue.indexOf("-")+1);
                                int resultValue = parseInt(midValue) - parseInt(curValue);
                                result.setText(String.valueOf(resultValue));

                            } else if(noteValue.contains("X")){
                                String curValue = noteValue.substring(noteValue.indexOf("X")+1);
                                int resultValue = parseInt(midValue) * parseInt(curValue);
                                result.setText(String.valueOf(resultValue));

                            } else if(noteValue.contains("/")){
                                String curValue = noteValue.substring(noteValue.indexOf("/")+1);
                                double resultValue = parseDouble(midValue) / parseDouble(curValue);
                                result.setText(String.valueOf(resultValue));
                            }
                            break;
                        default:
                            Toast.makeText(getApplicationContext(), "기능미구현", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        };
        clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                result.setText("");
                note.setText("");
                midResult.setText("");
                Toast.makeText(MainActivity.this, "초기화", Toast.LENGTH_SHORT).show();

            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = note.getText().toString();

                if(value.equals("")){
                    Toast.makeText(MainActivity.this, "지울 숫자가 없습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    note.setText(value.substring(0,value.length()-1));
                }
                //Toast.makeText(getApplicationContext(),"기능 미구현",Toast.LENGTH_SHORT).show();
            }
        });

        add.setOnClickListener(calButton);
        subtract.setOnClickListener(calButton);
        multiply.setOnClickListener(calButton);
        divide.setOnClickListener(calButton);
        equal.setOnClickListener(calButton);

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
        zero_2.setOnClickListener(numberButton);
    }


}
