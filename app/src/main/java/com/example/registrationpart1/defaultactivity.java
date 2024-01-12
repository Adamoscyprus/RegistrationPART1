package com.example.registrationpart1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class defaultactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_defaultactivity);

//        Intent intent = getIntent();
//        if (intent != null) {
//            String errorMessage = intent.getStringExtra("errorMessage");
//            if (errorMessage != null) {
//                // Handle the error message, for example, displaying it in a TextView or showing a toast
//                Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show();
//            }
//        }
    }
}