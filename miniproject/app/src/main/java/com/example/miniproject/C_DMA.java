package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class C_DMA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cdma);



        PDFView pdfView= findViewById(R.id.DMA_PDF);
        pdfView.fromAsset("dynamicmemory.pdf").load();

    }

}