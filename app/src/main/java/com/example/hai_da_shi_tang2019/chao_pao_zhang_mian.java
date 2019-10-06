package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class chao_pao_zhang_mian extends AppCompatActivity {
private String[]data={"炮仗面:\n" +
        "青海风味面食。拉面出锅后不带汤，用刀切成短条，倒入用粉丝、肉末、辣椒和少量菜做好的混菜锅内混炒而成。出锅前的制做等同于拉面的制做，出锅后的混炒法又相近于炒面片的混炒，但口味与两者各不相同。先长后短，先煮后炒、面菜混一。\n"+
"营养价值:\n" +
        "高筋面粉：养心、益肾、除热、止渴\n" +
        "主治：脏躁、烦热、消渴、泄痢、痈肿、外伤出血及烫伤等。\n" +
        "菜品特色:\n" +
        "炮仗面，形似炮仗（爆竹），面条劲道弹韧，辅菜香辣爽口，是西北穆斯林经典面食。特别在青海地区，深受各族人民喜欢。此套烹饪方法是家常做法，味道比拉面馆（非青海当地）的有过之而无不及，口味独特。喜欢面食的朋友可以试做，尝尝西北美食！"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chao_pao_zhang_mian);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(chao_pao_zhang_mian.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
