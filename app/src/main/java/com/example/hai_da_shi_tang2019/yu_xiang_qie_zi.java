package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class yu_xiang_qie_zi extends AppCompatActivity {
    private String[]data={"鱼香茄子是一道菜品，是四川省传统的特色名菜之一。属于川菜系中比较具有代表性的鱼香味型的名菜。\n" +
            "鱼香系列的川菜，最主要的辅料郫县豆瓣。主料配以郫县豆瓣加上其他调料烧出来的菜肴，其味厚重悠长，余味缭绕，回味无穷，故称余香。上世纪七十年代之前，餐馆菜单上书写的有“余香茄子”菜名。\n" +
            "营养价值:\n" +
            "吃茄子建议不要去皮，它的价值就在皮里面，但是一定要洗干净，否则农药会有所残留，危害到身体的健康，茄子皮里面含有维生素B，维生素B和维生素C是一对很好的搭档，我们摄入了充足的维C，这个维C的代谢过程中是需要维生素B的支持的。\n" +
            "茄子味甘、性凉，入脾、胃、大肠经；具有清热止血，消肿止痛的功效；用于热毒痈疮、皮肤溃疡、口舌生疮、痔疮下血、便血、衄血等。\n" +
            "茄子的营养，也较丰富，含有蛋白质、脂肪、碳水化合物、维生素以及钙、磷、铁等多种营养成分。每100克含有蛋白质2．3克，脂肪0．1克，碳水化合物3．1克，钙22毫克，磷31毫克，铁0．4毫克，胡萝卜素0．04毫克，硫胺素0．03毫克，核黄素0．04毫克，尼克酸0．5毫克，抗坏血酸3毫克。\n" +
            "保护心血管、抗坏血酸\n" +
            "茄子含丰富的维生素P，这种物质能增强人体细胞间的粘着力，增强毛细血管的弹性，减低毛细血管的脆性及渗透性，防止微血管破裂出血，使心血管保持正常的功能。此外，茄子还有防治坏血病及促进伤品愈合的功效。\n" +
            "防治胃癌\n" +
            "茄子含有龙葵碱，能抑制消化系统肿瘤的增殖，对于防治胃癌有一定效果。此外，茄子还有清退癌热的作用。\n" +
            "抗衰老\n" +
            "茄子含有维生素E，有防止出血和抗衰老功能，常吃茄子，可使血液中胆固醇水平不致增高，对延缓人体衰老具有积极的意义。\n" +
            "适用人群:\n" +
            "可清热解暑，对于容易长痱子、生疮疖的人，尤为适宜；但脾胃虚寒、哮喘者不宜多吃。且茄子秋后其味偏苦，性凉，脾胃虚寒、体弱、便溏者不宜多食；手术前吃茄子，麻醉剂可能无法被正常地分解，会拖延病人苏醒时间，影响病人康复速度。" +
            ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yu_xiang_qie_zi);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(yu_xiang_qie_zi.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
