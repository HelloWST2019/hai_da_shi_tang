package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class pi_jiu_ya_guo_zai extends AppCompatActivity {
private String[]data={"啤酒鸭是一道风味独特的特色佳肴，是深受广大食客喜爱的菜肴。据传起源于清代。啤酒鸭的做法有很多种。其主料为鸭子、啤酒。将鸭肉与啤酒一同炖煮成菜，使滋补的鸭肉味道更加浓厚，鸭肉不仅入口鲜香，还带有一股啤酒清香。\n"+
"营养价值:\n" +
        "鸭肉性寒、味甘、咸，归脾、胃、肺、肾经。可大补虚劳、滋五脏之阴、清虚劳之热、补血行水、养胃生津、止咳自惊、消螺蛳积、清热健脾、虚弱浮肿。特别适合夏秋食用，不上火，不易发胖。喜欢吃肉又怕胖的MM可以试试哦。\n" +
        "鸭肉中的脂肪酸熔点低，易于消化。所含B族维生素和维生素E较其他肉类多，能有效抵抗脚气病，神经炎和多种炎症，还能抗衰老。鸭肉中含有较为丰富的烟酸，它是构成体内两种重要辅酶的成分之一，对心肌梗死等心脏疾病患者有保护作用。\n"+
"适宜人群:\n" +
        "一般人群均可食用，特别适用于体内有热、上火的人食用。发低热、体质虚弱、食欲不振、大便干燥和水肿的人，食之更佳。\n" +
        "同时适宜营养不良，产后病后体虚、盗汗、遗精、妇女月经少、咽干口渴者食用。\n" +
        "还适宜癌症患者及放疗化疗后，糖尿病，肝硬化腹水，肺结核，慢性肾炎浮肿者食用。\n" +
        "不宜人群:\n" +
        "对于素体虚寒，受凉引起的不思饮食，胃部冷痛.腹泻清稀，腰痛及寒性痛经以及肥胖、动脉硬化、慢性肠炎应少食。感冒患者不宜食用。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pi_jiu_ya_guo_zai);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(pi_jiu_ya_guo_zai.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
