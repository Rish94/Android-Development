package com.example.codingquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions = {"1. Assignment operator is evaluated Left to Right.","2. The size of float variable is 32 bit ?",
            "3. the default value of int variable is 0 ?" , "4. Garbage Collection is manual process."
    ,"5. Constructor overloading is not possible in Java."};

    private boolean[] ans = {false,true,true,false,false};
    private int index = 0;
    private int s = 0;
    Button yes;
    Button no;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes =findViewById(R.id.YES);
        no = findViewById(R.id.NO);
        textview.setText(questions[index]);
        textview = findViewById(R.id.textView4);


        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index + 1 == questions.length){
                    Toast.makeText(MainActivity.this, "Your score is : " + s, Toast.LENGTH_SHORT).show();
                }
                if(ans[index]==true) {
                    s++;
                }
                textview.setText(questions[++index]);


            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index + 1 == questions.length){
                    Toast.makeText(MainActivity.this, "Your score is : + s", Toast.LENGTH_SHORT).show();
                }
                if(ans[index]==false) {
                    s++;
                }
                textview.setText(questions[++index]);
            }
        });



    }
}