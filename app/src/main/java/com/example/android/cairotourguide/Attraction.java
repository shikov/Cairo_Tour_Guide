package com.example.android.cairotourguide;

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

    public static Attraction[] getAttractionList(int index) {
        switch (index) {
            case 0:
            case 1:
            case 2:
            case 3:
                return new Attraction[]{
                        new Attraction("Pyramids of Giza", "456456",
                                "34234, sfs, asd.", R.drawable.pyramids),
                        new Attraction("Pyramids of Giza", null,
                                null, R.drawable.pyramids),
                        new Attraction("Pyramids of Giza", null,
                                null, R.drawable.pyramids),
                        new Attraction("Pyramids of Giza", null,
                                null, R.drawable.pyramids),
                };
            default:
                return new Attraction[]{};
        }
    }
}