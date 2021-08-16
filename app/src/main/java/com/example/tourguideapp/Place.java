package com.example.tourguideapp;

public class Place {

    private String placeName;

    private String placeDescription = NO_DESCRIPTION_PROVIDED;

    private String placeLocation;

    private String placeVisitingTime;

    private String placeUrl;

    private String placeImageResourceId;

    private static final String NO_DESCRIPTION_PROVIDED = null;

    public Place(String name,String description, String location, String visitingTime, String imageResourceId, String url){
        placeName = name;
        placeDescription = description;
        placeLocation = location;
        placeVisitingTime = visitingTime;
        placeImageResourceId = imageResourceId;
        placeUrl = url;
    }

    public Place(String name, String location, String visitingTime, String imageResourceId, String url){
        placeName = name;
        placeLocation = location;
        placeVisitingTime = visitingTime;
        placeImageResourceId = imageResourceId;
        placeUrl = url;
    }

    public String getPlaceName(){
        return placeName;
    }

    public String getPlaceDescription(){
        return placeDescription;
    }

    public String getPlaceLocation(){
        return placeLocation;
    }

    public String getPlaceVisitingTime(){
        return placeVisitingTime;
    }

    public String getPlaceUrl(){
        return placeUrl;
    }

    public String getPlaceImageResourceId(){
        return placeImageResourceId;
    }

    public boolean hasDescription(){
        return placeDescription != NO_DESCRIPTION_PROVIDED;
    }
}
