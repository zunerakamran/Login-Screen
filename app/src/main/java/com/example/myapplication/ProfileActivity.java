package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    // Single click handler method for all skill icons
    public void onSkillClick(View view) {
        String skill = "";

        int id = view.getId();

        if (id == R.id.skill_android) {
            skill = "Android";
        } else if (id == R.id.skill_java) {
            skill = "Java";
        } else if (id == R.id.skill_kotlin) {
            skill = "Kotlin";
        } else if (id == R.id.skill_flutter) {
            skill = "Flutter";
        } else if (id == R.id.skill_react) {
            skill = "React Native";
        }

        Toast.makeText(this, "Skill: " + skill, Toast.LENGTH_SHORT).show();
    }

    public void goToLogin(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}