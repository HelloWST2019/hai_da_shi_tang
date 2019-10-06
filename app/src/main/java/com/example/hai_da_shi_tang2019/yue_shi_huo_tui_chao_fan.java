package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class yue_shi_huo_tui_chao_fan extends AppCompatActivity {
    private String[]data={"起源\n" +
            "粤菜历史悠久，源自中原，起源可远溯至距今两千多年的汉初，经历了两千多年的发展历程后，到了晚清时期已渐成熟 [1]  。广东物产特别丰富，唾手可得，烹而食之，由此养成的喜好鲜活、生猛的饮食习惯。随着历史变迁和朝代更替，中原移民不断南迁，带来了“烩不厌细，食不厌精”的中原饮食风格。\n" +
            "漫长的岁月，使广东既继承了中原饮食文化的传统，又博采外来及各方面的烹饪精华，再根据本地的口味、嗜好、习惯，不断吸收、积累、改良、创新，从而形成了菜式繁多、烹调考究、质优味美的饮食特色。近百年来已成为国内最具代表性和最有世界影响的饮食文化之一。 [3] \n" +
            "形成\n" +
            "粤菜系的形成和发展与广东的地理环境、经济条件和风俗习惯密切相关。广东地处亚热带，濒临南海，雨量充沛，四季常青，物产富饶。故广东的饮食，一向得天独厚。早在西汉《淮南子·精神篇》中就载有粤菜选料的精细和广泛，而且可以想见千余年前的广东人已经对用不同烹调方法烹制不同的异味游刃有余。后来，中原移民不断南迁，带来了“烩不厌细，食不厌精”的中原饮食风格。漫长的岁月，使广东既继承了中原饮食文化的传统，又博采外来及各方面的烹饪精华，再根据本地的口味、嗜好、习惯，\n" +
            "不断吸收、积累、改良、创新，从而形成了菜式繁多、烹调考究、质优味美的饮食特色。近百年来已成为国内最具代表性和最有世界影响的饮食文化之一。\n" +
            "粤菜不断吸收外地特别是中国北方烹饪技艺和西餐烹饪技艺，灵活善变，贯通中西。粤厨们秉持着广东人那种灵活多变的发散性思维方式。他们具备一种素质，就是对一切可吃的东西，总是无休无止地进行研究，怎样才能把它们加工得好吃，更好吃，以满足人们“常吃常新”的饮食要求。\n" +
            "粤菜具有海纳百川的根基，善于取各家之长，为我所用，常学常新。粤菜的移植，并不生搬硬套，乃是结合广东原料广博、质地鲜嫩，人们口味喜欢清鲜常新的特点，加以发展，触类旁通。由北方的“爆法”演进为“油泡法”；由整形烹制的“扒”改进为分别烹制分层次上盘的“扒”，扩大了用料范围；引进西餐的焗法、吉列炸法、猪扒、牛扒，改造为自己的烹调方法和名菜；借鉴西餐的SAUCE（调味汁）做法，首创了粤菜的酱汁调味法等，无不体现出粤菜的创新性。 [3] \n" +
            "粤厨们还敢于对传统大胆否定，不断进行过滤、筛选。例如粤菜的烹调理论，有“猪不落姜、羊不落酱”的说法。意思是说烹调猪肉、羊肉时，不能加入生姜与酱油，否则会使肉类的鲜味丢失。年轻一代的粤厨们，勇敢地突破了前辈们留下来的戒律，通过不断探索与研试，一批诸如姜汁爆肉片、酱烧羊蹄、XO酱羊排等创新菜肴被推出应市，并深受消费者欢迎。 \n" +
            "除了正式菜点，广东的小食、点心也制作精巧，而各地的饮食风俗也有其独到之处，如广东早茶，潮州的工夫茶，这些饮食风俗已经超出“吃”的范畴，成为广东的饮食文化。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yue_shi_huo_tui_chao_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(yue_shi_huo_tui_chao_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
