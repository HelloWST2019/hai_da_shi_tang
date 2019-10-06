package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class lu_ya_zhua extends AppCompatActivity {
private String[]data={"卤鸭爪，一道家常菜品，主要制作原料是鸭爪，配料是糟卤，调料为花椒，白醋，泡山椒等，通过卤水腌制的做法而成。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lu_ya_zhua);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(lu_ya_zhua.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
