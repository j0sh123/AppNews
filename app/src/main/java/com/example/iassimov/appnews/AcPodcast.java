package com.example.iassimov.appnews;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class AcPodcast  extends Fragment implements View.OnClickListener {

    MediaPlayer mp1,mp2,mp3,mp4,mp5,mp6,mp7,mp8,mp9,mp10,mp11,mp12,mp13,mp14,mp15,global;
    TextView t;
    ImageButton play;
    Button bn1,bn2,bn3,bn4,bn5,bn6,bn7,bn8,bn9,bn10,bn11,bn12,bn13,bn14,bn15;
    Button[] botones=new Button[15];
    int cambio=0;
    boolean stopped=false;

    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.activity_podcst,container,false);

        mp1=MediaPlayer.create(getActivity(),R.raw.tecmp1);
        mp2=MediaPlayer.create(getActivity(),R.raw.tecmp2);
        mp3=MediaPlayer.create(getActivity(),R.raw.tecmp3);
        mp4=MediaPlayer.create(getActivity(),R.raw.tecmp4);
        mp5=MediaPlayer.create(getActivity(),R.raw.tecmp5);
        mp6=MediaPlayer.create(getActivity(),R.raw.tecmp6);
        mp7=MediaPlayer.create(getActivity(),R.raw.tecmp7);
        mp8=MediaPlayer.create(getActivity(),R.raw.tecmp8);
        mp9=MediaPlayer.create(getActivity(),R.raw.tecmp9);
        mp10=MediaPlayer.create(getActivity(),R.raw.tecmp10);
        mp11=MediaPlayer.create(getActivity(),R.raw.tecmp11);
        mp12=MediaPlayer.create(getActivity(),R.raw.tecmp12);
        mp13=MediaPlayer.create(getActivity(),R.raw.tecmp13);
        mp14=MediaPlayer.create(getActivity(),R.raw.tecmp14);
        mp15=MediaPlayer.create(getActivity(),R.raw.tecmp15);



        play=(ImageButton)view.findViewById(R.id.imgbplay);


        bn1=(Button)view.findViewById(R.id.btns1);
        bn2=(Button)view.findViewById(R.id.btns2);
        bn3=(Button)view.findViewById(R.id.btns3);
        bn4=(Button)view.findViewById(R.id.btns4);
        bn5=(Button)view.findViewById(R.id.btns5);
        bn6=(Button)view.findViewById(R.id.btns6);
        bn7=(Button)view.findViewById(R.id.btns7);
        bn8=(Button)view.findViewById(R.id.btns8);
        bn9=(Button)view.findViewById(R.id.btns9);
        bn10=(Button)view.findViewById(R.id.btns10);
        bn11=(Button)view.findViewById(R.id.btns11);
        bn12=(Button)view.findViewById(R.id.btns12);
        bn13=(Button)view.findViewById(R.id.btns13);
        bn14=(Button)view.findViewById(R.id.btns14);
        bn15=(Button)view.findViewById(R.id.btns15);


        play.setOnClickListener(this);
        bn1.setOnClickListener(this);
        bn2.setOnClickListener(this);
        bn3.setOnClickListener(this);
        bn4.setOnClickListener(this);
        bn5.setOnClickListener(this);
        bn6.setOnClickListener(this);
        bn7.setOnClickListener(this);
        bn8.setOnClickListener(this);
        bn9.setOnClickListener(this);
        bn10.setOnClickListener(this);
        bn12.setOnClickListener(this);
        bn13.setOnClickListener(this);
        bn14.setOnClickListener(this);
        bn15.setOnClickListener(this);

        botones[0]=bn1;
        botones[1]=bn2;
        botones[2]=bn3;
        botones[3]=bn4;
        botones[4]=bn5;
        botones[5]=bn6;
        botones[6]=bn7;
        botones[7]=bn8;
        botones[8]=bn9;
        botones[9]=bn10;
        botones[10]=bn11;
        botones[11]=bn12;
        botones[12]=bn13;
        botones[13]=bn14;
        botones[14]=bn15;

        return view;

    }


    @Override
    public void onClick(View v) {
        if(v.getId()!=R.id.imgbplay) {play.setImageResource(R.mipmap.ic_pause4); cambio=0;stopped=true;}

        switch (v.getId())
        {

            case R.id.btns1:
                play(mp1,R.raw.tecmp1);
                cambiaricon(bn1);

                break;
            case  R.id.btns2:
                play(mp2,R.raw.tecmp2);
                cambiaricon(bn2);
                break;
            case  R.id.btns3:
                play(mp3,R.raw.tecmp3);
                cambiaricon(bn3);
                break;
            case R.id.btns4:
                play(mp4,R.raw.tecmp4);
                cambiaricon(bn4);
                break;
            case R.id.btns5:
                play(mp5,R.raw.tecmp5);
                cambiaricon(bn5);
                break;
            case R.id.btns6:
                play(mp5,R.raw.tecmp6);
                cambiaricon(bn5);
                break;
             case R.id.btns7:
                play(mp1,R.raw.tecmp7);
                cambiaricon(bn1);

                break;
            case  R.id.btns8:
                play(mp2,R.raw.tecmp8);
                cambiaricon(bn2);
                break;
            case  R.id.btns9:
                play(mp3,R.raw.tecmp9);
                cambiaricon(bn3);
                break;
            case R.id.btns10:
                play(mp4,R.raw.tecmp10);
                cambiaricon(bn4);
                break;
            case R.id.btns11:
                play(mp5,R.raw.tecmp11);
                cambiaricon(bn5);
                break;
            case R.id.btns12:
                play(mp5,R.raw.tecmp12);
                cambiaricon(bn5);
                break;

             case R.id.btns13:
                play(mp4,R.raw.tecmp13);
                cambiaricon(bn4);
                break;
            case R.id.btns14:
                play(mp5,R.raw.tecmp14);
                cambiaricon(bn5);
                break;
            case R.id.btns15:
                play(mp5,R.raw.tecmp15);
                cambiaricon(bn5);
                break;



        }

        // verificar si es pausa o play
        if(v.getId()==R.id.imgbplay)
        {
            if(cambio==0){
                play.setImageResource(R.mipmap.ic_play);
                pausa();
                cambio=2;
            }else{
                play.setImageResource(R.mipmap.ic_pause4); play(global);
                cambio=0;
            }

        }
    }


    private void cambiaricon(Button bn){
        //bn.setCompoundDrawablesWithIntrinsicBounds(R.mipmap.ic_musicicon2,0,0,0);
        bn.setBackgroundColor(getResources().getColor(R.color.white2));
        for (int i=0;i<botones.length;i++)
        {
            if(bn.getId()!=botones[i].getId())
                //botones[i].setCompoundDrawablesWithIntrinsicBounds(0,0,R.mipmap.ic_points,0);
                botones[i].setBackgroundColor(getResources().getColor(R.color.gray));
        }
    }


    public void play(MediaPlayer media,int cancion)
    {   if(stopped) media= MediaPlayer.create(getActivity(),cancion);
        if(global!=null)global.stop();
        global=media;
        media.start();
    }
    public void play(MediaPlayer media)
    {
        global=media;
        media.start();
    }
    public void pausa()
    {
        global.pause();
    }


}
