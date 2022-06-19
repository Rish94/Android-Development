package com.example.c_program;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class P5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p5);


        PDFView pdfView = findViewById(R.id.P5);
        pdfView.fromAsset("P5.pdf").load();
    }
}