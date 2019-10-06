package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hong_shao_pai_gu extends AppCompatActivity {
private String[]data={"适用人群:\n" +
        "适宜于气血不 足，阴虚 纳差者；湿热痰滞内蕴者慎服；肥胖、血脂较高者不宜多食。\n" +
        "禁忌:\n" +
        "猪排骨： 猪肉不宜与乌 梅、甘草、鲫鱼、虾、鸽肉、田螺、杏仁、驴肉、羊肝、香菜、甲鱼、菱角、荞麦、鹌鹑肉、牛肉同食 。食用猪肉后不宜大量饮茶。\n" +
        "营养价值:\n" +
        "猪排骨提供人 体生理活动必需的优质蛋白质、脂肪、维生素外，还含有大量磷酸钙、 骨胶原、骨粘蛋白等，尤其是丰富的钙质可维护骨骼健康，具有滋阴润燥、益精补血的功效。\n" +
        "猪排骨具有 滋阴润燥、益精补血的功效；适宜于气血不足，阴虚纳差者"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hong_shao_pai_gu);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(hong_shao_pai_gu.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
