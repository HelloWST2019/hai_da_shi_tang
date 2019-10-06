package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class tu_shui_ya_tui_fan extends AppCompatActivity {
    private String[]data={"卤水鸭以香辛料油树脂为基本原料，在继承和发扬中国传统高技术的基础上，结合现代先进的生物技术，经科学复配而成。是替代传统“卤料包”的高新科技产品。\n" +
            ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tu_shui_ya_tui_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(tu_shui_ya_tui_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
