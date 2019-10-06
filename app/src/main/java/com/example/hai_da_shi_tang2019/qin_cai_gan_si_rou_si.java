package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class qin_cai_gan_si_rou_si extends AppCompatActivity {
    private String[]data={"芹菜，属伞形科植物，品种繁多，在我国有着悠久的种植历史和大范围的种植面积，是中国人常吃的蔬菜之一，其富含蛋白质、碳水化合物、胡萝卜素、B族维生素、钙、磷、铁、钠等，同时，具有平肝清热、祛风利湿、除烦消肿、凉血止血、解毒宣肺、健胃利血、清肠利便、润肺止咳、降低血压、健脑镇静的功效\n" +
            "药用价值\n" +
            "芹菜中具有许多药理活性成分，主要活性成分包括：黄酮类物质、挥发油化合物、不饱和脂肪酸、叶绿素、菇类、香豆素衍生物等。目前，科研人员研究最多、最深入的是芹菜素 ，具有抗肿瘤、抗炎、抗氧化、降血压扩血管等作用。芹菜中富含芹菜素，可以扩张血管，平稳降压。直接以新鲜芹菜榨汁服用或嫩芹菜捣汁加蜜糖少许服用，可防治高血压。芹菜中钙、磷含量较高，可增强骨骼健康。芹菜纤维素含量高，经过消化产生一种抗氧化剂，可以抑制肠内细菌。还可以加快肠的蠕动，促进排泄，降低致癌物与结肠黏膜接触时间，预防结肠癌。芹菜中富含钾，可预防浮肿，水肿病人宜多食新鲜芹菜汁。芹菜中富含铁，经常食用能起到补铁的作用。芹菜中含有可以中和尿酸的物质， 可以经常吃鲜奶煮芹菜防治痛风\n" +
            ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qin_cai_gan_si_rou_si);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(qin_cai_gan_si_rou_si.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
