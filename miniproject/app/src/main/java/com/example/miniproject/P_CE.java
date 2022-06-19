package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class P_CE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pce);


        PDFView pdfView = findViewById(R.id.CE_PDF);
        pdfView.fromAsset("conditionalexp.pdf").load();
    }
}