package com.example.hai_da_shi_tang2019;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class XiaoAdapter extends ArrayAdapter <Xiao>{
    private int resourceID;
    public XiaoAdapter(Context context, int textViewResourceID, List<Xiao> objects){
        super(context,textViewResourceID,objects);
        resourceID=textViewResourceID;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Xiao dan = getItem(position);

        View view = LayoutInflater.from(getContext()).inflate(resourceID, parent, false);

        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceID, parent, false);

        } else {
            view = convertView;

        }
        TextView foodName=(TextView)view.findViewById(R.id.xiao_name);
        foodName.setText(dan.getName());
        return view;
    }
}
