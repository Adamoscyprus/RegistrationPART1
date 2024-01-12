package com.example.registrationpart1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class TeachersProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers_profile);


        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("teacherName") && intent.hasExtra("teacherImage")) {
            String teacherName = intent.getStringExtra("teacherName");
            int teacherImageResource = intent.getIntExtra("teacherImage", R.drawable.img); // Provide a default image resource if needed

            // Use the retrieved information to populate the profile view
            TextView textViewTeacherName = findViewById(R.id.editTextTeacherName);
            textViewTeacherName.setText(teacherName);

            // Set the teacher's profile image
            ImageView imageViewProfile = findViewById(R.id.imageViewProfile);
            imageViewProfile.setImageResource(teacherImageResource);

            // Retrieve and populate other details of the teacher's profile as needed
        }
    }
}



//        // Retrieve the passed information about the teacher (e.g., Maria)
//        Intent intent = getIntent();
//        if (intent != null && intent.hasExtra("teacherName")) {
//            String teacherName = intent.getStringExtra("teacherName");
//
//            // Use the retrieved information to populate the profile view
//            TextView textViewTeacherName = findViewById(R.id.editTextTeacherName);
//            textViewTeacherName.setText(teacherName);
//
//            // Retrieve other details of the teacher's profile
//            // For example, qualifications
//            if (intent.hasExtra("teacherQualifications")) {
//                String teacherQualifications = intent.getStringExtra("teacherQualifications");
//                TextView textViewQualifications = findViewById(R.id.editTextTeacherQualifications);
//                textViewQualifications.setText(teacherQualifications);
//            }
//
//            // Similarly, populate other views with relevant data
//            // Retrieve and set qualifications, image, etc.
//        }