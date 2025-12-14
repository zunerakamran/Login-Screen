package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void registerUser(View v) {
        EditText etUsername = findViewById(R.id.etRegUsername);
        EditText etPassword = findViewById(R.id.etRegPassword);

        String username = etUsername.getText().toString();
        String password = etPassword.getText().toString();

        if(username.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "All fields are required", Toast.LENGTH_SHORT).show();
        } else {
            // Here you can store the user data if you implement database later
            Toast.makeText(this, "User registered successfully!", Toast.LENGTH_SHORT).show();
            finish(); // Go back to login screen
        }
    }
}
