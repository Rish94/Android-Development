package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class button1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button1);

        PDFView pdfView= findViewById(R.id.pdfview);
        pdfView.fromAsset("cprogramming.pdf").load();
    }
}