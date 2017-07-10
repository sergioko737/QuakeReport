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
    private long mTimeInMilliseconds;

    /** Create a new Earthquake object
     * @param magnitude strength of earthquake
     * @param location name of place
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the earthquake
     * happened
    */
    public Earthquake(String magnitude, String location, long timeInMilliseconds){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}