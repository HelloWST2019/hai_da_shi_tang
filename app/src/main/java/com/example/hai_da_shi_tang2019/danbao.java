package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class danbao extends AppCompatActivity {
    private List<Dan> danList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danbao);
        danInits();
        DanAdapter adapter=new DanAdapter(danbao.this,R.layout.dan_item,danList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Dan fo = danList.get(i);
                Intent intent = new Intent();
                switch (fo.getNiching()) {
                    case "xc": intent.setClass(danbao.this, xiang_chang_dan_bao_fan.class);
                        break;
                    case "jr": intent.setClass(danbao.this, ji_rou_dan_bao_fan.class);
                        break;
                    case "tb": intent.setClass(danbao.this, xiang_chang_dan_bao_fan.class);
                        break;
                }
                startActivity(intent);
            }
        });
    }
    private void danInits(){
        Dan xc=new Dan("香肠蛋包饭      11元", "xc");
        Dan jr=new Dan("鸡肉蛋包饭      11元","jr");
        Dan tb=new Dan("铁板蛋包饭      11元","tb");
        danList.add(xc);
        danList.add(jr);
        danList.add(tb);
    }
}
