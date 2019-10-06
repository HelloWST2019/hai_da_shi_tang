package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class shen_jing_shao_e_fan extends AppCompatActivity {
    private String[]data={"烧鹅饭是广东省传统小吃，属于粤菜系。将鹅仔处理干净，用姜末、蒜蓉、葱末、盐、白糖、料酒、玫瑰露酒、鸡精、五香粉与肉骨汤搅拌均匀，制成调味汁，将鹅腌制30分钟。用蜂蜜、白醋调成的脆皮水均匀地涂满鹅表皮，烤箱预热至230℃，烤制35分钟，然后改用180℃烤至表皮酥脆（约10~15分钟）。将烤好的鹅用刀劈开，然后剁成整齐的小块，铺在米饭上即可。\n" +
            ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shen_jing_shao_e_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(shen_jing_shao_e_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
