package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Tie_ban_dan_bao_fan extends AppCompatActivity {
private String[]data={"蛋包饭是日本一种比较普通且很受青睐的主食，由蛋皮包裹炒饭而成的菜肴。一般是将鸡蛋煎成厚薄均匀的蛋皮，再放上炒好的炒饭、韩式辣椒酱、番茄酱、色拉油和其他各种材料包好制成。 蛋包饭不论是在韩国，日本或台湾，都是相当受到欢迎的料理，不只是一道家庭料理，也有餐厅供应，甚至还有专卖店专卖。在中国大陆地区也有部分餐厅出售。\n"+
"铁板是西式烹调方法；即指食物“走油”后，连同以洋葱为主的香料料头和汁酱，放入烧至极热的铁板中致熟和致令食物喷香的烹调方法。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tie_ban_dan_bao_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(Tie_ban_dan_bao_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
