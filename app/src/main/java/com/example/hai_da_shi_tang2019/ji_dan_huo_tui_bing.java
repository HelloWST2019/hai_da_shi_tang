package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ji_dan_huo_tui_bing extends AppCompatActivity {
private String[]data={"火腿（英语：Ham）,是腌制或熏制的动物的腿(如牛腿、羊腿、猪腿、鸡腿)，是经过盐渍、烟熏、发酵和干燥处理的腌制动物后腿，一般用猪后腿或是以猪、牛肉的肉泥，添加淀粉与食品添加剂，压制成成的“三明治火腿”，又名“火肉”、“兰熏”。中国传统特色美食。原产于浙江金华，现代以浙江金华和江苏如皋，江西安福与云南宣威出产的火腿最有名。\n" +
        "营养价值:\n" +
        "火腿内含丰富的蛋白质和适度的脂肪，十多种氨基酸、多种维生素和矿物质；\n" +
        "火腿制作经冬历夏，经过发酵分解，各种营养成分更易被人体所吸收，具有养胃生津、益肾壮阳、固骨髓、健足力、愈创口等作用。\n" +
        "火腿肉性温，味甘咸；具有健脾开胃，生津益血，滋肾填精之功效；\n" +
        "可用以治疗虚劳怔忡、脾虚少食、久泻久痢、腰腿酸软等症。\n" +
        "江南一带常以之煨汤作为产妇或病后开胃增食的食品；因火腿有加速创口愈合的功能，现已用为外科手术后的辅助食品。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ji_dan_huo_tui_bing);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(ji_dan_huo_tui_bing.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
