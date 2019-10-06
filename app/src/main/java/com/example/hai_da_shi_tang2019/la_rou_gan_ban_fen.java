package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class la_rou_gan_ban_fen extends AppCompatActivity {
private String[]data={"拌粉俗称腌粉，是广东湛江市徐闻县以及福建闽东地区、江西地区四季皆宜的地方小吃，因其食用方便且经济实惠而受欢迎。随着拌粉日趋盛名，其制作方法已传到外地，它不但成为民间的佳食，而且已进入酒楼，登上了大雅之堂。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_la_rou_gan_ban_fen);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(la_rou_gan_ban_fen.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
