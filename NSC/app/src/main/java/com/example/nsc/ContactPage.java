package com.example.nsc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ContactPage extends AppCompatActivity {

    Button btnBackFromContact;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.contact_page);
        btnBackFromContact = findViewById(R.id.btnBackFromContact);

        btnBackFromContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ContactPage.this,MainActivity.class);
                startActivity(i);
            }
        });

    }
}
