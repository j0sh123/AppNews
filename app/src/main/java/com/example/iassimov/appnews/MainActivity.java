package com.example.iassimov.appnews;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

   private BottomNavigationView bottonMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     bottonMenu =(BottomNavigationView) findViewById(R.id.buttonNavigation);
     bottonMenu.setOnNavigationItemSelectedListener(navListener);

     getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new home_noticias()).commit();


    }
    private  BottomNavigationView.OnNavigationItemSelectedListener navListener=new BottomNavigationView.OnNavigationItemSelectedListener() {
          @Override
          public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
              Fragment selectedFragment=null;

           switch (menuItem.getItemId())
               {
                   case R.id.nav_home:
                       selectedFragment=new home_noticias();
                       break;
                    case R.id.nav_cate:
                       selectedFragment=new home_discover();
                       break;
                    case R.id.nav_user:
                       selectedFragment=new AcPodcast();
                       break;
                    case R.id.nav_info:
                       selectedFragment=new home_user();
                       break;

               }
               getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();

           return  true;
          }

    };

}
