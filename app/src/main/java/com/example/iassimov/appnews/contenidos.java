package com.example.iassimov.appnews;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class contenidos extends AppCompatActivity{

    TextView ed;
   // Button btn1,btn2,btn3,btn4,btn5;

    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_contenidos );


        /*pdfView=(PDFView)findViewById(R.id.pdfView1);
        pdfView.fromAsset("noti2.pdf").load();

     /*   InputStream leer=null;
        String valor = getIntent().getExtras().getString("not");

        switch (valor)
        {
            case "1" :pvbreak;
            case "2" :pdfView.fromAsset("noti2.pdf").load();break;
            case "3" :pdfView.fromAsset("noti3.pdf").load();break;
            case "4" :pdfView.fromAsset("noti1.pdf").load();break;
            case "5" :pdfView.fromAsset("noti2.pdf").load();break;
        }
        /*btn1=(Button)findViewById(R.id.btns1);
        btn2=(Button)findViewById(R.id.btns2);
        btn3=(Button)findViewById(R.id.btns3);
        btn4=(Button)findViewById(R.id.btns4);
        btn5=(Button)findViewById(R.id.btns5);*/

      //  ed=(TextView) findViewById(R.id.txtdatos);

      /*  try {
            CargaDatos();
        } catch (IOException e) {
            ed.setText("no salio");
        } */
/*

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
          */
    }

   /* class RetrievePDFStream extends AsyncTask<String,Void,InputStream>
    {

        @Override
        protected InputStream doInBackground(String... strings) {
            InputStream inputStream=null;

            try {
                URL url=new URL( strings[0] );
                HttpURLConnection urlConnection=(HttpURLConnection)url.openConnection();
                if(urlConnection.getResponseCode()==200)
                {
                    inputStream=new BufferedInputStream(urlConnection.getInputStream());
                }
            }
            catch (IOException e)
            {
                return null;
            }

            return inputStream;

        }

        protected void onPostExecute(InputStream inputStream)
        {
            pdfView.fromStream(inputStream).load();
        }
    }*/

   /* public void CargaDatos() throws IOException {
        String datos = null;
        InputStream leer=null;
        String valor = getIntent().getExtras().getString("not");

        switch (valor)
        {
            case "1" :leer =this.getResources().openRawResource(R.raw.not1);break;
            case "2" :leer =this.getResources().openRawResource(R.raw.not2);break;
            case "3" :leer =this.getResources().openRawResource(R.raw.not3);break;
            case "4" :leer =this.getResources().openRawResource(R.raw.not4);break;
            case "5" :leer =this.getResources().openRawResource(R.raw.not5);break;
        }

        BufferedReader reader=new BufferedReader(new InputStreamReader(leer));
        if(leer!=null)
        {
            datos=reader.readLine();
        }
        leer.close();

        ed.setText(datos);
    }


    /*public void onClick(View v) {
        String datos = null;
        InputStream leer = null;

        switch (v.getId())
        {
            case R.id.btnnot1:leer=this.getResources().openRawResource(R.raw.not1); break;
            case R.id.btnnot2:leer=this.getResources().openRawResource(R.raw.not2); break;
            case R.id.btnnot3:leer=this.getResources().openRawResource(R.raw.not3); break;
            case R.id.btnnot4:leer=this.getResources().openRawResource(R.raw.not4); break;
            case R.id.btnnot5:leer=this.getResources().openRawResource(R.raw.not5); break;

        }


        BufferedReader reader=new BufferedReader(new InputStreamReader(leer));
        if(leer!=null)
        {
            try {
                datos=reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            leer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ed.setText(datos);
    }*/
}
