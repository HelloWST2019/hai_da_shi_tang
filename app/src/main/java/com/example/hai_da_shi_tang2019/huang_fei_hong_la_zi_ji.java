package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class huang_fei_hong_la_zi_ji extends AppCompatActivity {
private String[]data={"辣子鸡，是一道经典的鲁菜。一般以整鸡为主料，加上葱、干辣椒、花椒、盐、胡椒、味精等多种材料精制而成，虽然是同一道菜，各地制作也各有特色。\n" +
        "辣子鸡因各地的不同制作方法也有不同的特色，深受各地人们的喜爱。此菜成菜色泽棕红油亮，麻辣味浓。\n" +
        "适用人群:\n" +
        "一般人群均可食用，老人、病人、体弱者更宜食用。\n" +
        "1. 感冒发热、内火偏旺、痰湿偏重之人、肥胖症、患有热毒疖肿之人、高血压、血脂偏高、胆囊炎、胆石症的人忌食；\n" +
        "2. 鸡肉性温，助火，肝阳上亢及口腔糜烂、皮肤疖肿、大便秘结者不宜食用；\n" +
        "3. 动脉硬化、冠心病和高血脂患者忌饮鸡汤；感冒伴有头痛、乏力、发热的人忌食鸡肉，鸡汤。\n" +
        "菜品特色:\n" +
        "鸡肉蛋白质的含量较高，脂肪含量较低。此外，鸡肉蛋白质中富含全部必需氨基酸，其含量与蛋、乳中的氨基酸谱式极为相似，因此为优质的蛋白质来源。每100克去皮鸡肉中含有24克蛋白质、0.7克脂类物质，是几乎不含脂肪的高蛋白食品。鸡肉也是磷、铁、铜与锌的良好来源，并且富含维生素B12、维生素B6、维生素A、维生素D、维生素K等。鸡肉含有较多的不饱和脂肪酸—油酸（单不饱和脂肪酸）和亚油酸（多不饱和脂肪酸），能够降低对人体健康不利的低密度脂蛋白胆固醇。\n" +
        "鸡肉蛋白质含量较高，且易被人体吸收入利用，有增强体力，强壮身体的作用。\n" +
        "健康功效：\n" +
        "姜：降逆止呕、化痰止咳、散寒解表\n" +
        "鸡腿：温中、补精益髓、益气\n" +
        "八角：理气、止痛、温阳"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huang_fei_hong_la_zi_ji);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(huang_fei_hong_la_zi_ji.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);   }
}
