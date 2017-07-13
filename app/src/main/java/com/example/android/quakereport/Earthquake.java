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

    /**
     * @return the magnitude of the earthquake as double
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * @return the location of the earthquake as String
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * @return the time of the earthquake
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }
}