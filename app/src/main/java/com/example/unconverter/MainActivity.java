package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textview;
    private EditText edittext;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textview = findViewById(R.id.textView);
        edittext = findViewById(R.id.editTextTextPersonName);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "hi click listner work", Toast.LENGTH_SHORT).show();
                String s = edittext.getText().toString();
                int a = Integer.parseInt(s);
                double pound = 2.205 * a;
                textview.setText("The Corresponding Value In Pound Is :" + pound);
            }
        });
    }
}