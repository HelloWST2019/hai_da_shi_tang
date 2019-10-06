package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class xin_ao_er_liang_kao_ji_guo_zai extends AppCompatActivity {
private String[]data={"来源一：相传，18世纪的美国南部小镇，当时有一户人家厨房着火，厨房里饲养的几只鸡没能躲过这场浩劫，家禽在当时是比较值钱的东西，主人很伤心的在整理废墟的时候发现了烤焦的鸡，于是便拾起，看是否还能食用，家里的人也都尝了尝，大家却意外的发现烤焦的鸡很美味，并在鸡的旁边发现了许多厨房的调料瓶，几经摸索后，主人终于烹调出了美味的烤鸡，并开始以卖烤鸡为生，他把这道美味以自己的名字命名为“奥尔良烤鸡”。\n" +
        "奥尔良是法国中部的一个城市，那里的森林植被面积广阔，家畜养殖业发达，从路易王朝开始民间就有吃烤鸡肉的传统，其中，奥尔良地区的鸡肉质地肥美，当地的农田里有一些家畜的喜欢的饲料，清澈的泉水和山间的百草对养殖家畜齐了很大作用，后来那里的烤鸡开始闻名于世，后来成为圣诞节一道必备的大餐。\n"+
"来源二：奥尔良烤翅，是由地名命名的烤翅\n" +
        "新奥尔良（New Orleans, LA），美国南部城市，濒临墨西哥湾，是路易斯安那州一个重要的港口城市。以爵士乐和法国殖民地文化闻名。\n" +
        "同时，美国新奥尔良一带原为印第安人的居住地，法国、西班牙殖民此地百余年，加上得天独厚的地理环境，靠密西西比河，墨西哥湾，这里的饮食自成一体，和爵士乐成了双生花\n" +
        "在新奥尔良的菜系当中，辣椒是必不可少的成分，如Cajun、Creole、Gumbo都以辣椒作为主要配菜材料。这源于辣椒是该地区的盛产作物之一，更因为新奥尔良人对辣椒的偏爱。在新奥尔良，辣椒有更深内涵，它代表一种文化、民族。\n" +
        "除了辣椒，新奥尔良的肉汁烩饭和烤肉也成为当地人的专宠。乡村名曲Jambalaya就是当地一种混合肉类或海鲜，加了肉汁的烩饭。著名的Creole汁酱：番茄、青椒、洋葱、西芹、百里香、月桂、蒜、辣椒粉、糖、胡椒，林林总总的调料构成了它的骨架，搭配了各种食材成就了各式美馔。\n" +
        "印第安人的原始烤肉，也在后来的发展过程中与当地饮食文化逐渐融合。他们坚持保留肉的原汁原味，各种调味食材的加入也都是为这一宗旨服务的。新奥尔良的烤肉，辣中带着甜香，肉汁的香气萦绕在整个餐厅。其中，新奥尔良烤翅就是其中最受欢迎的烤肉产品。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xin_ao_er_liang_kao_ji_guo_zai);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(xin_ao_er_liang_kao_ji_guo_zai.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
