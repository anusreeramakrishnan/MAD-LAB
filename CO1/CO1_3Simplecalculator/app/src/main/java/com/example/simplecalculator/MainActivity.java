package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText num1,num2,ans;
    public Button add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText) findViewById(R.id.num1);
        num2=(EditText) findViewById(R.id.num2);
        ans=(EditText) findViewById(R.id.numans);
    }
    public void add(View V){

        int n1=Integer.parseInt(num1.getText().toString());
        int n2=Integer.parseInt(num2.getText().toString());
        int result=n1+n2;
        ans.setText(String.valueOf(result));
    }
    public void sub(View V){

        int n1=Integer.parseInt(num1.getText().toString());
        int n2=Integer.parseInt(num2.getText().toString());
        int result=n1-n2;
        ans.setText(String.valueOf(result));
    }
    public void mul(View V){
        int n1=Integer.parseInt(num1.getText().toString());
        int n2=Integer.parseInt(num2.getText().toString());
        int result=n1*n2;
        ans.setText(String.valueOf(result));
    }
    public void div(View V){

        int n1=Integer.parseInt(num1.getText().toString());
        int n2=Integer.parseInt(num2.getText().toString());
        int result=n1/n2;
        ans.setText(String.valueOf(result));
    }
}