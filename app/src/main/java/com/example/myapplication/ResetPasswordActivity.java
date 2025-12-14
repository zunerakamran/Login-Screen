package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ResetPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
    }

    public void updatePassword(View v) {
        EditText etNewPassword = findViewById(R.id.etNewPassword);
        String newPassword = etNewPassword.getText().toString();

        if(newPassword.isEmpty()) {
            Toast.makeText(this, "Enter new password", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Password updated successfully!", Toast.LENGTH_SHORT).show();
            finish(); // Go back to login screen
        }
    }
}
