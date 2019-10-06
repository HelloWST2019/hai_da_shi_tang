package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class xi_yu_rou_chuan extends AppCompatActivity {
private String[]data={"美味，可口，好吃，香甜，爽口，口齿留香，回味无穷\n" +
        "烤羊肉串在新疆是最有名的民族风味小吃。制作原料主要有羊肉、洋葱、盐等。把羊肉与洋葱拌匀腌渍一段时间可减少膻味。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xi_yu_rou_chuan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(xi_yu_rou_chuan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
