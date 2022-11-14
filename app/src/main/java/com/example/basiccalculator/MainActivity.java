package com.example.basiccalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText e1,e2;
    public TextView res;
    public Button add,sub,mul,divide;
    int num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText)findViewById(R.id.editNum1);
        e2=(EditText) findViewById((R.id.editNum2));
        e1.setInputType(InputType.TYPE_CLASS_NUMBER);
        e2.setInputType(InputType.TYPE_CLASS_NUMBER);
        add =(Button) findViewById(R.id.addButton);
        sub =(Button) findViewById(R.id.subButton);
        mul =(Button) findViewById(R.id.mulButton);
        divide =(Button) findViewById(R.id.divideButton);


        res = (TextView) findViewById((R.id.resultLabel));
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().isEmpty()||e2.getText().toString().isEmpty()){
                    Toast toast=Toast.makeText(getApplicationContext(),"Please Enter the numbers",Toast.LENGTH_SHORT);
                    toast.show();
                    return;
                }


                    num1 = Integer.parseInt(e1.getText().toString());
                    num2 = Integer.parseInt(e2.getText().toString());

                    res.setText("Answer: "+String.valueOf(num1 + num2));

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().isEmpty()||e2.getText().toString().isEmpty()){
                    Toast toast=Toast.makeText(getApplicationContext(),"Please Enter the numbers",Toast.LENGTH_SHORT);
                    toast.show();
                    return;
                }
                num1=Integer.parseInt(e1.getText().toString());
                num2=Integer.parseInt(e2.getText().toString());

                res.setText("Answer: "+String.valueOf(num1-num2));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().isEmpty()||e2.getText().toString().isEmpty()){
                    Toast toast=Toast.makeText(getApplicationContext(),"Please Enter the numbers",Toast.LENGTH_SHORT);
                    toast.show();
                    return;
                }
                num1=Integer.parseInt(e1.getText().toString());
                num2=Integer.parseInt(e2.getText().toString());

                res.setText("Answer: "+String.valueOf(num1/num2));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().isEmpty()||e2.getText().toString().isEmpty()){
                    Toast toast=Toast.makeText(getApplicationContext(),"Please Enter the numbers",Toast.LENGTH_SHORT);
                    toast.show();
                    return;
                }
                num1=Integer.parseInt(e1.getText().toString());
                num2=Integer.parseInt(e2.getText().toString());

                res.setText("Answer: "+String.valueOf(num1*num2));
            }
        });
    }



}