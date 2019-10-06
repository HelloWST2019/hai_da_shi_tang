package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class gong_bao_ji_ding extends AppCompatActivity {
private String[]data={"宫保鸡丁（Kung Pao Chicken），是一道闻名中外的特色传统名菜。鲁菜、川菜、贵州菜中都有收录，原料、做法有差别。 该菜式的起源与鲁菜中的酱爆鸡丁，和贵州菜的胡辣子鸡丁有关，后被清朝山东巡抚、四川总督丁宝桢改良发扬，形成了一道新菜式——宫保鸡丁，并流传至今，此道菜也被归纳为北京宫廷菜 [3]  。之后宫保鸡丁也流传到国外。\n" +
        "宫保鸡丁选用鸡肉为主料，佐以花生米、黄瓜、辣椒等辅料烹制而成。 红而不辣、辣而不猛、香辣味浓、肉质滑脆。由于其入口鲜辣，鸡肉的鲜嫩配合花生的香脆。\n" +
        "营养价值:\n" +
        "宫保鸡丁富含蛋白质、钙、磷、铁、维生素及碳水化合物等营养成分，具有温中益气、滋补五脏、健脾胃、壮筋骨的功效。食之可养身滋补、增进食欲、促进人体健康、增强机体抵抗能力"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gong_bao_ji_ding);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(gong_bao_ji_ding.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
