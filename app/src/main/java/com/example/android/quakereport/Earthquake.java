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

    // Variable to store link to webpage
    private String mUrl;

    /**
     * Create a new Earthquake object
     *
     * @param magnitude          strength of earthquake
     * @param location           name of place
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the earthquake
     *                           happened
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
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

    public String getUrl() { return mUrl;}
}