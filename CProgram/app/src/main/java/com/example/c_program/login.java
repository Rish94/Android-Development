package com.example.c_program;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    ListView listview;
    String arr[] = {"C HELLO WORLD","C Program to Print an Integer (Entered by the User)","C Program to Add Two Integers"
    ,"C Program to Multiply Two Floating-Point Numbers","C Program to Find ASCII Value of a Character",
    "C Program to Compute Quotient and Remainder","C Program to Find the Size of int, float, double and char","C Program to Demonstrate the Working of Keyword long"
    ,"C Program to Swap Two Numbers","C Program to Check Whether a Number is Even or Odd","C Program to Check Whether a Character is a Vowel or Consonant",
            "C Program to Find the Largest Number Among Three Numbers","C Program to Find the Roots of a Quadratic Equation"
    ,"C Program to Check Leap Year","C Program to Check Whether a Number is Positive or Negative","C Program to Check Whether a Character is an Alphabet or not",
    "C Program to Calculate the Sum of Natural Numbers","C Program to Find Factorial of a Number"
    ,"C Program to Generate Multiplication Table","C Program to Display Fibonacci Sequence"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        listview = findViewById(R.id.listview);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1,arr);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    Toast.makeText(login.this, "PROGRAM", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this,hello.class);
                    startActivity(intent);
                }
                else if(i==1){
                    Toast.makeText(login.this, "PROGRAM", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this,P2.class);
                    startActivity(intent);
                }
                else if(i==2){
                    Toast.makeText(login.this, "PROGRAM", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this,P3.class);
                    startActivity(intent);

                }
                else if(i==3){
                    Toast.makeText(login.this, "PROGRAM", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this,P4.class);
                    startActivity(intent);
                }
                else if(i==4){
                    Toast.makeText(login.this, "PROGRAM", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this,P5.class);
                    startActivity(intent);

                }
                else if(i==5){
                    Toast.makeText(login.this, "PROGRAM", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this,P6.class);
                    startActivity(intent);
                }
                else if(i==6){
                    Toast.makeText(login.this, "PROGRAM", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this,P7.class);
                    startActivity(intent);
                }
                else if(i==7){
                    Toast.makeText(login.this, "PROGRAM", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this,P8.class);
                    startActivity(intent);

                }
                else if(i==8){
                    Toast.makeText(login.this, "PROGRAM", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this,P9.class);
                    startActivity(intent);
                }
                else if(i==9){
                    Toast.makeText(login.this, "PROGRAM", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this,P10.class);
                    startActivity(intent);
                }
                else if(i==10){
                    Toast.makeText(login.this, "PROGRAM", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this,P11.class);
                    startActivity(intent);
                }
                else if(i==11){
                    Toast.makeText(login.this, "PROGRAM", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this,P12.class);
                    startActivity(intent);
                }
                else if(i==12){
                    Toast.makeText(login.this, "PROGRAM", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this,P13.class);
                    startActivity(intent);
                }
                else if(i==13){
                    Toast.makeText(login.this, "PROGRAM", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this,P14.class);
                    startActivity(intent);
                }
                else if(i==14){
                    Toast.makeText(login.this, "PROGRAM", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this,P15.class);
                    startActivity(intent);
                }
                else if(i==15){
                    Toast.makeText(login.this, "PROGRAM", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this,P16.class);
                    startActivity(intent);
                }
                else if(i==16){
                    Toast.makeText(login.this, "PROGRAM", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this,P17.class);
                    startActivity(intent);
                }
                else if(i==17){
                    Toast.makeText(login.this, "PROGRAM", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this,P18.class);
                    startActivity(intent);
                }
                else if(i==18){
                    Toast.makeText(login.this, "PROGRAM", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this,P19.class);
                    startActivity(intent);
                }
                else if(i==19){
                    Toast.makeText(login.this, "PROGRAM", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this,P20.class);
                    startActivity(intent);
                }


            }
        });





        }
}