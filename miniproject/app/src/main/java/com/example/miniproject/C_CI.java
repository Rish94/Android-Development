package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class C_CI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cci);

        PDFView pdfView = findViewById(R.id.CI_PDF);
        pdfView.fromAsset("Conditionalinstructions .pdf").load();

    }
}