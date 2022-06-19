package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class C_FR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cfr);

        PDFView pdfView=findViewById(R.id.FR_PDF);
        pdfView.fromAsset("Functions & Recursion.pdf").load();
    }
}