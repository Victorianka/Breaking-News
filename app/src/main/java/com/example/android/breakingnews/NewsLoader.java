package com.example.android.breakingnews;
import android.support.v4.content.AsyncTaskLoader;
import android.content.Context;
import java.util.List;

public class NewsLoader  extends AsyncTaskLoader<List<News>>{

  //  private static String REQUEST_URL =
  //         "https://content.guardianapis.com/search?api-key=649eec2e-a8af-45fe-9403-f1c966709078&show-tags=contributor";

    String mURL;

    public NewsLoader(Context context, String url) {
        super(context);
        this.mURL = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    public List<News> loadInBackground() {
        if (mURL == null) {
            return null;
        }

        List<News> newsList = QueryUtils.fetchNewsData(mURL);
        return newsList;
    }
}
