package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class wu_xiang_niu_rou_ban_mian extends AppCompatActivity {
    private String[]data={"五香牛肉是一道菜品，主要食材是牛肉，配料是麻油、桂皮、生姜，调料是茴香、八角、花椒等，通过煮熟晾凉的做法而成。\n" +
            "营养价值\n" +
            "牛肉富含丰富蛋白质，氨基酸组成比猪肉更接近人体需要，能提高机体抗病能力，对生长发育及术后，病后调养的人在补充失血、修复组织等方面特别适宜，寒冬食牛肉可暖胃，是该季节的补益佳品；牛肉有补中益气，滋养脾胃，强健筋骨，化痰息风，止渴止涎之功效，适宜于中气下隐、气短体虚、筋骨酸软、贫血久病及面黄目眩之人食用。 [1] \n" +
            "禁忌\n" +
            "牛肉不宜与板栗、田螺、红糖、韭菜、白酒、猪肉同食。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wu_xiang_niu_rou_ban_mian);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(wu_xiang_niu_rou_ban_mian.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
