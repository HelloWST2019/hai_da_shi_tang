package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class lu_wu_hua_rou_fan extends AppCompatActivity {
private String[]data={"卤五花肉是一道美食，主要材料是五花肉500克，米酒300毫升，酱油1碗(250毫升)，冰糖20克，八角茴香1粒，蒜仁4粒，青葱2根"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lu_wu_hua_rou_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(lu_wu_hua_rou_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter); }
}
