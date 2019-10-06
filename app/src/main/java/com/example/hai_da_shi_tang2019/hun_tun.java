package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hun_tun extends AppCompatActivity {
private String[]data={"馄饨是起源于中国北方的一道民间传统面食，用薄面皮包肉馅儿，下锅后煮熟，食用时一般带汤。\n" +
        "由来:\n" +
        "汉朝匈奴之说:\n" +
        "过去老北京有“冬至馄饨夏至面”的说法。相传汉朝时，北方匈奴经常骚扰边疆，百姓不得安宁。当时匈奴部落中有浑氏和屯氏两个首领，十分凶残。百姓对其恨之入骨，于是用肉馅包成角儿，取\"浑\"与\"屯\"之音，呼作\"馄饨\"。恨以食之，并求平息战乱，能过上太平日子。因最初制成馄饨是在冬至这一天，所以在冬至这天家家户户吃馄饨。\n" +
        "馄饨发展至今，更成为名号繁多，制作各异，鲜香味美，遍布全国各地，深受人们喜爱的著名小吃。馄饨名号繁多，江浙等大多数地方称馄饨，而广东则称云吞，湖北称包面，江西称清汤，四川称抄手，新疆称曲曲等等。\n" +
        "道教之说:\n" +
        "另有一种说法：冬至之日，京师各大道观有盛大法会。道士唪经、上表，庆贺元始天尊诞辰。道教认为，元始天尊象征混沌未分，道气未显的第一大世纪。故民间有吃馄饨的习俗。《燕京岁时记》云：“夫馄饨之形有如鸡卵，颇似天地混沌之象，故于冬至日食之。”实际上“馄饨”与“混沌”谐音，故民间将吃馄饨引伸为，打破混沌，开辟天地。后世不再解释其原义，只流传所谓“冬至馄饨夏至面”的谚语，把它单纯看做是节令饮食而已。\n" +
        "吃馄饨我国许多地方有冬至吃馄饨的风俗。南宋时，当时临安（今杭州）也有每逢冬至这一天吃馄饨的风俗。宋朝人周密说，临安人在冬至吃馄饨是为了祭祀祖先。只是到了南宋，我国才开始盛行冬至食馄饨祭祖的风俗。\n" +
        "馄饨发展至今，更成为名号繁多，制作各异，鲜香味美，遍布全国各地，深受人们喜爱的著名小吃各地有不少特色的，深受食客好评的馄饨，著名的有成都市龙抄手饮食店的抄手，其品种多种，皮薄馅嫩，味美汤鲜；重庆市的过桥抄手，包捏讲究，调料多种，蘸调料食；上海市老城隍庙松运楼三鲜馄饨，馅料讲究，薄皮包馅，味色鲜美；新疆乌鲁木齐市的曲曲，羊肉为馅，皮薄馅嫩，汤清味鲜等等。\n" +
        "西施之说:\n" +
        "相传春秋战国，吴王夫差打败越国，生俘越王勾践，得到许多金银财宝，特别是得到了绝代美女西施后，更加得意忘形，终日沉湎歌舞酒色之中，不问国事。这年冬至节到了，吴王照例接受百官朝拜，宫廷内外歌舞升平。不料饮宴之中，吃腻山珍海味的他竟心有不悦，搁箸不食。这一切西施全都看在眼里，她趁机跑进御厨房，和面又擀皮，欲做出一种新式点心来，以表自己的心意。皮子在她手中翻了几个花样后，终于包出一种畚箕式的点心。放入滚水里一氽，点心便一只只泛上水面。她盛进碗里，加进鲜汤，撒上葱、蒜、胡椒粉，滴上香油，献给吴王。吴王一尝，鲜美至极，一口气吃了一大碗，连声问道：“这为何种点心？”西施暗中好笑：这个无道昏君，成天浑浑噩噩，真是混沌不开。听到问话，她便随口应道：“馄饨。”从此，这种点心便以“馄饨”为名流入民间。吴越人家不但平日爱吃馄饨，而且为了纪念西施的智慧和创造，还把它定为冬至节的应景美食。\n" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hun_tun);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(hun_tun.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);}
}
