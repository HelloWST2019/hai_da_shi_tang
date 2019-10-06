package com.example.hai_da_shi_tang2019;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class YinAdapter extends ArrayAdapter <Yin>{
    private int resourceID;
    public YinAdapter(Context context, int textViewResourceID, List<Yin> objects){
        super(context,textViewResourceID,objects);
        resourceID=textViewResourceID;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parrent){
        Yin zao=getItem(position);
        View view;
        if(convertView==null)
        {
            view= LayoutInflater.from(getContext()).inflate(resourceID,parrent,false);
        }
        else{
            view=convertView;
        }
        TextView zaoname=(TextView)view.findViewById(R.id.yin_name);
        zaoname.setText(zao.getName());
        return view;
    }
}
