package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class mifan extends AppCompatActivity {
private List<mi>miList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mifan);
        init_Mifan();
        miAdapter adapter=new miAdapter(mifan.this,R.layout.mi_item,miList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mi fo = miList.get(i);
                Intent intent = new Intent();
                switch (fo.getNicheng()) {
                    case "sd": intent.setClass(mifan.this, douya.class);
                        break;
                    case "sj": intent.setClass(mifan.this, juanxin.class);
                        break;
                    case "yd": intent.setClass(mifan.this, dougua.class);
                        break;
                    case "sg": intent.setClass(mifan.this, donggua.class);
                        break;
                    case "ww": intent.setClass(mifan.this, wawa.class);
                        break;
                    case "sh": intent.setClass(mifan.this, suanhuang.class);
                        break;
                    case "me": intent.setClass(mifan.this, mu_er_qing_cai.class);
                        break;
                    case "xy": intent.setClass(mifan.this, xi_yu_rou_chuan.class);
                        break;
                    case "qg": intent.setClass(mifan.this, qing_gua_chao_dan.class);
                        break;
                    case "fq": intent.setClass(mifan.this, fan_qie_chao_dan.class);
                        break;
                    case "jc": intent.setClass(mifan.this, jiu_cai_chao_dan.class);
                        break;
                    case "sc": intent.setClass(mifan.this, su_chao_hai_dai_jie.class);
                        break;
                    case "ss": intent.setClass(mifan.this, san_se_yu_mi.class);
                        break;
                    case "ws": intent.setClass(mifan.this, wo_sun_chao_rou_pian.class);
                        break;
                    case "hj": intent.setClass(mifan.this, hei_jiao_ji_kuai.class);
                        break;
                    case "hc": intent.setClass(mifan.this, hua_cai_chao_rou.class);
                        break;
                    case "kf": intent.setClass(mifan.this, kao_fu_niu_rou.class);
                        break;
                    case "lz": intent.setClass(mifan.this, la_zi_ji_kuai.class);
                        break;
                    case "jm": intent.setClass(mifan.this, jiao_ma_ji.class);
                        break;
                    case "hs": intent.setClass(mifan.this, hong_shao_yu.class);
                        break;
                    case "hl": intent.setClass(mifan.this, huang_jin_ji_liu.class);
                        break;
                    case "zm": intent.setClass(mifan.this, zhi_ma_niu_rou_wan.class);
                        break;
                    case "kj": intent.setClass(mifan.this, kao_ji_tui.class);
                        break;
                    case "wx": intent.setClass(mifan.this, wu_xiang_ya.class);
                        break;
                    case "hz": intent.setClass(mifan.this, hong_shao_qie_zi.class);
                        break;
                    case "ky": intent.setClass(mifan.this, kao_ya_tui.class);
                        break;
                    case "xl": intent.setClass(mifan.this, xiang_la_ji.class);
                        break;
                    case "td": intent.setClass(mifan.this, tu_dou_niu_rou.class);
                        break;
                    case "cb": intent.setClass(mifan.this, cong_bao_niu_rou.class);
                        break;
                    case "yr": intent.setClass(mifan.this, yang_rou_shou_zhua_fan.class);
                        break;
                }
                startActivity(intent);
            }
        });
    }
private void init_Mifan()
{
    mi sd=new mi("素炒豆芽      1.5元","sd");
    mi sj=new mi("素炒卷心菜    1.5元","sj");
    mi yd=new mi("原味豆瓜      2.0元","yd");
    mi sg=new mi("素炒冬瓜      2.0元","sg");
    mi ww=new mi("娃娃菜        2.0元","ww");
    mi sh=new mi("蒜泥黄瓜      2.0元","sh");
    mi me=new mi("木耳青菜      2.0元","me");
    mi xy=new mi("西域肉串      2.5元","xy");
    mi qg=new mi("青瓜炒蛋      2.5元","qg");
    mi fq=new mi("番茄炒蛋      2.5元","fq");
    mi jc=new mi("韭菜炒蛋      2.5元","jc");
    mi sc=new mi("素炒海带结    2.5元","sc");
    mi ss=new mi("三色玉米      3.0元","ss");
    mi ws=new mi("莴笋炒肉片    3.5元","ws");
    mi hj=new mi("黑椒鸡块      4.0元","hj");
    mi hc=new mi("花菜炒肉      4.0元","hc");
    mi kf=new mi("烤麸牛肉      4.0元","kf");
    mi lz=new mi("辣子鸡块      5.0元","lz");
    mi jm=new mi("椒麻鸡        5.0元","jm");
    mi hs=new mi("红烧鱼        5.0元","hs");
    mi hl=new mi("黄金鸡柳      5.0元","hl");
    mi zm=new mi("芝麻牛肉丸    5.0元","zm");
    mi kj=new mi("烤鸡腿        5.0元","kj");
    mi wx=new mi("五香鸭        5.0元","wx");
    mi hz=new mi("红烧茄子      5.0元","hz");
    mi ky=new mi("烤鸭腿        6.0元","ky");
    mi xl=new mi("香辣鸡        6.0元","xl");
    mi td=new mi("土豆牛肉      6.0元","td");
    mi cb=new mi("葱爆牛肉      6.0元","cb");
    mi yr=new mi("羊肉手抓饭    3元/两","yr");
    miList.add(sc);
    miList.add(sd);
    miList.add(sg);
    miList.add(sh);
    miList.add(sj);
    miList.add(ss);
    miList.add(jc);
    miList.add(jm);
    miList.add(kf);
    miList.add(hj);
    miList.add(kj);
    miList.add(ky);
    miList.add(ws);
    miList.add(ww);
    miList.add(wx);
    miList.add(td);
    miList.add(cb);
    miList.add(yd);
    miList.add(yr);
    miList.add(xl);
    miList.add(xy);
    miList.add(zm);
    miList.add(lz);
    miList.add(me);
    miList.add(qg);
    miList.add(hc);
    miList.add(hl);
    miList.add(hs);
    miList.add(hz);
    miList.add(fq);
}
}
