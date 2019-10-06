package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class zhi_ma_kao_bing extends AppCompatActivity {
    private String[]data={"芝麻烤饼是一款饼干小吃，制作原料主要有牛油、砂糖、牛奶、奶酪、低筋面粉等"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhi_ma_kao_bing);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(zhi_ma_kao_bing.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
