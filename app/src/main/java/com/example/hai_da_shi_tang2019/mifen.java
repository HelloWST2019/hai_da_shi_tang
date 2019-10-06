package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class mifen extends AppCompatActivity {
private List<Fen>fenList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mifen);
        fenInit();
        FenAdapter adapter=new FenAdapter(mifen.this,R.layout.fen_item,fenList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Fen fo = fenList.get(i);
                Intent intent = new Intent();
                switch (fo.getNiching()) {
                    case "kw": intent.setClass(mifen.this, kai_wei_suan_la_fen.class);
                        break;
                    case "gt": intent.setClass(mifen.this, gao_tang_shi_jin_fen.class);
                        break;
                    case "fq": intent.setClass(mifen.this, fan_qie_dan_fen.class);
                        break;
                    case "ml": intent.setClass(mifen.this, ma_la_ji_fen.class);
                        break;
                    case "lr": intent.setClass(mifen.this, la_rou_gan_ban_fen.class);
                        break;
                    case "gs": intent.setClass(mifen.this, gang_shi_ban_fen.class);
                        break;
                    case "sx": intent.setClass(mifen.this, san_xian_tang_fen.class);
                        break;
                    case "lz": intent.setClass(mifen.this, la_zi_ji_fen.class);
                        break;
                    case "sl": intent.setClass(mifen.this, suan_la_sun_jian_fen.class);
                        break;
                    case "gy": intent.setClass(mifen.this, gang_shi_yun_tun_fen.class);
                        break;
                    case "cf": intent.setClass(mifen.this, gang_shi_chao_fen.class);
                        break;
                    case "js": intent.setClass(mifen.this, ji_si_fen.class);
                        break;
                    case "yw": intent.setClass(mifen.this, yu_wan_fen.class);
                        break;
                    case "sd": intent.setClass(mifen.this, suan_dou_jiao_rou_si_tang.class);
                        break;
                    case "nw": intent.setClass(mifen.this, niu_wan_fen.class);
                        break;
                    case "rf": intent.setClass(mifen.this, hong_shao_niu_rou_fen.class);
                        break;
                    case "zb": intent.setClass(mifen.this, zhang_zhong_bao_fen.class);
                        break;
                    case "xg": intent.setClass(mifen.this, xiang_gu_rou_pian_fen.class);
                        break;
                    case "td": intent.setClass(mifen.this, tu_dou_fen.class);
                        break;
    }startActivity(intent);
            }

        });}
    public void fenInit(){
        Fen kw=new Fen("开胃酸辣粉       8元","kw");
        Fen gt=new Fen("高汤什锦粉       8元","gt");
        Fen fq=new Fen("番茄蛋粉         9元","fq");
        Fen ml=new Fen("麻辣鸡粉        10元","ml");
        Fen lr=new Fen("辣肉干拌粉      12元","lr");
        Fen gs=new Fen("港式拌粉         9元","gs");
        Fen sx=new Fen("三鲜汤粉        12元","sx");
        Fen lz=new Fen("辣子鸡粉        12元","lz");
        Fen sl=new Fen("酸辣笋尖粉      12元","sl");
        Fen gy=new Fen("港式云吞粉      12元","gy");
        fenList.add(kw);
        fenList.add(gt);
        fenList.add(fq);
        fenList.add(ml);
        fenList.add(lr);
        fenList.add(gs);
        fenList.add(sx);
        fenList.add(lz);
        fenList.add(sl);
        fenList.add(gy);
        Fen cf=new Fen("港式炒饭        12元","cf");
        Fen js=new Fen("鸡丝粉          12元","js");
        Fen yw=new Fen("鱼丸粉          12元","yw");
        Fen sd=new Fen("酸豆角肉丝粉    12元","sd");
        Fen nw=new Fen("牛丸粉          12元","nw");
        Fen rf=new Fen("红烧牛肉粉      12元","rf");
        Fen zb=new Fen("掌中宝粉        12元","zb");
        Fen xg=new Fen("香菇肉片粉      12元","xg");
        Fen td=new Fen("土豆粉          12元","td");
        fenList.add(cf);
        fenList.add(js);
        fenList.add(fq);
        fenList.add(yw);
        fenList.add(sd);
        fenList.add(nw);
        fenList.add(rf);
        fenList.add(zb);
        fenList.add(xg);
        fenList.add(td);
    }
}
