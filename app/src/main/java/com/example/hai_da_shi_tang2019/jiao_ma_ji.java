package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class jiao_ma_ji extends AppCompatActivity {
private String[]data={"营养价值:\n" +
        "鸡肉肉质细嫩，滋味鲜美，由于其味较淡，因此可使用于各种料理中。蛋白质的含量颇多，在肉之中，可以说是蛋白质最高的肉类之一，是属于高蛋白低脂肪的食品。钾硫酸氨基酸的含量也很丰富，因此可弥补牛及猪肉的不足。同时也由于鸡肉比其他肉类的维生素A含量多，而在量方面虽比蔬菜或肝脏差，但和牛肉和猪肉相比，其维生素A的含量却高出许多。\n" +
        "鸡肉蛋白质的含量比例较高，种类多，而且消化率高，很容易被人体吸收利用 鸡肉，有增强体力、强壮身体的作用。另外含有对人体生发育有重要作用的磷脂类，是中国人膳食结构中脂肪和磷脂的重要来源之一。\n" +
        "鸡肉对营养不良、畏寒怕冷、乏力疲劳、月经不调、贫血、虚弱等有很好的食疗作用。祖国医学认为，鸡肉有温中益气、补虚填精、健脾胃、活血脉、强筋骨的功效。 \n "+
"宜食人群:\n" +
        "一般人群均可食用，老人、病人、体弱者更宜食用。 \n" +
        "忌食人群:\n" +
        "感冒发热、内火偏旺、痰湿偏重之人、肥胖症、患有热毒疖肿之人、高血压、血脂偏高、胆囊炎、胆石症的人忌食；\n" +
        "鸡肉性温，助火，肝阳上亢及口腔糜烂、皮肤疖肿、大便秘结者不宜食用；\n" +
        "动脉硬化、冠心病和高血脂患者忌饮鸡汤；\n" +
        "感冒伴有头痛、乏力、发热的人忌食鸡肉，鸡汤。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jiao_ma_ji);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(jiao_ma_ji.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
