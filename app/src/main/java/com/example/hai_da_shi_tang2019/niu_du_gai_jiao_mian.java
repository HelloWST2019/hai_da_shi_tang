package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class niu_du_gai_jiao_mian extends AppCompatActivity {
    private String[]data={"牛肚即牛胃。牛为反刍动物，共有四个胃，前三个胃为食道变异，即瘤胃（草肚）、网胃（蜂巢胃、麻肚）、瓣胃（重瓣胃、百叶），最后一个才是真胃（皱胃）。\n" +
            "营养分析:\n" +
            "牛肚含蛋白质、脂肪、钙、磷、铁、硫胺素、核黄素、尼克酸等，具有补益脾胃，补气养血，补虚益精、消渴、风眩之功效，适宜于病后虚羸、气血不足、营养不良、脾胃薄弱之人。\n" +
            "适宜人群:\n" +
            "一般人都可食用，尤适宜于病后虚羸、气血不足、营养不良、脾胃薄弱之人。\n" +
            "食疗作用：\n" +
            "性平、味甘，归脾、胃经；\n" +
            "有补虚、益脾胃的作用；\n" +
            "治病后虚羸，气血不足，消渴，风眩。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niu_du_gai_jiao_mian);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(niu_du_gai_jiao_mian.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
