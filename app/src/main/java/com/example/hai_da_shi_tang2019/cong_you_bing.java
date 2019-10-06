package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class cong_you_bing extends AppCompatActivity {
    private String[]data={"葱油饼（英文名：Shallot pancake）是北方地区特色小吃的一种，属闽菜或鲁菜菜系。主要用料为面粉和葱花，口味香咸。中国福建，山东威海、东北、河北等地都有该小吃分布，是街头、夜市的常见食品。" +
            "营养功效\n" +
            "清热\n" +
            "祛痰 促进食欲 抗菌\n" +
            "抗病毒 防癌抗癌\n" +
            "适宜人群\n" +
            "多汗者忌食"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cong_you_bing);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(cong_you_bing.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
