package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hai_xian_wu_dong_mian extends AppCompatActivity {
private String[]data={"海鲜生吃应先冷冻、浇点淡盐水。牡蛎及一些水生贝类常存在一种“致伤弧菌”细菌，对肠道免疫功能差的人来说，生吃海鲜具有潜在的致命危害。医学专家指出，将牡蛎等先放在冰上，再浇上一些淡盐水，能有效杀死这种细菌，这样生吃起来更安全。\n" +
        "海产品虽然含有丰富的营养物质，但是不宜多吃。受海洋污染的影响，海产品内往往含有毒素和有害物质，过量食用易导致脾胃受损，引发胃肠道疾病。若食用方法不当，重者还会发生食物中毒。所以，食用海产品要注意适量适度，一般每周一次即可。\n" +
        "乌冬面（日文：うどん；英文：udon，在日文汉字中写为：饂饨），在中国大陆及港澳地区也被称为乌冬面。\n" +
        "乌冬面是最具日本特色的面条之一，与日本的荞麦面、绿茶面并称日本三大面条，是日本料理店 [1]  不可或缺的主角。其口感介于切面和米粉之间，口感偏软，再配上精心调制的汤料，就成了一道可口的面食。是将盐和水混入面粉中制作成的白色较粗（直径4毫米～6毫米）的面条。冬天加入热汤、夏天则放凉食用。凉乌冬面可以蘸被叫做“面佐料汁”的浓料汁食用。\n" +
        "最经典的日本乌冬面做法，离不了牛肉和高汤，面条滑软，酱汤浓郁，所以去日本，一定要尝一碗香川县的牛肉乌冬面。\n" +
        "乌冬面反式脂肪酸为零、并且含有很多高质量的碳水化合物。通过配合不同的佐料、汤料、调味料可以尝到各种不同的口味。有的时候也会在面上加上裙带菜、蔬菜天妇罗、小葱一起食用。在日本老少咸宜，不论在家里还是在外吃饭，乌冬都是一种很常见的食品。\n" +
        "历史起源:\n" +
        "日本历来小麦种植不普遍，缺少面食文化。当今日本的面食文化是受中国和西方的影响而形成，乌冬面便是因唐朝面食传入日本而产生。\n" +
        "根据香川县的口头传说，空海（弘法大师，西元774─835）由唐国带回面条的制法，拯救了赞岐当地的贫民。因为濑户内海雨水稀少，很难种米而传授给赞岐人，一般认为，这就是现在的赞岐乌冬的原型。\n" +
        "起源自奈良时代就已兴盛的唐果子（即唐朝传来的糕点）──索饼（sakubei）、馎饦（hakutaku,中文音博拖）、馄饨（konton）。\n" +
        "索饼（sakubei）- 用面粉及米粉揉制成细长交叉的油炸饼。阴历7月7日用以在驱除疟疾的仪式食用。索饼的系统，发展为现今的素面、五岛乌冬、稻庭乌冬。\n" +
        "馎饦（hakutaku）- 用面粉揉制成绳状或是团状切割的糕点。演变为今日的馎饦（houtou）。\n" +
        "馄饨（konton）- 面粉内包肉馅等，或煮或蒸的糕点。演变为今日的饺子或馄饨。\n" +
        "现今日本乌冬的形状诞生于室町时代（西元1336─1573）中期，元禄时代（西元1688─1703）也出现在江户、京都、大阪及琴平的乌冬店。\n" +
        "名字来历:\n" +
        "乌冬（udonn) undonn的发音是由unn-donn转变而来的，「乌冬」在日本也经常写成“うどん”，但是在比较有名一点的老字号，则经常写成另外两个汉字：饂（wen）饨。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hai_xian_wu_dong_mian);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(hai_xian_wu_dong_mian.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
