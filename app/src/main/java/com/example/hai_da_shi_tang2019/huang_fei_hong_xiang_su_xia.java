package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class huang_fei_hong_xiang_su_xia extends AppCompatActivity {
private String[]data={"虾（Shrimp），是一种生活在水中的节肢动物，属节肢动物甲壳类，种类很多 [1]  ，包括南极红虾、青虾、河虾、草虾、对虾、明虾、龙虾等。 虾具有很高的食疗营养价值，可以有蒸、炸等做法，并可以用做于中药材。\n" +
        "营养成分:\n" +
        "虾忌与某些水果同吃。虾含有比较丰富的蛋白质和钙等营养物质，如果把它们与含有鞣酸的水果，如葡萄、石榴、山楂、柿子等同食，不仅会降低蛋白质的营养价值，而且鞣酸和钙酸结合形成鞣酸钙后会刺激肠胃，引起人体不适，出现呕吐、头晕、恶心和腹痛、腹泻等症状。海鲜与这些水果同吃，至少应间隔2小时。  \n" +
        "虾皮中含有丰富的钙，还含有一种被称为甲壳质的动物性纤维，它是多糖的一种，不能被人体消化吸收，经过化学处理后将其溶解在水中可制成健康食品壳聚糖。  \n" +
        "营养分析:\n" +
        "虾营养丰富，且其肉质松软，易消化，对身体虚弱以及病后需要调养的人的食物。 \n" +
        "虾中含有丰富的镁，镁对心脏活动具有重要的调节作用，能很好的保护心血管系统，它可减少血液中胆固醇含量，防止动脉硬化，同时还能扩张冠状动脉，有利于预防高血压及心肌梗死。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huang_fei_hong_xiang_su_xia);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(huang_fei_hong_xiang_su_xia.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);}
    }

