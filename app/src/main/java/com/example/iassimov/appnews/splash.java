package com.example.iassimov.appnews;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class splash extends AppCompatActivity {


    private static final long splash1=3000;
    private ProgressDialog progres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                Intent i=new Intent(splash.this,slider.class);
                startActivity(i);
                finish();
            }
        };
        Timer timer=new Timer();
        timer.schedule(task,splash1);
    }
    }

