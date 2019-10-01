package com.example.iassimov.appnews;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class home_noticias extends Fragment implements View.OnClickListener {

    private Button btn1,btn2,btn3,btn4,btn5;
    private Button dbtn1,dbtn2,dbtn3,dbtn4,dbtn5;
    private  View view;
    private TextView tx;
    DownloadManager downloadManager;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.activity_noticias,container,false);

        btn1=(Button)view.findViewById(R.id.btnnot1);
        btn2=(Button)view.findViewById(R.id.btnnot2);
        btn3=(Button)view.findViewById(R.id.btnnot3);
        btn4=(Button)view.findViewById(R.id.btnnot4);
        btn5=(Button)view.findViewById(R.id.btnnot5);

        // descargas
        dbtn1=(Button)view.findViewById( R.id.descarga1 );
        dbtn2=(Button)view.findViewById( R.id.descarga2 );
        dbtn3=(Button)view.findViewById( R.id.descarga3 );
        dbtn4=(Button)view.findViewById( R.id.descarga4 );
        dbtn5=(Button)view.findViewById( R.id.descarga5 );

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);

        dbtn1.setOnClickListener( this );
        dbtn2.setOnClickListener( this );
        dbtn3.setOnClickListener( this );
        dbtn4.setOnClickListener( this );
        dbtn5.setOnClickListener( this );
        return view;
    }


    public void onClick(View v) {


        String nombrePdf="";
        String descargaspdf="";
        boolean botones=true;

       Intent i=new Intent( getActivity(),Categ.class );


        switch (v.getId())
        {
            case R.id.btnnot1:i.putExtra("not", "1");botones=true; break;
            case R.id.btnnot2:i.putExtra("not", "2");botones=true; break;
            case R.id.btnnot3:i.putExtra("not", "3");botones=true; break;
            case R.id.btnnot4:i.putExtra("not", "4");botones=true; break;
            case R.id.btnnot5:i.putExtra("not", "5");botones=true; break;

            case R.id.descarga1:nombrePdf="noti1";descargaspdf="elgiganteegoista.pdf";botones=false;break;
            case R.id.descarga2:nombrePdf="noti2";descargaspdf="losviajesdegulliver.pdf";botones=false;break;
            case R.id.descarga3:nombrePdf="noti3";descargaspdf="lacerillera.pdf";botones=false;break;
            case R.id.descarga4:nombrePdf="noti1";descargaspdf="lasirenita.pdf";botones=false;break;
            case R.id.descarga5:nombrePdf="noti3";descargaspdf="elgatoconbotas.pdf";botones=false;break;

        }


        if(botones) {
            startActivity( i );
        }
        else{
            downloadManager=(DownloadManager)getActivity().getSystemService(Context.DOWNLOAD_SERVICE );
            String archivo = "http://www.cuentosinfantilesadormir.com/"+descargaspdf;
            Uri uri=Uri.parse(archivo);
            DownloadManager.Request request=new DownloadManager.Request( uri );
            request.setNotificationVisibility( DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED );
            Long reference= downloadManager.enqueue( request );
            Toast.makeText( getActivity(),"descargando...",Toast.LENGTH_SHORT ).show();
        }


    }


}
