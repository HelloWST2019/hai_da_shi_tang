package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class li_ji_bao_chao_fan extends AppCompatActivity {
private String[]data={"里脊是牛、羊、猪等脊椎骨两侧的嫩肉 。猪里脊是猪脊椎骨内侧的条状嫩肉。大里脊和小里脊，大里脊就是大排骨相连的瘦肉外侧有筋覆盖，通常吃的大排去骨后就是里脊肉，小里脊是脊椎骨内侧一条肌肉，比较少，很嫩。\n" +
        "猪肉是目前人们餐桌上重要的动物性食品之一，肉质较嫩，易消化。猪里脊又分外脊和里脊。处在脊背位置，脊背上面的是外脊，贯穿整个脊背，所以又称为通脊、扁担肉、硬脊，是较嫩的瘦肉；里脊位于外脊下侧，从腰子到分水骨之间的一条肉，呈长条圆形，一头稍细，是最嫩的肉。由于里脊分量太少，做菜时往往用外脊替代里脊。\n" +
        ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_li_ji_bao_chao_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(li_ji_bao_chao_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
