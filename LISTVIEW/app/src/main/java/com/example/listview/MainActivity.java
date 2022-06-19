package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    String arr[] = {"hello","my name is rishabh","i live in agra","i like to do coding","hello","my name is rishabh","i live in agra","i like to do coding","hello","my name is rishabh","i live in agra","i like to do coding"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.listview);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1,arr);
        listview.setAdapter(adapter);

        //use our custom listview

        MyAdapter ad = new MyAdapter(this,R.layout.mylayout,arr);
        listview.setAdapter(ad);


        //this is for default listview
//   listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//       @Override
//       public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//           Toast.makeText(MainActivity.this, "YOU CLICKED ON :"  + i, Toast.LENGTH_SHORT).show();
//       }
//   });

    }
}