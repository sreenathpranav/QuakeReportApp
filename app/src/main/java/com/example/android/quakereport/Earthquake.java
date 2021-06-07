package com.example.android.quakereport;

public class Earthquake {
    private long mTimeInMilliseconds;
    private String mLocation;
    private String mDate;
    private double mNumber;
    private String mUrl;


    public Earthquake(double number, String location, long timeInMilliseconds) {
        mNumber = number;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mNumber = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param number is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     */

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
    public double getName(){return mNumber;}
    public String getLocation(){ return mLocation;}
    public String getUrl(){
        return mUrl;
    }
}
