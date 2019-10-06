package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class zhang_zhong_bao_fen extends AppCompatActivity {
    private String[]data={"掌中宝是鸡的脆骨。\n" +
            "\n" +
            "掌中宝通常指的是鸡脚掌（除开脚趾）踩在地上那一块，称为掌中宝，也叫鸡脆，好吃又金贵。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhang_zhong_bao_fen);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(zhang_zhong_bao_fen.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
