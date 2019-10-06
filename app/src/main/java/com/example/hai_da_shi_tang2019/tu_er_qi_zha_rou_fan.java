package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class tu_er_qi_zha_rou_fan extends AppCompatActivity {
private String[]data={"土耳其菜系是世界三大菜系之一，而烤肉是土耳其中久负盛名的一个菜肴，正宗的土耳其烤肉主要是用的是牛羊肉，鸡肉，鱼肉为主要食材，土耳其烤肉之所以如此流行，还有和德国有着重要的关系。\n" +
        "土耳其烤肉的历史\n" +
        "在二战之后，土耳其移民在德国的有很多，土耳其烤肉也得以广泛流行开来，同时有了西式的创新，比如在里面加入很多的酱汁和沙拉等等，使得更加的大众化，品种也更多的多元化。\n" +
        "土耳其烤肉有很多种种类，在土耳其文中称为KEBAP，我们平时在一些城市里面也会看到一个师傅拿着大菜刀不停的在正在烤的肉上切下大块的肉，然后放到馍中，这个是土耳其旋转烤肉和土耳其烤肉有异曲同工之妙，但是那明晃晃的大菜刀有时候让人挺担心的。\n" +
        "如果你在土耳其看到了正宗的土耳其烤肉的话，才会早知道自己对这个菜肴的认识有多贫乏。在土耳其任何的一家餐厅里面，我们都可以在菜单上看到最少五个烤肉品种，可以说让人目不暇接。\n" +
        "土耳其烤肉种类:\n" +
        "1、烤肉夹馍\n" +
        "这个是我们最为常见的一种烤肉的，热气腾腾的面饼，把有着浓郁香味的肉夹杂在其中，除了肉之外还有爽口的生菜、脆香的豆芽，咬下一口，香气四溢。\n" +
        "2、烤肉卷饼\n" +
        "卷饼薄而松软，卷上拌好的烧肉，搭配出口感良好的滋味，让人欲罢不能。\n" +
        "3、烤肉汉堡\n" +
        "烤肉汉堡可以说是在传入了欧美国家之后得到的一个创新和发展，更加的符合快节奏的快餐文化，甜香的汉堡饼里面夹上肥瘦相宜肉和生菜，再涂抹上土耳其特制的酱汁，让人美美的享受一番。\n" +
        "4、特味烤肉\n" +
        "在烤的外脆里嫩的烧肉周围夹杂上爽口的生菜和洋葱丝，搭配上特制的鲜香四溢的调味料，拥有很好的味道和口感，分量十足。\n" +
        "土耳其烤肉在制作的时候有着独特的制作工艺，使用的是专业化的旋转设备，拥有很强的可视性，往往通过现场制作的方式吸引到很多的顾客前来观看，风靡欧洲各国，成为了很多国家街头的休闲小吃。\n" +
        "土耳其烤肉并不是简单的直接将肉类烤了即可，而需要事先使用多达十余种调料对牛、羊、鸡等肉类事先进行泡制，等到浸泡腌制了之后，再采用旋转式烤肉机，把肉烤熟了之后再一片片削下搭配上沙拉、配料等食用。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tu_er_qi_zha_rou_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(tu_er_qi_zha_rou_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
