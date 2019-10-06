package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hei_jiao_ji_liu extends AppCompatActivity {
private String[]data={"黑椒鸡柳是一道美食，菜系待定，主要原料为鸡胸肉、青红椒、洋葱、橄榄油、黑胡椒等。\n" +
        "鸡柳是用鸡胸肉切成条状。在切的时候，先把鸡胸肉切成片状，然后再把片状的鸡胸肉切成条，由于切好的鸡胸肉就像一条条的柳叶，因而得名。是一种受广大人民所喜爱的一种小吃。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hei_jiao_ji_liu);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(hei_jiao_ji_liu.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter); }
}
