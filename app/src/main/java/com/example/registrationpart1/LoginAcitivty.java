package com.example.registrationpart1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginAcitivty extends AppCompatActivity {


        EditText email, password;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login_acitivty); // Make sure your layout file name matches this

            email = findViewById(R.id.email);
            password = findViewById(R.id.password);
        }

        public void SignIn(View view) {
            String userEmail = email.getText().toString();
            String userPassword = password.getText().toString();

            if (TextUtils.isEmpty(userEmail)){
                Toast.makeText(this, "Enter Email", Toast.LENGTH_SHORT).show();
                return;

            }

            if (TextUtils.isEmpty(userPassword)){
                Toast.makeText(this, "Enter Password", Toast.LENGTH_SHORT).show();
                return;
            }

            if ((userPassword.length()<6)){
                Toast.makeText(this, "Password should be at least 6 characters long", Toast.LENGTH_SHORT).show();
                return;
            }

            startActivity(new Intent(LoginAcitivty.this, MainActivity.class));

        }

        public void SignUp(View view) {
            startActivity(new Intent(LoginAcitivty.this, RegistrationActivity.class));
        }
    }
