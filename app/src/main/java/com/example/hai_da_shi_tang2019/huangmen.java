package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class huangmen extends AppCompatActivity {
private List<Huang>huangList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huangmen);
        huangInit();
        HuangAdapter adapter = new HuangAdapter(huangmen.this, R.layout.huang_item, huangList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Huang fo = huangList.get(i);
                Intent intent = new Intent();
                switch (fo.getNiching()) {
                    case "mf":
                        intent.setClass(huangmen.this, huang_men_ji_mi_fan.class);
                        break;
                    case "gx":
                        intent.setClass(huangmen.this, gong_xiang_pai_gu_fan.class);
                        break;
                    case "gz":
                        intent.setClass(huangmen.this, hong_shao_niu_rou_guo_zai.class);
                        break;
                    case "pg":
                        intent.setClass(huangmen.this, hong_shao_pai_gu_guo_zai.class);
                        break;
                    case "zg":
                        intent.setClass(huangmen.this, jin_zhen_gu_guo_zai.class);
                        break;
                    case "jd":
                        intent.setClass(huangmen.this, jun_gu_ji_dan_guo_zai.class);
                        break;
                    case "xa":
                        intent.setClass(huangmen.this, xin_ao_er_liang_kao_ji_guo_zai.class);
                        break;
                    case "lz":
                        intent.setClass(huangmen.this, la_zi_ji_guo_zai.class);
                        break;
                    case "yw":
                        intent.setClass(huangmen.this, yu_wan_san_xian_guo_zai.class);
                        break;
                    case "pt":
                        intent.setClass(huangmen.this, san_xian_pai_tiao.class);
                        break;
                    case "xc":
                        intent.setClass(huangmen.this, xiang_chang_ji_dan.class);
                        break;
                    case "hj":
                        intent.setClass(huangmen.this, hei_jiao_li_ji_guo_zai.class);
                        break;
                    case "pj":
                        intent.setClass(huangmen.this, pi_jiu_ya_guo_zai.class);
                        break;
                    case "st":
                        intent.setClass(huangmen.this, suan_tang_xiao_suan_rou.class);
                        break;
                    case "jy":
                        intent.setClass(huangmen.this, ji_yu_guo_zai.class);
                        break;
                    case "sc":
                        intent.setClass(huangmen.this, suan_cai_yu_guo_zai.class);
                        break;
                    case "yt":
                        intent.setClass(huangmen.this, yu_tou_guo_zai.class);
                        break;
                    case "fn":
                        intent.setClass(huangmen.this, fei_niu_guo_zai.class);
                        break;
                }
                startActivity(intent);
            }
        });
    }
    public void huangInit(){
        Huang mf=new Huang("黄焖鸡米饭       小14/大19","mf");
        Huang gx=new Huang("贡香排骨饭       小14/大19","gx");
        Huang gz=new Huang("红烧牛肉锅仔          16元","gz");
        Huang pg=new Huang("红烧排骨锅仔          16元","pg");
        Huang zg=new Huang("金针菇锅仔            10元","zg");
        Huang jd=new Huang("菌菇鸡蛋锅仔          11元","jd");
        Huang xa=new Huang("新奥尔良烤鸡锅仔      14元","xa");
        Huang lz=new Huang("辣子鸡锅仔             14元","lz");
        Huang yw=new Huang("鱼丸三鲜锅仔           14元","yw");
        Huang pt=new Huang("三鲜排条锅仔           14元","pt");
        Huang xc=new Huang("香肠鸡蛋锅仔           12元","xc");
        Huang hj=new Huang("黑椒里脊锅仔           14元","hj");
        Huang pj=new Huang("啤酒鸭锅仔             14元","pj");
        Huang st=new Huang("酸汤小酸肉锅仔         14元","st");
        Huang jy=new Huang("鲫鱼锅仔               15元","jy");
        Huang sc=new Huang("酸菜鱼锅仔             14元","sc");
        Huang yt=new Huang("鱼头锅仔               14元","yt");
        Huang fn=new Huang("肥牛锅仔               14元\n另加：大拉面 1元，荷包蛋1.5元，培根3元","fn");
        huangList.add(mf);
        huangList.add(gx);
        huangList.add(gz);
        huangList.add(pg);
        huangList.add(zg);
        huangList.add(jd);
        huangList.add(xa);
        huangList.add(lz);
        huangList.add(yw);
        huangList.add(pt);
        huangList.add(xc);
        huangList.add(hj);
        huangList.add(pj);
        huangList.add(st);
        huangList.add(jy);
        huangList.add(sc);
        huangList.add(yt);
        huangList.add(fn);
    }

}
