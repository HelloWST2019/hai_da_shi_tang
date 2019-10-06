package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class huang_jin_ji_liu extends AppCompatActivity {
private String[]data={"鸡柳的营养成分：\n" +
        "1.富含烟酸，具有促进消化系统的健康，促进血液循环。\n" +
        "2.富含蛋白质，具有维持钾钠平衡，消除水肿。提高免疫力，有利于生长发育。\n" +
        "3.富含磷，具有构成骨骼和牙齿，促进成长及身体组织器官的修复，供给能量与活力，参与酸碱平衡的调节。\n" +
        "4.富含铜，铜是人体健康不可缺少的微量营养素，对于血液、中枢神经和免疫系统，骨骼组织的发育和功能有重要影响。\n" +
        "适宜人群：适宜营养不良、畏寒怕冷、头晕心悸、乏力疲劳、月经不调、产后乳少、贫血、中虚食少、水肿、小便数频、遗精、耳聋耳鸣的人。肥胖或胃肠较弱、担心患糖尿病、动脉硬化的人。老人，病人，体弱者更宜食用。\n" +
        "鸡柳的营养价值主要体现在它里面的营养成分中，鸡柳里含有丰富的烟酸、蛋白质磷和铜等物质，对我们身体的各个器官的帮助是非常大的，而且有利于促进我们的身体健康"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huang_jin_ji_liu);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(huang_jin_ji_liu.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
