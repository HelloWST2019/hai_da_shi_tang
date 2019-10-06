package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class shuang extends AppCompatActivity {
private List<Pin>pinList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shuang);
        pinInit();
        PinAdapter adapter=new PinAdapter(shuang.this,R.layout.pin_item,pinList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Pin fo = pinList.get(i);
                Intent intent = new Intent();
                switch (fo.getNiching()) {
                    case "sy": intent.setClass(shuang.this,gang_shi_shao_ya.class);
                        break;
                    case "cs": intent.setClass(shuang.this,mi_zhi_chao_sha.class);
                        break;
                    case "sf": intent.setClass(shuang.this,lu_shui_shun_feng.class);
                        break;
                    case "yj": intent.setClass(shuang.this,mei_gui_you_ji.class);
                        break;
                    case "hr": intent.setClass(shuang.this,lu_wu_hua_rou.class);
                        break;
    }startActivity(intent);
            }

        });}
    public void pinInit(){
        Pin sy=new Pin("港式烧鸭        6元","sy");
        Pin cs=new Pin("蜜汁叉烧        6元","cs");
        Pin sf=new Pin("卤水顺风        6元","sf");
        Pin yj=new Pin("玫瑰油鸡        6元","yj");
        Pin hr=new Pin("卤五花肉        6元","hr");
        pinList.add(sy);
        pinList.add(cs);
        pinList.add(sf);
        pinList.add(yj);
        pinList.add(hr);
    }
}
