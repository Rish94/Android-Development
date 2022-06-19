package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class P_PFR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppfr);

        PDFView pdfView = findViewById(R.id.PFR_PDF);
        pdfView.fromAsset("funcrecp.pdf").load();
    }
}