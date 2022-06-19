package com.example.c_program;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class P19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p19);

        PDFView pdfView = findViewById(R.id.P19);
        pdfView.fromAsset("P19.pdf").load();
    }
}