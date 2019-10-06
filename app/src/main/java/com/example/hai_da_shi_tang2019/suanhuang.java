package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class suanhuang extends AppCompatActivity {
    private String[]data={"1. 黄瓜性味甘寒，能清热、利尿、除湿，滑肠、降脂、减肥。鲜黄瓜含有丙醇二酸，可抑制糖类物质转变为脂肪，所以多吃常吃黄瓜可以减肥。黄瓜还可作为美容剂，国外有人将黄瓜去瓤、籽，\n" +
            "捣烂取汁，用来清洁和保护皮肤，舒展脸上的皱纹。黄瓜藤还有很好的降压作用。实验表明，黄瓜藤有直接扩张血管和减慢心率的明显作用。黄瓜多凉拌生吃，要注意卫生，否则易引起急性呕吐、腹泻，因此有“黄瓜上市，医生行时”之说。\n" +
            "2. 大蒜历来以杀菌力强著名，现在发现大蒜有降脂，降压、降血糖的多种作用。大蒜降压主要是所含的“配糖体”起作用。国外学者观察大蒜降血脂的作用优于西药安妥明，还能使动脉血栓和粥样硬化斑块溶解，因此常吃大蒜对防治心血管病极为有利。大蒜汁还能降低糖尿病人的血糖。国内发现，大蒜可促进胃酸分泌，因此溃疡病禁用，但胃酸缺乏的萎缩性胃炎则可常吃。国内新近研究，大蒜有较好的抗癌作用。\n" +
            "3. 黄瓜脆嫩清香，大蒜味浓郁，为夏令冷碟佳肴。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suanhuang);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(suanhuang.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
