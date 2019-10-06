package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class lu_ya_tou extends AppCompatActivity {
private String[]data={"卤鸭头是是一道简单的家常菜，主料是鸭头、蒜仁、辣椒、青葱等。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lu_ya_tou);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(lu_ya_tou.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
