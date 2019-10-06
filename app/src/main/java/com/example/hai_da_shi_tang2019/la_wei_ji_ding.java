package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class la_wei_ji_ding extends AppCompatActivity {
private String[]data={"将鸡肉拍松后切成一厘米见方的丁，并以此为主料做成的家常菜宫保鸡丁、辣子鸡丁、酱爆鸡丁、甜酱鸡丁等是饭店中常见的菜肴。\n" +
        "鸡胸肉去筋膜，洗净，将鸡脯肉切成细条，\n" +
        " 然后把切完的鸡肉条再横过来切成丁，一般1厘米见方。\n" +
        "鸡胸肉也可用鸡腿肉代替。 2.如果你还嫌鸡肉不够入味，或者担心炒出来的鸡肉嫩滑不足，升级的做法是在码味上浆之前，将鸡肉用刀背拍打几下，也可以用刀将鸡肉浅浅地切花口，在用水抓鸡肉的时候，放入一只蛋白，这样的鸡肉会更加嫩滑\n" +
        ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_la_wei_ji_ding);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(la_wei_ji_ding.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
