package com.example.hai_da_shi_tang2019;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class mianAdapter extends ArrayAdapter<Mian1> {
    private int resourceID;
    public mianAdapter(Context context, int textViewResourceID, List<Mian1> objects){
        super(context,textViewResourceID,objects);
        resourceID=textViewResourceID;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parrent) {
        Mian1 mian1 = getItem(position);
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceID, parrent, false);

        } else {
            view = convertView;
        }
        TextView mianname = (TextView) view.findViewById(R.id.mian_name);
        mianname.setText(mian1.getName());
        return view;
    }}

