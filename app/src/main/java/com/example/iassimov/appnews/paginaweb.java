package com.example.iassimov.appnews;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class paginaweb extends AppCompatActivity {


    WebView web2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nose);

        Bundle dat=getIntent().getExtras();
        String dato=dat.getString("page");






        web2=(WebView)findViewById(R.id.web);

        web2.setWebViewClient(new WebViewClient()
                              {
                                  @Override
                                  public boolean shouldOverrideUrlLoading(WebView view, String url) {
                                      view.loadUrl(url);
                                      return true;
                                  }
                              }
        );
        web2.loadUrl(dato);
}
}
