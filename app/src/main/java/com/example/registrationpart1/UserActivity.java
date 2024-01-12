package com.example.registrationpart1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.registrationpart1.databinding.ActivityUserBinding;

public class UserActivity extends AppCompatActivity {

    ActivityUserBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        binding = ActivityUserBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent(); // No need to use this.getIntent()

        if (intent != null) {
            String name = intent.getStringExtra("name");
            String phone = intent.getStringExtra("phone");
            String Lesson = intent.getStringExtra("Lesson");
            String prices = intent.getStringExtra("prices");
            int imageId = intent.getIntExtra("imageId", R.drawable.img);

            binding.image.setImageResource(imageId);
            binding.phonenumber.setText(phone);
            binding.name.setText(name);
            binding.lesson.setText(Lesson);
            binding.Prices.setText(prices);

        }
    }
}