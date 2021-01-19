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
                return new Attraction[]{
                        new Attraction("Pyramids of Giza", null,
                                "Al-Ahram Street, Giza", R.drawable.pyramids),
                        new Attraction("The Egyptian Museum", null,
                                "Midan al-Tahrir, Downtown", R.drawable.egyptian_museum),
                        new Attraction("Nilometer", null,
                                "2 Abd El-Malek Ln, Giza Governorate", R.drawable.nilometer),
                        new Attraction("The Citadel", null,
                                "Off Midan Salah-ad-Din, Islamic Cairo District", R.drawable.the_citadel),
                };
            case 1:
                return new Attraction[]{
                        new Attraction("El Prince", "+20 2 37109292",
                                "79 Talaat Harb Street, Giza", 0),
                        new Attraction("Hadramawt Antar", "+20 111 429 2994",
                                "9 Gamal Abdel Naser, El Herafeen Gesr El Suez", 0),
                        new Attraction("Koshari Abou Tarek", "+20 2 25775935",
                                null, 0),
                        new Attraction("Sobhy Kaber", "+20 101 598 8898",
                                null, 0),
                };
            case 2:
                return new Attraction[]{
                        new Attraction("Ramses Hilton", "+20 2 25777444",
                                "Nile Corniche, Sharkas, Bulaq", 0),
                        new Attraction("Novotel Cairo El Borg", "+20 2 27356725",
                                "3 Saraya، Gezira St", 0),
                        new Attraction("Sofitel Cairo Nile El Gezirah", "+20 2 27373737",
                                "3 El Thawra Council St Zamalek Downtown, El Orman Giza", 0),
                        new Attraction("Horizon Nile Plaza Hotel", "+20 128 073 7020",
                                "67 Abdulaziz Al Saud, Al Manyal Al Gharbi", 0),
                };
            case 3:
                return new Attraction[]{
                        new Attraction("Ministry of Foreign Affairs", "+20 2 25796334",
                                "Masbero-Kornish El Nile St.Cairo", 0),
                        new Attraction("Ministry of Tourism and Antiquities", "+20 2 27358761",
                                "3 al adel abu bakr st. el zamalek", 0),
                        new Attraction("Ministry of Interior", "+20 2 24060788",
                                "New Cairo, Police Academy, Gate no. 2", 0),
                        new Attraction("Ministry of Health and Population", "+20 2 27943462",
                                "3 Magless El Shaab st", 0),
                };
            default:
                return new Attraction[]{};
        }
    }
}