package com.example.mateuszdziubek.itemtypesdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;


public class MyAdapter extends BaseAdapter {

    private Context context;

    private List<ListItem> data;

    private static LayoutInflater inflater = null;

    public MyAdapter(Context context, List<ListItem> data) {
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
        View root = data.get(i).inflateView(inflater);
        data.get(i).createView(root);

        return root;
    }
}
