package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hui_guo_rou extends AppCompatActivity {
    private String[]data={"回锅肉（Twice-cooked pork slices)，是一种四川传统菜式中家常（味型）菜肴的代表菜肴之一，属于川菜系列。制作原料主要有猪后臀肉、青椒、蒜苗等，口味独特，色泽红亮，肥而不腻。\n" +
            "回锅肉起源四川农村地区  。古代时期称作油爆锅，四川地区大部分家庭都会制作。所谓回锅，就是再次烹调的意思。回锅肉在川菜中的地位是非常重要的，回锅肉一直被认为是川菜之首，川菜之化身，提到川菜必然想到回锅肉。回锅肉色香味俱全，是下饭菜中大部分人会选的菜。配料各有不同，除了蒜苗（青蒜）还可以用彩椒，洋葱，韭菜，锅盔等来制作回锅肉，““家常”顾名思义，“调料家家常有之意，”故每一家制作出的味道都不相同，这一特性，也是赋予了回锅肉这道菜独特的魅力。\n" +
            "营养成分:\n" +
            "猪肉含有丰富的优质蛋白质和必需的脂肪酸，并提供血红素（有机铁）和促进铁吸收的半胱氨酸，能改善缺铁性贫血；具有补肾养血，滋阴润燥的功效；猪精肉相对其它部位的猪肉，其含有丰富优质蛋白，脂肪、胆固醇较少，一般人群均可适量食用。除了蛋白质、脂肪等主要营养成分外，还含有钙、磷、铁、硫胺素、核黄素和尼克酸等。回锅肉中还含有血红蛋白，可以起到补铁的作用，能够预防贫血。肉中的血红蛋白比植物中的更好吸收。\n" +
            "青椒果实中含有极其丰富的营养，维C含量比茄子、番茄都高，其中芬芳辛辣的辣椒素，能增进食欲、帮助消化，含有的抗氧化维生素和微量元素，能增强人的体力，缓解因工作生活压力造成的疲劳。其中还有丰富的维生素K，可以防治坏血病，对牙龈出血、贫血、血管脆弱有辅助治疗作用。其特有的味道和所含的辣椒素有刺激唾液和胃液分泌的作用，能增进食欲，帮助消化，促进肠蠕动，防止便秘。\n" +
            "青蒜中含有蛋白质、胡萝卜素、维生素B1、B2等营养成分。它的辣味主要来自于其含有的辣素，这种辣素具有醒脾气、消积食的作用。还有良好的杀菌、抑菌作用，能有效预防流感，肠炎等因环境污染引起的疾病。青蒜对于心脑血管有一定的保护作用，可预防血栓的形成，同时还能保护肝脏，诱导肝细胞脱毒酶的活性，可以阻断亚硝胺致癌物质的合成，对预防癌症有一定的作用。\n" +
            "营养功效:\n" +
            "1.味甘咸、性平，入脾、胃、肾经\n" +
            "2.具有补肾养血，滋阴润燥之功效\n" +
            "3.主治热病伤津、消渴羸瘦、肾虚体弱、产后血虚、燥咳、便秘、补虚、滋阴、润燥、滋肝阴，润肌肤，利二便和止消渴。\n" +
            "4.猪肉煮汤饮下可急补由于津液不足引起的烦躁、干咳、便秘和难产。\n" +
            "5.回锅肉中所用的猪肉油脂含量高，甜面酱及豆瓣酱均含钠，故高血压患者不宜多吃"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hui_guo_rou);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(hui_guo_rou.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
