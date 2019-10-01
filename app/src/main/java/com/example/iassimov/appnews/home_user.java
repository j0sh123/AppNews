package com.example.iassimov.appnews;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class home_user extends Fragment implements View.OnClickListener {

    View view;
    Button btn;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.activity_infor,container,false);

        btn=(Button)view.findViewById(R.id.btnUbicacion);

        btn.setOnClickListener(this);

        return view;
    }

    public void onClick(View v)
    {
        if(v.getId()==R.id.btnUbicacion)
        {
            Intent i=new Intent(getActivity(),map.class);
            startActivity(i);
        }
    }

    public void click(View view)
    {
        Intent i=new Intent(getActivity(),map.class);
        startActivity(i);

    }
}
