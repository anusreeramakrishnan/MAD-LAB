package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Password;
    private TextView Username,Info;
    private Button Login;
    int count=5;
    String uname,pwd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Username = (TextView) findViewById(R.id.etname);
        Password = (EditText) findViewById(R.id.etpass);
        Login = (Button) findViewById(R.id.etbutton);
        Info = (TextView) findViewById(R.id.etinfo);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uname=Username.getText().toString();
                pwd=Password.getText().toString();
                if(uname.equals("Anusree") && pwd.equals("12345")) {
                    Toast.makeText(getApplicationContext(), "login successful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, MainActivity2.class));
                }
                else {
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                    count--;
                    Info.setText("login attempts remaining : "+count);
                    if (count==0)
                    {
                        Toast.makeText(MainActivity.this, "Login Button Disabled", Toast.LENGTH_SHORT).show();
                        Login.setEnabled(false);
                    }
                }
            }
        });

    }
}