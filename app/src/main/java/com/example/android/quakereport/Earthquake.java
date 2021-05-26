package com.example.android.quakereport;

public class Earthquake {
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
}
