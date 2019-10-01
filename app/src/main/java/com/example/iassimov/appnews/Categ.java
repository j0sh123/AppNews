package com.example.iassimov.appnews;

import android.os.PersistableBundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;

import java.io.InputStream;


public class Categ extends AppCompatActivity{

    private PDFView pdfView;
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);

        pdfView=(PDFView)findViewById(R.id.pdfView1);
        String valor = getIntent().getExtras().getString("not");

        switch (valor)
        {
            case "1" :pdfView.fromAsset("noti1.pdf").load();break;
            case "2" :pdfView.fromAsset("noti2.pdf").load();break;
            case "3" :pdfView.fromAsset("noti3.pdf").load();break;
            case "4" :pdfView.fromAsset("noti1.pdf").load();break;
            case "5" :pdfView.fromAsset("noti2.pdf").load();break;
        }
    }
}
