package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class gao_tang_shi_jin_fen extends AppCompatActivity {
private String[]data={"高汤是烹饪中常用的一种辅助原料，以往通常是指鸡汤，经过长时间熬煮，其汤水留下，用于烹制其他菜肴时，在烹调过程中代替水，加入到菜肴或汤羹中，目的是为了提鲜，使味道更浓郁。\n" +
        "高汤是烹饪中最常用的辅料之一。高汤的做法很多，有荤有素，主要有鸡高汤、猪高汤、牛高汤、鱼高汤、蔬菜高汤等。\n" +
        "高汤是用老母鸡、鸡骨、鸽子、猪骨、瑶柱、冰糖、白胡椒粒、桂圆肉、生姜等为主要材料熬制成的清汤。其熬制考究、用料丰富、味道鲜美、营养丰富，是菜肴烹调的调料或原料，主要用于烹调上汤菜心、上汤时蔬、鱼翅捞饭、煲仔翅、煲仔饭等菜肴。\n" +
        "高汤功效:\n" +
        "（1）骨汤抗衰老：骨汤中的特殊养分以及胶原蛋促进微循环，50-59岁这十年是人体微循环由盛到衰的转折期，骨骼老化速度快，多喝骨头汤往往可收到药物难以达到的功效。\n" +
        "\n" +
        "（2）鱼汤防哮喘：鱼汤中含有一种特殊的脂肪酸，它具有抗炎作用，可以治疗肺呼吸道炎症，预防哮喘发作，对儿童哮喘病最为有效。\n" +
        "（3）菜汤抗污染：各种新鲜蔬菜含有大量碱性成分，其溶于汤中通过消化道进入人体内可使体液环境呈正常的弱碱性状态，有利于人体内的污染物或毒性物质重新溶解，随尿排出体外。\n" +
        "（4）鸡汤抗感冒：鸡汤特别是母鸡汤中的特殊养分，可加快咽喉部及支气管膜的血液循环，增强粘液分泌，及时清除呼吸道病毒，缓解咳嗽、咽干、喉痛等症状。\n" +
        "（5）海带汤御寒：海带含有大量的碘元素而碘元素有助于四状腺激素的合成。\n" +
        ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gao_tang_shi_jin_fen);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(gao_tang_shi_jin_fen.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
