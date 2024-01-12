package com.example.registrationpart1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class User {

    String name,lastname,lastMsgtime,phoneno,country,prices;

    int imageId;

    public User(String name, String lastname, String lastMistime, String phoneno, String country, int imageId,String prices) {
        this.name = name;
        this.lastname = lastname;
        this.lastMsgtime = lastMistime;
        this.phoneno = phoneno;
        this.country = country;
        this.prices=prices;
        this.imageId = imageId;

    }


}