package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class jian_bing extends AppCompatActivity {
private String[]data={"营养价值:\n" +
        "煎饼多以粗粮制成，常吃煎饼可以促进肠胃蠕动，有益肠胃健康；其次煎饼筋道耐嚼，常吃煎饼有益牙齿健康，有好多老太太都70岁左右了牙齿依然坚固，问她有何保健方法，答案是常吃煎饼。\n" +
        "煎饼可以用麦、豆、高粱、玉米等多种谷物制作，含有谷物本身的各种营养，食用方便，是人体补充能量的基础食物，再卷入各种蔬菜、鸡蛋、肉等配料，营养丰富，深受人们所喜爱。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jian_bing);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(jian_bing.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
