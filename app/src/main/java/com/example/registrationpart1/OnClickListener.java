package com.example.registrationpart1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class OnClickListener implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), "I made it bastardd", Toast.LENGTH_SHORT).show();
    }
}