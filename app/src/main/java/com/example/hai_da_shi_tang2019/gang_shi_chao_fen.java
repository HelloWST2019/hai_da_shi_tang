package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class gang_shi_chao_fen extends AppCompatActivity {
private String[]data={"炒粉是江西省地方传统名点，是将粉放热水中过一下，然后将粉放入油锅里通过明火翻炒，放入酱油、辣椒粉、葱、鸡蛋、青菜等配料，有米的醇香和爆炒的煎炸味道。这是一道风味独特饮食，方便容易制作，可做正餐使用。同类的还有炒面。\n" +
        "江西是鱼米之乡，盛产大米，因此也有很多大米做的食品，其中米粉是老百姓日常主食，炒粉是江西人除去正餐，日常最爱食用的快餐。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gang_shi_chao_fen);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(gang_shi_chao_fen.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
