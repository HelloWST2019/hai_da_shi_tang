package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ao_men_shao_rou_fan extends AppCompatActivity {
private String[]data={"澳门烧肉又称白切烧肉，是近十年来五香烧肉的改良创新品种，口感以其甘香酥脆而著称。\n营养分析:\n" +
        "猪肉为人类提供优质蛋白质和必需的脂肪酸。猪肉可提供血红素（有机铁）和促进铁吸收的半胱氨酸，能改善缺铁性贫血。 使用提示：成年人每天80-100克就可满足一天的需要；儿童每天50克即可。猪肉不宜多食，肥肉尤其如此，多食则助热，生痰助湿，动风。\n" +
        "食疗作用:\n" +
        "猪肉味甘咸、性平，入脾、胃、肾经；补肾养血，滋阴润燥；主治热病伤津、消渴羸瘦、肾虚体弱、产后血虚、燥咳、便秘、补虚、滋阴、润燥、滋肝阴，润肌肤，利二便和止消渴。猪肉煮汤饮下可急补由于津液不足引起的烦躁、干咳、便秘和难产。\n"+
"食用人群:\n" +
        "一般人都可食用；\n" +
        "湿热痰滞内蕴者不宜食；肥胖、血脂较高、高血压者不宜多食或忌用；外感病人亦不宜食。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ao_men_shao_rou_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(ao_men_shao_rou_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
