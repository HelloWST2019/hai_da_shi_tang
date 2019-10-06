package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class qing_jiao_rou_si_bing extends AppCompatActivity {
    private String[]data={"青椒为植物界，双子叶植物纲，菊亚纲，茄科。和红色辣椒统称为辣椒。果实为浆果。别名很多，大椒、灯笼椒、柿子椒都是它的名字，因能结甜味浆果，又叫甜椒、菜椒。\n" +
            "一年生或多年生草本植物，特点是果实较大，辣味较淡甚至根本不辣，作蔬菜食用而不作为调味料。由于它翠绿鲜艳，新培育出来的品种还有红、黄、紫等多种颜色，因此不但能自成一菜，还被广泛用于配菜。青椒由原产中南美洲热带地区的辣椒在北美演化而来，经长期栽培驯化和人工选择，使果实发生体积增大，果肉变厚，辣味消失和心皮及子房腔数增多等性状变化。中国于100多年前引入，现全国各地普遍栽培，青椒含有丰富的维生素C，适合高血压高血脂的人群食用。\n" +
            "医用价值:\n" +
            "辣椒味辛、性热，入心、脾经。\n" +
            "有温中散寒，开胃消食的功效。\n" +
            "主治寒滞腹痛，呕吐、泻痢，冻疮，脾胃虚寒，伤风感冒等症。\n" +
            "青椒能增强人的体力，缓解因工作、生活压力造成的疲劳。其特有的味道和所含的辣椒素有刺激唾液和胃液分泌的作用，能增进食欲，帮助消化，促进肠蠕动，防止便秘。它还可以防治坏血病，对牙龈出血、贫血、血管脆弱有辅助治疗作用。一般人都会感觉到，吃了带有辛味的青椒之后，会心跳动加速、皮肤血管扩张，令人觉得热乎乎的，所以中医对它的看法和辣椒一样，有温中下气、散寒除湿的说法。\n" +
            "1、解热、镇痛：辣椒辛温，能够通过发汗而降低体温，并缓解肌肉疼痛，因此具有较强的解热镇痛作用\n" +
            "2、预防癌症：辣椒的有效成分辣椒素是一种抗氧化物质，它可阻止有关细胞的新陈代谢，从而终止细胞组织的癌变过程，降低癌症细胞的发生率\n" +
            "3、增加食欲、帮助消化： 辣椒强烈的香辣味能刺激唾液和胃液的分泌，增加食欲，促进肠道蠕动，帮助消化\n" +
            "4、降脂减肥：辣椒所含的辣椒素，能够促进脂肪的新陈代谢，防止体内脂肪积存，有利于降脂减肥防病。\n" +
            "食用价值:\n" +
            "青椒果肉厚而脆嫩，维生素C含量丰富。青果含水分93. 9%左右、碳水化合物约3. 8%，红熟果含维生素C最高可达460毫克。可凉拌、炒食、煮食、作馅、腌渍和加工制罐，制蜜饯。" +
            ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qing_jiao_rou_si_bing);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(qing_jiao_rou_si_bing.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
