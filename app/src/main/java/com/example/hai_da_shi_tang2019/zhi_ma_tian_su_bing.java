package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class zhi_ma_tian_su_bing extends AppCompatActivity {
    private String[]data={"芝麻酥饼是一道由玉米淀粉等食材制成的美食"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhi_ma_tian_su_bing);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(zhi_ma_tian_su_bing.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
