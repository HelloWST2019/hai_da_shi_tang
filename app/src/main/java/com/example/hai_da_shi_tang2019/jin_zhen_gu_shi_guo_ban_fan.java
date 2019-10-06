package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class jin_zhen_gu_shi_guo_ban_fan extends AppCompatActivity {
private String[]data={"金针菇药理活性:\n" +
        "抗肿瘤与免疫调节\n" +
        "从金针菇中分离到具有抗癌活性的化合物，包括金针菇多糖、真菌免疫调节蛋白、甾体化合物、单萜、倍半萜、酚酸、糖蛋白等。从金针菇中分离纯化的金针菇多糖具有明显的抗肿瘤活性，主要通过抗氧化和清除自由基的功能抑制肿瘤细胞生长，干扰肿瘤细胞生化代谢和有丝分裂，诱导肿瘤细胞凋亡等方式来抵抗肿瘤。 [6] \n" +
        "降脂\n" +
        "金针菇中的膳食纤维不能被人体内的酶分解和消化道吸收，但是能够与胆固醇、胆酸结合，减少人体肝脏中胆酸的堆积，促进胆固醇代谢为胆酸，降低人体小肠中胆固醇含量，干扰小肠对脂质的吸收。Rahman等从金针菇中提取的多酚化合物也具有延缓LDL氧化的作用，具有治疗动脉粥样硬化的潜力。 [6] \n" +
        "抑菌、消炎和抗病毒\n" +
        "金针菇中的金针菇多糖（FVP）不仅有抗肿瘤、抗癌活性，还有抗细菌、抗真菌活性。 \n" +
        "改善记忆力\n" +
        "金针菇多糖可有效改善东莨菪碱引起的大鼠记忆功能障碍。采用金针菇多糖治疗大鼠，能有效防止大鼠抗氧化防御酶活性的降低，阻止东莨菪碱引起的大鼠硫代巴比妥酸反应物含量升高，改善脑部氧化应激反应，为治疗前脑基底类胆碱神经元的缺失、脑部活性氧产生和氧化酶作用不平衡引起的阿尔茨海默病等脑部损伤疾病提供药物基础。此外，金针菇多糖还能维持多巴胺、去甲肾上腺素、羟色胺等神经传导物质的水平，这些神经传导物质与人脑学习和记忆密切相关。利用金针菇多糖治疗记忆障碍模型小鼠，发现能有效改善障碍小鼠的学习记忆能力。因此，金针菇又称“智力菇”、“增智菇”，在健脑益智上应用前景广阔。 [6] \n" +
        "抗黑色素沉着、抗褐变\n" +
        "金针菇中发现的麦角硫因能显著降低多酚氧化酶活性，阻止多酚氧化酶引起的虾、螃蟹等海鲜的黑色素沉着或褐变。金针菇提取物是一种很好的抗黑色素、抗褐变的天然制剂，在食品工业上有巨大的应用潜力。此外，金针菇提取物在美白类化妆品产业上也有应用前景。\n" +
        "保护肝脏\n" +
        "近年来，金针菇多糖还被发现具有保护肝脏的作用。Pang等在金针菇中分离到α（1→4）-D-葡聚糖，是一种水溶性多糖FVP2，能够增强小鼠初级肝脏细胞的生长，抑制四氯化碳引起的急性肝损伤小鼠肝脏细胞内丙氨酸转氨酶（ALT）的释放。ALT主要存在于肝脏细胞中，肝脏细胞的损伤或坏死都会引起ALT浓度的升高，ALT是衡量肝细胞损伤程度的指标。此外，金针菇多糖还能提高肝脏细胞超氧化物歧化酶活性，增强细胞清除自由基的能力，减小自由基对细胞膜的损害，抑制脂质发生过氧化反应，具有保肝、护肝的效果。 [6] \n" +
        "抗骨骼肌疲劳\n" +
        "金针菇多糖具有延缓骨骼肌疲劳的作用。孙洪兆等以电刺激蟾蜍腓\n" +
        "肠肌为疲劳模型，金针菇多糖溶液能显著降低腓肠肌收缩幅度并且具有剂量依赖性。此外，金针菇多糖还能通过免疫调节作用显著降低运动疲劳大鼠的血清肌酸激酶和尿素氮含量，增加大鼠血液中乳酸脱氢酶活力，加速大鼠运动后恢复期血乳酸的清除，促进机能恢复。金针菇多糖对骨骼肌疲劳的延缓作用及血液相关因子的调节作用为消除运动疲劳、减小运动损伤的研究提供了理论基础。 "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jin_zhen_gu_shi_guo_ban_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(jin_zhen_gu_shi_guo_ban_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
