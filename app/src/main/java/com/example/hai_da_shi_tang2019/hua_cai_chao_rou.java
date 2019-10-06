package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hua_cai_chao_rou extends AppCompatActivity {
private String[]data={"菜花富含蛋白质、脂肪、碳水化合物、食物纤维、维生素及矿物质。其中维生素C花菜--菜花含量较高，每100克中含维生素Cp85-100毫克，比大白菜高4倍，胡萝卜素含量是大白菜的8倍，维生素 B2的含量是大白菜的2倍。白、绿两种菜花营养、作用基本相同，绿色的较白色的胡萝卜素含量要高些。菜花肉质细嫩，味甘鲜美，食用后很容易消化吸收。古代西方人发现，常吃菜花有爽喉、开音、润肺、止咳的功效，因此他们把菜花叫做“天赐的良药”和“穷人的医生”。\n" +
        "　　菜花营养分析：\n" +
        "　　1. 抗癌防癌：\n" +
        "　　菜花含有抗氧化防癌症的微量元素，长期食用可以减少乳腺癌、直肠癌及胃癌等癌症的发病几率。据美国癌症协会的报道，在众多的蔬菜水果中，菜花、大白菜的抗癌效果最好；\n" +
        "　　2. 清化血管：\n" +
        "　　菜花是含有类黄酮最多的食物之一，类黄酮除了可以防止感染，还是最好的血管清理剂，能够阻止胆固醇氧化，防止血小板凝结成块，因而减少心脏病与中风的危险；\n" +
        "　　3. 丰富的维K：\n" +
        "　　有些人的皮肤一旦受到小小的碰撞和伤害就会变得青一块紫一块的，这是因为体内缺乏维生素K的缘故。补充的最佳途径就是多吃菜花；\n" +
        "　　4. 解毒肝脏：\n" +
        "　　多吃菜花还会使血管壁加强，不容易破裂。丰富的维生素C含量，使菜花可增强肝脏解毒能力，并能提高机体的免疫力，可防止感冒和坏血病的发生；\n" +
        "　　5. 维C使者：\n" +
        "　　菜花的维生素C含量极高，不但有利于人的生长发育，更重要的是能提高人体免疫功能，促进肝脏解毒，增强人的体质，增加抗病能力，提高人体机体免疫功能。尤其是在防治胃癌、乳腺癌方面效果尤佳，研究表明，患胃癌时人体血清硒的水平明显下降，胃液中的维生素C的浓度也显著低于正常人，而菜花不但能给人补充一定量的硒和维生素C，同时也能供给丰富的胡萝卜素，起到阻止癌前病变细胞形成的作用，抑制癌肿生长；\n" +
        "　　6. 生物活性：\n" +
        "　　据美国营养学家研究，菜花内还有多种吲哚衍生物，此化合物有降低人体内雌激素水平的作用，可预防乳腺癌的发生。此外，研究表明，菜花中提取的一种酶能预防癌症，这种物质叫萝卜子素，有提高致癌物解毒酶活性的作用；另外菜花中还含有二硫酚硫酮，可以降低形成黑色素的酶及阻止皮肤色素斑的形成，经常食用可滑润开胃，对肌肤有很好的美白效果。\n" +
        "　　7.减肥：\n" +
        "　　由于菜花的含水量高达90%以上，所含热量较低（每杯23～32千卡），因此对希望减肥的人来说，它可以填饱肚子，而不会使你发胖。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hua_cai_chao_rou);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(hua_cai_chao_rou.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
