package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class huotui extends AppCompatActivity {
    private List<Huo>huoList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huotui);
        huoInit();
        HuoAdapter adapter=new HuoAdapter(huotui.this,R.layout.huo_item,huoList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Huo fo = huoList.get(i);
                Intent intent = new Intent();
                switch (fo.getNiching()) {
                    case "lj": intent.setClass(huotui.this,li_ji_bao_chao_fan.class);
                        break;
                    case "ys": intent.setClass(huotui.this,yue_shi_huo_tui_chao_fan.class);
                        break;
                    case "ml": intent.setClass(huotui.this, ma_la_ji_si_chao_fan.class);
                        break;
                    case "rs": intent.setClass(huotui.this, rou_si_bao_chao_fan.class);
                        break;
                    case "pg": intent.setClass(huotui.this, pei_gen_chao_fan.class);
                        break;
                    case "lg": intent.setClass(huotui.this, lao_gan_ma_niu_rou_chao_fan.class);
                        break;
                    case "xr": intent.setClass(huotui.this, xia_ren_dan_chao_fan.class);
                        break;
                    case "hy": intent.setClass(huotui.this, hao_you_dan_chao_fan.class);
                        break;
                }
                    startActivity(intent);
                }
            });}
    public void huoInit(){
        Huo lj=new Huo("里脊爆炒饭       9元","lj");
        Huo ys=new Huo("粤式火腿炒饭    10元","ys");
        Huo ml=new Huo("麻辣鸡丝炒饭     8元","ml");
        Huo rs=new Huo("肉丝爆炒饭       8元","rs");
        Huo pg=new Huo("培根炒饭        10元","pg");
        Huo lg=new Huo("老干妈牛肉炒饭  10元","lg");
        Huo xr=new Huo("虾仁蛋炒饭      10元","xr");
        Huo hy=new Huo("蚝油蛋炒饭       7元\n以上均有（面/河粉），另加 培根3元，牛肉3元，里脊2元，火腿2元，肉丝2元，鸡丝2元，鸡蛋1.5元","hy");
        huoList.add(lj);
        huoList.add(ys);
        huoList.add(ml);
        huoList.add(rs);
        huoList.add(pg);
        huoList.add(lg);
        huoList.add(xr);
        huoList.add(hy);
    }
}
