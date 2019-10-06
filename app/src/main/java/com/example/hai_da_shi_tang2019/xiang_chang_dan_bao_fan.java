package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class xiang_chang_dan_bao_fan extends AppCompatActivity {
private String[]data={"蛋包饭是日本一种比较普通且很受青睐的主食，由蛋皮包裹炒饭而成的菜肴。一般是将鸡蛋煎成厚薄均匀的蛋皮，再放上炒好的炒饭、韩式辣椒酱、番茄酱、色拉油和其他各种材料包好制成。 蛋包饭不论是在韩国，日本或台湾，都是相当受到欢迎的料理，不只是一道家庭料理，也有餐厅供应，甚至还有专卖店专卖。在中国大陆地区也有部分餐厅出售。\n"+
"主要功效:\n" +
        "香肠可开胃助食，增进食欲。\n" +
        "禁忌与副作用:\n" +
        "儿童、孕妇、老年人、高血脂症者少食或不食；肝肾功能不全者不适合食用。\n" +
        "饮食文化:\n" +
        "中国香肠约创制于南北朝以前，始见载于北魏《齐民要术》的“灌肠法”，其法流传至今。中国灌肠香肠不加淀粉，可贮存很久，熟制后食用，风味鲜美，醇厚浓郁，回味绵长，越嚼越香，远胜于其他国家的灌肠制品，是中华传统特色食品之一，享誉海内外。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiang_chang_dan_bao_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(xiang_chang_dan_bao_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
