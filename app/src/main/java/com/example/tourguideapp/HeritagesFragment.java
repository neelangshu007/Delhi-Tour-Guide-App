package com.example.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class HeritagesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container,false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("HUMAYUN'S TOMB","Being one of the most impressive structures in Delhi, the Humayun’s Tomb which is located conveniently at the banks of Yamuna River is a brilliant architectural splendor of the Mughal period.","Mathura Road Opposite, Hazrat Nizamuddin Aulia Dargah, Nizamuddin East,Delhi 110013","Monday to Sunday from 6:00 AM to 6:00 PM.","https://www.tourmyindia.com/states/delhi/images/humayuns-tomb-park1-1.jpg","https://www.tourmyindia.com/states/delhi/humayun-tomb.html"));
        places.add(new Place("Qutub Minar", "Built in the 13th century Qutub Minar is not only the highest brick minaret in the world but also one of the famous historical landmarks of India.", "Seth Sarai, Mehrauli, New Delhi, Delhi 110030", " Monday to Sunday from 6:00 AM to 6:00 PM", "https://www.tourmyindia.com/states/delhi/images/qutub-minar1-1.jpg", "https://www.tourmyindia.com/states/delhi/qutub-minar.html"));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Place currentPlace = adapter.getItem(position);

                Uri heritagePlaceUri = Uri.parse(currentPlace.getPlaceUrl());

                Intent websiteIntent = new Intent(Intent.ACTION_VIEW, heritagePlaceUri);

                startActivity(websiteIntent);
            }
        });

        return rootView;
    }
}
