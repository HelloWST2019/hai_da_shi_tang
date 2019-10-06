package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class he_bao_dan_mian extends AppCompatActivity {
private String[]data={"荷包蛋饭，是一道以鸡蛋和米饭为主要食材，制作而成的主食。鸡蛋中含有非常丰富的蛋白质，具有养心安神，补血的功效。\n" +
        "食谱营养:\n" +
        "鸡蛋：鸡蛋含有丰富的蛋白质、脂肪、维生素和铁、钙、钾等人体所需要的矿物质，其蛋白质是自然界最优良的蛋白质，对肝脏组织损伤有修复作用；同时富含DHA和卵磷脂、卵黄素，对神经系统和身体发育有利，能健脑益智，改善记忆力，并促进肝细胞再生；鸡蛋中含有较多的维生素B和其他微量元素，可以分解和氧化人体内的致癌物质，具有防癌作用；鸡蛋味甘，性平；具有养心安神，补血，滋阴润燥之功效。\n" +
        "稻米：大米具有很高营养功效，是补充营养素的基础食物；大米可提供丰富B族维生素；大米具有有补中益气、健脾养胃、益精强志、和五脏、通血脉、聪耳明目、止烦、止渴、止泻的功效。\n" +
        "青豆：青豆富含不饱和脂肪酸和大豆磷脂，有保持血管弹性、健脑和防止脂肪肝形成的作用；青豆中富含皂角苷、蛋白酶抑制剂、异黄酮、钼、硒等抗癌成分，对前列腺癌、皮肤癌、肠癌、食道癌等几乎所有的癌症都有抑制作用。\n" +
        "小米：小米有清热解渴、健胃除湿、和胃安眠等功效，还具有滋阴养血的功能，可以使产妇虚寒的体质得到调养；小米中含有丰富B族维生素，具有防止消化不良及口角生疮的功效。\n"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_he_bao_dan_mian);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(he_bao_dan_mian.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
