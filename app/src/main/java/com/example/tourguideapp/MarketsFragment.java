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

public class MarketsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container,false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Old Delhi Shopping Market","Chandni Chowk Delhi 110006","The market usually open around 11 am and closes around 8 pm in the evening","https://www.tourmyindia.com/states/delhi/images/old-delhi-shopping-market1-1.jpg","https://www.tourmyindia.com/states/delhi/old-delhi-shopping-market.html"));
        places.add(new Place("Connaught Place Shopping Market","Connaught Place New Delhi 110001","The market usually opens around 11 am in the morning and goes on until 11 in the night","https://www.tourmyindia.com/states/delhi/images/connaught-place-shopping-market1-1.jpg","https://www.tourmyindia.com/states/delhi/connaught-place-shopping-market.html"));
        places.add(new Place("Palika Bazaar Shopping Market","Palika BazarConnaught Place, New Delhi 110001","Closed on Sunday and Monday, Palika opens up around 10 am and closes around 8 pm","https://www.tourmyindia.com/states/delhi/images/palika-bazaar-shopping-market1-1.jpg","https://www.tourmyindia.com/states/delhi/palika-bazaar-shopping-market.html"));
        places.add(new Place("Janpath Shopping Market","Janpath Rd, Janpath, Connaught Place, New Delhi 110001","The market opens up around 11 am and goes on until 10 in the night","https://www.tourmyindia.com/states/delhi/images/janpath-shopping-market1-1.jpg","https://www.tourmyindia.com/states/delhi/janpath-shopping-market.html"));
        places.add(new Place("Paharganj Shopping Market","Paharganj, New Delhi 110055","The market remains closed on Monday and opens on the rest of the days from 11 am to 9 pm","https://www.tourmyindia.com/states/delhi/images/paharganj-shopping-market1-1.jpg","https://www.tourmyindia.com/states/delhi/paharganj-shopping-market.html"));
        places.add(new Place("Dilli Haat Shopping Market","INA Market, Dilli Haat, Kidwai Nagar West Delhi, 110023","The Dilli Haat markets open up around 11 am and close by 9 pm","https://www.tourmyindia.com/states/delhi/images/dilli-haat-shopping-market1-1.jpg","https://www.tourmyindia.com/states/delhi/dilli-haat-shopping-market.html"));
        places.add(new Place("Sarojini Nagar Shopping Market ","Sarojini Nagar Market Sarojini Nagar, New Delhi 110023","The market usually open around 10 am and closes around 9 pm The market is open from Tuesday to Sunday","https://www.tourmyindia.com/states/delhi/images/sarojini-nagar-shopping-market1-1.jpg","https://www.tourmyindia.com/states/delhi/sarojini-nagar-shopping-market.html"));
        places.add(new Place("Khan Market","61A, Khan Market, Rabindra Nagar, New Delhi 110003","The Khan market opens up around 10 am and closes around 11 pm The market remains open on all days except Sunday","https://www.tourmyindia.com/states/delhi/images/khan-shopping-market1-1.jpg","https://www.tourmyindia.com/states/delhi/khan-shopping-market.html"));
        places.add(new Place("Lajpat Nagar Shopping Market","Lajpat Nagar New Delhi 110024","The Lajpat Nagar market opens up at 10 am and closes around 9 pm The market remains open on all days except Monday","https://www.tourmyindia.com/states/delhi/images/lajpat-nagar-shopping-market1-1.jpg","https://www.tourmyindia.com/states/delhi/lajpat-nagar-shopping-market.html"));
        places.add(new Place("Nehru Place Shopping Market","Nehru Pl Market Rd Nehru Place, New Delhi 110019","The Nehru Place market opens around 10 and closes by 7 pm The tech market is closed on Sunday","https://www.tourmyindia.com/states/delhi/images/nehru-place-shopping-market1-1.jpg","https://www.tourmyindia.com/states/delhi/nehru-place-shopping-market.html"));
        places.add(new Place("INA Shopping Market","Sri Aurobindo Marg, Aviation Colony, INA Colony, New Delhi 110023", "The Khan market opens up around 10 am and closes around 8:30 pm The market remains open on all days except Monday","https://www.tourmyindia.com/states/delhi/images/ina-shopping-market1-1.jpg","https://www.tourmyindia.com/states/delhi/ina-shopping-market.html"));
        places.add(new Place("Hauz Khas Shopping Market","Hauz Khas Village, New Delhi 110002 India","The Hauz Khas opens up around 10 am and closes around 11 pm The market remains open on all days","https://www.tourmyindia.com/states/delhi/images/hauz-khas-shopping-market1-1.jpg","https://www.tourmyindia.com/states/delhi/hauz-khas-shopping-market.html"));
        places.add(new Place("Karol Bagh Shopping Market","Block 1, WEA, Karol Bagh, New Delhi 110060","The market usually opens around 11 am in the morning and stays alive till 11 in the night","https://www.tourmyindia.com/states/delhi/images/karol-bagh-shopping-market1-1.jpg","https://www.tourmyindia.com/states/delhi/karol-bagh-shopping-market.html"));


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
