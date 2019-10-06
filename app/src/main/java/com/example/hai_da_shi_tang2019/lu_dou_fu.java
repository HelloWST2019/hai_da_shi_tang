package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class lu_dou_fu extends AppCompatActivity {
private String[]data={"卤豆腐是一道地方名菜，属于湘菜（中国卤菜之都武冈最为有名），作为家常菜品，操作简单，适宜人群广。豆腐干买来后要清洗后焯一下水。去除豆腥。把卤汁用料煲滚，放下豆腐润，慢火煮十五分钟。再浸十分钟。\n" +
        "营养价值:\n" +
        "豆腐营养丰富，含有铁、钙、磷、镁等人体必需的多种微量元素，还含有糖类、植物油和丰富的优质蛋白，素有“植物肉”之美称。豆腐的消化吸收率达95%以上。两小块豆腐，即可满足一个人一天钙的需要量。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lu_dou_fu);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(lu_dou_fu.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
