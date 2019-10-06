package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class qiu_dao_yu extends AppCompatActivity {
    private String[]data={"秋刀鱼（Cololabis saira）又称竹刀鱼，由于其体形修长如刀，生产季节在秋天，故名秋刀鱼，英文名为Pacific Saury。秋刀鱼隶属颌针鱼亚目竹刀鱼科秋刀鱼属 [1]  。是飞鱼（Exocetid）与鹤鱵科（Belonid）的近亲 [2]  。为表层洄游性鱼类 [3]  ，以动物性浮游生物为食，如虾类、卜足类、鱼卵、桡足类等，尤喜虾类 [1]  。\n" +
            "秋刀鱼味道鲜美，营养丰富，适合蒸、煮、煎、烤 等多种方法烹饪，深受广大消费者的喜爱。\n" +
            "食用价值\n" +
            "秋刀鱼味道鲜美，营养丰富，适合蒸、煮、煎、烤 等多种方法烹饪，深受广大消费者的喜爱 [4]  。\n" +
            "在日本，秋刀鱼物美价廉，是非常深受日本民众欢迎的食品。在日本寿司店，秋刀鱼是一道经典食品。日本人是全世界最长寿的国家，跟他们在全世界食鱼量最高有很大关系，尤其是食用秋刀鱼。日本知名作家佐藤春夫在诗中赞赏秋刀鱼：“秋刀鱼、秋刀鱼，吃着滴上青桔酸汁的秋刀鱼，是此人故乡的习俗。” [7] \n" +
            "营养价值\n" +
            "众所周知，秋刀鱼营养价值是相当高，它除了含有人体所需的高消化吸收率的蛋白质以外，还有很多包含EPA成分具有预防脑血栓和心肌梗塞作用的优质脂肪。另外，它所含有的DHA成分具有抑\n" +
            "制乳腺癌、大肠癌、肺癌等的功效，可以提高人体学习机能及防止老年性痴呆症的效果。总体上，秋刀鱼是一种营养丰富、对人体健康十分有利的绿色健康水产品。如果对秋刀鱼分背、腹、皮、内脏来测定EPA和DHA，可知秋刀鱼的皮肤和内脏里含量最高。它接近皮肤部分的棕色肉除含EPA和DHA外，还含有各种铁和维他命的成分。秋刀鱼还含有中、老年人和儿童所需的钙和维他命D成分，并且含有强化肝脏作用的氨基乙硝酸" +
            ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qiu_dao_yu);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(qiu_dao_yu.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
