package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class juanxin extends AppCompatActivity {
private String[]data={"卷心菜的营养价值:\n" +
        "1.卷心菜的水分含量高(约90%)，而热量低，可是大多数卷心菜丝色拉中的热量比单纯的卷心菜高5倍，因色拉中常含有富于油脂的调料，想通过控制饮食来减肥的人最好用低热量的调料做色拉。\n" +
        "2.卷心菜很有丰富的钾、叶酸，而叶酸对巨幼细胞贫血和胎儿畸形有很好的预防作用。\n" +
        "3.卷心菜的营养价值与大白菜相差无几，其中维生素C的含量还要高出一倍左右。此外，卷心菜富含叶酸，这是甘蓝类蔬菜的一个优点。 圆白菜中含有丰富的维生素C、维生素E、β-胡萝卜素等，总的维生素含量比番茄多出3倍。\n"+
        "卷心菜的食用效果:\n" +
        "1.杀菌\n" +
        "新鲜的圆白菜有杀菌、消炎的作用。咽喉疼痛、外伤肿痛、胃痛、牙痛时，可以将圆白菜榨汁后饮下或涂于患处。\n" +
        "2.防癌抗癌\n" +
        "保护癌症患者的生活指标，在抗癌蔬菜中，圆白菜排在第5位，相当显赫。\n" +
        "3.促进消化\n" +
        "多吃圆白菜，可增进食欲，促进消化预防便秘。圆白菜也是糖尿病和肥胖患者的理想食物。\n" +
        "4.增强机体免疫功能\n" +
        "它能提高人体免疫力，预防感冒。\n"+
        "卷心菜的食用禁忌\n" +
        "1.肤瘙痒性疾病、眼部充血患者忌食。\n" +
        "\n" +
        "2.卷心菜含有粗纤维量多，且质硬，故脾胃虚寒、泄泻以及小儿脾弱者不宜多食。\n" +
        "\n" +
        "3.对于腹腔和胸外科手术后，胃肠溃疡及其出血特别严重时，腹泻及肝病时不宜吃。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juanxin);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(juanxin.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
