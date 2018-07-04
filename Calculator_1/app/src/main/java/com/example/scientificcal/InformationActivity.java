package com.example.scientificcal;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class InformationActivity extends AppCompatActivity {

    ImageButton fab2;
    LinearLayout info_AC, info_C, info_MC, info_MR, info_MS, info_MA, info_EXM, info_GT, info_TS, info_TA;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information_page);

        info_AC = findViewById(R.id.info_AC);
        info_C = findViewById(R.id.info_C);
        info_MC = findViewById(R.id.info_MC);
        info_MR = findViewById(R.id.info_MR);
        info_MS = findViewById(R.id.info_MS);
        info_MA = findViewById(R.id.info_MA);
        info_EXM = findViewById(R.id.info_EXM);
        info_GT = findViewById(R.id.info_GT);
        info_TS = findViewById(R.id.info_TS);
        info_TA = findViewById(R.id.info_TA);

        fab2 = findViewById(R.id.fab2);

        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        info_AC.setOnClickListener(explain);
        info_C.setOnClickListener(explain);
        info_MC.setOnClickListener(explain);
        info_MR.setOnClickListener(explain);
        info_MS.setOnClickListener(explain);
        info_MA.setOnClickListener(explain);
        info_EXM.setOnClickListener(explain);
        info_GT.setOnClickListener(explain);
        info_TS.setOnClickListener(explain);
        info_TA.setOnClickListener(explain);

    }
    View.OnClickListener explain = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(InformationActivity.this);
            switch(view.getId()){

                case R.id.info_AC:
                    builder.setTitle("AC");
                    builder.setMessage("모든 것을 초기화한다냥");
                    builder.setPositiveButton("알았다냥",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                    builder.show();
                    break;
                case R.id.info_C:
                    builder.setTitle("C");
                    builder.setMessage("현재 쓰고있는 숫자를 초기화한다냥");
                    builder.setPositiveButton("알았다냥",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                    builder.show();
                    break;
                case R.id.info_MC:
                    builder.setTitle("MC");
                    builder.setMessage("Memory에 기록된 숫자를 초기화한다냥");
                    builder.setPositiveButton("알았다냥",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                    builder.show();
                    break;
                case R.id.info_MR:
                    builder.setTitle("MR");
                    builder.setMessage("Memory에 기록된 숫자를 보여준다냥");
                    builder.setPositiveButton("알았다냥",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                    builder.show();
                    break;
                case R.id.info_MS:
                    builder.setTitle("M-");
                    builder.setMessage("Memory에 저장된 값에서 현재 계산된 값을 뺀 결과를 Memory에 저장한다냥");
                    builder.setPositiveButton("알았다냥",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                    builder.show();
                    break;
                case R.id.info_MA:
                    builder.setTitle("M+");
                    builder.setMessage("Memory에 저장된 값에서 현재 계산된 값을 더한 결과를 Memory에 저장한다냥");
                    builder.setPositiveButton("알았다냥",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                    builder.show();
                    break;
                case R.id.info_EXM:
                    builder.setTitle("M/EX");
                    builder.setMessage("환율관련 기능인데 아직 구현하지 않았다냥");
                    builder.setPositiveButton("알았다냥",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                    builder.show();
                    break;
                case R.id.info_GT:
                    builder.setTitle("GT");
                    builder.setMessage("이제껏 =으로 계산했던 결과들을 더한다냥");
                    builder.setPositiveButton("알았다냥",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                    builder.show();
                    break;
                case R.id.info_TS:
                    builder.setTitle("TAX-");
                    builder.setMessage("설정된 TAX의 비율만큼 뺀다냥");
                    builder.setPositiveButton("알았다냥",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                    builder.show();
                    break;
                case R.id.info_TA:
                    builder.setTitle("TAX+");
                    builder.setMessage("설정된 TAX의 비율만큼 더한다냥");
                    builder.setPositiveButton("알았다냥",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                    builder.show();
                    break;
                default:
                    break;
            }

        }
    };

}
