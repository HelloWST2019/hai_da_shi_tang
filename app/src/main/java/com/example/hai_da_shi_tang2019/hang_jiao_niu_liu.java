package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hang_jiao_niu_liu extends AppCompatActivity {
private String[]data={"杭椒牛柳是一种美食，是以杭椒、牛柳为主要食材，是杭州的一道特色传统家常名菜，属于浙江菜。辅料为味精5克，酱油5克，盐5克， 绍酒5克，香油5克。\n" +
        "杭椒，果羊角形，长13厘米左右，横径约1.4厘米，平均单果重10克。青熟果淡绿色，果实微辣，老熟果红色。果面略皱，果顶渐尖，稍弯。它既是美味佳肴的好佐料，又是一种温中散寒、可用于食欲不振等症的食疗佳品\n" +
        "营养价值:\n" +
        "椒干富含蛋白质、胡萝卜素、维生素A、辣椒碱、辣椒红素、挥发油以及钙、磷、铁等矿物质。它既是美味佳肴的好佐料，又是一种温中散寒、可用于食欲不振等症的食疗佳品。\n" +
        "牛柳指的是牛的里脊肉，是一种十分美味的食材。我国牛胴体大体上分为十二块，现代化屠宰加工企业将牛肉分为里脊（牛柳）、外脊、眼肉、上脑、胸肉、肩肉、米龙、腱子肉、腹肉等。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hang_jiao_niu_liu);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(hang_jiao_niu_liu.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);  }
}
