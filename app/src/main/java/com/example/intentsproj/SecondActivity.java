package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    EditText numView;
    EditText numView1;
    TextView tv;

    int nb1,nb2;
        String num1,num2;


    private Button plusBtn;
    private Button minusBtn;
    private Button multyBtn;
    private Button divBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        numView=findViewById(R. id. et3);
        numView1=findViewById(R. id. et4);
        tv=findViewById(R.id.tv3);

        //buttons
        plusBtn= findViewById(R.id.plusBtn);
        minusBtn= findViewById(R.id.minusBtn);
        multyBtn= findViewById(R.id.multyBtn);
        divBtn= findViewById(R.id.divBtn);


        Intent intent = getIntent();
        num1 = intent.getStringExtra("num1");
        num2 = intent.getStringExtra("num2");
        numView.setText(num1);
        numView1.setText(num2);

        nb1=Integer.parseInt(num1);
        nb2=Integer.parseInt(num2);

//plus OP
        plusBtn.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                tv.setText(num1+" + "+num2+"="+String.valueOf(nb1+nb2));

            }
        });
//substract OP
        minusBtn.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                tv.setText(num1+" - "+num2+"="+String.valueOf(nb1-nb2));

            }
        });
//multi OP
        multyBtn.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                tv.setText(num1+" * "+num2+"="+String.valueOf(nb1*nb2));

            }
        });
//division OP
        divBtn.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                tv.setText(num1+" / "+num2+"="+String.valueOf(nb1/nb2));

            }
        });
    }
}
