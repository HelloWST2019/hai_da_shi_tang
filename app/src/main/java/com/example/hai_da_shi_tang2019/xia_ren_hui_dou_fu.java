package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class xia_ren_hui_dou_fu extends AppCompatActivity {
    private String[]data={"虾仁，一种食品，选用活虾为原料，用清水洗净虾体，去掉虾头、虾尾和虾壳。剥壳后的纯虾肉即为虾仁。\n" +
            "虾仁菜肴因为清淡爽口，易于消化，老幼皆宜，而深受食客欢迎。\n" +
            "1. 虾营养丰富，虾仁中含有20%的蛋白质，是蛋白质含量很高的食品之一，虾仁和鱼肉相比，所含的人体必需氨基酸缬氨酸并不高，但却是营养均衡的蛋白质来源，另外，虾仁含有甘氨酸，这种氨基酸的含量越高，虾仁的甜味就越高。\n" +
            "　　2.虾仁和鱼肉禽肉相比，脂肪含量少，并且几乎不含作为能量来源的动物糖质，虾仁中的胆固醇含量较高，同时含有丰富的能降低人体血清胆固醇的牛磺酸，虾仁含有丰富的钾、碘、镁、磷等微量元素和维生素A等成分。还含有丰富的钾、碘、镁、磷等矿物质及维生素A、氨茶碱等成分，且其肉质松软，易消化，对身体虚弱以及病后需要调养的人是好的食物；\n" +
            "3. 虾中含有丰富的镁，镁对心脏活动具有重要的调节作用，能很好的保护心血管系统，它可减少血液中胆固醇含量，防止动脉硬化，同时还能扩张冠状动脉，有利于预防高血压及心肌梗死；\n" +
            "4. 虾的通乳作用较强，并且富含磷、钙、对小儿、孕妇尤有补益功效；\n" +
            "5.虾仁体内很重要的一种物质就是虾青素，就是表面红颜色的成分，虾青素是发现的最强的一种抗氧化剂，颜色越深说明虾青素含量越高。广泛应用在化妆品、食品添加剂、以及药品中。日本大阪大学的科学家发现，虾体内的虾青素有助于消除因时差反应而产生的“时差症”。 \n" +
            "适宜人群:\n" +
            "一般人群均可食用。\n" +
            "1. 中老年人、孕妇、心血管病患者、肾虚阳痿、男性不育症、腰脚无力之人尤其适合食用；\n" +
            "2. 宿疾者、正值上火之时不宜食虾；患过敏性鼻炎、支气管炎、反复发作性过敏性皮炎的老年人不宜吃虾；虾为动风发物，患有皮肤疥癣者忌食。\n" +
            "食疗作用:\n" +
            "虾仁具有补肾壮阳、健胃的功效，熟食能温补肾阳；\n" +
            "凡久病体虚、短气乏力、面黄肌瘦者，可作为食疗补品，而健康人食之可健身强力；\n" +
            "虾仁以酒浸炒，可治肾虚下寒、阳痿不起、遗精早泄等症；生虾仁捣烂外敷，可治脓疮。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xia_ren_hui_dou_fu);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(xia_ren_hui_dou_fu.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
