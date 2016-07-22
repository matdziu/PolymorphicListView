package com.example.mateuszdziubek.itemtypesdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class MyAdapter extends BaseAdapter {

    private Context context;

    private List<String> data;

    private static LayoutInflater inflater = null;

    public MyAdapter(Context context, List<String> data) {
        this.context = context;
        this.data = data;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View root = view;


        if (data.get(i).equals("button")) {
            root = inflater.inflate(R.layout.row3, null);

            Button button = (Button) root.findViewById(R.id.button);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, "Clicked!", Toast.LENGTH_SHORT).show();
                }
            });

        }
        else if (data.get(i).equals("picture")) {
            root = inflater.inflate(R.layout.row2, null);

            TextView textView2 = (TextView) root.findViewById(R.id.textView2);
            textView2.setText(data.get(i));

        }
        else if (data.get(i).equals("test")) {
            root = inflater.inflate(R.layout.row1, null);

            TextView headerText = (TextView) root.findViewById(R.id.headerText);
            TextView textView1 = (TextView) root.findViewById(R.id.textView1);

            headerText.setText(data.get(i).toUpperCase());
            textView1.setText(data.get(i));

        }

        return root;
    }
}
