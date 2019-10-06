package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hong_shao_niu_rou_fen extends AppCompatActivity {
private String[]data={"红烧牛肉粉是一道菜品，主要食材是新鲜牛肉，配料是米粉，调料为辣椒粉、食用油、食用盐，通过水煮的做法而成"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hong_shao_niu_rou_fen);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(hong_shao_niu_rou_fen.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
