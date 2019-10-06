package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ma_la_ji_fen extends AppCompatActivity {
private String[]data={"麻辣鸡块是一道非常好吃的肉类食品，麻辣味浓，干香味美，很多人喜欢吃麻辣鸡块。主要原料是鸡肉；工艺是炖，制作简单。\n" +
        "麻辣味浓，干香味美"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_la_ji_fen);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(ma_la_ji_fen.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
