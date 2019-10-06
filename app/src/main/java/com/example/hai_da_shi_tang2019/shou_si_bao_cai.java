package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class shou_si_bao_cai extends AppCompatActivity {
    private String[]data={"包菜，也被称球甘蓝、圆白菜，别名卷心菜，属于甘蓝的变种，富含纤体成分，一碗切好的甘蓝只有22卡路里的热量，所以它是既可以饱腹又健康的食品。同时，甘蓝也如维生素片一般富含多种营养成分。蔬菜的颜色深宜熟吃色浅生食是最好的方式，包菜含有大量的维生素C，纤维素以及碳水化合物及各种矿物质，多吃卷心菜有防癌功效。卷心菜新鲜汁液能治疗胃和十二指溃疡，有止痛及促进愈合作用。" +
            ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shou_si_bao_cai);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(shou_si_bao_cai.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
