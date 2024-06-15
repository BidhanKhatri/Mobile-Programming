package com.example.listviewandgridview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ArrayAdapterActivity extends AppCompatActivity {

    ListView list;
    String[] stdArray = {"Ram","John","Shia","Jack","Hari","Ben"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.array_adapter);
        list = findViewById(R.id.list);

        //list view to send the data and this is using the predefined layout
        list.setAdapter(new ArrayAdapter<>(ArrayAdapterActivity.this,
                android.R.layout.simple_list_item_1,stdArray));
    }
}
