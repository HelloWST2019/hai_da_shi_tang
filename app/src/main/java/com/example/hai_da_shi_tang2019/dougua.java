package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class dougua extends AppCompatActivity {
private String[]data={"豆瓜满架四邻香，其中的豆是指蚕豆、绿豆、豌豆、赤豆和黑豆等；瓜主要是指西瓜、冬瓜、南瓜 、黄瓜、苦瓜和丝瓜等。一到春季夏季，瓜果蔬菜豆类就会非常丰富，不仅气味特别芬芳，而且吃这些自然瓜果对我们身体也具有清热利水、消肿解毒的功效。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dougua);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(dougua.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
