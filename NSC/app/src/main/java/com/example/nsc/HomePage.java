package com.example.nsc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {

    Button btnBackFromHis;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.home_page);

        btnBackFromHis = findViewById(R.id.btnBackFromHis);

        btnBackFromHis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomePage.this, MainActivity.class);
                startActivity(i);
            }
        });


    }
}

