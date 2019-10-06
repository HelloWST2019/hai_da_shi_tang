package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class mei_gui_you_ji_fan extends AppCompatActivity {
    private String[]data={"玫瑰油鸡是广东省的传统名菜，属于粤菜系。是一道以鸡为主料的菜肴。\n" +
            ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mei_gui_you_ji_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(mei_gui_you_ji_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
