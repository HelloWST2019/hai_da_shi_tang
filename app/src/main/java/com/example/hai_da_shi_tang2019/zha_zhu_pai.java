package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class zha_zhu_pai extends AppCompatActivity {
private String[]data={"营养分析:\n" +
        "猪排骨(大排)\n" +
        "猪排骨提供人体生理活动必需的优质蛋白质、脂肪，尤其是丰富的钙质可维护骨骼健康具有滋阴润燥、益精补血。\n" +
        "洋葱(黄皮)\n" +
        "洋葱为百合科草本植物，二年生或多年生植物，是一种很普通的廉价家常菜。原产亚洲西部，在中国各地均有栽培，四季都有供应。洋葱供食用的部位为地下的肥大鳞\n" +
        "芹菜\n" +
        " 茎(即葱头)。根据其皮色可分为白皮、黄皮和红皮三种：白皮种鳞茎小，外表白色或略带绿色，肉质柔嫩，汁多辣叶淡，品质佳，适于生食。中国人常惧怕其特有的辛辣香气，而在国外它却被誉为“菜中皇后”，营养价值不低。洋葱的品质要求：以葱头肥大，外皮光泽，不烂，无机械伤和泥土，鲜葱头不带叶；经贮藏后，不松软，不抽苔，鳞片紧密，含水量少，辛辣和甜味浓的为佳。\n" +
        "胡萝卜\n" +
        "胡萝卜能提供丰富的维A，可促进机体正常生长繁殖、维持上皮组织、防止呼吸道感染与保持视力正常、治疗夜盲症。\n" +
        "豌豆\n" +
        "在豌豆荚和豆苗的嫩叶中富含维生素C和能分解体内亚硝胺的酶，可以分解亚\n" +
        "各式炸猪排2\n" +
        "各式炸猪排2(12张)\n" +
        " 硝胺，具有抗癌防癌的作用。豌豆与一般蔬菜有所不同，所含的止杈酸、赤霉素和植物凝素等物质，具有抗菌消炎，增强新陈代谢的功能。在荷兰豆和豆苗中含有较为丰富的膳食纤维，可以防止便秘，有清肠作用。\n" +
        "芹菜\n" +
        "芹菜是常用蔬菜之一，既可热炒，又能凉拌，深受人们喜爱。近年来诸多研究表明，这是一种具有很好药用价值的蔬菜。\n" +
        "小麦面粉\n" +
        "面粉富含蛋白质、碳水化合物、维生素和钙、铁、磷、钾、镁等矿物质，有养心益肾、健脾厚肠、除热止渴的功效。\n" +
        "鸡蛋\n" +
        "鸡蛋含有丰富的蛋白质、脂肪、维生素和铁、钙、钾等人体所需要的矿物质，蛋白质为优质蛋白，对肝脏组织损伤有修复作用；富含DHA和卵磷脂、卵黄素，对神经系统和身体发育有利，能健脑益智，改善记忆力，并促进肝细胞再生； 鸡蛋中含有较多的维生素B和其他微量元素，可以分解和氧化人体内的致癌物质，具有防癌作用。\n" +
        "黄油\n" +
        "黄油的主要成分是脂肪，其含量在90%左右，剩下的主要是水分、胆固醇，基本不含蛋白质。有研究称：适量食用天然黄油可改善因食用不饱和脂肪酸或人造黄油而导致的贫血症状。\n"+
"适合人群:\n" +
        "1、适宜于气血不足，阴虚纳差者；湿热痰滞内蕴者慎服；肥胖、血脂较高者不宜多食。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zha_zhu_pai);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(zha_zhu_pai.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
