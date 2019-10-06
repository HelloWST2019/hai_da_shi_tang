package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class tieban extends AppCompatActivity {
private List<Tie>tieList= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tieban);
        tieInit();
        TieAdapter adapter=new TieAdapter(tieban.this,R.layout.tie_item,tieList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Tie fo = tieList.get(i);
                Intent intent = new Intent();
                switch (fo.getNiching()) {
                    case "xj": intent.setClass(tieban.this, xiang_jian_ji_pai.class);
                        break;
                    case "yc": intent.setClass(tieban.this, tie_ban_ya_chang_chao_dan.class);
                        break;
                    case "pg": intent.setClass(tieban.this, tie_ban_pei_gen_chao_dan.class);
                        break;
                    case "xl": intent.setClass(tieban.this, xiang_la_ya_chang.class);
                        break;
                    case "qd": intent.setClass(tieban.this, qiu_dao_yu.class);
                        break;
                    case "pj": intent.setClass(tieban.this, pei_gen_juan_xin_cai.class);
                        break;
                    case "jz": intent.setClass(tieban.this, jin_zhen_gu_niu_liu.class);
                        break;
                    case "ll": intent.setClass(tieban.this, xiang_jian_long_li_yun.class);
                        break;
                    case "jb": intent.setClass(tieban.this, jiang_bao_you_yu.class);
                        break;
                    case "sb": intent.setClass(tieban.this, song_ban_rou.class);
                        break;
                    case "hj": intent.setClass(tieban.this, hei_jiao_zhu_pai.class);
                        break;
                    case "bl": intent.setClass(tieban.this, bo_luo_cui_pi_ji.class);
                        break;
                    case "hx": intent.setClass(tieban.this, hai_xian_wu_dong_mian.class);
                        break;
                    case "jl": intent.setClass(tieban.this, hei_jiao_ji_liu.class);
                        break;
                    case "zs": intent.setClass(tieban.this, tang_ludan.class);
                        break;
    }startActivity(intent);
            }

        });}
    private void tieInit(){
        Tie xj=new Tie("香煎鸡排套餐    12元","xj");
        Tie yc=new Tie("铁板鸭肠炒蛋    12元","yc");
        Tie pg=new Tie("铁板培根炒蛋    12元","pg");
        Tie xl=new Tie("香辣鸭肠套餐    12元","xl");
        Tie qd=new Tie("秋刀鱼套餐      11元","qd");
        Tie pj=new Tie("培根卷心菜      10元","pj");
        Tie jz=new Tie("金针菇牛柳      14元","jz");
        Tie ll=new Tie("香煎龙利鱼      14元","ll");
        Tie jb=new Tie("酱爆鱿鱼        14元","jb");
        Tie sb=new Tie("松板肉套餐      13元","sb");
        Tie hj=new Tie("黑椒猪排        13元","hj");
        Tie bl=new Tie("菠萝脆皮鸡      13元","bl");
        Tie hx=new Tie("海鲜乌冬面      13元","hx");
        Tie jl=new Tie("黑椒鸡柳套餐    12元","jl");
        Tie zs=new Tie("赠送汤、卤蛋","zs");
        tieList.add(xj);
        tieList.add(yc);
        tieList.add(pg);
        tieList.add(xl);
        tieList.add(qd);
        tieList.add(pj);
        tieList.add(jz);
        tieList.add(ll);
        tieList.add(jb);
        tieList.add(sb);
        tieList.add(hj);
        tieList.add(bl);
        tieList.add(hx);
        tieList.add(jl);
        tieList.add(zs);
    }
}
