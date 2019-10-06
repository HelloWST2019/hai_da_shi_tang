package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hong_shao_pai_gu_mian extends AppCompatActivity {
private String[]data={"红烧排骨饭是一种美食，主料有排骨\n" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hong_shao_pai_gu_mian);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(hong_shao_pai_gu_mian.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
