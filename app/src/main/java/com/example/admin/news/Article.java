package com.example.admin.news;

import java.util.ArrayList;

/**
 * Created by admin on 12/6/2016.
 */

public class Article extends ArrayList<Article> {
    private String mTitle;
    private String mSectionName;
    private String mArticleLink;

    public Article(String title, String sectionName, String articleLink) {
        mTitle = title;
        mSectionName = sectionName;
        mArticleLink = articleLink;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSectionName() {
        return mSectionName;
    }

    public String getArticleLink() {
        return mArticleLink;
    }
}