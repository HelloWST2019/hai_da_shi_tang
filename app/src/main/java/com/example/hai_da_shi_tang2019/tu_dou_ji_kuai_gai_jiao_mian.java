package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class tu_dou_ji_kuai_gai_jiao_mian extends AppCompatActivity {
    private String[]data={"土豆历史起源\n" +
            "马铃薯原产于南美洲安第斯山区，人工栽培史最早可追溯到公元前8000年到5000年的秘鲁南部地区。十六世纪中期，马铃薯被一个西班牙殖民者从南美洲带到欧洲。那时人们总是欣赏它的花朵美丽，把它当作装饰品。 [3] \n" +
            "1586年英国人在加勒比海击败西班牙人，从南美搜集烟草等植物种子，把马铃薯带到英国，英国的气候适合马铃薯的生长，比其它谷物产量高且易于管理。 [3] \n" +
            "后来一位法国农学家——安·奥巴曼奇在长期观察和亲身实中，发现马铃薯不仅能吃，还可以做面包等。从此，法国农民便开始大面积种植马铃薯。 [3] \n" +
            "17世纪时，马铃薯已经成为欧洲的重要粮食作物并且已经传播到中国，马铃薯传入中国只有三百多年的历史。据说是华侨从东南亚一带引进的，在21世纪中国马铃薯种植面积居世界第二位。马铃薯产量高，营养丰富，对环境的适应性较强，现已遍布世界各地，热带和亚热带国家甚至在冬季或凉爽季节也可栽培并获得较高产量。由于马铃薯非常适合在原来粮食产量极低，只能生长莜麦（裸燕麦）的高寒地区生长，很快在内蒙、河北、山西、陕西北部普及，马铃薯和玉米、番薯等从美洲传人的高产作物成为贫苦阶层的主要食品，对维持中国人口的迅速增加起到了重要作用。\n" +
            "药用及保健价值\n" +
            "马铃薯不但营养价值高，而且还有较广泛的药用价值。我国中医学认为，马铃薯有和胃、健脾、益气的功效，可以预防和治疗多种疾病，还有解毒、消炎之功效。 [21] \n" +
            "⒈预防中风\n" +
            "马铃薯中含有丰富的B族维生素和优质纤维素，这在延缓人体衰老过程中有重要作用。马铃薯富含的膳食纤维、蔗糖有助于防治消化道癌症和控制血液中胆固醇的含量。马铃薯中富含钾，钾在人体中主要分布在细胞内，维持着细胞内的渗透压，参与能量代谢过程，因此经常吃马铃薯，可防止动脉粥样硬化，医学专家认为，每天吃一个马铃薯，能大大减少中风的危险。 [21] \n" +
            "⒉减肥\n" +
            "吃马铃薯不必担心脂肪过剩，因为它只含有0.1%的脂肪，每天多吃马铃薯可以减少脂肪的摄入，使多余的脂肪渐渐被身体代谢掉。近几年，意大利、西班牙、美国、加拿大、俄罗斯等国先后涌现出了一批风味独特的马铃薯食疗餐厅，以满足健美减肥人士的日常需求。 [21] \n" +
            "⒊养胃\n" +
            "中医认为，马铃薯能和胃调中、健脾益气，对治疗胃溃疡、习惯性便秘等疾病大有裨益，而且它还兼有解毒消炎的作用。 [21] \n" +
            "⒋降血压\n" +
            "马铃薯中含有降血压的成分，具有类似降压药的作用，能阻断血管紧张素Ⅰ转化为血管紧张素Ⅱ，并能使具有血管活性作用的血管紧张素Ⅱ的血浆水平下降，使周围血管舒张，血压下降。 [21] \n" +
            "⒌通便\n" +
            "马铃薯中的粗纤维，可以起到润肠通便的作用，从而避免便秘者用力憋气排便而导致血压的突然升高。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tu_dou_ji_kuai_gai_jiao_mian);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(tu_dou_ji_kuai_gai_jiao_mian.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
