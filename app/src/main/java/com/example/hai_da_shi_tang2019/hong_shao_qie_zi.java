package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hong_shao_qie_zi extends AppCompatActivity {
private String[]data={"营养价值:\n" +
        "1. 保护心血管、抗坏血病：茄子含丰富的维生素P，这种物质能增强人体细胞间的粘着力，增强毛细血管的弹性，减低毛细血管的脆性及渗透性，防止微血管破裂出血，使心血管保持正常的功能。此外，茄子还有防治坏血病及促进伤品愈合的功效；\n" +
        "2. 防治胃癌：茄子含有龙葵碱，能抑制消化系统肿瘤的增殖，对于防治胃癌有一定效果。此外，茄子还有清退癌热的作用；\n" +
        "3. 抗衰老：茄子含有维生素E，有防止出血和抗衰老功能，常吃茄子，可使血液中胆固醇水平不致增高，对延缓人体衰老具有积极的意义 [1]  。\n" +
        "食用功效:\n" +
        "味甘、性凉，入脾、胃、大肠经；可清热止血，消肿止痛；用于热毒痈疮、皮肤溃疡、口舌生疮、痔疮下血、便血、衄血等。\n" +
        "中医学认为，茄子属于寒凉性质的食物。所以夏天食用，有助于清热解暑，对于容易长痱子、生疮疖的人，尤为适宜。消化不良，容易腹泻的人，则不宜多食，正如李时珍在《本草纲目》中 所说：“茄性寒利，多食必腹痛下利。”《滇南本草》记载，茄子能散血、消肿、宽肠。所以，大便于结、痔疮出血以及患湿热黄疸的人，多吃些茄子，也有帮助，可以选用紫茄同大米煮粥吃。《本草纲目》介绍，将带蒂的茄子焙干， 研成细末，用酒调服治疗肠风下血；《滇南本草》主张用米汤调服，更为妥当，因为肠风下血和痔疮出血，都不宜用酒。把带蒂茄子焙干，研成细末，更常作外用。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hong_shao_qie_zi);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(hong_shao_qie_zi.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
