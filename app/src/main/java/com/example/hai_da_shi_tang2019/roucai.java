package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class roucai extends AppCompatActivity {
    private List<Rou>rouList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roucai);
        rouInit();
        RouAdapter adapter=new RouAdapter(roucai.this,R.layout.rou_item,rouList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Rou fo = rouList.get(i);
                Intent intent = new Intent();
                switch (fo.getNiching()) {
                    case "qj": intent.setClass(roucai.this,qing_jiao_gan_si_rou_si.class);
                        break;
                    case "qc": intent.setClass(roucai.this,qin_cai_rou_si.class);
                        break;
                    case "gs": intent.setClass(roucai.this,qin_cai_gan_si_rou_si.class);
                        break;
                    case "hf": intent.setClass(roucai.this,huang_fei_hong_xiang_su_xia.class);
                        break;
                    case "xg": intent.setClass(roucai.this,xiang_gu_hua_ji.class);
                        break;
                    case "xr": intent.setClass(roucai.this,xia_ren_hui_dou_fu.class);
                        break;
                    case "gl": intent.setClass(roucai.this,ga_li_niu_rou.class);
                        break;
                    case "ss": intent.setClass(roucai.this,su_shi_jin.class);
                        break;
                    case "jg": intent.setClass(roucai.this,jun_gu_rou_pian.class);
                        break;
                    case "fc": intent.setClass(roucai.this,fei_cui_yu_wan_miao_mu_er.class);
                        break;
                    case "jb": intent.setClass(roucai.this,jiang_bao_tuo_tuo_rou.class);
                        break;
                    case "dj": intent.setClass(roucai.this,duo_jiao_tuo_tuo_rou.class);
                        break;
                    case "gc": intent.setClass(roucai.this,jun_gu_chao_tuo_tuo_rou.class);
                        break;
                    case "lz": intent.setClass(roucai.this,huang_fei_hong_la_zi_ji.class);
                        break;
                    case "nl": intent.setClass(roucai.this,jun_gu_chao_niu_liu.class);
                        break;
                    case "jk": intent.setClass(roucai.this,hong_shao_ji_kuai.class);
                        break;
                    case "lj": intent.setClass(roucai.this,ga_li_ji_kuai.class);
                        break;
                    case "jy": intent.setClass(roucai.this,jiao_yan_ya.class);
                        break;
                    case "nj": intent.setClass(roucai.this,nong_jia_xiao_chao_rou.class);
                        break;
                    case "lw": intent.setClass(roucai.this,la_wei_ji_ding.class);
                        break;
                    case "gb": intent.setClass(roucai.this,gong_bao_ji_ding.class);
                        break;
                    case "hg": intent.setClass(roucai.this,hui_guo_rou.class);
                        break;
                    case "yx": intent.setClass(roucai.this,yu_xiang_qie_zi.class);
                        break;
                    case "mp": intent.setClass(roucai.this,ma_po_dou_fu.class);
                        break;
                    case "jc": intent.setClass(roucai.this,jiu_cai_chao_dan.class);
                        break;
                    case "jr": intent.setClass(roucai.this,qing_jiao_rou_si.class);
                        break;
                    case "jd": intent.setClass(roucai.this,qing_jiao_chao_dan.class);
                        break;
                    case "fq": intent.setClass(roucai.this,fan_qie_chao_dan.class);
                        break;
                    case "yr": intent.setClass(roucai.this,yu_xiang_rou_si.class);
                        break;
                    case "sl": intent.setClass(roucai.this,suan_la_tu_dou_si.class);
                        break;
                    case "sb": intent.setClass(roucai.this,shou_si_bao_cai.class);
                        break;
                    case "js": intent.setClass(roucai.this,jin_zhen_gu_rou_si.class);
                        break;
                    case "xh": intent.setClass(roucai.this,xia_ren_hui_dan.class);
                        break;
                    case "rh": intent.setClass(roucai.this,rou_si_hui_dan.class);
                        break;
                    case "mx": intent.setClass(roucai.this,mu_xu_rou.class);
                        break;
                    case "hn": intent.setClass(roucai.this,hong_shao_niu_rou_guo_zai.class);
                        break;
                    case "an": intent.setClass(roucai.this,hao_you_niu_rou.class);
                        break;
                    case "hj": intent.setClass(roucai.this,hang_jiao_niu_liu.class);
                        break;
                    case "pt": intent.setClass(roucai.this,pai_tiao.class);
                        break;


    }
                startActivity(intent);
            }

        });}
    public void rouInit(){
        Rou qj=new Rou("青椒干丝肉丝    12元","qj");
        Rou qc=new Rou("芹菜肉丝        12元","qc");
        Rou gs=new Rou("芹菜干丝肉丝    12元","gs");
        Rou hf=new Rou("黄飞鸿香酥虾    16元","hf");
        Rou xg=new Rou("香菇滑鸡        14元","xg");
        Rou xr=new Rou("虾仁烩豆腐      12元","xr");
        Rou gl=new Rou("咖喱牛肉        15元","gl");
        Rou ss=new Rou("素什锦          10元","ss");
        Rou jg=new Rou("菌菇肉片        12元","jg");
        Rou fc=new Rou("翡翠鱼丸炒木耳  12元","fc");
        Rou jb=new Rou("酱爆乇乇肉      13元","jb");
        Rou dj=new Rou("剁椒乇乇肉      13元","dj");
        Rou gc=new Rou("菌菇炒乇乇肉    13元","gc");
        Rou lz=new Rou("黄飞鸿辣子鸡    14元","lz");
        Rou nl=new Rou("菌菇炒牛柳      15元","nl");
        Rou jk=new Rou("红烧鸡块        13元","jk");
        Rou lj=new Rou("咖喱鸡块        13元","lj");
        Rou jy=new Rou("椒盐鸭          12元","jy");
        Rou nj=new Rou("农家小炒肉      11元","nj");
        Rou lw=new Rou("辣味鸡丁        11元","lw");
        Rou gb=new Rou("宫保鸡丁        11元","gb");
        Rou hg=new Rou("回锅肉          11元","hg");
        Rou yx=new Rou("鱼香茄子        11元","yx");
        Rou mp=new Rou("麻婆豆腐         8元","mp");
        Rou jc=new Rou("韭菜炒蛋         8元","jc");
        rouList.add(qj);
        rouList.add(qc);
        rouList.add(gs);
        rouList.add(hf);
        rouList.add(xg);
        rouList.add(xr);
        rouList.add(gl);
        rouList.add(ss);
        rouList.add(jg);
        rouList.add(fc);
        rouList.add(jb);
        rouList.add(dj);
        rouList.add(gc);
        rouList.add(lz);
        rouList.add(nl);
        rouList.add(jk);
        rouList.add(lj);
        rouList.add(jy);
        rouList.add(nj);
        rouList.add(lw);
        rouList.add(gb);
        rouList.add(hg);
        rouList.add(yx);
        rouList.add(mp);
        rouList.add(jc);
        Rou jr=new Rou("青椒肉丝         9元","jr");
        Rou jd=new Rou("青椒炒蛋         9元","jd");
        Rou fq=new Rou("番茄炒蛋         9元","fq");
        Rou yr=new Rou("鱼香肉丝         9元","yr");
        Rou sl=new Rou("酸辣土豆丝       9元","sl");
        Rou sb=new Rou("手撕包菜         9元","sb");
        Rou js=new Rou("金针菇肉丝      11元","js");
        Rou xh=new Rou("虾仁烩蛋        12元","xh");
        Rou rh=new Rou("肉丝烩蛋        12元","rh");
        Rou mx=new Rou("木须肉          12元","mx");
        Rou hn=new Rou("红烧牛肉        15元","hn");
        Rou an=new Rou("蚝油牛肉        15元","an");
        Rou hj=new Rou("杭椒牛柳        14元","hj");
        Rou pt=new Rou("排条            13元","pt");
        rouList.add(jr);
        rouList.add(jd);
        rouList.add(fq);
        rouList.add(yr);
        rouList.add(sl);
        rouList.add(sb);
        rouList.add(js);
        rouList.add(xh);
        rouList.add(rh);
        rouList.add(mx);
        rouList.add(hn);
        rouList.add(an);
        rouList.add(hj);
        rouList.add(pt);
    }

}
