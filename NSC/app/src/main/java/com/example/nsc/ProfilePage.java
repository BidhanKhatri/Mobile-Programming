package com.example.nsc;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProfilePage extends AppCompatActivity {
    TextView showUsername,showPassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);

        showUsername = findViewById(R.id.showUsername);
        showPassword = findViewById(R.id.showPassword);

        String data = getIntent().getExtras().getString("keyUser");
        showUsername.setText(data);

        String data2 = getIntent().getExtras().getString("keyPass");
        showPassword.setText(data2);
    }
}
