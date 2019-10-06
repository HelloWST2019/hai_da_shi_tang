package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class xiang_jian_ji_pai extends AppCompatActivity {
private String[]data={"鸡排，是小吃店里很流行的一种油炸类食品，香味可谓是十里飘香。呈米白色，上有“面包渣”似的小面团。里是鸡胸肉片成的肉片，须选上等淀粉将胸片肉与面渣相互结合，再过一遍纯豆油，变成“排”似的鸡胸肉。用铁板烧烤，大约5分钟左右即可熟，再将朝天椒榨成的油与风宁大酱做成的辣酱过一遍，辅以作料等，便成了外焦里嫩，香味可口的小派鸡排。\n" +
        "功效:\n" +
        "强身健体\n" +
        "鸡肉的消化率高，很容易被人体吸收利用，有增强体力、强壮身体的作用。\n" +
        "提高免疫力\n" +
        "现代社会中天天忙忙碌碌，常处于亚健康状态的白领最好多吃一些，以增强免疫力，减少患病几率。鸡肉具有温中益气、补精填髓、益五脏、补虚损的功效，用于治疗虚劳瘦弱、中虚食少、泄泻头晕心悸、月经不调、产后乳少、消渴、水肿等症状。\n" +
        "补肾精\n" +
        "可缓解由于肾精不足所导致的小便频繁、耳聋、精少精冷等症状。\n" +
        "促进智力发育\n" +
        "具有抗氧化和一定的解毒作用。在改善心脑功能、促进儿童智力发育方面，更是有较好的作用。\n" +
        "禁忌人群:\n" +
        "高血脂患者以及湿热体质者不宜食用鸡排。" +
        ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiang_jian_ji_pai);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(xiang_jian_ji_pai.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
