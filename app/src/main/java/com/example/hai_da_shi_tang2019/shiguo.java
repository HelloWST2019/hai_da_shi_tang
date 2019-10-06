package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class shiguo extends AppCompatActivity {
private List<Shi> shiList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shiguo);
        shiInit();
        ShiAdapter adapter=new ShiAdapter(shiguo.this,R.layout.shi_item,shiList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Shi fo = shiList.get(i);
                Intent intent = new Intent();
                switch (fo.getNiching()) {
                    case "pc": intent.setClass(shiguo.this,pao_cai_wu_hua_rou_shi_guo_fan.class);
                        break;
                    case "nr": intent.setClass(shiguo.this,pao_cai_niu_rou_shi_guo_ban_fan.class);
                        break;
                    case "jr": intent.setClass(shiguo.this,pao_cai_ji_rou_shi_guo_ban_fan.class);
                        break;
                    case "nn": intent.setClass(shiguo.this,niu_rou_shi_guo_ban_fan.class);
                        break;
                    case "wh": intent.setClass(shiguo.this,wu_hua_rou_shi_guo_ban_fan.class);
                        break;
                    case "yy": intent.setClass(shiguo.this,you_yu_shi_guo_ban_fan.class);
                        break;
                    case "pg": intent.setClass(shiguo.this,pei_gen_shi_guo_ban_fan.class);
                        break;
                    case "jj": intent.setClass(shiguo.this,ji_rou_shi_guo_ban_fan.class);
                        break;
                    case "pp": intent.setClass(shiguo.this,pao_cai_shi_guo_ban_fan.class);
                        break;
                    case "jz": intent.setClass(shiguo.this,jin_zhen_gu_shi_guo_ban_fan.class);
                        break;
                    case "ht": intent.setClass(shiguo.this,huo_tui_shi_guo_ban_fan.class);
                        break;
                    case "jk": intent.setClass(shiguo.this,jian_kang_shi_guo_ban_fan.class);
                        break;
                    case "df": intent.setClass(shiguo.this,dou_fu_tang_jia_yin_la_mian.class);
                        break;
                    case "pt": intent.setClass(shiguo.this,pao_cai_tang_jia_yin_la_mian.class);
                        break;
                    case "yw": intent.setClass(shiguo.this,you_yu_wu_hua_rou_shi_guo_ban_fan.class);
                        break;
                    case "cy": intent.setClass(shiguo.this,pao_cai_you_yu_shi_guo_ban_fan.class);
                        break;
                    case "mg": intent.setClass(shiguo.this,mo_gu_niu_rou_shi_guo_ban_fan.class);
                        break;
                    case "gj": intent.setClass(shiguo.this,mo_gu_ji_rou_shi_guo_ban_fan.class);
                        break;
                    case "gp": intent.setClass(shiguo.this,mo_gu_pei_gen_shi_guo_ban_fan.class);
                        break;
                    case "cp": intent.setClass(shiguo.this,pao_cai_pei_gen_shi_guo_ban_fan.class);
                        break;
    }startActivity(intent);
            }

        });}
    private void shiInit(){
        Shi pc=new Shi("泡菜五花肉石锅拌饭   14元","pc");
        Shi nr=new Shi("泡菜牛肉石锅拌饭     14元","nr");
        Shi jr=new Shi("泡菜鸡肉石锅拌饭     13元","jr");
        Shi nn=new Shi("牛肉石锅拌饭         13元","nn");
        Shi wh=new Shi("五花肉石锅拌饭       12元","wh");
        Shi yy=new Shi("鱿鱼石锅拌饭         12元","yy");
        Shi pg=new Shi("培根石锅拌饭         11元","pg");
        Shi jj=new Shi("鸡肉石锅拌饭         10元","jj");
        Shi pp=new Shi("泡菜石锅拌饭          9元","pp");
        Shi jz=new Shi("金针菇石锅拌饭        9元","jz");
        Shi ht=new Shi("火腿石锅拌饭          8元","ht");
        Shi jk=new Shi("健康石锅拌饭          7元","jk");
        Shi df=new Shi("豆腐汤加辛拉面       17元","df");
        Shi pt=new Shi("泡菜汤加辛拉面       15元","pt");
        Shi yw=new Shi("鱿鱼五花肉石锅拌饭   15元","yw");
        Shi cy=new Shi("泡菜鱿鱼石锅拌饭     14元","cy");
        Shi mg=new Shi("蘑菇牛肉石锅拌饭     14元","mg");
        Shi gj=new Shi("蘑菇鸡肉石锅拌饭     13元","gj");
        Shi gp=new Shi("蘑菇培根石锅拌饭     13元","gp");
        Shi cp=new Shi("泡菜培根石锅拌饭     14元","cp");
        shiList.add(pc);
        shiList.add(nr);
        shiList.add(jr);
        shiList.add(nn);
        shiList.add(wh);
        shiList.add(yy);
        shiList.add(pg);
        shiList.add(jj);
        shiList.add(pp);
        shiList.add(jz);
        shiList.add(ht);
        shiList.add(jk);
        shiList.add(df);
        shiList.add(pt);
        shiList.add(yw);
        shiList.add(cy);
        shiList.add(mg);
        shiList.add(gj);
        shiList.add(gp);
        shiList.add(cp);

    }
}
