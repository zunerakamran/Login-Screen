package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ForgetPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
    }

    public void resetPassword(View v) {
        EditText etUsername = findViewById(R.id.etFPUsername);
        String username = etUsername.getText().toString();
        if(username.isEmpty()) {
            Toast.makeText(this, "Enter username", Toast.LENGTH_SHORT).show();
        } else {
            // Navigate to Reset Password Page
            Intent intent = new Intent(this, ResetPasswordActivity.class);
            intent.putExtra("username", username);
            startActivity(intent);
        }
    }
}
