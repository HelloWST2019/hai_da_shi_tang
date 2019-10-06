package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class jun_gu_chao_niu_liu extends AppCompatActivity {
private String[]data={"菌菇营养价值:\\n\" +\n" +
        "        \"每100克鲜蘑菇中含优质蛋白质2.9克、脂肪0.2克、碳水化合物2.4克、膳食纤维0.6克、钙8毫克、磷66毫克、铁1.3克、维生素B 0.16毫克、烟酸3.3毫克、维生素C 4毫克。此外，还含有非特异植物凝集素、酷氨酸酶等物质，因而它是一种营养丰富的食用菌，是各种菜肴的理想配料  。\\n\" +\n" +
        "        \"食疗效果:\\n\" +\n" +
        "        \"蘑菇含有丰富的赖氨酸。赖氨酸是人体必须的氨基酸，能增高、增重，并能增强抗病力、增加血色素、提高智力 。\\n\" +\n" +
        "        \"蘑菇中还含有干扰素诱导剂，能诱发干扰素的产生，因而对水泡性口炎病毒、脑炎病毒等有较好的疗效。鲜蘑菇浸膏片可治疗迁延性或慢性肝炎，所以肝脏病人宜食用蘑菇。蘑菇还具有降低血液胆固醇的作用，蘑菇中的解朊酶、酷氨酸酶具有降血压的功能，因而蘑菇是高血压和心血管病人理想的保健食品"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jun_gu_chao_niu_liu);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(jun_gu_chao_niu_liu.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
