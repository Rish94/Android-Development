package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class C_VKC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cvkc);

        PDFView pdfView= findViewById(R.id.VKC_PDF);
        pdfView.fromAsset("variablekeywordconstants.pdf").load();
    }
}