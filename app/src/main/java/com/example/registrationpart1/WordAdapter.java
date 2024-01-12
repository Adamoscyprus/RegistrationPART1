package com.example.registrationpart1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<word> {


    public WordAdapter(Activity context, ArrayList<word> words){
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View ListItemView = convertView;
        if (ListItemView == null) {
            ListItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }



        word currentWord = getItem(position);

        TextView name = (TextView) ListItemView.findViewById(R.id.name);
        name.setText(currentWord.getName());


        ImageView image = (ImageView) ListItemView.findViewById(R.id.image);
        image.setImageResource(currentWord.getImage());




        return ListItemView;

    }
}

