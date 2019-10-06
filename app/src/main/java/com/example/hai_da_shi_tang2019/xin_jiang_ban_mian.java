package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class xin_jiang_ban_mian extends AppCompatActivity {
    private String[]data={"新疆拌面，俗称“拉条子”，因其制法独特，并拌以菜食而得名。新疆拌面，起源于山西“骆驼客”。“骆驼客”类似我们今天的邮差，过去人们运送货物没有像现在这样发达的交通运输工具，没有快捷便利的物流，要将货物通过一望无际的沙漠运送到新疆，只能靠“沙漠之舟”的骆驼。所以，过去各城市都有这些“跑运输”的骆驼客常年来往于丝绸之路，出门在外时间久了，家乡饭菜永远是心中的牵挂，那时沿路没有各地风味小吃的饭馆，吃了一路干粮的骆驼客们，总要做一些家乡饭慰劳自己。山西拉面的技艺正是由山西骆驼客带到新疆的，因其制作的时候以菜拌面而得名成“新疆拌面”。\n" +
            ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xin_jiang_ban_mian);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(xin_jiang_ban_mian.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
