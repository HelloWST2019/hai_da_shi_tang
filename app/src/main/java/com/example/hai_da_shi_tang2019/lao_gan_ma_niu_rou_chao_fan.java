package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class lao_gan_ma_niu_rou_chao_fan extends AppCompatActivity {
private String[]data={"老干妈（陶华碧）牌油制辣椒是贵州地区传统风味食品之一。近几十年来，一直沿用传统工艺精心酿造，具有优雅细腻，香辣突出，回味悠长等特点。是居家必备，馈赠亲友之良品。\n" +
        "1984年，陶华碧女士凭借自己独特的炒制工艺，推出了别具风味的佐餐调料，令广大顾客大饱口福，津津乐道。1996年批量生产后在全国迅速成为销售热点。老干妈是国内生产及销售量最大的辣椒制品生产企业，主要生产风味豆豉、风味鸡油辣椒、香辣菜、风味腐乳等20余个系列产品。在大多数国外购物网站上老干妈都直接译成\"Lao GanMa\"， 也有译成\"The godmother\"。\n" +
        "2012年7月，美国奢侈品电商Gilt 把老干妈奉为尊贵调味品，限时抢购价11.95美元两瓶（约7.74英镑，折合约79.1人民币元）。美国“老干妈”绝对算得上是“来自中国的进口奢侈品”。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lao_gan_ma_niu_rou_chao_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(lao_gan_ma_niu_rou_chao_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
