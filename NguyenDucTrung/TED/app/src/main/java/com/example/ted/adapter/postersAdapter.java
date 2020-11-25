package com.example.ted.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.ted.R;
import com.example.ted.object.posters;

import java.util.ArrayList;
import java.util.List;

public class postersAdapter extends ArrayAdapter<posters> {
    private Context ct;
    private ArrayList<posters> arr;
    public postersAdapter( Context context, int resource,  List<posters> objects) {
        super(context, resource, objects);
        this.ct = context;
        this.arr = new ArrayList<>(objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_podcast, null);
        }
        if (arr.size() > 0) {
            posters posters = this.arr.get(position);
            TextView Nameposter = convertView.findViewById(R.id.textname);
            TextView Dayposter = convertView.findViewById(R.id.textdate);
            ImageView Imageposter = convertView.findViewById(R.id.imgpost);

            Nameposter.setText(posters.getName());
            Dayposter.setText(posters.getDay());
            Glide.with(this.ct).load(posters.getLinkphoto()).into(Imageposter);
        }
        return convertView;
    }
}
