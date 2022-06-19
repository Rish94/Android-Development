package com.example.c_program;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Login;
    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Login = findViewById(R.id.Login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("123456"))
                {
                    Toast.makeText(MainActivity.this, "LOGIN SECCESSFULLY !", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,login.class);
                    startActivity(intent);
                }
                else
                {
                    if( username.getText().toString().length() == 0 && password.getText().toString().length() == 0)
                    {
                        Toast.makeText(MainActivity.this, "FIRST ENTER DETAILS", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(MainActivity.this, "LOGIN FAILED !", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, forgot.class);
                        startActivity(intent);
                    }
                }

            }
        });
    }
}