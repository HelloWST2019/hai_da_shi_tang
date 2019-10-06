package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class gang_shi_yun_tun_fen extends AppCompatActivity {
private String[]data={"云吞又称扁食，是两广地区的特色传统小吃的一种，属于粤菜系。不同于大部分南方地区的“馄饨”，初期被归类为饼类之中。 之所以叫云吞， 是因为粤语中馄饨的发音类似于云吞。\n" +
        "经过长年的发展，云吞也有了自己独特的风格，外皮以及里头的馅料都跟馄饨不同。大小一般以“一口吞”为标准，按照老广记的标准，一碗标准碗云吞数量为6颗到8颗。\n" +
        "名称来源:\n" +
        "云吞是广西、广东小吃的一种，源于北方的“馄饨”，初期被归类为饼类之中。传入南方时因“馄饨”与“云吞”的粤语发音相近，又取其“一口一颗”的意思，于是南方人逐渐把“馄饨”称为 “云吞”，而福建等地区称为扁食。再后来经过长期的发展，南方的“云吞”亦有了自己独立的风格，跟北方地区的馄饨有一定区别。云吞与四川人叫的“抄手”、福建人叫的“扁食”相类似，不过用料、外形略有不同。云吞与蛋面一起煮成的云吞面是地道的广东小吃之一。 [1] \n" +
        "历史典故:\n" +
        "相传春秋战国时期，吴王夫差打败越国，生俘越王勾践，得到许多金银财宝，特别是得到了绝代美女西施后，更加得意忘形，终日沉湎歌舞酒色之中，不问国事。这年冬至节到了，吴王照例接受百官朝拜，宫廷内外歌舞升平。不料饮宴之中，吃腻山珍海味的他竟心有不悦，搁箸不食。这一切西施全都看在眼里，她趁机跑进御厨房，和面又擀皮，欲做出一种新式点心来，以表自己的心意。皮子在她手中翻了几个花样后，终于包出一种畚箕式的点心。放入滚水里一氽，点心便一只只泛上水面。她盛进碗里，加进鲜汤，撒上葱、蒜、胡椒粉，滴上香油，献给吴王。吴王一尝，鲜美至极，一口气吃了一大碗，连声问道：“这为何种点心？”西施暗中好笑：这个无道昏君，成天浑浑噩噩，真是混沌不开。听到问话，她便随口应道：“馄饨。”从此，这种点心便以“馄饨”为名流入民间。吴越人家不但平日爱吃馄饨，而且为了纪念西施的智慧和创造，还把它定为冬至节的应景美食。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gang_shi_yun_tun_fen);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(gang_shi_yun_tun_fen.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
