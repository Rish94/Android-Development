package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class P_PLOOP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pploop);



        PDFView pdfView = findViewById(R.id.PLOOP_PDF);
        pdfView.fromAsset("looppython.pdf").load();
    }
}