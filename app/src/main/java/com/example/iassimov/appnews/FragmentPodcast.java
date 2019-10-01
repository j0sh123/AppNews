package com.example.iassimov.appnews;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

public class FragmentPodcast extends Fragment {

    private View view;

    private int[] img={R.mipmap.cate_edu,R.mipmap.cate_eco,R.mipmap.cate_sport};
    private int[] podcasTech={R.raw.tecmp1,R.raw.tecmp2,R.raw.tecmp3,R.raw.tecmp4,R.raw.tecmp5};
    private String[] Titulo={"¿Cuántas generaciones se necesitan para cumplir tus sueños?",
                              "Cómo se fotografió un agujero negro por primera vez | PlatziLive","Cómo ser un hacker o experto en seguridad informática",
                            "Más que lo que dices es cómo lo dices | Curso de negociación","CÓMO SER FELIZ"};
    MediaPlayer mp1Tech[]=new MediaPlayer[podcasTech.length];
    MediaPlayer      mp2,mp3,mp4,mp5,global;
    Button btn;


    public FragmentPodcast(){

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       view =inflater.inflate(R.layout.podcast_fragment,container,false);

        ListView listView=(ListView)view.findViewById(R.id.ListView_podcast);

        for (int i=0;i<podcasTech.length;i++)
        { mp1Tech[i]=MediaPlayer.create(getActivity(),podcasTech[i]); }

        CustomerAdappter customerAdappter=new CustomerAdappter();
        listView.setAdapter(customerAdappter);

        listView.setOnItemClickListener((AdapterView.OnItemClickListener) getActivity());

        return view;
    }

    class CustomerAdappter extends BaseAdapter {

        @Override
        public int getCount() {
            return img.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {

            view =getLayoutInflater().inflate(R.layout.customelayout,null);
            ImageView imageView=(ImageView)view.findViewById(R.id.imgView);
            btn=(Button) view.findViewById(R.id.btnName);


            imageView.setImageResource(img[i]);
            imageView.setMaxHeight(100);
            imageView.setMaxWidth(100);
            btn.setText(Titulo[i]);
            btn.setId(i);
            return view;
        }
    }


    public void onClick(View v)
    {

    }


}
