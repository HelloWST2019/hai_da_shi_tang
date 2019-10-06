package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class song_ban_rou extends AppCompatActivity {
    private String[]data={"松板肉是一道家常菜，该菜的主料松板肉取自猪颈两边，因其稀少而珍贵，所以有“黄金六两”之称，此部位肉脂如雪花般均匀分布，肉质鲜嫩，入喉爽口滑顺，口劲适中。\n" +
            ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_ban_rou);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(song_ban_rou.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
