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

        List<ListItem> items = new ArrayList<>();

        ListItem buttonItem = new ButtonItem(getApplicationContext());
        ListItem pictureItem = new PictureItem("picture");
        ListItem textItem = new TextItem("test");

        items.add(buttonItem);
        items.add(pictureItem);
        items.add(textItem);

        items.add(buttonItem);
        items.add(pictureItem);
        items.add(textItem);

        items.add(buttonItem);
        items.add(pictureItem);
        items.add(textItem);

        items.add(buttonItem);
        items.add(pictureItem);
        items.add(textItem);

        items.add(buttonItem);
        items.add(pictureItem);
        items.add(textItem);

        items.add(buttonItem);
        items.add(pictureItem);
        items.add(textItem);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new MyAdapter(this, items));
    }
}
