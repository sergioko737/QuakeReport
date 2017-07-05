package com.example.android.quakereport;

/**
 * Created by Fujitsu on 05.07.2017.
 */

public class Earthquake {
    // Variable to store magnitude
    private double eqMagnitude;

    // Variable to store location
    private String eqLocation;

    // Variable to store date
    private long eqDate;

    /* Constructor

     */
    public Earthquake(double magnitude, String location, long date){
        eqMagnitude = magnitude;
        eqLocation = location;
        eqDate = date;
    }
}