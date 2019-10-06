package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class shuijiao extends AppCompatActivity {
private List<Shui>shuiList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shuijiao);
        shuiInit();
        ShuiAdapter adapter=new ShuiAdapter(shuijiao.this,R.layout.shui_item,shuiList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Shui fo = shuiList.get(i);
                Intent intent = new Intent();
                switch (fo.getNiching()) {
                    case "xr": intent.setClass(shuijiao.this,xian_rou_shui_jiao.class);
                        break;
                    case "jc": intent.setClass(shuijiao.this,jiu_cai_xian_rou_shui_jiao.class);
                        break;
                    case "bc": intent.setClass(shuijiao.this,bai_cai_xian_rou_shui_jiao.class);
                        break;
                    case "qc": intent.setClass(shuijiao.this,qin_cai_xian_rou_shui_jiao.class);
                        break;
    }startActivity(intent);
            }

        });}
    public void shuiInit(){
        Shui xr=new Shui("鲜肉水饺       8元/2两","xr");
        Shui jc=new Shui("韭菜鲜肉水饺  2.5元/两","jc");
        Shui bc=new Shui("白菜鲜肉水饺  2.5元/两","bc");
        Shui qc=new Shui("芹菜鲜肉水饺  2.5元/两","qc");
        shuiList.add(xr);
        shuiList.add(jc);
        shuiList.add(bc);
        shuiList.add(qc);
    }
}
