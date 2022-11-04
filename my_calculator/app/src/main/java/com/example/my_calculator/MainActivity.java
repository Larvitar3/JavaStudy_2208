package com.example.my_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 변수 선언
    private TextView oneTextView;
    private TextView twoTextView;
    private TextView threeTextView;
    private TextView fourTextView;
    private TextView fiveTextView;
    private TextView sixTextView;
    private TextView sevenTextView;
    private TextView eightTextView;
    private TextView nineTextView;
    private TextView zeroTextView;
    private TextView caTextView;
    private TextView plusTextView;
    private TextView minusTextView;
    private TextView resultTextView;

    // 이전에 눌러진 값 + 새로 눌러진 값 => 더해진 값
    // 값을 저장하기 위해 변수를 선언한다.

    // int를 사용하면 합쳐지기 때문에 String을 사용한다
    String oldValue = "0";
    String newValue = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        addEventListener();
    }

    private void initData(){
        // id를 찾아오는 방법
        oneTextView = findViewById(R.id.one);
        twoTextView = findViewById(R.id.two);
        threeTextView = findViewById(R.id.three);
        fourTextView = findViewById(R.id.four);
        fiveTextView = findViewById(R.id.five);
        sixTextView = findViewById(R.id.six);
        sevenTextView = findViewById(R.id.seven);
        eightTextView = findViewById(R.id.eight);
        nineTextView = findViewById(R.id.nine);
        zeroTextView = findViewById(R.id.zero);
        caTextView = findViewById(R.id.ca);
        plusTextView = findViewById(R.id.plus);
        minusTextView = findViewById(R.id.minus);
        resultTextView = findViewById(R.id.resultTextView);
    }

    private void addEventListener(){
        oneTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("TAG", "oneBtn 눌러짐");
                newValue = newValue + 1;
                resultTextView.setText(newValue);
            }
        });

        twoTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("TAG", "twoBtn 눌러짐");
                newValue = newValue + 2;
                resultTextView.setText(newValue);
            }
        });

        threeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("TAG", "threeBtn 눌러짐");
                newValue = newValue + 3;
                resultTextView.setText(newValue);
            }
        });

        fourTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("TAG", "fourBtn 눌러짐");
                newValue = newValue + 4;
                resultTextView.setText(newValue);
            }
        });

        fiveTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("TAG", "fiveBtn 눌러짐");
                newValue = newValue + 5;
                resultTextView.setText(newValue);
            }
        });

        sixTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("TAG", "sixBtn 눌러짐");
                newValue = newValue + 6;
                resultTextView.setText(newValue);
            }
        });

        sevenTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("TAG", "sevenBtn 눌러짐");
                newValue = newValue + 7;
                resultTextView.setText(newValue);
            }
        });

        eightTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("TAG", "eightBtn 눌러짐");
                newValue = newValue + 8;
                resultTextView.setText(newValue);
            }
        });

        nineTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("TAG", "nineBtn 눌러짐");
                newValue = newValue + 9;
                resultTextView.setText(newValue);
            }
        });

        zeroTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("TAG", "zeroBtn 눌러짐");
                newValue = newValue + 0;
                resultTextView.setText(newValue);
            }
        });

        caTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("TAG", "caBtn 눌러짐");
                newValue = "";
                oldValue = "0" ;
                resultTextView.setText("0");
            }
        });

        // 람다 표현식 ▼
        plusTextView.setOnClickListener(view -> {
            Log.d("TAG", "plus 눌러짐");
            try {
                int num1 = Integer.parseInt(newValue);
                int num2 = Integer.parseInt(oldValue);
                int sum = num1 + num2;
                oldValue = String.valueOf(sum);
                Log.d("TAG", "new : " + newValue);
                newValue = "";
                resultTextView.setText(oldValue);

            }catch (NumberFormatException e){
                Log.d("TAG", e.toString());
            }
              Log.d("TAG", "new : " + newValue);
              Log.d("TAG", "old : " + oldValue);
        });

        minusTextView.setOnClickListener(view -> {
            Log.d("TAG", "minus 눌러짐");
            try {
                int num1 = Integer.parseInt(newValue);
                int num2 = Integer.parseInt(oldValue);
                int minus = num1 - num2;

                if(num2 != 0){
                    minus = num2 - num1;
                    newValue = "";
                    oldValue = String.valueOf(minus);
                    resultTextView.setText(oldValue);
                }else{
                    oldValue = String.valueOf(minus);
                    newValue = "";
                    resultTextView.setText(oldValue);
                }

                // 300 - 0
                // 2번째 입력 : 500
                // 300 - 500 = -200


            }catch (NumberFormatException e){
                Log.d("TAG", e.toString());
            }
            Log.d("TAG", "Mnew : " + newValue);
            Log.d("TAG", "Mold : " + oldValue);
        });

        }
    }


