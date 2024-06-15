package com.example.myfirstapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    TextView firstTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        firstTextView = findViewById(R.id.firstTextView);

        String data = getIntent().getExtras().getString("key"); //getting value which is passed from the bundle
        firstTextView.setText(data);



    }
}
