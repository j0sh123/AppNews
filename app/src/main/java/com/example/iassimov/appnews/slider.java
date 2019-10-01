package com.example.iassimov.appnews;

import android.content.Intent;
import android.support.v4.text.HtmlCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class slider extends AppCompatActivity {

    private ViewPager slider;
    private LinearLayout linear;
    private sliderAdapter slAdapter;

    private TextView[] mdots;

    private Button mnext;
    private Button mprev;
    private int currentpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);

        slider=(ViewPager)findViewById(R.id.slidePage);
        linear=(LinearLayout)findViewById(R.id.linearLayout);


        mnext=(Button)findViewById(R.id.btnNext);
        mprev=(Button)findViewById(R.id.btnPrev);

        slAdapter=new sliderAdapter(this);

        slider.setAdapter(slAdapter);

        addDots(0);

        slider.addOnPageChangeListener(viewListener);

        mnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentpage==mdots.length-1)
                {
                    nuevapage();
                }
                else {
                    slider.setCurrentItem(currentpage + 1);
                }
            }
        });

        mprev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    slider.setCurrentItem(currentpage - 1);

            }
        });
    }

    private void nuevapage()
    {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }

    //agregar los 3 puntos
    public void addDots(int position)
    {
        mdots=new TextView[3];
        linear.removeAllViews();
        for (int i=0;i<mdots.length;i++)
        {
            mdots[i]=new TextView(this);
            mdots[i].setText(Html.fromHtml("&#8226"));
            mdots[i].setTextSize(35);
            mdots[i].setTextColor(getResources().getColor(R.color.white3));

            linear.addView(mdots[i]);

        }

        if(mdots.length>0)
        {
            mdots[position].setTextColor(getResources().getColor(R.color.white));
        }
    }

    ViewPager.OnPageChangeListener viewListener=new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            addDots(i);
            currentpage=i;
            if (i==0)
            {
                mnext.setEnabled(true);
                mprev.setEnabled(false);
                mprev.setVisibility(View.INVISIBLE);

                mnext.setText("Next");
                mprev.setText("");
            }
            else if(i==mdots.length-1)
            {
                mnext.setEnabled(true);
                mprev.setEnabled(true);
                mprev.setVisibility(View.VISIBLE);

                mnext.setText("Finish");
                mprev.setText("Back");
            }
            else
            {
                mnext.setEnabled(true);
                mprev.setEnabled(true);
                mprev.setVisibility(View.VISIBLE);

                mnext.setText("Next");
                mprev.setText("Back");
            }
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
}
