package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class jin_zhen_gu_guo_zai extends AppCompatActivity {
private String[]data={"金针菇是秋冬与早春栽培的食用菌，以其菌盖滑嫩、柄脆、营养丰富、味美适口而著称于世，特别是凉拌菜和火锅的上好食材，其营养丰富、清香扑鼻而且味道鲜美，深受大众的喜爱。\n"+
"功能成分:\n" +
        "金针菇还含有独特功效的功能成分，如有多种药理作用的蛋白，有抗癌作用的多糖等，这些成分使得金针菇更加有价值。  \n" +
        "功能性蛋白\n" +
        "金针菇中含多种功能性蛋白，如核糖体失活蛋白（Robo-someinactitatingproteins，RIP）具有抗肿瘤、抗病毒、抗虫、抗真菌以及抗人体免疫缺陷病毒（HIV）等活性；金针菇毒素（Flammutoxin，FTX）是一种成孔溶细胞素（Pore-formingcytoly-sin），可引起哺乳动物红细胞裂解，使肿瘤细胞溶胀破裂，并能改变肠上皮细胞的渗透性，具有促进药物吸收等作用；真菌免疫调节蛋白（Fungalimmunomodulatoryproteins，FIP）其不仅具有与免疫球蛋白重链可变区相似的结构，而且具有抑制过敏反应、促进核酸和蛋白质合成、加速代谢的功能，能够增强机体的免疫力，具有抗癌、抗过敏、抗增殖、刺激免疫细胞产生多种细胞因子和免疫调节功能。  \n" +
        "多糖\n" +
        "金针菇的多糖也有很好的抗癌作用。1968年，日本Kamasuka等人最先报道了其多糖成分对小鼠肉瘤S-180有明显的抑制作用。1982年，日本癌中心研究所的池川先生研究证实，金针菇提取物具有很强的抗癌效果。金针菇菌丝体能产生具有很高抗肿瘤活性的多糖，其一就是胞内多糖，结构为β-1，3-葡聚糖，对小鼠肉瘤S-180的抑制率高达96%，抗肿瘤活性比香菇多糖和云芝多糖都高。日本的大重远等从金针菇的发酵液中提取出胞外抗癌杂多糖，称为KM-45。KM-45是一种灰白色的粉末，它的平均分子量介于104~105之间。它对毒瘤S-180和艾氏腹水癌的效果比子实体、菌丝体作为原料得到的多糖更具有速效性和高效性，对肉瘤S-180的抑制率为70%，对腹水瘤的抑制率为80%，且对细胞无任何毒副作用。KM-45主要由D-葡萄糖、D-半乳糖、D-甘露糖、D-木糖和D-阿拉伯糖组成。 \n" +
        "其他\n" +
        "金针菇的铁含量是菠菜的20倍，又有许多纤维质，可促进新陈代谢，并有镇定的作用，适合孕妇产后多吃。其含有的酸性和中性植物纤维可吸附胆汁酸盐，调节体内胆固醇代谢，降低血浆中胆固醇的含量，还可促进肠胃蠕动，强化消化系统的功能，它能预防和治疗肝脏系统及肠胃道溃疡。同时，金针菇又是一种高钾低钠食品，并含有VB1，VB2，VE以及较高含量的微量元素锌。这些不仅对儿童的生长发育有很大好处，也特别适宜于高血压病人和中老年人食用。 \n" +
        "药理活性:\n" +
        "抗肿瘤与免疫调节\n" +
        "从金针菇中分离到具有抗癌活性的化合物，包括金针菇多糖、真菌免疫调节蛋白、甾体化合物、单萜、倍半萜、酚酸、糖蛋白等。从金针菇中分离纯化的金针菇多糖具有明显的抗肿瘤活性，主要通过抗氧化和清除自由基的功能抑制肿瘤细胞生长，干扰肿瘤细胞生化代谢和有丝分裂，诱导肿瘤细胞凋亡等方式来抵抗肿瘤。\n" +
        "降脂\n" +
        "金针菇中的膳食纤维不能被人体内的酶分解和消化道吸收，但是能够与胆固醇、胆酸结合，减少人体肝脏中胆酸的堆积，促进胆固醇代谢为胆酸，降低人体小肠中胆固醇含量，干扰小肠对脂质的吸收。Rahman等从金针菇中提取的多酚化合物也具有延缓LDL氧化的作用，具有治疗动脉粥样硬化的潜力。\n" +
        "抑菌、消炎和抗病毒\n" +
        "金针菇中的金针菇多糖（FVP）不仅有抗肿瘤、抗癌活性，还有抗细菌、抗真菌活性。  \n" +
        "改善记忆力\n" +
        "金针菇多糖可有效改善东莨菪碱引起的大鼠记忆功能障碍。采用金针菇多糖治疗大鼠，能有效防止大鼠抗氧化防御酶活性的降低，阻止东莨菪碱引起的大鼠硫代巴比妥酸反应物含量升高，改善脑部氧化应激反应，为治疗前脑基底类胆碱神经元的缺失、脑部活性氧产生和氧化酶作用不平衡引起的阿尔茨海默病等脑部损伤疾病提供药物基础。此外，金针菇多糖还能维持多巴胺、去甲肾上腺素、羟色胺等神经传导物质的水平，这些神经传导物质与人脑学习和记忆密切相关。利用金针菇多糖治疗记忆障碍模型小鼠，发现能有效改善障碍小鼠的学习记忆能力。因此，金针菇又称“智力菇”、“增智菇”，在健脑益智上应用前景广阔。  \n" +
        "抗黑色素沉着、抗褐变\n" +
        "金针菇中发现的麦角硫因能显著降低多酚氧化酶活性，阻止多酚氧化酶引起的虾、螃蟹等海鲜的黑色素沉着或褐变。金针菇提取物是一种很好的抗黑色素、抗褐变的天然制剂，在食品工业上有巨大的应用潜力。此外，金针菇提取物在美白类化妆品产业上也有应用前景。\n" +
        "保护肝脏\n" +
        "近年来，金针菇多糖还被发现具有保护肝脏的作用。Pang等在金针菇中分离到α（1→4）-D-葡聚糖，是一种水溶性多糖FVP2，能够增强小鼠初级肝脏细胞的生长，抑制四氯化碳引起的急性肝损伤小鼠肝脏细胞内丙氨酸转氨酶（ALT）的释放。ALT主要存在于肝脏细胞中，肝脏细胞的损伤或坏死都会引起ALT浓度的升高，ALT是衡量肝细胞损伤程度的指标。此外，金针菇多糖还能提高肝脏细胞超氧化物歧化酶活性，增强细胞清除自由基的能力，减小自由基对细胞膜的损害，抑制脂质发生过氧化反应，具有保肝、护肝的效果。  \n" +
        "抗骨骼肌疲劳\n" +
        "金针菇多糖具有延缓骨骼肌疲劳的作用。孙洪兆等以电刺激蟾蜍腓\n" +
        "肠肌为疲劳模型，金针菇多糖溶液能显著降低腓肠肌收缩幅度并且具有剂量依赖性。此外，金针菇多糖还能通过免疫调节作用显著降低运动疲劳大鼠的血清肌酸激酶和尿素氮含量，增加大鼠血液中乳酸脱氢酶活力，加速大鼠运动后恢复期血乳酸的清除，促进机能恢复。金针菇多糖对骨骼肌疲劳的延缓作用及血液相关因子的调节作用为消除运动疲劳、减小运动损伤的研究提供了理论基础。 "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jin_zhen_gu_guo_zai);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(jin_zhen_gu_guo_zai.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
