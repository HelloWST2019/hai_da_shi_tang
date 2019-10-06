package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class shang_hai_qiang_bing extends AppCompatActivity {
    private String[]data={"营养价值:\n" +
            "1、面粉：失眠多梦、心悸不安、多呵欠、喜悲伤欲哭，古称妇人脏燥（癔病）者食用，也适宜妇人回乳时食用；进食全麦可以降低血液循环中的雌激素的含量，从而达到防治乳腺癌的目的。\n" +
            "2、小麦营养价值很高，所含的B族维生素和矿物质对人体健康很有益处。对于更年期妇女，食用未精制的小麦还能缓解更年期综合症；患有脚气病、末梢神经炎者宜食小麦面粉；体虚自汗盗汗多汗者，宜食浮小麦。\n" +
            "美食禁忌:\n" +
            "忌选择颜色特别白色的小麦粉。"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shang_hai_qiang_bing);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(shang_hai_qiang_bing.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
