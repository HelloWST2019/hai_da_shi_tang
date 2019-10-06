package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hao_you_dan_chao_fan extends AppCompatActivity {
private String[]data={"蚝油是用蚝（牡蛎）熬制而成的调味料。蚝油是广东常用的传统的鲜味调料，也是调味汁类最大宗产品之一，它以素有\"海底牛奶\"之称的蚝牗牡蛎牍为原料，经煮熟取汁浓缩，加辅料精制而成。\n" +
        "蚝油味道鲜美、蚝香浓郁，黏稠适度，营养价值高，亦是配制蚝油鲜菇牛肉、蚝油青菜、蚝油粉面等传统粤菜的主要配料。\n" +
        "历史起源:\n" +
        "蚝即牡蛎，是一种海生软体动物，肉质鲜美，营养丰富，遍布于我国南方沿海。1888年，在广东省珠海南水乡，一家小小的家庭作坊悄然成立了，主要出售一种新款调味料——蚝油。作坊的主人李锦裳，生于1868年，祖籍广东新会七堡镇涌沥村，幼年丧父，与母亲蔡氏相依为命，务农为生。因为见义勇为得罪了当地恶霸土豪，受到他们迫害，于是背井离乡，辗转来到珠海南水定居，南水是珠江口一个小岛屿，盛产生蚝，李锦裳为补生计，他开设了一间小茶寮，在小茶寮煮蚝出售。\n" +
        "一天，李锦裳与往日一样生火煮蚝，因忙碌着别的事出门忘记照看，很长时间后，传来浓烈香味，他赶忙跑回来，心里想：坏了，恐怕煮糊了！揭开锅盖一看，呈现在他眼前的竟是厚厚一层沉于锅底、色泽棕褐的浓稠汁，香郁扑鼻，引人食欲。于是他随意取了一点放在嘴里品尝，顿觉美味无比。无意之间，一种新的调味品——蚝油就这样发明诞生了！真是“无心插柳柳成荫”，“得来全不费工夫”。李锦裳抓住了这个幸运的机会，灵机一动，专门熬制这一新款调味品出售，并于1888年正式成立李锦记蚝油庄。\n" +
        "1. 蚝油含有丰富的微量元素和多种氨基酸，可以用于补充各种氨基酸及微量元素，其中主要含有丰富的锌元素，是缺锌人士的首选膳食调料；\n" +
        "2. 蚝油中有氨基酸，各种氨基酸的含量协调平衡，其中，谷氨酸含量是总量的一半，它与核酸共同构成蚝油呈味主体，两者含量越高，蚝油味道越鲜美；\n" +
        "3. 蚝油富含牛磺酸，可增强人体免疫力等多种保健功能。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hao_you_dan_chao_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(hao_you_dan_chao_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
