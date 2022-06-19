package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class start_page extends AppCompatActivity {
    Button c,p,j,cplus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
        c = findViewById(R.id.c);
        p = findViewById(R.id.p);
        j = findViewById(R.id.j);
        cplus = findViewById(R.id.cplus);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(start_page.this, "WELCOME IN C", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(start_page.this,CLANGUAGE.class);
                startActivity(intent);
            }
        });

        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(start_page.this, "WELCOME IN PYTHON", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(start_page.this,PYTHON.class);
                startActivity(intent);

            }
        });

        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(start_page.this, "WELCOME IN JAVA", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(start_page.this,JAVA.class);
                startActivity(intent);
            }
        });

        cplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(start_page.this, "WELCOME IN C++", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(start_page.this,CPLUS.class);
                startActivity(intent);
            }
        });
    }

}