package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class mian extends AppCompatActivity {
private List<Mian1>mian1List=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mian);
        mianInit();
        mianAdapter adapter=new mianAdapter(mian.this,R.layout.mian_item,mian1List);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Mian1 fo = mian1List.get(i);
                Intent intent = new Intent();
                switch (fo.getNicheng()) {
                    case "nr": intent.setClass(mian.this, niu_rou_shui_jiao.class);
                        break;
                    case "hb": intent.setClass(mian.this, he_bao_dan_mian.class);
                        break;
                    case "zz": intent.setClass(mian.this, niu_rou_mian.class);
                        break;
                    case "fq": intent.setClass(mian.this, fan_qie_chao_dan_mian.class);
                        break;
                    case "qz": intent.setClass(mian.this, qie_zi_ban_mian.class);
                        break;
                    case "td": intent.setClass(mian.this, tu_dou_ji_kuai_gai_jiao_mian.class);
                        break;
                    case "cp": intent.setClass(mian.this, chao_pao_zhang_mian.class);
                        break;
                    case "xj": intent.setClass(mian.this, xin_jiang_ban_mian.class);
                        break;
                    case "wx": intent.setClass(mian.this, wu_xiang_niu_rou_ban_mian.class);
                        break;
                    case "qj": intent.setClass(mian.this, qing_jiao_niu_rou_gai_jiao_mian.class);
                        break;
                    case "ng": intent.setClass(mian.this, niu_rou_gan_ban_mian.class);
                        break;
                    case "nd": intent.setClass(mian.this, niu_du_gai_jiao_mian.class);
                        break;
    }
                startActivity(intent);
            }

        });}
    private void mianInit(){
        Mian1 nr=new Mian1("牛肉水饺     2.5元（5只）","nr");
        Mian1 hb=new Mian1("荷包蛋面        6.0元","hb");
        Mian1 zz=new Mian1("正宗牛肉面      7.0元","zz");
        Mian1 fq=new Mian1("番茄炒蛋面      7.0元","fq");
        Mian1 qz=new Mian1("茄子拌面        8.0元","qz");
        Mian1 td=new Mian1("土豆鸡块盖浇面  10.0元","td");
        Mian1 cp=new Mian1("炒炮仗面        10.0元","cp");
        Mian1 xj=new Mian1("新疆拌面        10.0元","xj");
        Mian1 wx=new Mian1("五香牛肉拌面    11.0元","wx");
        Mian1 qj=new Mian1("青椒牛肉盖浇面  11.0元","qj");
        Mian1 ng=new Mian1("牛肉干拌面      12.0元","ng");
        Mian1 nd=new Mian1("牛肚盖浇面      13.0元","nd");
        mian1List.add(nr);
        mian1List.add(hb);
        mian1List.add(zz);
        mian1List.add(fq);
        mian1List.add(qz);
        mian1List.add(td);
        mian1List.add(cp);
        mian1List.add(xj);
        mian1List.add(wx);
        mian1List.add(qj);
        mian1List.add(ng);
        mian1List.add(nd);
    }
}
