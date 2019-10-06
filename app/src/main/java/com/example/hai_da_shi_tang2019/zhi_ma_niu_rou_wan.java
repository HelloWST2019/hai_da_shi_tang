package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class zhi_ma_niu_rou_wan extends AppCompatActivity {
private String[]data={"牛肉丸的营养价值有：\n" +
        "1.增强抵抗力\n" +
        "肉丸里面含有多种营养物质，可以充分补充人体需要的营养物质，增强人体抵抗力。\n" +
        "2.提供能量\n" +
        "肉丸热量充足，适合劳动强度大的人群食用，可以提供足够的能量。\n"+
"芝麻食用价值:\n" +
        "芝麻可用作烹饪原料，如作糕点的馅料，点心、烧饼的面料，亦可作菜肴辅料。日常生活中，人们常吃的芝麻制品有：芝麻粉，芝麻糊，芝麻饼，芝麻酱。常吃芝麻有以下保健效果：\n" +
        "芝麻照片集锦\n" +
        "芝麻照片集锦(18张)\n" +
        "护肤美肤：常吃芝麻，可使皮肤保持柔嫩、细致和光滑。有习惯性便秘的人，肠内存留的毒素会伤害人的肝脏，也会造成皮肤的粗糙。芝麻能滑肠治疗便秘，并具有滋润皮肤的作用。利用节食来减肥的人，由于其营养的摄取量不够，皮肤会变得干燥、粗糙。\n" +
        "减肥塑身：芝麻中含有防止人体发胖的物质蛋黄素、胆碱、肌糖，因此芝麻吃多了也不会发胖。在节食减肥的同时，若配合芝麻的食用，粗糙的皮肤可获得改善。\n" +
        "营养分析：\n" +
        "1、芝麻含有大量的脂肪和蛋白质，其中主要为油酸、亚油酸、棕榈酸、花生酸等的甘油脂；又含甾醇、芝麻\n" +
        "素、芝麻酚、叶酸、烟酸、蔗糖、卵磷脂、蛋白质；还有膳食纤维、糖类、维生素a、维生素B1,B2、尼克酸、维生素E、卵磷脂、钙、铁、镁等营养成分；  \n" +
        "芝麻中的亚油酸(Linoleic、C18∶2)有调节胆固醇的作用。\n" +
        "2、 芝麻中含有丰富的维生素E，能防止过氧化脂质对皮肤的危害，抵消或中和细胞内有害物质游离基的积聚，可使皮肤白皙润泽，并能防止各种皮肤炎症。\n" +
        "3、 芝麻还具有养血的功效，可以治疗皮肤干枯、粗糙、令皮肤细腻光滑、红润光泽。 \n "+
"适合人群:\n" +
        "一般人群均可食用\n" +
        "适宜肝肾不足所致的眩晕、眼花、视物不清、腰酸腿软、耳鸣耳聋、发枯发落、头发早白之人食用；\n" +
        "适宜妇女产后乳汁缺乏者食用；\n" +
        "适宜身体虚弱、贫血、高脂血症、高血压病、老年哮喘、肺结核，以及荨麻疹，习惯性便秘者食用；\n" +
        "适宜糖尿病、血小板减少性紫瘴、慢性神经炎、末梢神经麻痹、痔疮以及出血性素质者适用；\n" +
        "患有慢性肠炎、便溏腹泻者忌食；根据前人经验，男子阳痿、遗精者忌食。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhi_ma_niu_rou_wan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(zhi_ma_niu_rou_wan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
