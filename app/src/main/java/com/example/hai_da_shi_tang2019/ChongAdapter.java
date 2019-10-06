package com.example.hai_da_shi_tang2019;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ChongAdapter extends ArrayAdapter <Chong>{
    private int resourceID;
    public ChongAdapter(Context context, int textViewResourceID, List<Chong> objects){
        super(context,textViewResourceID,objects);
        resourceID=textViewResourceID;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Chong dan = getItem(position);

        View view = LayoutInflater.from(getContext()).inflate(resourceID, parent, false);

        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceID, parent, false);

        } else {
            view = convertView;

        }
        TextView foodName=(TextView)view.findViewById(R.id.chong_name);
        foodName.setText(dan.getName());
        return view;
    }
}
