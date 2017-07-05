package com.example.android.quakereport;

/**
 * Created by Fujitsu on 05.07.2017.
 */

public class Earthquake {
    // Variable to store magnitude
    private double mMagnitude;

    // Variable to store location
    private String mLocation;

    // Variable to store date
    private long mTimeInMilliseconds;

    /** Create a new Earthquake object
     * @param magnitude strength of earthquake
     * @param location name of place
     * @param date date of earthquake
    */
    public Earthquake(double magnitude, String location, long date){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = date;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}