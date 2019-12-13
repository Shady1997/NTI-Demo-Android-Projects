package com.example.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class MyListAdapter extends ArrayAdapter<String> {

//    private final Activity context;
//    private final String[] SongerName;
//    private final Integer[] SongerImg;
//
//    public MyListAdapter(@NonNull Activity context, String[] SongerName, Integer[] SongerImg) {
//        super(context, R.layout.choose_songer, SongerName);
//
//        this.context=context;
//        this.SongerName=SongerName;
//        this.SongerImg=SongerImg;
//    }
//
//
//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        LayoutInflater inflater=context.getLayoutInflater();
//        View rowView=inflater.inflate(R.layout.choose_songer,null,true);
//        ImageView img=(ImageView)rowView.findViewById(R.id.img1);
//        TextView txt=(TextView)rowView.findViewById(R.id.txt1);
//        img.setImageResource(SongerImg[position]);
//        txt.setText(SongerName[position]);
//        return rowView;
//    }
}
