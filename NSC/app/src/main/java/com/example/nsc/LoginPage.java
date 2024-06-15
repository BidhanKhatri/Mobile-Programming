package com.example.nsc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginPage extends AppCompatActivity {
    Button setLoginValue;
    EditText userNameText, passwordText;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        setLoginValue = findViewById(R.id.setLoginValue);
        userNameText = findViewById(R.id.userNameText);
        passwordText = findViewById(R.id.passwordText);

        setLoginValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameValue = userNameText.getText().toString();
                String passwordTextValue = passwordText.getText().toString();

                Bundle b = new Bundle();
                b.putString("keyUser",usernameValue);
                b.putString("keyPass",passwordTextValue);

                Intent i = new Intent(LoginPage.this, ProfilePage.class);
                i.putExtras(b);
                startActivity(i);

            }
        });

    }
}
