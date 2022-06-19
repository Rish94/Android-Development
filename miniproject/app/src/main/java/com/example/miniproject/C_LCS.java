package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class C_LCS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clcs);

        PDFView pdfView = findViewById(R.id.LCS_PDF);
        pdfView.fromAsset("Loop Control Instructions.pdf").load();


    }
}