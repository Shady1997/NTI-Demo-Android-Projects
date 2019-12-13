package com.example.myapplication.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sudhirkhanger.tourguideapp.R;
import com.sudhirkhanger.tourguideapp.model.TourItem;

import java.util.ArrayList;


public class TourAdapter extends ArrayAdapter<TourItem> {

    private Context mContext;

    public TourAdapter(Context context, ArrayList<TourItem> tourItemArrayList) {
        super(context, 0, tourItemArrayList);
        mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TourItem tourItem = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageview_lv);
        TextView titleTextView = (TextView) convertView.findViewById(R.id.title_textview_lv);
        TextView descTextView = (TextView) convertView.findViewById(R.id.desc_textview_lv);
        TextView locTextView = (TextView) convertView.findViewById(R.id.loc_textview_lv);

        imageView.setImageResource(tourItem.getImage());
        titleTextView.setText(tourItem.getTitle());
        descTextView.setText(tourItem.getEventDesc());
        locTextView.setText(tourItem.getLocation());

        return convertView;
    }
}
