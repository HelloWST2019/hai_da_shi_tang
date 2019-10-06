package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class jian_kang_shi_guo_ban_fan extends AppCompatActivity {
private String[]data={"“石锅拌饭”又称“韩国拌饭”、“石碗拌饭”，朝鲜语돌솥비빔밥，是朝鲜半岛以及中国东北地区黑龙江、吉林、辽宁特有的米饭料理。 它的发源地为韩国全罗北道，后来演变为朝鲜半岛的代表性食物。是朝鲜半岛三大名菜（平壤冷面，开城汤饭，全州拌饭）之一。\n" +
        "韩国全州的石锅拌饭名闻遐迩，拌饭里蕴涵着“五行五脏五色”的原理。在石锅锅内放入米饭及菜肴，再烤到锅底有一层锅巴，喷香诱人，石锅是陶做成的，厚重的黑色陶锅可直接拿到炉具烹煮，而且保温效果好。细嚼慢咽的人可安心享用，不用怕饭菜冷掉。石锅拌饭材料并不新奇特别，主要为米饭、肉类、鸡蛋，以及黄豆芽、菌菇类和各式野菜，菜的种类并无一定，采用当季最对味的季节时令蔬菜去调配即可。\n石锅拌饭的优点包括：营养丰富、热量不高、蔬菜品种多，顺应了世界范围内吃蔬菜、减肥的潮流，具有很高的营养价值。\n" +
        "拌饭里蕴涵着“五行五脏五色”的原理。菠菜、芹菜、小南瓜、黄瓜、银杏等五行属木，利于肝脏。生牛肉片、辣椒酱、红萝卜五行属火，利于心脏。凉粉、蛋黄、核桃、松子等黄色食品五行属土，利于脾脏。萝卜、黄豆芽、栗子、蛋白是白色食品，五行属金，利于肺脏。最后，桔梗、海带、香菇等五行属水，这些黑色食品利于肾脏。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jian_kang_shi_guo_ban_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(jian_kang_shi_guo_ban_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
