// MainActivity.java
package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // Hard-coded credentials
    private final String USERNAME = "admin";
    private final String PASSWORD = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Edge-to-edge padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnReset = findViewById(R.id.btnReset);
        btnReset.setOnClickListener(v -> {
            EditText etName = findViewById(R.id.etName);
            EditText etPassword = findViewById(R.id.etPassword);
            TextView tvMessage = findViewById(R.id.tvMessage);
            etName.setText("");
            etPassword.setText("");
            tvMessage.setText("");
            Toast.makeText(MainActivity.this, "Fields are cleared!", Toast.LENGTH_SHORT).show();
        });
    }

    public void login(View v) {
        EditText etName = findViewById(R.id.etName);
        String strName = etName.getText().toString();
        EditText etPassword = findViewById(R.id.etPassword);
        String strPassword = etPassword.getText().toString();

        if(strName.isEmpty()) {
            Toast.makeText(this, "Enter username", Toast.LENGTH_SHORT).show();
        } else if(strPassword.isEmpty()) {
            Toast.makeText(this, "Enter password", Toast.LENGTH_SHORT).show();
        } else if(strName.equals(USERNAME) && strPassword.equals(PASSWORD)) {
            // Login success → Redirect to LandingActivity
            Intent intent = new Intent(this, LandingActivity.class);
            intent.putExtra("username", strName);
            startActivity(intent);
            finish(); // Close login screen
        } else {
            Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show();
        }
    }

    public void goToRegister(View v) {
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }

    public void goToForgetPassword(View v) {
        Intent intent = new Intent(this, ForgetPasswordActivity.class);
        startActivity(intent);
    }
}
