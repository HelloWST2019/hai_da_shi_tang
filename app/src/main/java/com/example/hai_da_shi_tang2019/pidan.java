package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class pidan extends AppCompatActivity {
private List<Pi>piList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pidan);
        piInit();
        PiAdapter adapter=new PiAdapter(pidan.this,R.layout.pi_item,piList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Pi fo = piList.get(i);
                Intent intent = new Intent();
                switch (fo.getNiching()) {
                    case "pd": intent.setClass(pidan.this, pi_dan_shou_rou_zhou.class);
                        break;
                    case "xg": intent.setClass(pidan.this, xiang_gu_niu_rou_zhou.class);
                        break;
                    case "ld": intent.setClass(pidan.this, lv_dou_zhou.class);
                        break;
                    case "bb": intent.setClass(pidan.this, ba_bao_zhou.class);
                        break;
    }
                startActivity(intent);
            }

        });}
    public void piInit(){
        Pi pd=new Pi("皮蛋瘦肉粥     7元","pd");
        Pi xg=new Pi("香菇牛肉粥     7元","xg");
        Pi ld=new Pi("绿豆粥         5元","ld");
        Pi bb=new Pi("八宝粥         5元","bb");
        piList.add(pd);
        piList.add(xg);
        piList.add(ld);
        piList.add(bb);
    }
}
