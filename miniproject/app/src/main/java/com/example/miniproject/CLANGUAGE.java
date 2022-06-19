package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CLANGUAGE extends AppCompatActivity {
    Button VKC,IO,CI,LCS,FR,A,S,ST,FIO,DMA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clanguage);

        VKC = findViewById(R.id.VKC);
        IO = findViewById(R.id.IO);
        CI = findViewById(R.id.CI);
        LCS = findViewById(R.id.LCS);
        FR = findViewById(R.id.FR);
        A = findViewById(R.id.A);
        S = findViewById(R.id.S);
        ST = findViewById(R.id.ST);
        FIO = findViewById(R.id.FIO);
        DMA = findViewById(R.id.DMA);

        VKC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CLANGUAGE.this,C_VKC.class);
                startActivity(intent);
            }
        });

        IO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CLANGUAGE.this,C_IO.class);
                startActivity(intent);
            }
        });

        CI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CLANGUAGE.this,C_CI.class);
                startActivity(intent);
            }
        });

        LCS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CLANGUAGE.this,C_LCS.class);
                startActivity(intent);
            }
        });

        FR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CLANGUAGE.this,C_FR.class);
                startActivity(intent);

            }
        });

        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CLANGUAGE.this,C_A.class);
                startActivity(intent);
            }
        });

        S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CLANGUAGE.this,C_S.class);
                startActivity(intent);
            }
        });

        ST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CLANGUAGE.this,C_ST.class);
                startActivity(intent);
            }
        });

        FIO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CLANGUAGE.this,C_FIO.class);
                startActivity(intent);
            }
        });

        DMA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CLANGUAGE.this,C_DMA.class);
                startActivity(intent);
            }
        });

    }
}