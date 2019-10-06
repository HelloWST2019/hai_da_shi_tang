package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hei_jiao_ji_kuai extends AppCompatActivity {
private String[]data={"营养分析:\n" +
        "科学调查认为，鸡肉食用量对人体，尤其是老年人、女性的健康有重大影响。\n" +
        "营养学家指出，由于人们一天中会食用各种食物，平均起来，鸡肉中的胆固醇含量最高。胆固醇会极大增加心脑血管疾病的诱发几率，如果老年人、女性每天都吃鸡肉，那么势必会有多余的胆固醇存积在体内，这不但不利于健康，也会增加心脏病、脑血栓诱发的几率。\n" +
        "另外某些不法商贩在鸡饲料中添加激素，导致鸡肉中激素残留，也会影响人体健康。\n" +
        "孕妇食用了含有激素的鸡，会导致回奶、过度肥胖；未成年人还会导致性早熟。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hei_jiao_ji_kuai);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(hei_jiao_ji_kuai.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
