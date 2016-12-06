package com.example.admin.news;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by admin on 12/6/2016.
 */

public class ArticleLoader extends AsyncTaskLoader<List<Article>> {

    /**
     * Query URL
     */
    private String mUrl;


    public ArticleLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Article> loadInBackground() {

        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of articles.
        List<Article> articles = QueryUtils.fetchArticleData(mUrl);
        return articles;
    }
}
