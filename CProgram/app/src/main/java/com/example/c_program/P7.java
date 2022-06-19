package com.example.c_program;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class P7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p7);

        PDFView pdfView = findViewById(R.id. P7);
        pdfView.fromAsset("P7.pdf").load();
    }
}