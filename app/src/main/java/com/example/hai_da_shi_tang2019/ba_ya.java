package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ba_ya extends AppCompatActivity {
private String[]data={"营养价值:\n" +
        "\n" +
        "鸭肉中的脂肪酸熔点低，易于消化。所含B族维生素和维生素E较其他肉类多，能有效抵抗脚气病，神经炎和多种炎症，还能抗衰老。鸭肉中含有较为丰富的烟酸，它是构成人体内两种重要辅酶的成分之一，对心肌梗死等心脏疾病患者有保护作用。\n" +
        "食用功效:\n" +
        "\n" +
        "1、益气补虚：其肉性味甘、寒，入肺胃肾经，有大补虚劳、滋五脏之阴、清虚劳之热、补血行水、养胃生津、止咳自惊、消螺蛳积、清热健脾、虚弱浮肿等功效;治身体虚弱、病后体虚、营养不良性水肿。\n" +
        "2、滋阴：入药以老而白、白而骨乌者为佳。用老而肥大之鸭同海参炖食，具有很大的滋补功效，炖出的鸭汁，善补五脏之阴和虚痨之热。\n" +
        "\n" +
        "适用人群:\n" +
        "\n" +
        "一般人群均可食用。适用于上火、食欲不振体质虚弱、食欲不振、大便干燥和水肿的人，营养不良癌症患者。\n" +
        "\n" +
        "禁忌人群:\n" +
        "\n" +
        "胃部冷痛、腹泻清稀、腰痛及寒性痛经以及肥胖、动脉硬化、慢性肠炎应少食；感冒患者不宜食用。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ba_ya);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(ba_ya.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
