package com.example.android.cairotourguide;

import android.content.Context;

public class Attraction {
    private final String mTitle;
    private final String mTelephone;
    private final String mAddress;
    private final int mImageResourceId;

    public Attraction(String title, String telephone, String address, int imageResourceID) {
        mTitle = title;
        mTelephone = telephone;
        mAddress = address;
        mImageResourceId = imageResourceID;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getTelephone() {
        return mTelephone;
    }

    public String getAddress() {
        return mAddress;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    // static variables & functions

    public static Attraction[] getAttractionList(int index, Context context) {
        switch (index) {
            case 0:
                return new Attraction[]{
                        new Attraction(context.getString(R.string.attraction_1_title), null,
                                context.getString(R.string.attraction_1_address),
                                R.drawable.pyramids),
                        new Attraction(context.getString(R.string.attraction_2_title), null,
                                context.getString(R.string.attraction_2_address),
                                R.drawable.egyptian_museum),
                        new Attraction(context.getString(R.string.attraction_3_title), null,
                                context.getString(R.string.attraction_3_address),
                                R.drawable.nilometer),
                        new Attraction(context.getString(R.string.attraction_4_title), null,
                                context.getString(R.string.attraction_4_address),
                                R.drawable.the_citadel),
                };
            case 1:
                return new Attraction[]{
                        new Attraction(context.getString(R.string.attraction_5_title),
                                context.getString(R.string.attraction_5_tel),
                                context.getString(R.string.attraction_5_address), 0),
                        new Attraction(context.getString(R.string.attraction_6_title),
                                context.getString(R.string.attraction_6_tel),
                                context.getString(R.string.attraction_6_address), 0),
                        new Attraction(context.getString(R.string.attraction_7_title),
                                context.getString(R.string.attraction_7_tel),
                                null, 0),
                        new Attraction(context.getString(R.string.attraction_8_title),
                                context.getString(R.string.attraction_8_tel),
                                null, 0),
                };
            case 2:
                return new Attraction[]{
                        new Attraction(context.getString(R.string.attraction_9_title),
                                context.getString(R.string.attraction_9_tel),
                                context.getString(R.string.attraction_9_address), 0),
                        new Attraction(context.getString(R.string.attraction_10_title),
                                context.getString(R.string.attraction_10_tel),
                                context.getString(R.string.attraction_10_address), 0),
                        new Attraction(context.getString(R.string.attraction_11_title),
                                context.getString(R.string.attraction_11_tel),
                                context.getString(R.string.attraction_11_address), 0),
                        new Attraction(context.getString(R.string.attraction_12_title),
                                context.getString(R.string.attraction_12_tel),
                                context.getString(R.string.attraction_12_address), 0),
                };
            case 3:
                return new Attraction[]{
                        new Attraction(context.getString(R.string.attraction_13_title),
                                context.getString(R.string.attraction_13_tel),
                                context.getString(R.string.attraction_13_address), 0),
                        new Attraction(context.getString(R.string.attraction_14_title),
                                context.getString(R.string.attraction_14_tel),
                                context.getString(R.string.attraction_14_address), 0),
                        new Attraction(context.getString(R.string.attraction_15_title),
                                context.getString(R.string.attraction_15_tel),
                                context.getString(R.string.attraction_15_address), 0),
                        new Attraction(context.getString(R.string.attraction_16_title),
                                context.getString(R.string.attraction_16_tel),
                                context.getString(R.string.attraction_16_address), 0),
                };
            default:
                return new Attraction[]{};
        }
    }
}