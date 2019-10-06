package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class bai_cai_xian_rou_shui_jiao extends AppCompatActivity {
private String[]data={"食谱营养:\n" +
        "小麦富强粉：面粉富含蛋白质、碳水化合物、维生素和钙、铁、磷、钾、镁等矿物质，有养心益肾、健睥厚肠、除热止渴的功效，主治脏躁、烦热、消渴、泄痢、痈肿、外伤出血及烫伤等。\n" +
        "猪肉(肥瘦)：猪肉含有丰富的优质蛋白质和必需的脂肪酸，并提供血红素（有机铁）和促进铁吸收的半胱氨酸，能改善缺铁性贫血；具有补肾养血，滋阴润燥的功效；但由于猪肉中胆固醇含量偏高，故肥胖人群及血脂较高者不宜多食。\n" +
        "大白菜(小白口)：大白菜是现今餐桌上必不可少的一道家常美食，大白菜具有较高的营养价值，含有丰富的多种维生素和矿物质，特别是维C和钙、膳食纤维的含量非常丰富。对于护肤、养颜、防止女性乳腺癌、润肠排毒、促进人体对动物蛋白的吸收等，都有极大功效。我国中医还认为大白菜能养胃生津、除烦解渴、利尿通便、清热解毒。多食大白菜，还能预防和治疗便秘，预防痔疮及结肠癌等。\n" +
        "虾米：虾米中含有丰富的蛋白质和矿物质，钙含量尤其丰富；还含有丰富的镁元素，能很好地保护心血管系统，对于预防动脉硬化、高血压及心肌梗死有一定的作用；并还有镇定作用，常用来治疗神经衰弱、植物神经功能紊乱等症。老年人常食，可预防自身因缺钙所致的骨质疏松症。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_cai_xian_rou_shui_jiao);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(bai_cai_xian_rou_shui_jiao.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
