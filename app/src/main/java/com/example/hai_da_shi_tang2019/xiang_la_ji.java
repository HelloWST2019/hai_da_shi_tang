package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class xiang_la_ji extends AppCompatActivity {
private String[]data={"食谱营养:\n" +
        "鸡肉：鸡肉肉质细嫩，滋味鲜美，蛋白质含量较高，且易被人体吸收入利用，有增强体力，强壮身体的作用，所含对人体生长发育有重要作用的磷脂类，是中国人膳食结构中脂肪和磷脂的重要来源之一。且鸡的全身都是药，有益五脏，补虚损，补虚健胃、强筋壮骨、活血通络、调月经、止白带等作用。用于虚劳瘦弱、中虚食少、泄泻头晕心悸、月经不调、产后乳少、消渴、水肿、小便数频、遗精、耳聋耳鸣等证。一般人群均可食用，老人，病人，体弱者更宜食用。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiang_la_ji);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(xiang_la_ji.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
