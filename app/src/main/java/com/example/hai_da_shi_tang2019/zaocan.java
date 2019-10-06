package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class zaocan extends AppCompatActivity {
private List<Zao>zaoList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zaocan);
        zaocanInit();
        zaoAdapter adapter=new zaoAdapter(zaocan.this,R.layout.zao_item,zaoList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Zao fo = zaoList.get(i);
                Intent intent = new Intent();
                switch (fo.getNicheng()) {
                    case "hj": intent.setClass(zaocan.this,hua_juan.class);
                        break;
                    case "bz": intent.setClass(zaocan.this,bai_zhou.class);
                        break;
                    case "td": intent.setClass(zaocan.this,tu_dou_bao.class);
                        break;
                    case "hl": intent.setClass(zaocan.this,huo_luo_bo.class);
                        break;
                    case "kb": intent.setClass(zaocan.this,kao_bao_zi.class);
                        break;
                    case "yw": intent.setClass(zaocan.this,yuan_wei_dou_nai.class);
                        break;
                    case "jd": intent.setClass(zaocan.this,ji_dan_bing.class);
                        break;
                    case "ng": intent.setClass(zaocan.this,nan_gua_fa_gao.class);
                        break;
                    case "cy": intent.setClass(zaocan.this,cong_you_bing.class);
                        break;
                    case "zm": intent.setClass(zaocan.this,zhi_ma_kao_bing.class);
                        break;
    }startActivity(intent);
            }

        });}
private void zaocanInit(){
Zao hj=new Zao("花卷        0.5元","hj");
Zao bz=new Zao("白粥        0.5元","bz");
Zao td=new Zao("土豆包      1.0元","td");
Zao hl=new Zao("胡萝卜      1.0元","hl");
Zao kb=new Zao("烤包子      1.0元","kb");
Zao yw=new Zao("原味豆奶    1.5元","yw");
Zao jd=new Zao("鸡蛋饼      1.5元","jd");
Zao ng=new Zao("南瓜发糕    2.0元","ng");
Zao cy=new Zao("葱油饼      2.0元","cy");
Zao zm=new Zao("芝麻烤饼    2.0元","zm");
zaoList.add(hj);
zaoList.add(bz);
zaoList.add(td);
zaoList.add(hl);
zaoList.add(kb);
zaoList.add(yw);
zaoList.add(jd);
zaoList.add(ng);
zaoList.add(cy);
zaoList.add(zm);
}
}
