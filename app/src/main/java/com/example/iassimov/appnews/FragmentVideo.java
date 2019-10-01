package com.example.iassimov.appnews;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

public class FragmentVideo extends Fragment {

    private View view;
    private VideoView vi,vi2,vi3;
    MediaController mediap;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       view =inflater.inflate(R.layout.videos_fragment,container,false);

        Uri uri;
        String path;

        vi=(VideoView)view.findViewById(R.id.videoView1);
        mediap=new MediaController(getActivity());
        vi.setMediaController(mediap);
        mediap.setAnchorView(vi);

         path="android.resource://"+getActivity().getPackageName()+"/"+R.raw.escandaloplavavea;
        uri= Uri.parse(path);
        vi.setVideoURI(uri);


        vi2=(VideoView)view.findViewById(R.id.videoView2);
        mediap=new MediaController(getActivity());

        vi2.setMediaController(mediap);

        path="android.resource://"+getActivity().getPackageName()+"/"+R.raw.fabrica;
        uri= Uri.parse(path);
        vi2.setVideoURI(uri);
        mediap.setAnchorView(vi2);

        vi3=(VideoView)view.findViewById(R.id.videoView3);
        mediap=new MediaController(getActivity());

        path="android.resource://"+getActivity().getPackageName()+"/"+R.raw.deuda39anios;
        uri= Uri.parse(path);
        vi3.setVideoURI(uri);
        mediap.setAnchorView(vi3);
        return view;
    }


}
