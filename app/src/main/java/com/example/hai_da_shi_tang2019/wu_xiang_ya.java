package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class wu_xiang_ya extends AppCompatActivity {
private String[]data={"健康提示:\n" +
        "1. 鸭肉具有益脾胃，补虚劳的功效。适用于食少纳呆，肥胖羸瘦等症。\n" +
        "2. 酱鸭含水45%，蛋白质26%，脂肪19.3%，碳水化合物4.5%，以及矿物质5.7%等。\n" +
        "食谱营养:\n"+
        "鸭：鸭肉中的脂肪酸熔点低，易于消化。所含B族维生素和维生素E较其他肉类多，能有效抵抗脚气病，神经炎和多种炎症，还能抗衰老。鸭肉中含有较为丰富的烟酸，它是构成人体内两种重要辅酶的成分之一，对心肌梗死等心脏疾病患者有保护作用。鸭肉性寒凉，性寒，味甘，咸，主大补虚劳。滋五脏之阴，清虚劳之热，补血行水，养胃生津，止咳自惊，消螺蛳积。一般人都适合食用，尤其体热、上火、虚弱、食少、便秘、水肿、心脏病、癌症患者和放疗、化疗后的病人宜食。\n"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wu_xiang_ya);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(wu_xiang_ya.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
