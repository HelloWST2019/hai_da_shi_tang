package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class yu_tou_guo_zai extends AppCompatActivity {
private String[]data={"鱼头:\n" +
        "鱼头具有营养高、口味好、富含人体必需的卵磷脂和不饱和脂肪酸。有助于增强男性性功能，对降低血脂、健脑及延缓衰老有好处等等"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yu_tou_guo_zai);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(yu_tou_guo_zai.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
