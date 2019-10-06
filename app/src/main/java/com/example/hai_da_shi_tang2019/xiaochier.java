package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class xiaochier extends AppCompatActivity {
private List<Xiaoer>xiaoerList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaochier);
        xiaoerInit();
        XiaoerAdapter adapter=new XiaoerAdapter(xiaochier.this,R.layout.xiaoer_item,xiaoerList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Xiaoer fo = xiaoerList.get(i);
                Intent intent = new Intent();
                switch (fo.getNiching()) {
                    case "ld": intent.setClass(xiaochier.this,lu_dou.class);
                        break;
                    case "df": intent.setClass(xiaochier.this,lu_dou_fu.class);
                        break;
                    case "ly": intent.setClass(xiaochier.this,lu_ya_tou.class);
                        break;
                    case "lj": intent.setClass(xiaochier.this,lu_ji_zhua.class);
                        break;
                    case "yz": intent.setClass(xiaochier.this,lu_ya_zhua.class);
                        break;
                    case "jt": intent.setClass(xiaochier.this,lu_ji_tui.class);
                        break;
                    case "yt": intent.setClass(xiaochier.this,lu_ya_tui.class);
                        break;
                    case "zt": intent.setClass(xiaochier.this,lu_zhu_ti.class);
                        break;
    }startActivity(intent);
            }

        });}
    public void xiaoerInit(){
        Xiaoer ld=new Xiaoer("卤蛋             2元","ld");
        Xiaoer df=new Xiaoer("卤豆腐           2元","df");
        Xiaoer ly=new Xiaoer("卤鸭头（2只）   5元","ly");
        Xiaoer lj=new Xiaoer("卤鸡爪（3只）   5元","lj");
        Xiaoer yz=new Xiaoer("卤鸭爪（2只）   5元","yz");
        Xiaoer jt=new Xiaoer("卤鸡腿           5元","jt");
        Xiaoer yt=new Xiaoer("卤鸭腿           6元","yt");
        Xiaoer zt=new Xiaoer("卤猪蹄          12元","zt");
        xiaoerList.add(ld);
        xiaoerList.add(df);
        xiaoerList.add(ly);
        xiaoerList.add(lj);
        xiaoerList.add(yz);
        xiaoerList.add(jt);
        xiaoerList.add(yt);
        xiaoerList.add(zt);
    }
}
