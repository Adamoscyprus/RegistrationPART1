package com.example.registrationpart1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView numbers = (ImageView) findViewById(R.id.image1);
        numbers.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(MainActivity.this, Student.class);
                startActivity(numberIntent);
            }
        });

        ImageView colors = (ImageView) findViewById(R.id.image);
        colors.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, TeachersProfile.class);
                startActivity(colorsIntent);
            }
        });
    }


}
