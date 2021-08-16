package com.example.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(@NonNull Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        TextView placeNameTextView = listItemView.findViewById(R.id.name);
        placeNameTextView.setText(currentPlace.getPlaceName());

        TextView placeDescriptionTextView = listItemView.findViewById(R.id.description);
        if(currentPlace.hasDescription()){
            placeDescriptionTextView.setText(currentPlace.getPlaceDescription());
            placeDescriptionTextView.setVisibility(View.VISIBLE);
        }else{
            placeDescriptionTextView.setVisibility(View.GONE);
        }

        TextView placeLocationTextView = listItemView.findViewById(R.id.location);
        placeLocationTextView.setText(currentPlace.getPlaceLocation());

        TextView placeVisitingTime = listItemView.findViewById(R.id.time);
        placeVisitingTime.setText(currentPlace.getPlaceVisitingTime());

        ImageView placeImageView = listItemView.findViewById(R.id.imageView);
        if(!currentPlace.getPlaceImageResourceId().equals("null")){
            Glide.with(getContext()).load(currentPlace.getPlaceImageResourceId()).into(placeImageView);
        }else{
            Glide.with(getContext()).load("https://kare.ee/images/no-image.jpg").into(placeImageView);
        }

        return listItemView;
    }
}
