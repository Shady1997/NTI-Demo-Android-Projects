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
public class RestaurantFragment extends Fragment {

    public static final String NAME = "Restaurants";

    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fragment_restaurant, container, false);

        ArrayList<TourItem> tourItems = new ArrayList<>();

        tourItems.add(new TourItem(getString(R.string.rest_mark_name), "", getString(R.string.rest_mark_addr)));
        tourItems.add(new TourItem(getString(R.string.rest_mos_name), "", getString(R.string.rest_mos_addr)));

        ListView listView = (ListView) rootView.findViewById(R.id.rest_lv);
        TourAdapter tourAdapter = new TourAdapter(rootView.getContext(), tourItems);
        listView.setAdapter(tourAdapter);

        return rootView;
    }

}
