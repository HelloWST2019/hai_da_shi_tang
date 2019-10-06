package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class mi_zhi_chao_sha extends AppCompatActivity {
    private String[]data={"蜜汁叉烧，是香港十大经典名菜之一，也是广东省传统名菜之一，属于粤菜系。“叉烧”是从“插烧”发展而来的。主要以猪肉(瘦)、叉烧酱、蚝油、蒜、生抽、料酒、蜂蜜、白糖、花生油为原材料制作而成。\n" +
            "因一只猪，只有两条里脊，人们便想出插烧之法。久而久之插烧之名便被叉烧所替代。具有补肾养血，滋阴润燥和有增加记忆力和健脑的功效\n" +
            "营养价值:\n" +
            "猪肉：猪肉含有丰富的优质蛋白质和必需的脂肪酸，并提供血红素（有机铁）和促进铁吸收的半胱氨酸，能改善缺铁性贫血；具有补肾养血，滋阴润燥的功效；但由于猪肉中胆固醇含量偏高，故肥胖人群及血脂较高者不宜多食。\n" +
            "淀粉：蚕豆中含有丰富的钙、锌、锰、磷脂等，是大脑和神经组织的重要组成成分，并含有丰富的胆碱，有增加记忆力和健脑作用。对于正在应付考试或脑力工作者，适当进食蚕豆可能会有一定功效。蚕豆中的蛋白质可以延缓动脉硬化，蚕豆皮中的粗纤维有降低胆固醇、促进肠蠕动的作用。同时蚕豆也是抗癌食品之一，对预防肠癌有一定的作用。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_zhi_chao_sha);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(mi_zhi_chao_sha.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);  }
}
