package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class mo_gu_pei_gen_shi_guo_ban_fan extends AppCompatActivity {
    private String[]data={"蘑菇称为双孢蘑菇，又叫白蘑菇、洋蘑菇，隶属于伞菌目，伞菌科，蘑菇属，是世界上人工栽培较广泛、产量较高、消费量较大的食用菌品种，很多国家都有栽培，其中我国总产量占世界第二位。近年来，随着食用菌产业的快速发展，双孢蘑菇的产量也在逐年增加，成为许多地区农民增收的支柱产业。随着人民生活水平的提高，对蘑菇周年消费需求不断增加，双孢蘑菇的工厂化栽培也已开始实现\n" +
            "食疗效果:\n" +
            "蘑菇含有丰富的赖氨酸。赖氨酸是人体必须的氨基酸，能增高、增重，并能增强抗病力、增加血色素、提高智力。\n" +
            "蘑菇中还含有干扰素诱导剂，能诱发干扰素的产生，因而对水泡性口炎病毒、脑炎病毒等有较好的疗效。鲜蘑菇浸膏片可治疗迁延性或慢性肝炎，所以肝脏病人宜食用蘑菇。蘑菇还具有降低血液胆固醇的作用，蘑菇中的解朊酶、酷氨酸酶具有降血压的功能，因而蘑菇是高血压和心血管病人理想的保健食品" +
            ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mo_gu_pei_gen_shi_guo_ban_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(mo_gu_pei_gen_shi_guo_ban_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
