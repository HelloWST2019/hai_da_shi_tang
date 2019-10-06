package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class gu_li_shao_ya_fan extends AppCompatActivity {
private String[]data={"烧鸭饭是一道色香味俱全的传统名点，属于粤菜系。源自广东地区，以红色的烧鸭配米饭和青菜食用（有些加上更多配菜），简单而美味，充满烧腊香味，在东南沿海、香港、新加坡等地都极受大众欢迎。\n" +
        "营养:\n" +
        "鸭肉中的脂肪酸熔点低，易于消化。所含B族维生素和维生素E较其他肉类多，能有效抵抗脚气病，神经炎和多种炎症，还能抗衰老。鸭肉中含有较为丰富的烟酸，它是构成人体内两种重要辅酶的成分之一，对心肌梗死等心脏疾病患者有保护作用。鸭肉性寒凉，性寒，味甘，咸，主大补虚劳。滋五脏之阴，清虚劳之热，补血行水，养胃生津，止咳自惊，消螺蛳积。一般人都适合食用，尤其体热、上火、虚弱、食少、便秘、水肿、心脏病、癌症患者和放疗、化疗后的病人宜食。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gu_li_shao_ya_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(gu_li_shao_ya_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);  }
}
