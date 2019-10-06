package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class gong_xiang_pai_gu_fan extends AppCompatActivity {
private String[]data={"排骨，指猪、牛、羊等动物剔肉后剩下的肋骨和脊椎骨，上面还附有少量肉类，可以食用，如：红烧排骨，是一道中国家常菜。\n" +
        "猪排骨除含蛋白质、脂肪、维生素外，还含有大量磷酸钙、骨胶原、骨粘蛋白等，可为幼儿和老人提供钙质。\n"+
"营养价值:\n" +
        "排骨有很高的营养价值，排骨味甘咸、性平，入脾、胃、肾经；补肾养血，滋阴润燥；主治热病伤津、消渴羸瘦、肾虚体弱、产后血虚、燥咳、便秘、补虚、滋阴、润燥、滋肝阴，润肌肤，利二便和止消渴。 [6] \n" +
        "补中益气\n" +
        "中医认为，排骨可以补中益气，无论是酱排骨，还是排骨汤，无论是红烧，还是爆炒，排骨都有着补中益气的作用。 [6] \n" +
        "滋养脾胃\n" +
        "排骨可以滋养脾胃，合理食用排骨，可以保健脾胃功能。\n" +
        "改善贫血\n" +
        "排骨可提供血红素（有机铁）和促进铁吸收的半胱氨酸，能改善缺铁性贫血。\n" +
        "强健筋骨\n" +
        "排骨富含铁、锌等微量元素，可以强健筋骨。\n" +
        "增强体力\n" +
        "排骨有着丰富的肌氨酸，可以增强体力，让人精力充沛。\n" +
        "补钙\n" +
        "排骨含有大量磷酸钙、骨胶原、骨粘蛋白等，可为幼儿和老人提供钙质。\n" +
        "补充营养\n" +
        "排骨富含蛋白质和脂肪，为人类提供优质蛋白质和必需的脂肪酸，可以补充人体所需的营养。\n" +
        "滋阴壮阳\n" +
        "中医认为，排骨可以滋阴壮阳，对于女性男性，都是极佳的食疗材料。\n"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gong_xiang_pai_gu_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(gong_xiang_pai_gu_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
