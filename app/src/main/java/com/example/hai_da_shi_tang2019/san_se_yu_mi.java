package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class san_se_yu_mi extends AppCompatActivity {
private String[]data={"营养价值:\n" +
        "玉米属禾木科植物五蜀黍，玉米籽粒由胚乳、胚、皮、尖端等组成，其含量分别为82%、12%、5%、1%。玉米胚是种子的胚乳，具有很高的营养价值，每100g中含脂肪4.6g以上、蛋白质8.2g、碳水化合物70.6g以上、粗纤维1.3g以上、钙17mg以上、铁2.0mg以上、磷21mg以上、尼克酸2.4mg以上、核黄素0.14mg以上。淀粉主要存在于胚乳中，胚内含有大量的油脂和灰分。 [3] \n" +
        "玉米中的维生素含量非常高，是稻米、小麦的5-10倍，在所有主食中，玉米的营养价值和保健作用是最高的。玉米中含有的核黄素等高营养物质，对人体是十分有益的。 [2] \n" +
        "值得注意的是，特种玉米的营养价值要高于普通玉米，鲜玉米的水分、活性物、维生素等各种营养成分也比老玉米高很多。 [2] \n" +
        "药用价值:\n" +
        "据《本草纲目》记载：玉蜀黍种出西土，甘平无毒，能调中开胃。玉米的\n" +
        "花粉、胚芽中还含有大量的维生素E和玉米黄酮，经常食用玉米制品可延缓人体衰老，增强人的体力和耐力。玉米果糖浆能防止牙龈出血，对心血管疾病的治疗具有辅助功效。将玉米变性淀粉涂于人体烧伤处可使患处不产生疤痕。玉米淀粉还是良好的生产青霉素的培养基。氧化后的玉米右旋糖制成的山梨醇膏，可用于制备抗坏血酸片剂。玉米还有美容瘦身的作用。与大豆、小麦相比，玉米的脂肪、蛋白质含量较低，碳水化合物含量较高，因而玉米制品越来越受到健身以及减肥人士的青睐。 [3] "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_san_se_yu_mi);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(san_se_yu_mi.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
