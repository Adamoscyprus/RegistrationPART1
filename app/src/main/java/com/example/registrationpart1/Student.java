package com.example.registrationpart1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Student extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }



    public void Find(View view) {
        startActivity(new Intent(Student.this, FindTeachersActivity.class));


    }

}









//
//
//    private EditText editTextStudentName;
//    private EditText editTextStudentEmail;




//        editTextStudentName = findViewById(R.id.editTextStudentName);
//        editTextStudentEmail = findViewById(R.id.editTextStudentEmail);
//
//
//        Button btnSaveProfile =  findViewById(R.id.btnSaveProfile);
//        btnSaveProfile.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                saveProfileInformation();
//            }
//        });
//
//        // Assuming you have a button to submit registration
//        Button btnRegister = findViewById(R.id.btnRegister);
//        btnRegister.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                registerStudent();
//            }
//        });
//    }

//    private void saveProfileInformation() {
//        // Get the entered profile information
//        String studentName = editTextStudentName.getText().toString().trim();
//        String studentEmail = editTextStudentEmail.getText().toString().trim();
//        // Retrieve other profile information
//
//        // Validate the information if necessary
//        if (TextUtils.isEmpty(studentName) || TextUtils.isEmpty(studentEmail)) {
//            Toast.makeText(Student.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
//            return;
//        }
//
//        // Save the profile information to storage or database
//        // ...
//
//        Toast.makeText(Student.this, "Profile information saved", Toast.LENGTH_SHORT).show();
//    }
//
//    private void registerStudent() {
// Perform registration process here
// Retrieve student information and submit for registration
// ...

//        Toast.makeText(Student.this, "Student registered", Toast.LENGTH_SHORT).show();
//        startActivity(new Intent(Student.this, LoginActivity.class)); // Redirect to login after registration