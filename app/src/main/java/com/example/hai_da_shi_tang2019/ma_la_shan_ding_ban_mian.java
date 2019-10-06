package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ma_la_shan_ding_ban_mian extends AppCompatActivity {
private String[]data={"麻辣，是川菜常用味道之一。特点是麻辣味厚，咸鲜而香。广泛应用于以家禽、家畜、内脏以及干鲜蔬品、豆类与豆制品等为原料的冷、热菜式，如水煮肉片、麻婆豆腐、麻辣牛肉丝、牛舌莴笋、麻辣鸡片、毛肚火锅等，主要由辣椒、花椒、川盐、味精和料酒调制而成。\n" +
        "益于心脏:\n" +
        "研究表明辣椒中的辣椒素有降血压、降胆固醇的功效，从而有效保护人们免受心脏病的侵袭，“当然，我们并不是 [2]  建议人们多食用辛辣食品，健康的饮食是一种营养均衡的饮食。辣椒只能作为一种食品补充剂，决不可作为一种治疗心脏疾病的药物”。\n" +
        "注意事项:\n" +
        "辛辣食品食用过多会让人便秘、上火，所以应该适量食用，切不可食用过量。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_la_shan_ding_ban_mian);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(ma_la_shan_ding_ban_mian.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
