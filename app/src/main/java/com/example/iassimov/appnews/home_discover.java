package com.example.iassimov.appnews;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class home_discover extends Fragment {

    private TabLayout tablayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;
    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view =inflater.inflate(R.layout.activity_categorias_cont,container,false);

        tablayout=(TabLayout)view.findViewById(R.id.tableLayout);
        appBarLayout=(AppBarLayout) view.findViewById(R.id.appbar);
        viewPager=(ViewPager)view.findViewById(R.id.view_page);

        ViewPageAdapter adapter=new ViewPageAdapter(getActivity().getSupportFragmentManager());
        adapter.AddFragment(new FragmentNews(),"Noticias");
        adapter.AddFragment(new FragmentVideo(),"Videos");

        viewPager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewPager);

        return view;
    }
}
