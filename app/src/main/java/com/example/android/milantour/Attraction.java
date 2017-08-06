package com.example.android.milantour;

/**
 * Created by lama on 8/4/2017 AD.
 */

public class Attraction {
    private static final int NO_IMAGE = -1;
    private String mName;
    private String mPhoneNumber;
    private String mAddress;
    private int mImageId = NO_IMAGE;

    public Attraction(String mName, String mPhoneNumber, String mAddress, int mImageId) {
        this.mName = mName;
        this.mPhoneNumber = mPhoneNumber;
        this.mAddress = mAddress;
        this.mImageId = mImageId;
    }

    public Attraction(String mName, String mPhoneNumber, String mAddress) {
        this.mName = mName;
        this.mPhoneNumber = mPhoneNumber;
        this.mAddress = mAddress;
    }

    public boolean hasImage() {
        return mImageId != NO_IMAGE;
    }

    public String getmName() {
        return mName;
    }

    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    public String getmAddress() {
        return mAddress;
    }

    public int getmImageId() {
        return mImageId;
    }
}
