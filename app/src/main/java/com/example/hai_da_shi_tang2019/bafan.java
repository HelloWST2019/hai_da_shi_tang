package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class bafan extends AppCompatActivity {
    private List<Ba>baList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bafan);
        baInit();
        BaAdapter adapter=new BaAdapter(bafan.this,R.layout.ba_item,baList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Ba fo = baList.get(i);
                Intent intent = new Intent();
                switch (fo.getNiching()) {
                    case "zj": intent.setClass(bafan.this, hong_shao_zai__ji_ba_fan.class);
                        break;
                    case "yk": intent.setClass(bafan.this, douya.class);
                        break;
                    case "yp": intent.setClass(bafan.this, douya.class);
                        break;
                    case "sn":
                        case "nr": intent.setClass(bafan.this, douya.class);
                        break;
                    case "sp":
                    case "pg": intent.setClass(bafan.this, douya.class);
                        break;
                    case "rr":
                    case "rb": intent.setClass(bafan.this, douya.class);
                        break;
                    case "js": intent.setClass(bafan.this, douya.class);
                        break;
                    case "te": intent.setClass(bafan.this, douya.class);
                        break;
                    case "by": intent.setClass(bafan.this, douya.class);
                        break;
                    case "pp": intent.setClass(bafan.this, douya.class);
                        break;
                    case "qz": intent.setClass(bafan.this, douya.class);
                        break;
                    case "zp": intent.setClass(bafan.this, douya.class);
                        break;
                    case "hd": intent.setClass(bafan.this, douya.class);
                        break;
                }
                startActivity(intent);
            }

    });}
    public void baInit(){
        Ba zj=new Ba("扒饭系列\n红烧仔鸡扒饭        12元","zj");
        Ba yk=new Ba("红烧鱼块扒饭        12元","yk");
        Ba yp=new Ba("酸菜鱼片扒饭        12元","yp");
        Ba nr=new Ba("红烧牛肉扒饭        14元","nr");
        Ba pg=new Ba("红烧排骨扒饭        13元","pg");
        Ba rb=new Ba("红烧肉扒饭          12元","rb");
        Ba js=new Ba("酱烧鸭扒饭          12元","js");
        Ba te=new Ba("土耳其炸肉饭        11元","te");
        Ba by=new Ba("扒饭单点\n扒     鸭             7元","by");
        Ba pp=new Ba("培     根             6元","pp");
        Ba qz=new Ba("土耳其炸肉            6元","qz");
        Ba zp=new Ba("炸 猪 排              5元","zp");
        Ba sn=new Ba("红烧牛肉             11元","sn");
        Ba sp=new Ba("红烧排骨              9元","sp");
        Ba rr=new Ba("红 烧 肉              9元","rr");
        Ba hd=new Ba("黄豆猪脚              9元","hd");
        baList.add(zj);
        baList.add(yk);
        baList.add(yp);
        baList.add(nr);
        baList.add(pg);
        baList.add(rb);
        baList.add(js);
        baList.add(te);
        baList.add(by);
        baList.add(pp);
        baList.add(qz);
        baList.add(zp);
        baList.add(sn);
        baList.add(sp);
        baList.add(rr);
        baList.add(hd);

    }
}
