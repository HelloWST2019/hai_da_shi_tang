package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class mu_xu_rou extends AppCompatActivity {
private String[]data={"营养价值:\n" +
        "木耳（水发）：黑木耳中铁的含量极为丰富，故常吃木耳能养血驻颜，令人肌肤红润，容光焕发，并可防治缺铁性贫血；黑木耳含有维生素K，能减少血液凝块，预防血栓症的发生，有防治动脉粥样硬化和冠心病的作用；木耳中的胶质可把残留在人体 消化系统内的灰尘、杂质吸附集中起来排出体外，从而起到清胃涤肠的作用，它对胆结石、肾结石等内源性异物也有比较显著的化解功能；黑木耳含有抗肿瘤活性物质，能增强机体免疫力，经常食用可防癌抗癌。\n" +
        "竹笋：竹笋富含B族维生素及烟酸等招牌营养素，具有低脂肪、低糖、多膳食纤维的特点，本身可吸附大量的油脂来增加味道。所 以肥胖的人，如果经常吃竹笋，每顿饭进食的油脂就会被它所吸附，降低了胃肠黏膜对脂肪的吸收和积蓄，从而达到减肥目的，而且竹笋还含大量纤维素，不仅能促进肠道蠕动、去积食、防便秘，而且也是肥胖者减肥佳品，并能减少与高脂有关的疾病。另由于竹笋富含烟酸、膳食纤维等，能促进肠道蠕动、帮助消化\n" +
        " 、消除积食、防止便秘，故有一定的预防消化道肿瘤的功效。\n" +
        "猪肉(瘦)：猪肉含有丰富的优质蛋白质和必需的脂肪酸，并提供血红素（有机铁）和 促进铁吸收的半胱氨酸，能改善缺铁性贫血；具有补肾养血，滋阴润燥的功效；猪精肉相对其它部位的猪肉，其含有丰富优质蛋白，脂肪、胆固醇较少，一般人群均可适量食用。\n" +
        "油菜：油菜中含有丰富的钙、铁和维C。另外胡萝卜素也很丰富，是人体黏膜及上皮组织维持生长的重要营养源，对于抵御皮肤过度角化大有裨益，爱美人士不妨多吃一些 油菜。油菜还有促血液循环、散血消肿、活血化瘀、解毒消肿、宽肠通便、强身健体等功效。已经国外科学家还在油菜中发现含有能促进眼睛视紫质合成的物质，能起到明目的作用，同时指出十字花科蔬菜如油菜可降低胰腺癌发病的危险。\n" +
        "鸡蛋：鸡蛋含有丰富的蛋白质、脂肪、维生素和铁、钙、钾等人体所需要的矿物质，其蛋白质是自然界最优良的蛋白质，对肝脏组织损伤有修复作用；同时富含DHA和卵磷脂、卵黄素，对神经系统和身体发育有利，能健脑益智， 改善记忆力，并促进肝细胞再生；鸡蛋中含有较多的维生素B和其他微量元素，可以分解和氧化人体内的致癌物质，具有防癌作用；鸡蛋味甘，性平；具有养心安神，补血，滋阴润燥之功效。\n" +
        "鸡蛋清：鸡蛋清富含蛋白质和人体必需的8种氨基酸和少量醋酸，可以增强皮肤的润滑作用，保护皮肤的微酸性，以防细 菌感染；此外，鸡蛋清还具有清热解毒作用；我国中医还认为，鸡蛋清性微寒而气清，能易经补气，润肺利咽，清热解毒，有助于延缓衰老。" +
        ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mu_xu_rou);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(mu_xu_rou.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
