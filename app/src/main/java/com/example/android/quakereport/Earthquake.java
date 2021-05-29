package com.example.android.quakereport;

public class Earthquake {
    private long mTimeInMilliseconds;
    private String mLocation;
    private String mDate;
    private String mNumber;

    public Earthquake (String number, String location, String date) {
        mDate = date;
        mLocation = location;
        mNumber = number;
    }
    public String getName(){return mNumber;}
    public String getLocation(){ return mLocation;}
    public String getDate(){return mDate;}

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param number is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     */
    public Earthquake(String number, String location, long timeInMilliseconds) {
        mNumber = number;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }
    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
