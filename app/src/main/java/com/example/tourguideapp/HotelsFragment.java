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

public class HotelsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container,false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Hyatt Regency","Bhikaji Cama Place, Ring Road New Delhi, India, 110066","","https://www.tourmyindia.com/states/delhi/images/hyatt-regency-delhi.jpg","https://www.tourmyindia.com/luxury-hotels/hyatt-regency-delhi.html"));
        places.add(new Place("The Oberoi Hotel","Dr Zakir Hussein Marg, New Delhi Delhi, 110003","","https://www.tourmyindia.com/states/delhi/images/the-oberoi-new-delhi.jpg","https://www.tourmyindia.com/luxury-hotels/hotel-oberoi-delhi.html"));
        places.add(new Place("The Taj Mahal Hotel","No.1, Mansingh Road,New Delhi, Dl 110001, India","","https://www.tourmyindia.com/states/delhi/images/hotel-taj-mahal-delhi.jpg","https://www.tourmyindia.com/luxury-hotels/hotel-taj-mahal-delhi.html"));
        places.add(new Place("The Leela Palace","Diplomatic Enclave,Chankyapuri, New Delhi, 110023", "","https://www.tourmyindia.com/states/delhi/images/the-leela-palace.jpg","https://www.tourmyindia.com/luxury-hotels/leela-palace-delhi.html"));
        places.add(new Place("Taj Palace","2, Sardar Patel Marg,Diplomatic Enclave,New Delhi, Delhi, 110021","","https://www.tourmyindia.com/states/delhi/images/taj-palace-delhi.jpg","https://www.tourmyindia.com/luxury-hotels/taj-palace-delhi.html"));
        places.add(new Place("The Imperial Hotel","Janpath Lane, Connaught Place,New Delhi, Delhi, 110001","", "https://www.tourmyindia.com/states/delhi/images/hotel-imperial-delhi.jpg","https://www.tourmyindia.com/luxury-hotels/hotel-imperial-delhi.html"));


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
