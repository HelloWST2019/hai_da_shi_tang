package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class su_shi_jin extends AppCompatActivity {
    private String[]data={"素什锦是用豆腐干、白菜等材料制作的一道家常菜，属于鲁菜。豆腐干营养丰富，含有大量蛋白质、脂肪、碳水化合物，还含有钙、磷、铁等多种人体所需的矿物质。\n" +
            ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_su_shi_jin);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(su_shi_jin.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);;
    }
}
