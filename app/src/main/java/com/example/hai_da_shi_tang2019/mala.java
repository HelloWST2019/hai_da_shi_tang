package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class mala extends AppCompatActivity {
private List<Ma>maList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mala);
        maInit();
        MaAdapter adapter=new MaAdapter(mala.this,R.layout.ma_item,maList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
    public void maInit(){
        Ma pr=new Ma("素材类1.5元  荤菜类2.8元  （50克）","pr");
        Ma mes=new Ma("\n麻辣香锅是一种美食，发源于重庆缙云山，由川渝地方麻辣风味融合而来。麻辣香锅源于土家风味，是当地老百姓的家常做法，以麻、辣、鲜、香、油、混搭为特点。\n" +
                "虽然麻辣香锅属于麻辣口味，但颇受全国食客喜爱。味道十分美味，而且口味多种多样，多种食材可任意搭配，可以满足大多数人的胃口喜好，烹饪时间短，4~7分钟即可出锅食用，是很多年轻人偏爱的一种微餐饮。\n"+
                "菜品介绍:\n" +
                "麻辣香锅源于重庆缙云山土家风味，是当地老百姓的家常做法，以麻、辣、香、混一锅为特点。据说，当地人平时喜欢把一大锅菜一起用各种调料味料炒起来吃，而 每当有尊贵的客人时，便会在平常吃的大锅炒菜中加入肉、海鲜、脆肠、肉嫩，笋片清香，腐竹因为事先炸过，可以吸收各种肉类和海鲜的鲜味，加入本身的香味，混合起来，就成了“一锅香”。\n" +
                "内容混搭有荤、有素、有淡、有辣、有自然形成、也有人工加工…… 看上去已觉天南地北的食材，融入一锅，就如时尚界将五彩六色混搭在一起一样，享受的是丰富与多样。麻辣香锅，具有辣而不燥、鲜而不腥、入口窜香、回味悠长的独特口味。香锅制作中对辣椒的选用有着特别的要求，尤以川西的“二荆条”为最佳，因为这种辣椒颜色鲜艳、辣香浓郁、辣感柔和。而香锅的香料采用四川独有的几十味特殊原料，经现代工艺精制而成，不伤胃、不上火、色泽鲜艳，故有“一锅红艳”之称。该香锅香气扑鼻、滋味柔和纯正，在制作上采用单锅单炒，一次使用，迎合现代人对健康的追求。\n" +
                "随着一些川菜师傅在香辣与干锅菜的基础上对这种麻辣香锅进行了整理与开发，使麻辣香锅适宜餐厅经营与操作：原料上， 扩展到了海鲜水产、家禽家畜、时鲜蔬菜单品多达数百种之多；味型上，融合火锅、川式干锅、香辣菜系特点，突出了麻、辣、干、香的特点；辣味上，进一步细化，采用5-7级的分级方式，点点辣、微辣、中辣、重辣、特辣，因人而异；功效上，在中药辛香原料的独特配伍中加进了清热除湿等功效的中药材，具备了不伤胃、不上火、去湿热等特殊的药膳功能。因此，麻辣香锅在夏季的流行也就不足为奇了。\n"+
                "香锅配料:\n" +
                "材料:\n" +
                "麻辣香锅的材 料非常广泛，基本适合炒制的都可以用来做麻辣香锅，但是基本需要事先处理一下，就是用水焯熟，可以把麻辣香锅的材料分成以下几大类，大家可以根据自己的喜好来选择。\n" +
                "蔬菜类：青笋、莲藕、竹笋、圆白菜、蘑菇、金针菇、花菜、西兰花、土豆、红薯等。\n" +
                "干货类：木 耳、魔芋等。\n" +
                "海鲜类：鱿鱼、虾、螃蟹等。\n" +
                "肉类：五花肉、午餐肉、牛蛙、老肉片、鸭肠、脆皮肠、鳝鱼、鸡爪、鸭爪等。\n" +
                "内脏类 ：百叶、毛肚、鸭肠、鸭胗，鸡胗等。\n" +
                "丸类：素丸子、肉丸、鱼丸等。\n" +
                "麻辣香锅\n" +
                "麻辣香锅\n" +
                "豆制品 ：豆腐干、腐竹、冻豆腐、豆皮等","mes");
        maList.add(pr);
        maList.add(mes);
    }
}
