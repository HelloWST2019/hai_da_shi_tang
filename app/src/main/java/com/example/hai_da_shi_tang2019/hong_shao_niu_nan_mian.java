package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hong_shao_niu_nan_mian extends AppCompatActivity {
private String[]data={"红烧牛腩面是一款美食，主要原料有牛腩（腰窝）300克，面条（标准粉）250克等。\n" +
        "牛腩是指带有筋、肉、油花的肉块，即牛腹部及靠近牛肋处的松软肌肉，是一种统称。若依部位来分，牛身上许多地方的肉都可以叫做牛腩。国外进口的是切成条状的牛肋条为主，取自肋骨间的去骨条状肉，瘦肉较多，脂肪较少，筋也较少，适合红烧或炖汤。另外，在里脊肉上层有一片筋少、油少、肉多，但形状不大规则的里脊边，也可以称作牛腩，是上等的红烧部位。牛腱可以算是牛腩的一种，筋肉多、油少，甚至全是瘦肉，一般用来卤，不适合炖汤，更不适合红烧。\n" +
        "营养价值:" +
        "1、牛腩提供高质量的蛋白质，含有全部种类的氨基酸，各种氨基酸的比例与人体蛋白质中各种氨基酸的比例基本一致，其中所含的肌氨酸比任何食物都高。\n" +
        "2、牛腩的脂肪含量很低，却是低脂的亚油酸的来源，还是潜在的抗氧化剂。\n" +
        "3、牛腩含有矿物质和维他命B群，包括烟酸、维生素B1和核黄素。牛肉还是每天所需要的铁质的最佳来源。\n" +
        "4、牛腩还含肉毒碱。\n" +
        "药用价值:\n" +
        "味甘，性平；归脾、胃经；牛肉具有补脾胃、益气血、强筋骨、消水肿等功效。老年人将牛肉与仙人掌同食，可起到抗癌止痛、提高机体免疫功能的效果；牛肉加红枣炖服，则有助肌肉生长和促伤口愈合之功效。\n" +
        "食用禁忌:\n" +
        "1、感染性疾病、肝病、肾病的人慎食\n" +
        "2、高胆固醇、高脂肪、老年人、儿童、消化力弱的人不宜多吃。\n" +
        "3、一周吃一次牛肉即可，不可食之太多，另外，牛脂肪更应少食为妙，否则会增加体内胆固醇和脂肪的积累量。\n" +
        "4、一般人群均可食用，适宜于生长发育、术后、病后调养的人、中气下隐、气短体虚、筋骨酸软、贫血久病及黄目眩的人食用；感染性疾病、肝病、肾病的人慎食；黄牛肉为发物，患疮疥湿疹、痘痧、瘙痒者慎用；高胆固醇、高脂肪、老年人、儿童、消化力弱的人不宜多吃。 "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hong_shao_niu_nan_mian);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(hong_shao_niu_nan_mian.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
