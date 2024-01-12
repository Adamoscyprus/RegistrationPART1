package com.example.registrationpart1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class word  {
    private String name;
    private int image;

    public word(String names,int images){

        name= names;

        image= images;
    }
    public String getName(){
        return name;
    }

    public int getImage(){
        return image;
    }

}

