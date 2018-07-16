package com.example.android.breakingnews;

import android.support.v4.content.Loader;

public class News {
    private String mTitle;
    private String mCategory;
    private String mDate;
    private String mUrl;

    public News(String mTitle, String mCategory, String mDate, String mUrl) {
        this.mTitle = mTitle;
        this.mCategory = mCategory;
        this.mDate = mDate;
        this.mUrl = mUrl;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmCategory() {
        return mCategory;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmUrl() {
        return mUrl;
    }
}