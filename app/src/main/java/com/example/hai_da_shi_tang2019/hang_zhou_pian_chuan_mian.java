package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hang_zhou_pian_chuan_mian extends AppCompatActivity {
private String[]data={"杭州片儿川，“中国十大面条”之一 ，是浙江杭州地区一种著名的特色传统汤面，面的浇头主要由雪菜，笋片，瘦肉丝组成，鲜美可口。已有百余年历史，最早由杭州老店奎元馆首创。\n" +
        ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hang_zhou_pian_chuan_mian);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(hang_zhou_pian_chuan_mian.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
