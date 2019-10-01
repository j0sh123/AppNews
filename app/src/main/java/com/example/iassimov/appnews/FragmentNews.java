package com.example.iassimov.appnews;

import android.app.AlertDialog;
import android.content.Intent;
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
import android.widget.TextView;
import android.widget.Toast;

public class FragmentNews extends Fragment {

    private View view;

    private int[] imagenes={R.mipmap.pecomercio,R.mipmap.peperu,R.mipmap.perepublica,R.mipmap.peperuano,R.mipmap.petrome,R.mipmap.peojo,
                            R.mipmap.peextra,R.mipmap.pepopular,R.mipmap.pechino,R.mipmap.pedepor,R.mipmap.pegestion};
    private String[] Titulo={"El Comercio","Peru 21","La República","El Peruano","Trome","OJO","Extra","El Popular","El chino","Depor","Gestión"};
    private String[] urls={"http://elcomercio.pe","http://peru21.pe","http://larepublica.pe","http://elperuano.pe","http://trome.pe","http://ojo.pe",
                             "http://www.extra.com.pe","http://www.elpopular.pe","http://elchino.pe","http://depor.com","http://gestion.pe"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       view =inflater.inflate(R.layout.newss_fragment,container,false);

        final ListView listView=(ListView)view.findViewById(R.id.ListView_Quiz);

        CustomerAdappter customerAdappter=new CustomerAdappter();
        listView.setAdapter(customerAdappter);

        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                /*AlertDialog.Builder build=new AlertDialog.Builder( getActivity() );
                build.setIcon( R.mipmap.ic_launcher ).setTitle( "hola" ).setMessage( "el numero" +urls[position] );

                AlertDialog alertDialog=build.create();
                alertDialog.show();*/
                Intent i=new Intent( view.getContext(),paginaweb.class);
                i.putExtra( "page" , urls[position]);
                startActivity(i);

            }

        } );

        return view;
    }

    class CustomerAdappter extends BaseAdapter{

        @Override
        public int getCount() {
            return Titulo.length;
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
            TextView btn=(TextView) view.findViewById(R.id.txtName);

            imageView.setImageResource(imagenes[i]);
            imageView.setMaxHeight(100);
            imageView.setMaxWidth(100);
            btn.setText(Titulo[i]);

            return view;
        }
    }


}
