package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class lu_ya_tui extends AppCompatActivity {
private String[]data={"卤鸭腿是一种传统酱卤制品，深受广大消费者喜爱。卤鸭腿以鸭腿和香辛料为主要食材，口感紧实，耐咀嚼；具有经卤制后的良好的滋味与气味，无异味\n" +
        "营养价值:\n" +
        "食品是人类赖以生存的能源和发展的物质基础，所以食品的质量十分关键; 首先是有营养，还能促进人体健康。所以肉类食用的品质直接决定消费者购买欲望，是影响消费者意愿的关键点。鸭肉中的脂肪酸熔点低，易于消化。所含 B族维生素和维生素 C 较其他肉类多，鸭肉中含有较为丰富的烟酸，它是构成人体内两种重要辅酶的成分之一，对心肌梗死等心脏疾病患者有保护作用，鸭肉适于滋补，是各种美味名菜的主要原料。\n" +
        "安全隐患:\n" +
        "中国不少美食以卤水烹调，像人们常吃的鸭舌、鸭腿、卤肉饭等等。可据研究发现，卤肉加热时间愈长，产生的致癌物胆固醇氧化物（COPs）也愈多。\n" +
        "食物卤煮太久会使营养素流失，且卤制品通常太油太咸，多吃易患心血管疾病及增加肾脏负荷。\n" +
        "食物经高温加热会有氧化现象，时间太久会产生过氧化物，破坏血管、细胞膜及DNA等，而且不少卤味如猪肠等都含高脂肪，也有可能增加患心血管病的风险。\n" +
        "卤味加热时间应少于3小时，而在卤水汁中加入合比例的冰糖及酱油，有助于减少致癌物。 "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lu_ya_tui);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(lu_ya_tui.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
