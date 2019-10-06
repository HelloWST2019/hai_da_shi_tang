package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class qing_gua_chao_dan extends AppCompatActivity {
private String[]data={"营养分析:\n" +
        "1. 鸡蛋含有丰富的蛋白质、脂肪、维生素和铁、钙、钾等人体所需要的矿物质，蛋白质为优质蛋白，对肝脏组织损伤有修复作用；\n" +
        "2. 富含DHA和卵磷脂、卵黄素，对神经系统和身体发育有利，能健脑益智，改善记忆力，并促进肝细胞再生；\n" +
        "3. 鸡蛋中含有较多的维生素B和其他微量元素，可以分解和氧化人体内的致癌物质，具有防癌作用。\n" +
        "青瓜的营养成份，虽不及苋菜、蕃茄，在瓜类中，则是佼佼者； 　它含有重要的矿物质和多种的维他命，有蛋白质、钙质、磷质、铁质、维他命A及C。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qing_gua_chao_dan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(qing_gua_chao_dan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
