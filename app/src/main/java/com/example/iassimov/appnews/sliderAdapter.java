package com.example.iassimov.appnews;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class sliderAdapter extends PagerAdapter  {
    Context context;
    LayoutInflater layoutInflater;

   public sliderAdapter (Context context)
    {
        this.context=context;
    }

    public int[] slide_img={R.mipmap.group_10,R.mipmap.group_11,R.mipmap.group_12};

   public String[] slide_title={"LEER","NOTICIAS","AYUDARA"};
   public String[] slide_desc={
           "El leer le proporsciona a la persona de Agudiza la astucia, Estimula el intercambio de información y conocimiento, La costumbre continuada de leer, retarda la aparición de los síntomas de demencia ",
           "Las noticias nos mantienen informado de todo lo que pasa en nuestros alrededores para no ser igorantes y tener un buen tema de que hablar",
           "Te ayudara mucho esta App para que te encuentres actualizado de las noticias y no estes perdido en medio de conversaciones importantes"

   };

    @Override
    public int getCount() {
        return slide_title.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==(ConstraintLayout)o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view= layoutInflater.inflate(R.layout.slider1,container,false);

        ImageView slideimg=(ImageView) view.findViewById(R.id.slideimg);
        TextView slidetittle=(TextView) view.findViewById(R.id.slidetitle);
        TextView slidecontent=(TextView) view.findViewById(R.id.slidecontent);

        slidecontent.setText(slide_desc[position]);
        slidetittle.setText(slide_title[position]);
        slideimg.setImageResource(slide_img[position]);

        container.addView(view);
        return  view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout)object);
    }
}
