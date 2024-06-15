package com.example.nsc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Faculty extends AppCompatActivity {

    Button btnBackFromFaculty;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.faculty_page);

        btnBackFromFaculty = findViewById(R.id.btnBackFromFaculty);

        btnBackFromFaculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Faculty.this,MainActivity.class);
                startActivity(i);
            }
        });



    }

}
