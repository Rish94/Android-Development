package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PYTHON extends AppCompatActivity {
    Button in,CM,VD,PS,LT,DS,CE,PLOOP,PFR,PFH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python);
        in = findViewById(R.id.in);
        CM = findViewById(R.id.CM);
        VD = findViewById(R.id.VD);
        PS = findViewById(R.id.PS);
        LT = findViewById(R.id.LT);
        DS = findViewById(R.id.DS);
        CE = findViewById(R.id.CE);
        PLOOP = findViewById(R.id.PLOOP);
        PFR = findViewById(R.id.PFR);
        PFH = findViewById(R.id.PFH);


        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PYTHON.this,P_IN.class);
                startActivity(intent);

            }
        });

        CM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PYTHON.this,P_CM.class);
                startActivity(intent);

            }
        });

        VD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PYTHON.this,P_VD.class);
                startActivity(intent);
            }
        });

        PS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PYTHON.this,P_PS.class);
                startActivity(intent);
            }
        });

        LT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PYTHON.this,P_LT.class);
                startActivity(intent);
            }
        });

        DS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PYTHON.this,P_DS.class);
                startActivity(intent);

            }
        });

        CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PYTHON.this,P_CE.class);
                startActivity(intent);

            }
        });

        PLOOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PYTHON.this,P_PLOOP.class);
                startActivity(intent);

            }
        });

        PFR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PYTHON.this,P_PFR.class);
                startActivity(intent);

            }
        });

        PFH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PYTHON.this,P_PFH.class);
                startActivity(intent);

            }
        });




    }
}