package com.example.listviewandgridview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CustomArrayAdapter extends AppCompatActivity {

    ListView customList,empIdList;
    String[] empName = {"Bidhan", "Shreejal", "Henna", "Billie"};
    Integer[] empId= {101,102,103,104};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_array_adapter);

        customList = findViewById(R.id.customList);
        empIdList = findViewById(R.id.empIdList);

        customList.setAdapter( new ArrayAdapter<>(CustomArrayAdapter.this,
                android.R.layout.simple_list_item_1,empName));
        empIdList.setAdapter(new ArrayAdapter<>(CustomArrayAdapter.this,
                android.R.layout.simple_list_item_1,empId));
    }
}
