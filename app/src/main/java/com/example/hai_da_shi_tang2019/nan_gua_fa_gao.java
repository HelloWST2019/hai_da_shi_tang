package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class nan_gua_fa_gao extends AppCompatActivity {
private String[]data={"南瓜发糕是南瓜、面粉等材料制作的一道较为有名的点心食品。口感非常松软，而且有一种面粉制品的特别香味，是早餐的上佳选择。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nan_gua_fa_gao);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(nan_gua_fa_gao.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
