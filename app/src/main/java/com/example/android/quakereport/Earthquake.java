package com.example.android.quakereport;

/**
 * Created by Fujitsu on 05.07.2017.
 */

public class Earthquake {
    // Variable to store magnitude
    private String mMagnitude;

    // Variable to store location
    private String mLocation;

    // Variable to store date
    private String mDate;

    /** Create a new Earthquake object
     * @param magnitude strength of earthquake
     * @param location name of place
     * @param date date of earthquake
    */
    public Earthquake(String magnitude, String location, String date){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getDate() {
        return mDate;
    }
}