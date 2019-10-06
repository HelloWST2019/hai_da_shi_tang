package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class jiang_shao_ya_ba_fan extends AppCompatActivity {
private String[]data={"健康小常识:\n" +
        "1、鸭肉是含B族维生素和维生素E比较多的肉类。维生素E是抗氧化剂，是人体多余自由基的清除剂，能起到很好的抗衰老作用。\n" +
        "2、鸭肉中的脂肪含量适也比猪肉低。所以，适当的吃一些鸭肉还是很好的。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jiang_shao_ya_ba_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(jiang_shao_ya_ba_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
