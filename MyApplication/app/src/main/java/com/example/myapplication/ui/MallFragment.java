package com.example.myapplication.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.sudhirkhanger.tourguideapp.R;
import com.sudhirkhanger.tourguideapp.adapter.TourAdapter;
import com.sudhirkhanger.tourguideapp.model.TourItem;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MallFragment extends Fragment {

    public static final String NAME = "Malls";

    public MallFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fragment_mall, container, false);

        ArrayList<TourItem> tourItems = new ArrayList<>();

        tourItems.add(new TourItem(getString(R.string.mall_ashima_name), "", getString(R.string.mall_ashima_addr), R.drawable.ashima));
        tourItems.add(new TourItem(getString(R.string.mall_c21_name), "", getString(R.string.mall_c21_addr), R.drawable.c21));

        ListView listView = (ListView) rootView.findViewById(R.id.mall_lv);
        TourAdapter tourAdapter = new TourAdapter(rootView.getContext(), tourItems);
        listView.setAdapter(tourAdapter);

        return rootView;
    }

}
