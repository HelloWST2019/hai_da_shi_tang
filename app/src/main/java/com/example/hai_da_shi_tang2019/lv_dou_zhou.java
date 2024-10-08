package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class lv_dou_zhou extends AppCompatActivity {
private String[]data={"绿豆粥指用绿豆为主要材料混合熬制而成的粥。绿豆粥为一种常见的杂粮粥，性寒味甘，有清热解毒，降火消暑的功效，十分适合在夏天食用。\n" +
        "营养价值:\n" +
        "稻米\n" +
        "大米具有很高营养功效，是补充营养素的基础食物；大米可提供丰富B族维生素；大米具有有补中益气、健脾养胃、益精强志、和五脏、通血脉、聪耳明目、止烦、止渴、止泻的功效。\n" +
        "绿豆\n" +
        "绿豆含有丰富营养元素，有增进食欲、降血脂、降低胆固醇、抗过敏、解毒、保护肝脏的作用；绿豆味甘，性凉，入心、胃经；具有清热解毒，消暑除烦，止渴健胃，利水消肿之功效；主治暑热烦渴、湿热泄泻、水肿腹胀、疮疡肿毒、丹毒疖肿、痄腮、痘疹以及金石砒霜草木中毒者。绿豆性寒，素体虚寒者不宜多食或久食，脾胃虚寒泄泻者慎食。\n" +
        "莲子\n" +
        "《本草纲目》称莲子益心脏、厚肠胃、固精气、强筋骨、补虚损、利耳目、除寒湿、止脾泻久痢、赤白浊，女人带下崩中渚血病。中医认为莲子可以治疗脾虚泄泻、心悸不安、失眠、夜寝多梦、男子遗精滑精、妇女月经过多、白带过多、淋浊带下、食欲不振等；它的特点是既能补，又能回，所以可补中止泻、安中固精。莲子营养丰富，含有多种无机盐和维生素，其中丰富的钙质，不仅能固齿，还具有促进凝血，使某些酶活化，维持神经传导性，镇静精神，维持肌肉的伸缩性和心跳的节律，具有安神养心作用。尤其莲子中钾元素含量为所有的植物食品之冠，对维持肌肉的兴奋性、心跳规律和各种代谢有重要的作用。 \n" +
        "红豆\n" +
        "有清心养神、健脾益肾功效，加入莲子、百合更有固精益气、止血、强健筋骨等作用，能治肺燥、干咳，提升内脏活力，增强体力。养生也是护肤的重要的一部分，外调加上内养，才能造就一个水灵灵的女人。红豆在传统医学上，主要应用于行水——去水肿、利气——去脚气、健脾，如将红豆和鲤鱼煮汤食用，对水肿、脚气、小便困难等起食疗作用，还能治疗肝硬化、肝腹水、补体虚；红豆与冬瓜同煮后的汤汁是全身水肿的食疗佳品；红豆与扁豆、薏仁同煮，可治疗腹泻。另外，红豆还可与中药同用，如红豆配连翘和当归煎汤，可治疗肝脓肿；红豆配以蒲公英、甘草煎汤，可治疗肠痛等\n" +
        "百合\n" +
        "味甘微苦，性平，入心肺经；具有润肺止咳、养阴消热、清心安神之效；主治阴虚久咳，痰中带血，咽痛失音；热病后期，余热未清，或情志不遂，虚烦惊悸，失眠多梦，精神恍惚，痈肿。百合除含有淀粉、蛋白质、脂肪及钙、磷、铁、维生素B1、B2.C等营养素外，还含有一些特殊的营养成分，如秋水仙碱等多种生物碱。这些成分综合作用于人体，不仅具有良好的营养滋补之功，而且还对秋季气候干燥而引起的多种季节性疾病有一定的防治作用。中医上讲鲜百合具有养心安神，润肺止咳的功效，对病后虚弱的人非常有益。\n" +
        "草莓\n" +
        "营养丰富，含有果糖、蔗糖、柠檬酸、苹果酸、水杨酸、氨基酸以及钙、磷、铁等矿物质。此外，它还含有多种维生素，尤其是维生素C含量非常丰富，每100克草莓中就含有维生素C60毫克。草莓中所含的胡萝卜素是合成维生素A的重要物质，具有明目养肝作用。草莓还含有果胶和丰富的膳食纤维，可以帮助消化、通畅大便。草莓的营养成分容易被人体消化、吸收，多吃也不会受凉或上火，是老少皆宜的健康食品。\n" +
        "药用价值:n" +
        "中医认为，绿豆性味甘、凉，入心、胃经，有清热解暑，利尿通\n" +
        " 淋，解毒消肿之功，为夏日解暑除烦，清热生津佳品。\n" +
        "《本草纲目》言其\"治痘毒，利肿胀，为食中要药；解金石砒霜草木一切诸毒....真济世之良谷也\"。《随息居饮食谱》言\"绿豆甘凉，煮食清胆养胃，解暑止渴\"。\n" +
        "《食药医镜》言其\"清火化痰，疗痈肿痘烂，食之调和五脏，安精神，补元气，润皮肤，清暑解毒\"。\n" +
        "《本草求真》言\"绿豆性味甘寒，服此性善解毒，故凡一切痈肿等症，无不用此奏效\"。《日用本草》言其\"解诸热，益气，解酒食诸毒\"。\n" +
        "《食鉴本草》言其\"作枕明目\"。药理分析表明，绿豆有防止实验性动脉粥样硬化症、家兔血脂上升的作用，还能使已升高的血脂迅速下降。其提取液有明显的解毒保肝作用，此外，绿豆皮对葡萄球菌有较好的抑制作用。炎夏季节，暑热熏蒸，大汗淋漓，常食绿豆粥，既可补充人体丢失的营养成分，又可果腹防病，正如《本草纲目》所言：绿豆粥：解热毒，止烦渴是也 。\n" +
        "【注意事项】\n" +
        "1、《食鉴本草》言绿豆\"清热解毒，不可去皮，去皮壅气\"。\n" +
        "2、绿豆性寒，脾胃虚寒，或阳虚之人不宜长服。\n" +
        "食用指南:\n" +
        "忌食人群\n" +
        "寒凉体质的人\n" +
        "如四肢冰凉乏力、腰腿冷痛、腹泻便稀。这些人体内本无热，吃了绿豆反而会加重四肢冰凉等症状，甚至引发其他疾病。\n" +
        "老人、儿童等体质虚弱的人 绿豆含蛋白质极高，和鸡肉相当，是粳米的3倍。绿豆含的是大分子蛋白质，需要在酶的作用下转化为小分子肽、氨基酸，才能被人体吸收。老人、儿童等肠胃消化功能比较差，很难在短时间内消化掉绿豆中的蛋白质，容易因消化不良导致腹泻。\n" +
        "正在服药的人\n" +
        "由于绿豆具有解毒作用，因此服用的药物中如果含有有机磷、钙、钾等成分，绿豆会与这些成分结合成沉淀物，从而分解药效，影响治疗。特别是正在服用一些温补性中药的人，更不宜吃绿豆，以免减低药效。不过，一些清热泻火中药，如黄连、黄芩、黄柏、大青叶、板蓝根、牛黄、金银花等，和绿豆汤（粥）或绿豆糕等同服，可起到相辅相成的作用，达到事半功倍的效果。\n" +
        "月经期妇女\n" +
        "她们的身体正处于失血状态，体质偏差，再吃寒凉食品，容易伤害脾胃。\n" +
        "不少人喜欢把做好的绿豆汤放进冰箱里，喝时取出，口感冰爽。其实，绿豆汤不宜喝冰镇的，否则会造成脾胃失衡、腹泻。脾胃虚弱的人不一定非得选择喝绿豆汤，可以选择吃绿豆粥。绿豆粥的做法是：将大米或小米和绿豆同时下锅加水熬煮成粥，大米、小米对脾胃有滋补作用。\n"
        };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lv_dou_zhou);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(lv_dou_zhou.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
