package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    public static final String extra_name = "com.example.mainactivity.extra.NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    public void OpenActivity(View v){
        Toast.makeText(this, "NEW ACTIVITY OPEN", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MainActivity2.class);
        name = findViewById(R.id.editTextTextPersonName);
        String nameText = name.getText().toString();
        intent.putExtra(extra_name,nameText);
        startActivity(intent);
    }

}