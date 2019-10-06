package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class jiang_bao_you_yu extends AppCompatActivity {
private String[]data={"酱爆鱿鱼是一道菜肴，主要是用鱿鱼和辣椒炒制而成。色泽棕黄，柔软脆嫩，酱香扑鼻，美味可口，佐酒下饭均宜\n" +
        "营养价值:\n" +
        "鱿鱼，营养价值很高，是名贵的海产品。\n" +
        "营养分析:\n" +
        "1. 鱿鱼富含钙、磷、铁元素，利于骨骼发育和造血，能有效治疗贫血；\n" +
        "2. 鱿鱼除富含蛋白质和人体所需的氨基酸外，鱿鱼还含有大量的牛黄酸，可抑制血液中的胆固醇含量，缓解疲劳，恢复视力，改善肝脏功能；\n" +
        "3. 其所含多肽和硒有抗病毒、抗射线作用；\n" +
        "4. 中国科学院海洋研究所王存信教授表示，胆固醇有低密度和高密度之分，鱿鱼中的胆固醇以高密度为主，对人体有利无害。鱿鱼体内的脂肪与畜、禽类脂肪的结构是有明显区别的；\n" +
        "5.含蛋白质、欧米伽3脂肪酸、铜、锌、B族维生素和碘。B族维生素有助缓解偏头痛，磷有助钙吸收。100克鱿鱼只有70千卡能量。注意：每天吃鱿鱼不要超过一个拳头的量，吃时最好不要油炸。\n" +
        "中医认为，鱿鱼有滋阴养胃、补虚润肤的功能。\n" +
        "其营养价值毫不逊色于牛肉和金枪鱼。每百克干鱿鱼含有蛋白质66.7克、脂肪7.4克，并含有大量的碳水化合物和钙、磷、磺等无机盐。鲜活鱿鱼中蛋白质含量也高达16%～20%，脂肪含量极低，仅为一般肉类的4%左右，因此热量也远远低于肉类食品，对怕胖的人来说，吃鱿鱼是一种好的选择。有较高含量的牛磺酸。食用鱿鱼可有效减少血管壁内所累积的胆固醇，对于预防血管硬化、胆结石的形成都颇具效力。同时能补充脑力、预防老年痴呆症等。因此对容易罹患心血管方面疾病的中、老年人来说，鱿鱼更是有益健康的食物。\n" +
        "现代医学通过研究发现，鱿鱼中虽然胆固醇含量较高，但鱿鱼中同时含有一种物质——牛磺酸，而牛磺酸有抑制胆固醇在血液中蓄积的作用。只要摄入的食物中牛黄酸与胆固醇的比值在2以上，血液中的胆固醇就不会升高。而鱿鱼中牛磺酸含量较高，其比值为2.2。因此，食用鱿鱼时，胆固醇只是正常地被人体所利用，而不会在血液中积蓄。其体内的胆固醇多集中于其内脏部位。人们根本没必要担心因为食用鱿鱼而导致胆固醇摄入量增多。\n" +
        "食用提示:\n" +
        "鱿鱼需煮熟、煮透后再食，因为鲜鱿鱼中有一种多肽成分，若未煮透就食用，会导致肠运动失调。鱿鱼之类的水产品性质寒凉，脾胃虚寒的人应少吃。鱿鱼含胆固醇较多，故高血脂、高胆固醇血症、动脉硬化等心血管病及肝病患者应慎食。鱿鱼是发物，患有湿疹、荨麻疹等疾病的人忌食。适用量：每次30～50克。\n" +
        "功效作用:\n" +
        "功效作用方面，鱿鱼具有补虚养气、滋阴养颜等功效，可降低血液中胆固醇的浓度、调节血压、保护神经纤维、活化细胞，对预防老年痴呆症等有一定功效。此外，鱿鱼还有助于肝脏的解毒、排毒，可促进身体的新陈代谢，具有抗疲劳、滋阴养颜、延缓衰老等功效。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jiang_bao_you_yu);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(jiang_bao_you_yu.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
