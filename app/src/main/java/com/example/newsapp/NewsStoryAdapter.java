package com.example.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ListAdapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class NewsStoryAdapter extends ArrayAdapter<Story> {
        // constructor
        public NewsStoryAdapter(@NonNull Context context, ArrayList<Story> story) {
            super(context, 0,story);

    }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View listItemView = convertView;
            //check if there is an existing view is used, otherwise , inflate list view from @news_feed_list_item
            if(listItemView==null){
                listItemView= LayoutInflater.from(getContext()).inflate
                        (R.layout.news_feed_list_item, parent,false);

            }
            //initilize the items of current listitem
            Story currentNewsStory = getItem(position);

            // set the section that news feed belongs to
            TextView txtSection = (TextView)listItemView.findViewById(R.id.txtsection);
            txtSection.setText(currentNewsStory.getSection());
            //set the short title of the story
            TextView txtTitle =(TextView)listItemView.findViewById(R.id.txtTitle);
            txtTitle.setText(currentNewsStory.getTitle());

            //set the date of story
            TextView txtDate = (TextView)listItemView.findViewById(R.id.txtDate);
            //Create date object from the date of the news feed story
            Date date=new Date(currentNewsStory.getDate());
            String formatedDate = formatDate(date);
            txtDate.setText(formatedDate);
            //TODO looking for hot news by checking whether the difference between current dateTime and DateTime of the story is less than 1 hour

            return listItemView;
        }

    /**
     *
     * @param date
     * @return formated short date string in (dd, mm , yy )format
     */
    private String formatDate(Date date) {
        //TODO use another format of date that count how long the story published in hours
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        return dateFormat.format(date);
    }
    }
