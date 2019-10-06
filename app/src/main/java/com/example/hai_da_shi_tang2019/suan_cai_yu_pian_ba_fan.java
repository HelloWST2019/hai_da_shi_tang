package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class suan_cai_yu_pian_ba_fan extends AppCompatActivity {
private String[]data={"营养价值:\n" +
        "酸菜鱼的主材鱼含丰富优质蛋白，人体消化吸收率可达96%，并能供给人体必需的氨基酸、矿物质、维生素A和维生素D；鱼的脂肪多为不饱和脂肪酸，能很好的降低胆固醇，可以防治动脉硬化、冠心病，因此，多吃鱼可以健康长寿。\n" +
        "鲤鱼含丰富优质蛋白，人体消化吸收率可达96%，并能供给人体必需的氨基酸、矿物质、维生素A和维生素D；鲤鱼的脂肪多为不饱和脂肪酸，能很好的降低胆固醇，可以防治动脉硬化、冠心病，因此，多吃鱼可以健康长寿。鲤鱼味甘、性平，具有滋补健胃、利水消肿、通乳、清热解毒、止号嗽下气之功效，对各种水肿、浮肿、腹胀、少尿、黄疸、乳汁不通皆有益。\n" +
        "酸白菜:\n" +
        "酸菜中的乳酸能开胃提神、醒酒去腻，还能能增进食欲、帮助消化，还可以促进人体对铁元素的吸收。同时，白菜变酸，其所含营养成分不易损失。但酸菜只能偶尔食用，如果人体缺乏维C就应少吃，长期贪食，则可能引起泌尿系统结石，使红细胞失去携氧能力，导致组织缺氧，出现皮肤和嘴唇青紫、头痛头晕、恶心呕吐、心慌等中毒症状，严重者还能致死。\n" +
        "营养成分:\n" +
        "热量(1182.25千卡) 维生素B6(0.15毫克) 蛋白质(183.25克) 脂肪(41.56克) 泛酸(0.07毫克)\n" +
        "碳水化合物(16.59克) 叶酸(9.20微克) 膳食纤维(1.43克) 胆固醇(840.00毫克) 维生素A (263.50微克) 胡萝卜素(81.20微克) 硫胺素(0.36毫克) 核黄素(1.04毫克) 尼克酸(28.44毫克) 维生素C(5.10毫克) 维生素E(14.53毫克) 钙(608.00毫克) 磷(2139.12毫克) 钾(3650.88毫克) 钠(1993.10毫克) 镁(385.76毫克) 铁(14.18毫克) 锌(21.69毫克) 硒(159.00微克) 铜(0.74毫克) 锰(1.03毫克)\n" +
        "适宜人群:\n" +
        "一般人群均可食用，尤其适宜虚劳、风虚头痛、肝阳上亢高血压、头痛、久疟、心血管病人。\n" +
        "注意事项:\n" +
        "患痛风的人吃鱼会使症状加重。患有血小板减少、血友病、维生素E缺少等出血性疾病，还是少吃或不吃鱼。\n" +
        "营养疗效:\n" +
        "草鱼味甘、性温、无毒，入肝、胃经；\n" +
        "具有暖胃和中、平降肝阳、祛风、治痹、截疟、益肠明眼目之功效；\n" +
        "主治虚劳、风虚头痛、肝阳上亢、高血压、头痛、久疟。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suan_cai_yu_pian_ba_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(suan_cai_yu_pian_ba_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
