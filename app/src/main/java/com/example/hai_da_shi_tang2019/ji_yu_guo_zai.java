package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ji_yu_guo_zai extends AppCompatActivity {
private String[]data={"鲫鱼是我国最常见的淡水鱼类之一，生活在青藏高原地域以外的各大水系。鲫鱼是杂食性鱼类，食性广、适应性强、繁殖力强、抗病力强、生长快、对水温要求不高，便于养殖，是我国重要的养殖性鱼类。 \n" +
        "鲫鱼主要是以植物为食的杂食性鱼，喜群集而行，择食而居。肉质细嫩，营养价值很高，每百克肉含蛋白质13克、脂肪11克，并含有大量的钙、磷、铁等矿物质。鲫鱼药用价值极高，其性平味甘，人胃、肾，具有和中补虚、除赢、温胃进食、补中生气之功效。\n "+
"食用价值:\n" +
        "鲫鱼是一种高蛋白，低脂肪，营养价值很高的鱼类，是国民膳食结构中优质、价廉、充足的蛋白质来源。\n" +
        "蛋白质的氨基酸组成与人体蛋白质氨基酸模式接近，属于优质蛋白\n" +
        "肌纤维细短，水分含量较多，因此鲫鱼组织柔软细嫩，比畜、禽肉更易消化;脂肪多由不饱和脂肪酸组成，主要为欧米伽3多不饱和脂肪酸，其中二十碳五烯酸(EPA)具有降血脂、防治动脉粥样硬化、抗癌等作用;是维生素A、维生素D和维生素B2的重要来源，维生素E、维生素B1、烟酸的含量也很高。 [7] \n" +
        "鲫鱼肉嫩味鲜，是我国重要的食用鱼类之一，以2~4月份和8~12月份的最为肥美。 \n" +
        "鲫鱼的食疗作用古来已有总结，具有益气健脾、利尿消肿、通络下乳等功效，尤其是活鲫鱼氽汤在通乳方面有其他药物不可比拟的作用，体质虚弱者常吃有益身体健康。\n "+
"不宜人群:\n" +
        "鲫鱼虽好，却不是所有人都可以吃，以下几类人要注意：\n" +
        "痛风病人。一般来说，常把食物按照嘌呤含量分成四等：超高嘌呤食物、中高嘌呤食物、中低嘌呤食物和低嘌呤食物。每100克鲫鱼嘌呤含量为137.1毫克，属于第二等食物。在痛风急性发作期，病人每天的嘌呤摄入量应限制在150毫克以内，此时应禁止吃鲫鱼;在痛风缓解期，病人可限量吃鲫鱼。 [7] \n" +
        "对鱼类过敏的人。有些人属于过敏体质，吃鱼就会引起过敏，这部分人最好别吃鲫鱼。  \n" +
        "部分肝肾疾病患者。患有泌尿系统结石的患者要对尿酸进行控制，因为尿酸酸化过多和尿酸排泄过多与结石有关联。因此，这类患者要限制嘌呤摄入，不能过多吃鲫鱼。由于鲫鱼富含钾，急性肾衰竭的病人也不能食用，否则会加重肾脏负担。在肝脏疾病的急性期，病人应减少蛋白质的摄入量，控制在每天20克之内，鲫鱼富含蛋白质，因此，这类病人也不宜吃鲫鱼。 \n" +
        "出血性疾病患者。鲫鱼中富含二十碳五烯酸，这种成分具有抑制血小板凝聚、抗血栓等作用。出血性疾病包括过敏性紫癜、维生素C缺乏症、血友病等，主要原因为止血机制异常，表现为不同部位出血，患有这些疾病的人群也不宜吃鲫鱼。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ji_yu_guo_zai);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(ji_yu_guo_zai.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
