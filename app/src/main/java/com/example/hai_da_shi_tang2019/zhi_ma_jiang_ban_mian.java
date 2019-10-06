package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class zhi_ma_jiang_ban_mian extends AppCompatActivity {
    private String[]data={"芝麻酱拌面是一款面食菜品，制作原料主要有芝麻酱、面条等。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhi_ma_jiang_ban_mian);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(zhi_ma_jiang_ban_mian.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
