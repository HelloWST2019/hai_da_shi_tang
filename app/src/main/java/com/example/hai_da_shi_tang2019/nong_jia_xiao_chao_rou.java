package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class nong_jia_xiao_chao_rou extends AppCompatActivity {
private String[]data={"农家小炒肉，属于湘菜或川菜，是一道家常菜。农家小炒肉是以五花肉和青椒为主料，蒜、湖南剁辣椒等为辅料炒制而成。成品菜具有爆香味辣、肉质细嫩、麻辣鲜香、滑嫩适口的特点。\n" +
        "营养价值\n" +
        "辣椒\n" +
        "辣椒，又叫番椒、海椒、辣子、辣角、秦椒等，是一种茄科辣椒属植物。辣椒属为一年或多年生草本植物。果实通常成圆锥形或长圆形，未成熟时呈绿色，成熟後变成鲜红色、黄色或紫色，以红色最为常见。辣椒的果实因果皮含有辣椒素而有辣味。能增进食欲。辣椒中维生素C的含量在蔬菜中居第一位。\n" +
        "1.开胃消食。辣椒能促进消化液分泌，增进食欲。\n" +
        "2.暖胃驱寒。《食物本草》中说，辣椒能温暖脾胃。如果遇寒出现呕吐、腹泻、肚子疼等症状，可以适当吃些辣椒。\n" +
        "3.促进血液循环。辣椒有一定的药性，因此能“除风发汗，行痰，除湿。”用现代医学解释，就是能促进血液循环，改善怕冷、冻伤、血管性头疼。\n" +
        "4.肌肤美容。辣椒能促进体内激素分泌，改善皮肤状况。许多人觉得吃辣会长痘，其实并不是辣椒的问题。只有本身就爱长痘的体质，吃完辣椒才会火上浇油。\n" +
        "5.降脂减肥。辣椒素能加速脂肪分解，丰富的膳食纤维也有一定的降血脂作用。\n" +
        "6.止痛散热。辣椒性温，能通过发汗降低体温，并缓解肌肉疼痛，因此具有较强的解热镇痛作用。美国研究发现，辣椒素能减少传达痛感的神经递质，使人对疼痛的感觉减弱。\n" +
        "7.抵抗癌症。辣椒素能加速癌细胞死亡，而不会损害健康的细胞。\n" +
        "8.保护心脏。经常吃辣椒可有效延缓动脉粥样硬化的发展。\n" +
        "9.降低血压。英国最新的动物实验发现，辣椒素能起到降低血压的作用，但具体机制还不是十分清楚。10.对糖尿病有利。对于1型糖尿病的某些症状，辣椒素可起到减轻的作用。\n" +
        "10.农家小炒肉属于家常菜谱，主要原料是五花肉、里脊，口味：豉香，工艺：炒，烹饪难度属于中级。其特色：省事省时，具有味甘咸、性平，入脾、胃、肾经；补肾养血，滋阴润燥的功效。\n" +
        "猪肉\n" +
        "猪肉又名豚肉，是主要家畜之一。属猪科动物。其性味甘咸平，含有丰\n" +
        "农家小炒肉\n" +
        "农家小炒肉\n" +
        "富的蛋白质及脂肪、碳水化合物、钙、磷、铁等成分。猪肉是日常生活的主要副食品，具有补虚强身，滋阴润燥、丰肌泽肤的作用。凡病后体弱、产后血虚、面黄赢瘦者，皆可用之作营养滋补之品。\n" +
        "1 味甘，性平。能滋阴，润燥，补血。\n" +
        "2 肥肉主要含脂肪，并含少量蛋白质、磷、钙、铁等；瘦肉主要含蛋白质、脂肪、维生素B1、B2，磷、钙、铁等，后者含量较肥肉多。\n" +
        "3 用于温热病后，热退津伤，口渴喜饮；肺燥咳嗽，干咳痰少，咽喉干痛；肠道枯燥，大便秘结；气血虚亏，羸瘦体弱。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nong_jia_xiao_chao_rou);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(nong_jia_xiao_chao_rou.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
