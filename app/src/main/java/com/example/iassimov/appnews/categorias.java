package com.example.iassimov.appnews;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class categorias extends AppCompatActivity {

    private TabLayout tablayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias_cont);

        tablayout=(TabLayout)findViewById(R.id.tableLayout);
        appBarLayout=(AppBarLayout) findViewById(R.id.appbar);
        viewPager=(ViewPager)findViewById(R.id.view_page);

        ViewPageAdapter adapter=new ViewPageAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentNews(),"Noticias");
        adapter.AddFragment(new FragmentVideo(),"Videos");
      //  adapter.AddFragment(new FragmentPodcast(),"PodCast");

        //viewPager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewPager);

    }
}
