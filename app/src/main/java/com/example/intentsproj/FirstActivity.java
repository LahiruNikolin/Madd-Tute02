package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private Button btn;
    EditText num1;
    EditText num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
         btn= findViewById(R.id.btn1);
         num1=findViewById(R. id. et1);
        num2=findViewById(R. id.et2);

         btn.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(FirstActivity.this, SecondActivity.class);
                myIntent.putExtra("num1", num1.getText().toString());
                myIntent.putExtra("num2",  num2.getText().toString());//Optional parameters
               startActivity(myIntent);

                Toast.makeText(getApplicationContext(), "Yoy clicked Ok button!",
                        Toast.LENGTH_LONG).show();
            }
        });

    }


}
