package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hong_shao_yu extends AppCompatActivity {
    private String[]data={"营养价值:\n" +
            "鱼的种类很多，主要的食用淡水鱼包括鲤鱼、草鱼、鲫鱼、桂鱼、湄公鱼等，海水鱼包括黄鱼、带鱼、平鱼等。它们都具有肉质细嫩鲜美、营养丰富的特点，是一些维生素、无机盐的良好来源。\n" +
            "鱼肉含有叶酸、维生素B2、维生素B12等维生素，有滋补健胃、利水消肿、通乳、清热解毒、止嗽下气的功效。对各种水肿、浮肿、腹胀、少尿、黄疸、乳汁不通皆有效。\n" +
            "食用鱼肉对孕妇胎动不安、妊娠性水肿有很好的疗效。\n" +
            "鱼肉含有丰富的镁元素，对心血管系统有很好的保护作用，有利于预防高血压、心肌梗互等心血管疾病。\n" +
            "鱼肉中富含维生素A、铁、钙、磷等，常吃鱼还有养肝补血、泽肤养发健美的功效。\n" +
            "营养功效:\n" +
            "抗衰老、 食养补气、抗少尿病、老年滋补佳品；\n" +
            "适用人群:\n" +
            "一般人都可食用。哮喘病患者和过敏体质者慎食；\n" +
            "健康贴士:\n" +
            "吃红烧鱼讲究的是色、香、味俱全，我国红烧鱼的传统做法是先进行煎、炸等高温处理，在进行煎炸处理时鱼的表面就会形成一种叫杂环胺类的分子物质，这种物质会进入人的细胞核和人的基因相互作用，这样就会改变基因的基本结构，引起了基因变异，也即引起了细胞的癌变。\n" +
            "鱼肉是发物(发物是指富于营养或有刺激性特别容易诱发某些疾病（尤其是旧病宿疾）或加重已发疾病的食物)，有慢性病者不宜食。特别是有糖尿病者和有慢性消化道疾病者也不宜吃红烧鱼"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hong_shao_yu);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(hong_shao_yu.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
