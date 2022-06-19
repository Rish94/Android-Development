package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button plus,minus,multi,div;
    EditText n1,n2;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multi = findViewById(R.id.multi);
        div = findViewById(R.id.div);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        ans = findViewById(R.id.ans);

    }

    public void plus(View v){
        Toast.makeText(this, "ADDITION DONE SUCCESSFULL", Toast.LENGTH_SHORT).show();
        int a = Integer.parseInt(n1.getText().toString());
        int b = Integer.parseInt(n2.getText().toString());
        ans.setText("ANS : "+ (a+b));
    }

    public void minus(View v){
        Toast.makeText(this, "SUBTRACTION DONE SUCCESSFULL", Toast.LENGTH_SHORT).show();
        int a = Integer.parseInt(n1.getText().toString());
        int b = Integer.parseInt(n2.getText().toString());
        ans.setText("ANS : "+ (a-b));
    }

    public void multi(View v){
        Toast.makeText(this, "MULTIPLICATION DONE SUCCESSFULL", Toast.LENGTH_SHORT).show();
        int a = Integer.parseInt(n1.getText().toString());
        int b = Integer.parseInt(n2.getText().toString());
        ans.setText("ANS : "+ (a*b));
    }

    public void div(View v){
        Toast.makeText(this, "DIVISION DONE SUCCESSFULL", Toast.LENGTH_SHORT).show();
        int a = Integer.parseInt(n1.getText().toString());
        int b = Integer.parseInt(n2.getText().toString());
        ans.setText("ANS : "+ (a/b));
    }

}