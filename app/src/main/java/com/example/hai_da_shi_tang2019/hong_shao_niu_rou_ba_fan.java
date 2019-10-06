package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hong_shao_niu_rou_ba_fan extends AppCompatActivity {
private String[]data={"营养价值:\n" +
        "牛肉含有丰富的蛋白质和氨基酸等营养成分，比猪肉更接近人体需要，能提高机体抗病能力，对生长发育及术后、病后调养的人在补充失血和修复组织等方面特别适宜。寒冷的冬天食用牛肉，除了暖胃驱寒以外，还有补中益气、滋养脾胃、强健筋骨、化痰息风等功效作用，实为寒冬的补益佳品。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hong_shao_niu_rou_ba_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(hong_shao_niu_rou_ba_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
