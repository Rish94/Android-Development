package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class C_FIO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cfio);


        PDFView pdfView= findViewById(R.id.FIO_PDF);
        pdfView.fromAsset("fileinout.pdf").load();
    }
}