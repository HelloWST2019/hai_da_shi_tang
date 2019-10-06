package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class shang_hai_xiao_long_bao extends AppCompatActivity {
    private String[]data={"上海小笼包，是一道上海特色小吃，制作原料主要有夹心腿肉、饺子皮、肉皮等。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shang_hai_xiao_long_bao);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(shang_hai_xiao_long_bao.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
