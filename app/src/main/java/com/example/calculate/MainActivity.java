package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

    private boolean plusphase = false;

    private StringBuilder sb;

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

        sb = new StringBuilder();

        calctext = findViewById(R.id.calctext);

    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.btn1) {
            if(sb.length() < 10) {
                sb.append("1");
                calctext.setText(sb);
            }

        } else if(view.getId() == R.id.btn2) {
            if(sb.length() < 10) {
                sb.append("2");
                calctext.setText(sb);
            }

        } else if(view.getId() == R.id.btn3) {
            if(sb.length() < 10) {
                sb.append("3");
                calctext.setText(sb);
            }
        } else if(view.getId() == R.id.btn4) {
            if(sb.length() < 10) {
                sb.append("4");
                calctext.setText(sb);
            }
        } else if(view.getId() == R.id.btn5) {
            if(sb.length() < 10) {
                sb.append("5");
                calctext.setText(sb);
            }
        } else if(view.getId() == R.id.btn6) {
            if(sb.length() < 10) {
                sb.append("6");
                calctext.setText(sb);
            }
        } else if(view.getId() == R.id.btn7) {
            if(sb.length() < 10) {
                sb.append("7");
                calctext.setText(sb);
            }
        } else if(view.getId() == R.id.btn8) {
            if(sb.length() < 10) {
                sb.append("8");
                calctext.setText(sb);
            }
        } else if(view.getId() == R.id.btn9) {
            if(sb.length() < 10) {
                sb.append("9");
                calctext.setText(sb);
            }
        } else if(view.getId() == R.id.btnplus) {
            if(plusphase == false) {
                btnplus.setBackgroundColor(Color.rgb(200, 200, 200));
                plusphase = true;
            } else {
                btnplus.setBackgroundColor(Color.rgb(68, 68, 68));
                plusphase = false;
            }

        } else if(view.getId() == R.id.btnc) {
            sb.delete(0, sb.length());
            calctext.setText(sb);
        }

    }
}