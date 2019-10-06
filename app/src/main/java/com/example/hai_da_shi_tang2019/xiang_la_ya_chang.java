package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class xiang_la_ya_chang extends AppCompatActivity {
    private String[]data={"鸭肠是鸭的内脏之一，是很多菜肴都会用到的食材。可卤、可炒、可炖、可烫火锅。味道鲜美，香脆可口。对消化和视觉的维护都有良好的作用。\n" +
            "功效:\n" +
            "便血\n" +
            "遗尿\n" +
            "白浊\n" +
            "肾虚\n" +
            "使用效果:\n" +
            "对人体新陈代谢，神经、心脏、消化和视觉的维护都有良好的作用。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiang_la_ya_chang);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(xiang_la_ya_chang.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
