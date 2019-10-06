package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class su_chao_hai_dai_jie extends AppCompatActivity {
private String[]data={"营养成分\n" +
        "海带中含有丰富的海带多糖，至今已发现有3种多糖：褐藻胶、岩藻糖胶、褐藻淀粉。并含有酸性聚糖类物质、岩藻半乳多糖硫酸酯、大叶藻素、半乳糖醛酸、昆布氨酸、牛磺酸、双歧因子等多种活性成分。海带是一种营养丰富的食用褐藻，含有60多种营养成分。据测定，每100g中含8g蛋白质、0.1g脂肪、0.57mg胡萝卜素、0.09mg VB、0.36mg VB1、1.6mg烟酸、1.177mg钙、1.50mg铁，2.16mg磷，还含有丰富的褐藻酸、纤维素、甘露醇以及多种微量元素。海带热量低、蛋白质适中、矿物质含量丰富，是一种理想的天然海洋食品。 [4] \n" +
        "功效作用\n" +
        "（1）抗辐射\n" +
        "海带能阻止放射生元素锶的吸收。放射性锶进入人体后对人体危害很大，可在体内放射射线，对骨髓造成损伤，并损坏其造血功能，影响骨髓生长，并诱发骨癌和白血病。海带中的海藻酸钠不但能预防锶被消化道吸收，而且对生物体内旧有的放射性锶有排出作用。另外，褐藻酸钠在体内有排铅作用。铅进入人体会对神经系统和造血系统造成严重危害，而常吃海带会起到排铅的作用 [4]  。\n" +
        "（2）预防和治疗甲状腺肿\n" +
        "人体缺碘会患甲状腺肿，幼儿缺碘大脑和性器官不能充分发育，身体矮小，智力迟钝，即患所谓“呆小症”。海带中含有非常丰富的碘，食用海带对预防和治疗甲状腺肿有很好的作用，可促进智力发育   。\n" +
        "（3）瘦身功效\n" +
        "海带含有的一种化学物质能够阻止身体吸收脂肪，对减肥瘦身大有好处 [8]  。 英国纽卡斯尔大学的研究人员发现，海带中含有的藻脘酸盐能有效抑制人体对脂肪的消化和吸收。当一种藻脘酸盐含量攀升4倍之后，人体对抗脂肪吸收的能力将提升75% [4]  。\n" +
        "（4）美肤美发\n" +
        "海带中含有多种维生素，尤以能转变为维生素的胡萝卜素含量丰富。维生素有助于形成糖蛋白，维持皮肤的正常功能，防止感染和患皮肤病，使皮肤保持光滑细腻，韧性增强。海带中还有大量含硫蛋白质等营养物质，对美发大有裨益 [4]  。\n" +
        "（5）降血压、血脂和血糖\n" +
        "海带中含有膳食纤维褐藻酸钾，能调节钠钾平衡，降低人体对钠的吸收，从而起到降血压的作用。在我国民间，就有食用蒸海带降血压的做法。海带能降血脂是因为胶体纤维对降低血浆胆固醇有作用。  \n" +
        "海带除含多种维生素及微量元素外，还有大量的膳食纤维，尤其是可溶性纤维具有很高的比例。膳食纤维是指不被人体消化道酶系分解的植物组分，在人体内可通过多种特定的机制发挥作用，主要有吸水膨胀增加饱腹感，加速胃排空，降低肠腔pH值，促进胆汁酸代谢，降低血中胆固醇，提高胰岛细胞外周敏感性以降低血糖，促进体内能量随粪便丢失等，从而达到降血糖作用"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_su_chao_hai_dai_jie);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(su_chao_hai_dai_jie.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
