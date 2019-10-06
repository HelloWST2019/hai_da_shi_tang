package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class xiaochi extends AppCompatActivity {
private List<Xiao>xiaoList= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaochi);
        xiaoInit();
        XiaoAdapter adapter=new XiaoAdapter(xiaochi.this,R.layout.xiao_item,xiaoList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Xiao fo = xiaoList.get(i);
                Intent intent = new Intent();
                switch (fo.getNiching()) {
                    case "sh": intent.setClass(xiaochi.this,shang_hai_qiang_bing.class);
                        break;
                    case "cy": intent.setClass(xiaochi.this,cong_you_bing.class);
                        break;
                    case "jj": intent.setClass(xiaochi.this,jian_bing.class);
                        break;
                    case "xh": intent.setClass(xiaochi.this,hun_tun.class);
                        break;
                    case "gt": intent.setClass(xiaochi.this,guo_tie.class);
                        break;
                    case "sj": intent.setClass(xiaochi.this,sheng_jian.class);
                        break;
                    case "sx": intent.setClass(xiaochi.this,shang_hai_xiao_long_bao.class);
                        break;
                    case "rj": intent.setClass(xiaochi.this,shan_xi_rou_jia_mo.class);
                        break;
                    case "qj": intent.setClass(xiaochi.this,qing_jiao_rou_si_bing.class);
                        break;
                    case "zm": intent.setClass(xiaochi.this,zhi_ma_tian_su_bing.class);
                        break;
                    case "jd": intent.setClass(xiaochi.this,ji_dan_huo_tui_bing.class);
                        break;
                    case "dj": intent.setClass(xiaochi.this,ji_dan_jiu_cai_bing.class);
                        break;
    }startActivity(intent);
            }

        });}
    public void xiaoInit(){
        Xiao sh=new Xiao("上海炝饼      3元/份","sh");
        Xiao cy=new Xiao("葱油饼        2元/个","cy");
        Xiao jj=new Xiao("煎饺          5元/份","jj");
        Xiao xh=new Xiao("小馄饨        5元/份\n大馄饨        8元/份","xh");
        Xiao gt=new Xiao("锅贴          4元/两","gt");
        Xiao sj=new Xiao("生煎          4元/两","sj");
        Xiao sx=new Xiao("上海小笼包    6元/笼","sx");
        Xiao rj=new Xiao("陕西肉夹馍    5元/个","rj");
        Xiao qj=new Xiao("青椒肉丝饼  3.5元/个","qj");
        Xiao zm=new Xiao("芝麻甜酥饼    3元/个","zm");
        Xiao jd=new Xiao("鸡蛋火腿饼    3元/个","jd");
        Xiao dj=new Xiao("鸡蛋韭菜饼  2.5元/个","dj");
        xiaoList.add(sh);
        xiaoList.add(cy);
        xiaoList.add(jj);
        xiaoList.add(xh);
        xiaoList.add(gt);
        xiaoList.add(sj);
        xiaoList.add(sx);
        xiaoList.add(rj);
        xiaoList.add(qj);
        xiaoList.add(zm);
        xiaoList.add(jd);
        xiaoList.add(dj);
    }
}
