package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class xian_rou_shui_jiao extends AppCompatActivity {
private String[]data={"鲜肉水饺，一种特色小吃，以猪肉为主要食材。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xian_rou_shui_jiao);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(xian_rou_shui_jiao.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
