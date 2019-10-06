package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class chong_qing_xiao_mian extends AppCompatActivity {
private String[]data={"重庆小面，是重庆四大特色之一，归属于重庆面食的一类。是一款发源于重庆的一种特色传统小吃，属于重庆小吃。重庆小面是重庆面食中最简单的一种。\n" +
        "重庆小面是指麻辣素面，分汤面和干溜两种类型，麻辣味型。重庆面还包括重庆小面和有臊子的面食，如牛肉、肥肠、豌豆杂酱面、荣昌铺盖面等。重庆面富于变化，在面店，可以要求店家制作个人定制口味，如要求店家\"干熘\"(拌面)、\"提黄\"(偏生硬)、\"加青\"(多加蔬菜)、\"重辣\"(多加油辣子)等等。\n" +
        "佐料是重庆面的灵魂，一碗面条全凭调料提味儿。先调好调料，再放入煮好面条。麻辣味调和不刺激，面条劲道顺滑，汤料香气扑鼻，味道浓厚。\n" +
        "重庆面是作为南方人的重庆市民普遍接受的传统面食，因其独特口感，以辣闻名，近年来全国知名。" +
        "小面起源:\n" +
        "重庆小面作为重庆最受欢迎的美食，成为了重庆人不可或缺的早餐，重庆小面在以前叫做切面，也被称为“杠子面”，它是根据中国手工面条三大传统技法“压”“拉”“切”中研究出的“压面”和“切面”，综合而成的特色面。\n"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chong_qing_xiao_mian);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(chong_qing_xiao_mian.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
