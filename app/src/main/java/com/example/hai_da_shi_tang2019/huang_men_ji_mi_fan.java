package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class huang_men_ji_mi_fan extends AppCompatActivity {
private String[]data={"黄焖鸡:\n" +
        "黄焖鸡米饭又叫香鸡煲、浓汁鸡煲饭，属于鲁菜系家常菜品，起源于山东省济南市。主要食材是鸡腿肉，配以青椒、土豆、香菇等焖制而成，味道美妙，具有肉质鲜美嫩滑的特点。\n"+
"营养价值:\n" +
        "鸡肉:\n" +
        "肉质细嫩，滋味鲜美，由于其味较淡，因此可使用于各种料理中，蛋白质的含量颇多，在肉之中，可以说是蛋白质最高的肉类之一，是属于高蛋白低脂肪的食品。钾硫酸氨基酸的含量也很丰富，因此可弥补牛及猪肉的不足。同时也由于鸡肉比其他肉类的维生素A含量多，而在量方面虽比蔬菜或肝脏差，但和牛肉和猪肉相比，其维生素A的含量却高出许多。鸡肉蛋白质含量较高，且易被人体吸收入利用，有增强体力，强壮身体的作用。性平、温、味甘，入脾、胃经；可温中益气，补精添髓；用于治疗虚劳瘦弱、中虚食少、泄泻头晕心悸、月经不调、产后乳少、消渴、水肿、小便数频、遗精、耳聋耳鸣等。\n" +
        "木耳:\n" +
        "木耳科真菌，状如耳朵，系寄生于枯木上的一种菌类，富含铁、钙、磷和维生素B1等。黑木耳中铁的含量极为丰富，故常吃木耳能养血驻颜，令人肌肤红润，容光焕发，并可防治缺铁性贫血。黑木耳含有维生素K，能减少血液凝块，预防血栓症的发生，有防治动脉粥样硬化和冠心病的作用。木耳中的胶质可把残留在人体消化系统内的灰尘、杂质吸附集中起来排出体外，从而起到清胃涤肠的作用，它对胆结石、肾结石等内源性异物也有比较显著的化解功能。黑木耳含有抗肿瘤活性物质，能增强机体免疫力，经常食用可防癌抗癌。\n" +
        "香菇:\n" +
        "提高机体免疫功能，香菇多糖可提高小鼠腹腔巨噬细胞的吞噬功能，还可促进T淋巴细胞的产生，并提高T淋巴细胞的杀伤活性。延缓衰老：香菇的水提取物对过氧化氢有清除作用，对体内的过氧化氢有一定的消除作用；防癌抗癌：香菇菌盖部分含有双链结构的核糖核酸，进入人体后，会产生具有抗癌作用的干扰素；降血压、降血脂、降胆固醇：香菇中含有嘌呤、胆碱、酪氨酸、氧化酶以及某些核酸物质，能起到降血压、降胆固醇、降血脂的作用，又可预防动脉硬化、肝硬化等疾病。\n" +
        "食用须知:n" +
        "宜食人群:\n" +
        "一般人群均可食用，老人、病人、体弱者更宜食用。\n" +
        "忌食人群:\n" +
        "感冒发热、内火偏旺、痰湿偏重之人、肥胖症、患有热毒疖肿之人、高血压、血脂偏高、胆囊炎、胆石症的人忌食；鸡肉性温，助火，肝阳上亢及口腔糜烂、皮肤疖肿、大便秘结者不宜食用；动脉硬化、冠心病和高血脂患者忌饮鸡汤；感冒伴有头痛、乏力、发热的人忌食鸡肉，鸡汤。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huang_men_ji_mi_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(huang_men_ji_mi_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
