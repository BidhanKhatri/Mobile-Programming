package com.example.myfirstapp;

import static android.provider.CalendarContract.CalendarCache.URI;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //bidhan
    TextView obj;
    EditText editOne,editUrl;
    Button add,sub,goCalculator,btnSend,btnOpenUrl;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //From AppCompatActivity
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main); // UI set

        obj = findViewById(R.id.result);
        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnSub);
        goCalculator = findViewById(R.id.btnGoCalculator);
        editOne = findViewById(R.id.editOne);
        btnSend = findViewById(R.id.btnSend);
        editUrl = findViewById(R.id.editUrl);
        btnOpenUrl = findViewById(R.id.btnOpenUrl);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editOne.getText().toString();    //getting value
                Bundle b = new Bundle();       //packing items using bundle
                b.putString("key",value);      //setting key and value, key should be different
                Intent i = new Intent(MainActivity.this,ThirdActivity.class); //Explicit intent
                i.putExtras(b);
                startActivity(i);
            }
        });


        add.setOnClickListener(new View.OnClickListener() {             //Interface
            @Override
            public void onClick(View v) {
                count = count + 1;
                obj.setText(String.valueOf(count));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {             //Interface
            @Override
            public void onClick(View v) {
                if(count > 0) {
                    count = count - 1;
                    obj.setText(String.valueOf(count));
                }else{
                    obj.setText("0");
                }
            }
        });
        //Intent is used to transform from one UI(app) to another UI(app)
        goCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Source to destination gayem source is declared as Contex and concat with .this and destination is concat with .class
                Intent i = new Intent(MainActivity.this,CalculatorActivity.class);
                startActivity(i);
            }
        });
        btnOpenUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = editUrl.getText().toString();
                Intent i = new Intent(Intent.ACTION_VIEW,URI.parse(url)); //use to open the url from app
                startActivity(i);
            }
        });

        Log.e("onCreate", "called");


    }

    // All seven type of Activity Life Cycle

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("OnStart ", "called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("OnResume ", "called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("OnPause ", "called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("OnStop ", "called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("OnRestart ", "called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("OnDestroy ", "called");
    }
}