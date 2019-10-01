package com.example.iassimov.appnews;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class home_info extends Fragment {

    private  View view;
    private WebView web2;
    TextView tx;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.activity_nose,container,false);

        Bundle dat=getActivity().getIntent().getExtras();
        String dato;




     /*
        web2=(WebView)view.findViewById(R.id.web);

        web2.setWebViewClient(new WebViewClient());

        web2.loadUrl("http://"+dato);
*/
        return view;
    }
}
