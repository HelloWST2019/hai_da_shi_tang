package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class suan_la_sun_jian_fen extends AppCompatActivity {
    private String[]data={"笋是竹子初从土里长出的嫩芽，味鲜美，可以做菜。竹为质化植物，食用部分为初生、嫩肥、短壮的芽或鞭\n" +
            "功效作用:\n" +
            "1、开胃健脾。\n" +
            "竹笋独有的清香，具有开胃、促进消化、增强食欲的作用，可用于治疗消化不良，脘痞纳呆之病症。\n" +
            "2、增强机体免疫力。\n" +
            "竹笋中植物蛋白、维生素及微量元素的含量均很高，有助于增强机体的免疫功能，提高防病抗病能力。\n" +
            "3、清毒消痰。\n" +
            "竹笋味甘，性微寒，所含脂肪、糖分含量低，孕期上火或是咳嗽痰多的孕妈妈吃竹笋有助于清热解毒，消痰止咳。 [1] \n" +
            "4、静心散热。\n" +
            "竹笋被誉为人体垃圾的“清道夫”，在夏天孕妈妈尤其适合食用竹笋，因为竹笋对孕期手足心热、心烦气躁症状等有辅助治疗功效。\n" +
            "5、宽胸利膈、通肠排便。\n" +
            "竹笋甘寒通利，其所含有的植物纤维可以增加肠道水分的贮留量，促进胃肠蠕动，降低肠内压力，减少粪便粘度，使粪便变软利排出，用于治疗便秘，预防肠癌。\n" +
            "6、降“三高”。\n" +
            "竹笋具有低糖、低脂的特点，富含植物纤维，可降低体内多余脂肪，消痰化瘀滞，治疗高血压、高血脂、高血糖症，且对消化道癌肿及乳腺癌有一定的预防作用。\n" +
            "7、激发脑的潜能。\n" +
            "竹笋的皮和切口处出现的白色粉状物质是一种叫做酪氨酸的蛋白质结晶。在体内，酪氨酸被输送到脑部，是激发抗压意欲和脑的潜能所必需的物质。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suan_la_sun_jian_fen);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(suan_la_sun_jian_fen.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
