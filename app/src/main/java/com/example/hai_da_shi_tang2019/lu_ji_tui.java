package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class lu_ji_tui extends AppCompatActivity {
private String[]data={"卤鸡腿是一道以鸡腿为主料，以黄酒、酱油、白糖、茴香、桂皮等为调料，经盐后，煮制而成的一道美食。\n" +
        "中国不少美食以卤水烹调，像人们常吃的鸭舌、鸭腿、卤肉饭等等。可据研究发现，卤肉加热时间愈长，产生的致癌物胆固醇氧化物（COPs）也愈多。\n" +
        "食物卤煮太久会使营养素流失，且卤制品通常太油太咸，多吃易患心血管疾病及增加肾脏负荷。\n" +
        "食物经高温加热会有氧化现象，时间太久会产生过氧化物，破坏血管、细胞膜及DNA等，而且不少卤味如猪肠等都含高脂肪，也有可能增加患心血管病的风险。\n" +
        "卤味加热时间应少于3小时，而在卤水汁中加入合比例的冰糖及酱油，有助于减少致癌物。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lu_ji_tui);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(lu_ji_tui.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
