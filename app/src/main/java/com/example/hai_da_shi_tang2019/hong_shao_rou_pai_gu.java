package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hong_shao_rou_pai_gu extends AppCompatActivity {
    private String[]data={"食用禁忌:\n" +
            "适宜：气虚质、气郁质、阳虚质、平和质\n" +
            "禁忌：湿热质、痰湿质、血瘀质\n" +
            "适宜人群:\n" +
            "⒈ 一般健康人和患有疾病之人均能食之，但食之过多，便使人摄入了过多热量，多余的热量转化为脂肪在人体内储存，就致人肥胖，肥胖则易发多种疾病；多食或冷食易引起胃肠饱胀或腹胀腹泻；对于脂肪及猪油，患高血压或偏瘫(中风)病者及肠胃虚寒、虚肥身体、痰湿盛、宿食不化者应慎食或少食之。\n" +
            "⒉ 适宜阴虚不足、头晕、贫血、老人燥咳无痰、大便干结，以及营养不良者食用；\n" +
            "⒊ 对湿热偏重、痰湿偏盛、舌苔厚腻之人，忌食猪肉。\n" +
            "⒋ 猪皮和猪蹄具有“和气血、润肌肤、可美容”的功效，爱美的女性可多食用猪皮和猪蹄。\n"+
    "营养价值:\n" +
            "猪肋条肉（五花肉）：猪肉含有丰富的优质蛋白质和必需的脂肪酸，并提供血红素（有机铁）和促进铁吸收的半胱氨酸，能改善缺铁性贫血；具有补肾养血，滋阴润燥的功效；但由于猪肉中胆固醇含量偏高，故糖尿病、肥胖人群及血脂较高者不宜多食。\n" +
            "每百克营养成分\n" +
            "能量 489.175千卡 、维生素B60.02毫克、叶酸1.32微克、膳食纤维 0.58克、胆固醇 854.7毫克、A88.3微克、胡萝卜素14.9微克、硫胺素 0.76毫克、核黄素0.49毫克、烟酸 20.19毫克、维生素C0.5毫克、维生素E2.46毫克、钙159.45毫克、磷 947.75毫克、 钾 1990.55毫克、钠 6362.96毫克、碘 2.4微克、镁 300.5毫克铁 16.95毫克、锌 13.73毫克、硒 29.72微克、铜 0.52毫克、锰 1.71毫克 [2] \n"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hong_shao_rou_pai_gu);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(hong_shao_rou_pai_gu.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
