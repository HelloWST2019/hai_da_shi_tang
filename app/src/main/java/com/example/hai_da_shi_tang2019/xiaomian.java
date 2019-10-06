package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class xiaomian extends AppCompatActivity {
    private List<Chong>chongList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomian);
        chongInit();
        ChongAdapter adapter=new ChongAdapter(xiaomian.this,R.layout.chong_item,chongList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Chong fo = chongList.get(i);
                Intent intent = new Intent();
                switch (fo.getNiching()) {
                    case "cq": intent.setClass(xiaomian.this,chong_qing_xiao_mian.class);
                        break;
                    case "zm": intent.setClass(xiaomian.this,zhi_ma_jiang_ban_mian.class);
                        break;
                    case "xg": intent.setClass(xiaomian.this,xiang_gu_dun_ji_mian.class);
                        break;
                    case "xh": intent.setClass(xiaomian.this,xi_hong_shi_ji_dan_mian.class);
                        break;
                    case "qs": intent.setClass(xiaomian.this,qi_shan_sao_zi_mian.class);
                        break;
                    case "kz": intent.setClass(xiaomian.this,hang_zhou_pian_chuan_mian.class);
                        break;
                    case "sx": intent.setClass(xiaomian.this,san_xian_mian.class);
                        break;
                    case "zj": intent.setClass(xiaomian.this,zha_jiang_mian.class);
                        break;
                    case "rl": intent.setClass(xiaomian.this,xiang_gu_rou_lu_mian.class);
                        break;
                    case "jd": intent.setClass(xiaomian.this,ji_ding_mian.class);
                        break;
                    case "pg": intent.setClass(xiaomian.this,hong_shao_pai_gu_mian.class);
                        break;
                    case "nn": intent.setClass(xiaomian.this,hong_shao_niu_nan_mian.class);
                        break;
                    case "zb": intent.setClass(xiaomian.this,zi_bu_niu_rou_dao_xiao_mian.class);
                        break;
                    case "ml": intent.setClass(xiaomian.this,ma_la_shan_ding_ban_mian.class);
                        break;
    }startActivity(intent);
            }

        });}
    public void chongInit(){
        Chong cq=new Chong("重庆小面        10元","cq");
        Chong zm=new Chong("芝麻酱拌面       9元","zm");
        Chong xg=new Chong("香菇炖鸡面      12元","xg");
        Chong xh=new Chong("西红柿鸡蛋面     9元","xh");
        Chong qs=new Chong("岐山臊子面      11元","qs");
        Chong kz=new Chong("杭州片儿川面    10元","kz");
        Chong sx=new Chong("三鲜面           9元","sx");
        Chong zj=new Chong("炸酱面           9元","zj");
        Chong rl=new Chong("香菇肉卤面       9元","rl");
        Chong jd=new Chong("鸡丁面           9元","jd");
        Chong pg=new Chong("红烧排骨面      13元","pg");
        Chong nn=new Chong("红烧牛腩面      13元","nn");
        Chong zb=new Chong("滋补牛肉刀削面  13元","zb");
        Chong ml=new Chong("麻辣三丁拌面     9元","ml");
        chongList.add(cq);
        chongList.add(zm);
        chongList.add(xg);
        chongList.add(xh);
        chongList.add(qs);
        chongList.add(kz);
        chongList.add(sx);
        chongList.add(zj);
        chongList.add(rl);
        chongList.add(jd);
        chongList.add(pg);
        chongList.add(nn);
        chongList.add(zb);
        chongList.add(ml);
    }
}
