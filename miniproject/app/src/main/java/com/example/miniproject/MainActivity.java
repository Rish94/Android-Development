package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
    }

    public void OpenSecondPage(View view)
    {
        Toast.makeText(MainActivity.this, "WELCOME", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,start_page.class);
        startActivity(intent);

    }

}