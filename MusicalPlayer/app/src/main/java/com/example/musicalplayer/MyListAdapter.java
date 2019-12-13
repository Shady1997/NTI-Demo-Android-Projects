package com.example.musicalplayer;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

public class MyListAdapter extends ArrayAdapter {


    public MyListAdapter(@NonNull Context context, int resource, @NonNull Object[] objects) {
        super(context, R.layout.songers, objects);
    }
}
