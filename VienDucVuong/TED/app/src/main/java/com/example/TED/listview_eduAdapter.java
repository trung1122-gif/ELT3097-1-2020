package com.example.TED;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class listview_eduAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<listview_edu> listview_edus;


    public listview_eduAdapter(Context context, int layout, List<listview_edu> listview_edus) {
        this.context = context;
        this.layout = layout;
        this.listview_edus = listview_edus;
    }

    @Override
    public int getCount() {
        return listview_edus.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(layout, null);
        return null;
    }
}
