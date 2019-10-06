package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class shaola extends AppCompatActivity {
    private List<Shao>shaoList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shaola);
        shaoInit();
        ShaoAdapter adapter=new ShaoAdapter(shaola.this,R.layout.shao_item,shaoList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Shao fo = shaoList.get(i);
                Intent intent = new Intent();
                switch (fo.getNiching()) {
                    case "gl": intent.setClass(shaola.this,gu_li_shao_ya_fan.class);
                        break;
                    case "mg": intent.setClass(shaola.this,mei_gui_you_ji_fan.class);
                        break;
                    case "mz": intent.setClass(shaola.this,mi_zhi_cha_shao_fan.class);
                        break;
                    case "ls": intent.setClass(shaola.this,lu_shui_shun_fen_fan.class);
                        break;
                    case "sj": intent.setClass(shaola.this,shen_jing_shao_e_fan.class);
                        break;
                    case "sl": intent.setClass(shaola.this,shan_lin_hong_chang_fan.class);
                        break;
                    case "am": intent.setClass(shaola.this,ao_men_shao_rou_fan.class);
                        break;
                    case "jt": intent.setClass(shaola.this,lu_shui_ji_tui_fan.class);
                        break;
                    case "zt": intent.setClass(shaola.this,lu_shui_zhu_ti_fan.class);
                        break;
                    case "yt": intent.setClass(shaola.this,gu_li_shao_ya_fan.class);
                        break;
                    case "lw": intent.setClass(shaola.this,lu_wu_hua_rou_fan.class);
                        break;
                    case "sn": intent.setClass(shaola.this,lu_shui_niu_jian_fan.class);
                        break;
    }startActivity(intent);
            }

        });}
    public void shaoInit(){
        Shao gl=new Shao("谷立烧鸭饭     14元","gl");
        Shao mg=new Shao("玫瑰油鸡饭     14元","mg");
        Shao mz=new Shao("蜜汁叉烧饭     15元","mz");
        Shao ls=new Shao("卤水顺风饭     17元","ls");
        Shao sj=new Shao("深井烧鹅饭     22元","sj");
        Shao sl=new Shao("山林红肠饭     12元","sl");
        Shao am=new Shao("澳门烧肉饭     17元","am");
        Shao jt=new Shao("卤水鸡腿饭     12元","jt");
        Shao zt=new Shao("卤水猪蹄饭     17元","zt");
        Shao yt=new Shao("卤水鸭腿饭     13元","yt");
        Shao lw=new Shao("卤五花肉饭     15元","lw");
        Shao sn=new Shao("卤水牛腱饭     20元","sn");
        shaoList.add(gl);
        shaoList.add(mg);
        shaoList.add(mz);
        shaoList.add(ls);
        shaoList.add(sj);
        shaoList.add(sl);
        shaoList.add(am);
        shaoList.add(jt);
        shaoList.add(zt);
        shaoList.add(yt);
        shaoList.add(lw);
        shaoList.add(sn);
    }
}
