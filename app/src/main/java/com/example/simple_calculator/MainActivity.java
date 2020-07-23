/*seg2105 assignment3
    Xia(Cynthia) Sheng
    300091655
 */


package com.example.simple_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnplus,btnminus,btnmul,btnequal,
    btndiv,btnpoint,btnc;
    TextView edttxt;
    float val_one,val_two;
    boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0=(Button) findViewById(R.id.btn0);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button) findViewById(R.id.btn4);
        btn5=(Button) findViewById(R.id.btn5);
        btn6=(Button) findViewById(R.id.btn6);
        btn7=(Button) findViewById(R.id.btn7);
        btn8=(Button) findViewById(R.id.btn8);
        btn9=(Button) findViewById(R.id.btn9);
        btnc=(Button) findViewById(R.id.btnc);
        btnplus=(Button) findViewById(R.id.btnplus);
        btnminus=(Button) findViewById(R.id.btnminus);
        btnmul=(Button) findViewById(R.id.btnMul);
        btnpoint=(Button) findViewById(R.id.btnpoint);
        btndiv=(Button) findViewById(R.id.btndiv);
        btnequal=(Button) findViewById(R.id.btnequal);
        edttxt=(TextView)findViewById(R.id.screen);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "0");
            }
        });

        btnpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + ".");
            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val_two=Float.parseFloat(edttxt.getText()+ "");
                if(add==true){
                    edttxt.setText(val_one + val_two+"");
                    add=false;
                }
                if(sub==true){
                    edttxt.setText(val_one - val_two+"");
                    sub=false;
                }
                if(mul==true){
                    edttxt.setText(val_one * val_two+"");
                    mul=false;
                }
                if(div==true){
                    edttxt.setText(val_one / val_two+"");
                    div=false;
                }
            }
        });

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val_one=Float.parseFloat(edttxt.getText() + "");
                add=true;
                edttxt.setText(null);
            }
        });

        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val_one=Float.parseFloat(edttxt.getText() + "");
                sub=true;
                edttxt.setText(null);
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val_one=Float.parseFloat(edttxt.getText() + "");
                mul=true;
                edttxt.setText(null);
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val_one=Float.parseFloat(edttxt.getText() + "");
                div=true;
                edttxt.setText(null);
            }
        });

         btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edttxt.setText("");
            }
        });
    }
}