package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class sheng_jian extends AppCompatActivity {
    private String[]data={"生煎又称生煎馒头，是流行于上海、浙江，江苏及广东的一种特色传统小吃，广受国人喜爱，材料有面粉、芝麻、葱花、猪肉、肉皮冻等。原为茶楼、老虎灶（开水店）兼营品种。馅心以鲜猪肉加皮冻为主，20世纪30年代后，上海饮食业有了生煎的专营店，馅心花色也增加了玉米、荠菜、虾仁等多种品种。" +
            ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sheng_jian);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(sheng_jian.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
