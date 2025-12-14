package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        TextView tvWelcome = findViewById(R.id.tvWelcome);
        String username = getIntent().getStringExtra("username");
        tvWelcome.setText("Welcome, " + username + "!");
    }
}
