package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class lu_shui_shun_fen_fan extends AppCompatActivity {
    private String[]data={"卤水，即槟榔卤水，是用氢氧化钙和饴糖经过热反应得到的一种褐色浆体。一般在这种浆体中，还加入了甜味剂以及多种食用香精香料。\n"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lu_shui_shun_fen_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(lu_shui_shun_fen_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
