package com.example.registrationpart1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends ArrayAdapter<User> {


    public  ListAdapter(Context context, ArrayList<User> userArrayList){

        super(context,R.layout.list_itemss, (List<User>) userArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        User user= getItem(position);
        if (convertView == null){

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_itemss,parent,false);

        }

        ImageView imageView = convertView.findViewById(R.id.image);
        TextView UserName = convertView.findViewById(R.id.name);
        TextView lastMsg = convertView.findViewById(R.id.surname);
        TextView time = convertView.findViewById(R.id.price);

        imageView.setImageResource(user.imageId);
        lastMsg.setText(user.name);
        UserName.setText(user.lastname);
        time.setText(user.lastMsgtime);





        return  convertView;
    }
}

