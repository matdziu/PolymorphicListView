package com.example.mateuszdziubek.itemtypesdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> data = new ArrayList<>();

        data.add("test");
        data.add("picture");
        data.add("test");
        data.add("button");
        data.add("test");
        data.add("test");
        data.add("button");
        data.add("test");
        data.add("test");
        data.add("picture");
        data.add("picture");
        data.add("test");
        data.add("button");
        data.add("picture");
        data.add("button");
        data.add("button");


        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new MyAdapter(this, data));
    }
}
