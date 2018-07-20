package com.example.android.breakingnews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, ArrayList<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        News currentNews = getItem(position);
        TextView newsTitle = (TextView) listItemView.findViewById(R.id.title);
        String title = currentNews.getmTitle();
        newsTitle.setText(title);

        TextView newsCategory = (TextView) listItemView.findViewById(R.id.category);
        String category = currentNews.getmCategory();
        newsCategory.setText(category);

        TextView newsDate = (TextView) listItemView.findViewById(R.id.date);
        String date = currentNews.getmDate();
        newsDate.setText(date);

        TextView newsAuthortextView = (TextView) listItemView.findViewById(R.id.author);
        String author = currentNews.getmAuthor();
        newsAuthortextView.setText(author);

        return listItemView;

    }

}