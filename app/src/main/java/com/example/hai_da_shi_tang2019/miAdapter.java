package com.example.hai_da_shi_tang2019;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class miAdapter extends ArrayAdapter <mi> {
    private int resourceID;

    public miAdapter(Context context, int textViewResourceID, List<mi> objects) {
        super(context, textViewResourceID, objects);
        resourceID = textViewResourceID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        mi mi1 = getItem(position);

        View view = LayoutInflater.from(getContext()).inflate(resourceID, parent, false);

        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceID, parent, false);

        } else {
            view = convertView;

        }
        TextView miName = (TextView) view.findViewById(R.id.mi_name);
        miName.setText(mi1.getName());
        return view;
    }


}
