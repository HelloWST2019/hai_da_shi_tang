package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hei_jiao_zhu_pai extends AppCompatActivity {
private String[]data={"黑椒猪排:\n" +
        "浓郁的黑椒香气，配上纯厚的底香味，风味丰富，醇厚，诱人的烧烤香气让人胃口大开；烤制出来的烤肉呈天然的酱棕色，保留着肉本身的香味，其表面布有黑椒颗粒； 黑椒烧烤腌料是复合调味料，可轻松烤制牛扒、猪扒、排骨、肉串等。菜肴所属类别烤\n" +
        "猪排，是指炸过或煎过的大片瘦猪肉，是在西餐中出现的一道美食，和牛排一样深受大家的喜爱，比较好吃，闻上去很香。\n" +
        "猪排并不是我们通常所吃的猪排骨，其实它就是一块平整的猪肉，而且没有骨头也没有太多肥的，可以十分方便地食用，没有任何“阻拦”。一般的猪排都会使用里脊肉。\n" +
        "营养价值:\n" +
        "排骨除含蛋白、脂肪、维生素外，还含有大量磷酸钙、骨胶原、骨粘蛋白等，可为幼儿和老人提供钙质。\n" +
        "排骨有很高的营养价值，具有滋阴壮阳、益精补血的功效。熬汤来放上葱，和一些相应的调味料，煮过后非常美味，也很有营养。\n" +
        "食用功效\n" +
        "1、补钙：猪排中含有大量的磷酸钙、骨胶原、骨粘蛋白等，是补钙的好食材，尤其对于正在长身体的青少年儿童和容易发生骨质疏松的老人十分有益。\n" +
        "2、补血：猪排能够提供血红素和促进铁吸收的半胱氨酸，它们具有很强的补血功效，可以有效应对身体贫血。\n" +
        "3、滋阴补阳：猪排有滋阴壮阳和益精补血的功效，正在备孕期的夫妻可以在饮食中增加一些瘦猪肉，可以增强体质，达到更好的备孕效果。\n" +
        "4、补肾润燥：猪排有补肾养血和滋阴润燥的功效，主治热病伤津、消渴羸瘦、肾虚体弱、产后血虚、燥咳、便秘、补虚、滋阴、润燥、滋肝阴，润肌肤，利二便和止消渴等症。\n" +
        "适宜人群:\n" +
        "一般人都可食用。适宜阴虚不足，头晕，贫血，老人燥咳无痰，大便干结，以及营养不良者食用。\n" +
        "禁忌人群:\n" +
        "湿热痰滞内蕴者、外感病人忌食；肥胖、血脂较高、高血压者慎食。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hei_jiao_zhu_pai);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(hei_jiao_zhu_pai.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
