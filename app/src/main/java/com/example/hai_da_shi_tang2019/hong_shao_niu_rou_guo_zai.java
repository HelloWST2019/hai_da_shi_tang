package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hong_shao_niu_rou_guo_zai extends AppCompatActivity {
    private String[]data={"红烧是烹调中最基本的一种技法，应用范围很广，成品多为深红、浅红或枣红色，它的色泽红润，味道鲜咸微甜，酥烂适口，汁黄浓香。\n"+
    "食用价值:\n" +
            "1.牛肉富含肌氨酸\n" +
            "牛肉中的肌氨酸含量比任何其它食品都高，它对增长肌肉、增强力量特别有效。在进行训练的头几秒钟里，肌氨酸是肌肉燃料之源，有效补充三磷酸腺苷，使训练能坚持得更久。\n" +
            "2.牛肉含维生素B6\n" +
            "蛋白质需求量越 大，饮食中增加的维生素B6就越多。牛肉含有足够的维生素B6，可帮你增强免疫力，促进蛋白质的新陈代谢和合成，从而有助于紧张训练后身体的恢复。\n" +
            "3.牛肉含肉毒碱\n" +
            "鸡肉、鱼肉中肉毒碱和肌氨酸的含量很低，牛肉却很高。肉毒碱主要用于支持脂肪的新陈代谢，产生支链氨基酸，是对健美运动员 增长肌肉起重要作用的一种氨基酸。\n" +
            "4.牛肉含钾和蛋白质\n" +
            "钾是运动员饮食中比较缺少的矿物质。钾的水平低会抑制蛋白质的合成以及生长激素的产生，影响肌肉生长。牛肉中富含蛋白 质：4盎司瘦里脊就产生22克一流的蛋白质。\n" +
            "5.牛肉是亚油酸的低脂肪来源\n" +
            "牛肉中脂肪含量很低，却富含结合亚油酸，潜在的抗氧化剂可以有效对抗举重等运动中造成的组织损伤。另外，亚油酸还可以作为抗氧化剂保持肌肉块。\n" +
            "6.牛肉含锌、镁\n" +
            "锌是一种有助于合成蛋白质、促进肌肉生长的抗氧化剂。锌与谷氨酸盐和维生素B6共同作用是：能增强免疫系统。镁,支持蛋白质 的合成、增强肌肉力量，更重要的是可提高胰岛素合成代谢的效率。\n" +
            "7.牛肉含铁\n" +
            "铁，造血必需的 矿物质。鸡、鱼、火鸡中少得可怜的铁含量形成对比的是，牛肉中富含铁质。\n" +
            "8.牛肉含丙胺酸\n" +
            "丙胺酸的作用是 ：从饮食的蛋白质中产生糖分。你对碳水化合物的摄取量不足，丙胺酸,能够供给肌肉所需的能量以缓解不足，使你能够继续进行训练。这种氨基酸最大的好处就在于它能够把肌肉从供给能量这一重负下解放出来。\n" +
            "9.牛肉含维生素B12\n" +
            "维生素B12对细胞的产生至关重要，红细胞的作用是：将氧带给肌肉组织。维生素B12,能促进支链氨基酸的新陈代谢，供给身体进 行高强度训练所需的能量。\n" +
            "10.牛肉的食用多样化\n" +
            "连续几周甚至几个月日复一日地食用，鸡胸显得令人生厌。牛肉不同，后腿肉、侧腹肉、上腰肉和细肉片在滋味和口感上都有不同，单调乏味的鸡胸肉的确不可相提并论\n"+
    "锅仔:\n" +
            "一种菜品，颇似于砂锅，类似于火锅，但有不同于火锅，火锅要用底汤，锅仔却讲究原汁原味，一般不加多的涮料，味道比较专一。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hong_shao_niu_rou_guo_zai);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(hong_shao_niu_rou_guo_zai.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
