package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btnplus;
    private Button btnmainasu;
    private Button btnkakeru;
    private Button btnwaru;
    private Button btnikoru;
    private Button btnc;
    private TextView calctext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(this);
        btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(this);
        btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(this);
        btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(this);
        btn0 = findViewById(R.id.btn0);
        btn0.setOnClickListener(this);
        btnplus = findViewById(R.id.btnplus);
        btnplus.setOnClickListener(this);
        btnmainasu = findViewById(R.id.btnmainasu);
        btnmainasu.setOnClickListener(this);
        btnkakeru = findViewById(R.id.btnkakeru);
        btnkakeru.setOnClickListener(this);
        btnwaru = findViewById(R.id.btnwaru);
        btnwaru.setOnClickListener(this);
        btnikoru = findViewById(R.id.btnikoru);
        btnikoru.setOnClickListener(this);
        btnc = findViewById(R.id.btnc);
        btnc.setOnClickListener(this);

        calctext = findViewById(R.id.calctext);

    }

    @Override
    public void onClick(View view) {
        Log.d("MainActivity", "Button ID: " + view.getId());
        switch(view.getId()) {

            case R.id.btn1:
                calctext.setText("1");
                break;

        }

    }
}