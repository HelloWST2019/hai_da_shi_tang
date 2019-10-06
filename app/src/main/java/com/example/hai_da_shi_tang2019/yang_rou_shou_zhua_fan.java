package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class yang_rou_shou_zhua_fan extends AppCompatActivity {
private String[]data={"营养价值：\n羊肉鲜嫩,营养价值高,凡肾阳不足、腰膝酸软、腹中冷痛、虚劳不足者皆可用它作食疗品。羊肉营养丰富,对肺结核、气管炎、哮喘、贫血、产后气血两虚、腹部冷痛、体虚畏寒、营养不良、腰膝酸软,阳痿早泄以及一切虚寒病症均有很大裨益;具有补肾壮阳、补虚温中等作用,男士适合经常食用。\n" +
        "\n" +
        "1、羊肉含有丰富的蛋白质,其含量较猪肉牛肉高。\n" +
        "\n" +
        "2、羊肉与猪肉忽和牛肉比,钙、铁、维生素C含量更多。\n" +
        "\n" +
        "羊肉手抓饭的营养价值\n" +
        "\n" +
        "3、羊肉具有独特的膻味,主要是因为脂肪中含有石碳酸的成分,去掉脂肪之后,羊肉便不会再有膻味。\n\n"+
"羊肉禁忌人群:\n" +
        "\n" +
        "1、有发热、牙疼、口舌生疮、咳吐黄痰等上火症状的人应少食。\n" +
        "\n" +
        "2、高血压、肝病、急性肠炎或其他感染性疾病的人不应食用羊肉。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yang_rou_shou_zhua_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(yang_rou_shou_zhua_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
