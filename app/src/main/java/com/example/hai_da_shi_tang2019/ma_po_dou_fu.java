package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ma_po_dou_fu extends AppCompatActivity {
private String[]data={"麻婆豆腐（拼音：má pó dòu fǔ；英文：sauteed tofu in hot and spicy sauce），是四川省传统名菜之一，属于川菜。主要原料为配料和豆腐，材料主要有豆腐、牛肉末（也可以用猪肉）、辣椒和花椒等。麻来自花椒，辣来自辣椒，这道菜突出了川菜“麻辣”的特点。其口味独特，口感顺滑。\n" +
        "食用功效\n" +
        "1.此菜富含动植物蛋白质、钙、磷、铁、维生素及碳水化合物\n" +
        "，具有温中益气、补中生津、解毒润燥、补精添髓的功效。\n" +
        "2.此菜夏天食用能生津止渴、健脾，有利健身防病。麻婆豆腐也是高血压、高血脂、高胆固醇症及动脉硬化、冠心病患者的佳肴。\n" +
        "3.豆腐为补益、清热养生食品，常食补中益气，清热润燥，生津止渴，清洁肠胃，解毒化湿，更适于热生体质，口臭口渴，肠胃不清，热病后调养者食用。\n" +
        "4.此菜富含动植物蛋白质、钙、磷、铁、维生素及碳水化合物，具有温中益气、补中生津、解毒润燥、补精添髓的功效。\n" +
        "5.豆腐和鱼同食，能够更好的吸收鱼中的动物蛋白。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_po_dou_fu);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(ma_po_dou_fu.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
