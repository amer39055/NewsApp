package com.example.newsapp;

/**
 * this class represents a story that extracted from news feed
 * it is the data structure holds the title, date, section and
 */
public class Story {

    //the title of html content
    private String mTitle;
    //the name of news section
    private String mSection;
    //The combined date and time of publication
    private String mDate;
    // url of html content
    private String mWebUrl;

    //constructor

    public Story(String title, String section, String pubdate, String webUrl) {
        this.mTitle = title;
        this.mSection = section;
        this.mDate = pubdate;
        this.mWebUrl = webUrl;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection;
    }

    public String getDate() {
        return mDate;
    }

    public String getWebUrl() {
        return mWebUrl;
    }
}
