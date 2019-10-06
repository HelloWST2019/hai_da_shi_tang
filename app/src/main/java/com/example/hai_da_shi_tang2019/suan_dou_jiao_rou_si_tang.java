package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class suan_dou_jiao_rou_si_tang extends AppCompatActivity {
    private String[]data={"酸豆角是以豆角为主要食材，猪肉馅、葱、姜、蒜、郫县辣酱、生抽、料酒、糖、食用油为辅料制作而成的家常菜，口味微辣。\n" +
            "豆角含有丰富的优质蛋白质、碳水化合物及多种维生素、微量元素等，可补充机体的招牌营养素。其中所含B族维生素能维持正常的消化腺分泌和胃肠道蠕动的功能，抑制胆碱酶活性，可帮助消化，增进食欲。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suan_dou_jiao_rou_si_tang);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(suan_dou_jiao_rou_si_tang.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
