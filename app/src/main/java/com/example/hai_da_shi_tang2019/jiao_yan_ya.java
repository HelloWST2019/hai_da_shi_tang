package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class jiao_yan_ya extends AppCompatActivity {
private String[]data={"椒盐鸭是以急冻光鸭、四川花椒等为主要食材制作的美食。\n" +
        "椒盐为中国各个地区常见的调味料。可以用小中火将花椒粒与盐炒约一两分钟至花椒香气溢出，盛起待凉即可。\n" +
        "营养分析:\n" +
        "1. 花椒气味芳香，可除各种肉类的腥膻臭气，能促进唾液分泌，增加食欲；\n" +
        "2. 日本医学院研究发现，花椒能使血管扩张，从而能起到降低血压的作用。\n" +
        "相关人群:\n" +
        "一般人群均可食用\n" +
        "肾病患者、白内障患者、高温环境下工作的人群、孕妇、阴虚火旺者不宜食用。\n" +
        "食疗作用:\n" +
        "花椒有芳香健胃，温中散寒，除湿止痛，杀虫解毒，止痒解腥之功效。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jiao_yan_ya);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(jiao_yan_ya.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter); }
}
