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
        places.add(new Place("HUMAYUN'S TOMB","Being one of the most impressive structures in Delhi, the Humayun’s Tomb which is located conveniently at the banks of Yamuna River is a brilliant architectural splendor of the Mughal period","Mathura Road Opposite, Hazrat Nizamuddin Aulia Dargah, Nizamuddin East,Delhi 110013","Monday to Sunday- 6:00 AM to 6:00 PM","https://www.tourmyindia.com/states/delhi/images/humayuns-tomb-park1-1.jpg","https://www.tourmyindia.com/states/delhi/humayun-tomb.html"));
        places.add(new Place("QUTUB MINAR", "Built in the 13th century Qutub Minar is not only the highest brick minaret in the world but also one of the famous historical landmarks of India", "Seth Sarai, Mehrauli, New Delhi, Delhi 110030", "Monday to Sunday- 6:00 AM to 6:00 PM", "https://www.tourmyindia.com/states/delhi/images/qutub-minar1-1.jpg", "https://www.tourmyindia.com/states/delhi/qutub-minar.html"));
        places.add(new Place("RED FORT", "Built out of red sandstone, Red Fort or Lal Quila was initially a residential area of the Mughals for about 200 years", "Netaji Subhash Marg, Lal Qila, Chandni Chowk, New Delhi 110006", "Tuesday to Sunday- 7:00 AM to 5:30 PM", "https://www.tourmyindia.com/states/delhi/images/red-fort1-1.jpg", "https://www.tourmyindia.com/states/delhi/red-fort.html"));
        places.add(new Place("JAMA MASJID", "Towering over Old Delhi, the magnificent Jama Masjid stands as the reminder of the Mughal architecture which was commissioned by the Mughal Emperor Shah Jahan", "Jama Masjid Rd, Chandni Chowk, Delhi 110006", "7:00 AM to Noon and 1:30 PM to 6:30 PM", "https://www.tourmyindia.com/states/delhi/images/jama-masjid1-1.jpg", "https://www.tourmyindia.com/states/delhi/jama-masjid.html"));
        places.add(new Place("JANTAR MANTAR","Built by Maharaja Jai Singh in the year 1724, Jantar Mantar is a vast observatory in New Delhi, built to help and improve upon the studies of time and space","Connaught Place, Sansad Marg, New Delhi 110001", "Monday to Sunday- 6:00 AM to 6:00 PM", "https://www.tourmyindia.com/states/delhi/images/jantar-mantar1-1.jpg", "https://www.tourmyindia.com/states/delhi/jantar-mantar.html"));
        places.add(new Place("LODI TOMB", "Amidst lush flora of the Lodhi gardens lies the tomb of Sikandar Lodi; the second ruler of the Lodi dynasty", "Lodhi Gardens, Lodhi Estate, New Delhi 110003","Monday to Sunday- 5:00 AM to 8:00 PM", "https://www.tourmyindia.com/states/delhi/images/lodhi-garden1-1.jpg","https://www.tourmyindia.com/states/delhi/lodi-tomb.html"));
        places.add(new Place("INDIA GATE", ">India gate or The All India War Memorial is 42-metre-high giant gate made up of sandstone, built by prominent war memorial architect Edwin Lutyens in 1921", "Rajpath, India Gate, New Delhi 110001","One can visit India Gate at any time of the day and night", "https://www.tourmyindia.com/states/delhi/images/india-gate-memorial1-1.jpg","https://www.tourmyindia.com/states/delhi/india-gate.html"));
        places.add(new Place("PARLIAMENT HOUSE","Located at the end of the Sansad Marg, the Parliament House or Sansad Bhavan is one of the most impressive buildings in New Delhi","Sansad Marg, Gokul Nagar, Janpath, Connaught Place, New Delhi 10001","Tuesday to Saturady- 11:00 AM to 5:00 PM", "https://www.tourmyindia.com/states/delhi/images/parliament-house1-1.jpg", "https://www.tourmyindia.com/states/delhi/parliament-house.html"));
        places.add(new Place("RASHTRAPATI BHAVAN", "Etched to the heart of Central Delhi from the year 1929 is the most wonderful landmark in the history of Indian architecture, Rashtrapati Bhavan", "Rashtrapati Bhawan, President's Estate, New Delhi 110004", "Monday to Friday- 9:00 AM to 5:30 PM","https://www.tourmyindia.com/states/delhi/images/rashtrapati-bhavan.jpg", "https://www.tourmyindia.com/states/delhi/rashtrapati-bhavan.html"));
        places.add(new Place("AGRASEN KI BAOLI","In contrast to the chaos of central Delhi, the quaint Hailey Road hides a gem which has become a tourist hotspot in Delhi, the infamous Agrasen Ki Baoli","Hailey Road, KG Marg, near Diwanchand Imaging Centre, New Delhi 110001", "The Baoli is open on all days of the week from sunrise to sunset","https://www.tourmyindia.com/states/delhi/images/agrasen-ki-baoli1-1.jpg","https://www.tourmyindia.com/states/delhi/agrasen-ki-baoli.html"));

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
