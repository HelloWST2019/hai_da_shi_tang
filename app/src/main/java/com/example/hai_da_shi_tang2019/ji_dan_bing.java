package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ji_dan_bing extends AppCompatActivity {
private String[]data={"鸡蛋饼是由新鲜的鸡蛋、优质面粉、淀粉、食用盐、鸡精、葱、油、等精制而成。口感润滑，细嫩，营养丰富，是早餐的最佳食品，不上火。\n" +
        "鸡蛋是人类最好的营养来源之一，鸡蛋中含有大量的维生素和矿物质及有高生物价值的蛋白质。对人而言，鸡蛋饼的蛋白质营养丰富，品质最佳，仅次于母乳。一个鸡蛋饼所含的热量，相当于半个苹果或半杯牛奶的热量，但是它还拥有磷、锌、铁、这些营养都是人体必不可少的，它们起着极其重要的作用，如修复人体组织、形成新的组织、消耗能量和参与复杂的新陈代谢过程。\n" +
        ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ji_dan_bing);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(ji_dan_bing.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
