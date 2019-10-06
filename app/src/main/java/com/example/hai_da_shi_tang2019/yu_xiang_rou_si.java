package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class yu_xiang_rou_si extends AppCompatActivity {
    private String[]data={"鱼香肉丝（Yuxiang shredded pork(sauteed in spicy garlic sauce） [1]  ，是一道汉族特色传统名菜，以鱼香味调味而得名，属于川菜。相传灵感来自泡椒肉丝，民国年间则是由四川籍厨师创制而成 [2]  。\n" +
            "鱼香肉丝是一道常见川菜。鱼香，是四川菜肴主要传统味型之一。成菜具有鱼香味，其味是调味品调制而成。此法源出于四川民间独具特色的烹鱼调味方法，而今已广泛用于川味的熟菜中。\n" +
            "营养价值\n" +
            "猪肉\n" +
            "猪肉含有丰富的蛋白质和多种脂肪酸，并提供血红素（有机铁）和促进铁吸收的半胱氨酸，能改善缺铁性贫血；具有补肾养血，滋阴润燥的功效。\n" +
            "竹笋\n" +
            "竹笋富含B族维生素及烟酸等营养素，具有低脂肪、低糖、多膳食纤维的特点，可吸附大量的油脂来增加味道 [16]  。\n" +
            "黑木耳\n" +
            "黑木耳中铁的含量丰富，有养血驻颜、令人肌肤红润的功效，并可防治缺铁性贫血；另外含有维生素K，能减少血液凝块，预防血栓症的发生，有防治动脉粥样硬化和冠心病的作用" +
            ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yu_xiang_rou_si);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(yu_xiang_rou_si.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
