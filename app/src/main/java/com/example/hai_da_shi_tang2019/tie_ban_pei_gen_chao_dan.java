package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class tie_ban_pei_gen_chao_dan extends AppCompatActivity {
    private String[]data={"炒饭是常见的一种食物，分为多种品类，如扬州炒饭、香肠炒饭、西红柿炒饭、咖喱炒饭、培根炒饭等，很受大众追捧，在各个地方特色化。主要材料是用煮好的米饭、一些菜肴、鸡蛋爆炒而成。一般大众把炒饭当做早饭或者是晚饭，因为炒饭制作方便，耗时较少。\n" +
            "历史传说:\n" +
            "网络传说炒饭的发明和李鸿章有关。但实为误传。\n" +
            "李鸿章只是晚清人士，而炒饭历史悠久，譬如我国著名的扬州炒饭，在隋朝时期早已成形。而扬州炒饭脱胎自碎金饭，即蛋炒饭，相传源自隋朝越国公杨素爱吃的碎金饭，就更加说明了炒饭出现的时期在更早以前。炒饭是古代东亚人民在日常生活中所自然形成的做饭方法，是劳动人民智慧的结晶。" +
            ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tie_ban_pei_gen_chao_dan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(tie_ban_pei_gen_chao_dan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
