package com.example.iassimov.appnews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login extends AppCompatActivity implements View.OnClickListener {

    Button btIngresar;
    TextView txtSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btIngresar =findViewById(R.id.button);
        txtSkip=findViewById(R.id.txtSkip);

        btIngresar.setOnClickListener(this);
        txtSkip.setOnClickListener(this);

    }

    public void onClick(View view)
    {
        Intent i;
        switch (view.getId()) {

            case R.id.button:
                 i = new Intent(this, slider.class);
                startActivity(i);
            break;
            case R.id.txtSkip:
                 i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;

        }
    }

}