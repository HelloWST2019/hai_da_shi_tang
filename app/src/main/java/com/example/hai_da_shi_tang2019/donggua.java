package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class donggua extends AppCompatActivity {
private String []data={"冬瓜营养价值：\n" +
        "冬瓜含有多种维生素和人体必需的微量元素，可调节人体的代谢平衡。冬瓜性寒，能养胃生津、清降胃火，使人食量减少，促使体内淀汾、糖转化为热能，而不变成脂肪。因此，冬瓜是肥胖者的理想蔬菜。同时冬瓜有抗衰老的作用，久食可保持皮肤洁白如玉，润泽光滑，并可保持形体健美。此外冬瓜还有良好的清热解暑功效。夏季多吃些冬瓜，不但解渴消暑、利尿、还可使人免生疔疮。因其利尿，且含钠极少，所以是慢性肾盐水肿、营养不良性水肿、孕妇水肿的消肿佳品。\n" +
        "1、降血压：由于冬瓜含Vc较多，且钾含量高，钠盐含量低，所以最适合需低钠食物的高血压、肾脏病、浮肿病等患者。\n" +
        "2、保护肾脏：冬瓜汁及冬瓜提取物能增加动物排尿量，减轻由升汞引起的肾病病变程度，并具有显著减少血清肌酐含量的作用。病理组织学显示，冬瓜总氨酸（大剂量）、冬瓜葫芦素对升汞引起的肾损伤均有较明显的保护和阻断作用。\n" +
        "3、减肥降脂：经研究发现，冬瓜中富含丙醇二酸。能有效控制体内的糖类转化为脂肪，防止体内脂肪堆积，\n" +
        "还能把肥胖多余的脂肪消耗掉，有良好的减肥效果。葫芦巴碱主要存在于冬瓜瓤中，它能帮助人体新陈代谢，抑制糖类转化为脂肪也是冬瓜中的减肥降脂功能因子之一。\n" +
        "4、美容养颜：唐代《圣济总录》书中介绍了古人用冬瓜制作面脂进行美容的方法。另外，据《本草纲目》载：冬瓜瓤白，绵软，用它洗脸，洗身，可除肤褐斑，令肤色柔软光洁、白皙；《神农本草经》记载：冬瓜子能令人“面容生辉”。冬瓜子是古代面脂中的常用药。\n" +
        "冬瓜籽中的油酸，具有抑制体内黑色素沉积的活性，是良好的润肤美容成分氨基酸。冬瓜中富含鸟氨酸和Y-氨基丁酸，天冬氨酸、谷氨酸、精氨酸的含量也较高，瓜籽和果皮中的含量又高于果肉，瓜籽中的上述3种氨基酸含量分别是果肉的15.09、18.32倍，它们是人体解除游离氨毒害的不可缺少的氨基酸，成为其利尿消肿功效的物质基础。此外，冬瓜籽所含的蛋白质和瓜氨酸更可润泽皮肤，还能抑制黑色素的形成。\n" +
        "5、降血糖：冬瓜中的膳食纤维含量很高，每100g中含膳食纤维约0.9g。现代医学研究表明膳食纤维含量高的食物对改善血糖水平效果好，人的血糖指数与食物中食物纤维的含量成负相关。另外，膳食纤维还能降低体内胆固醇。\n" +
        "6、排除致癌物质：降血脂冬瓜中的粗纤维，能刺激肠道蠕动，使肠道里积存的致癌物质尽快排泄出去。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donggua);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(donggua.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
