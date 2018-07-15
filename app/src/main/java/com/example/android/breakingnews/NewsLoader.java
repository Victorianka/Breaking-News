package com.example.android.breakingnews;

import android.content.Context;
import android.content.AsyncTaskLoader;
import java.util.List;

public class NewsLoader  extends AsyncTaskLoader<List<News>>{

    private static String REQUEST_URL =
            "https://content.guardianapis.com/search?api-key=649eec2e-a8af-45fe-9403-f1c966709078";

    public NewsLoader(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    public List<News> loadInBackground() {
        if (REQUEST_URL == null) {
            return null;
        }

        List<News> newsList = QueryUtils.fetchNewsData(REQUEST_URL);
        return newsList;
    }
}
