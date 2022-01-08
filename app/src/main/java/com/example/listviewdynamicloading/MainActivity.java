package com.example.listviewdynamicloading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.mylist);
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                R.array.listview, android.R.layout.simple_list_item_1);

        listView.setAdapter(arrayAdapter);
    }
}