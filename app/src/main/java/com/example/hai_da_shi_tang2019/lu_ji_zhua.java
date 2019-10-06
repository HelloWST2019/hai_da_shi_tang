package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class lu_ji_zhua extends AppCompatActivity {
private String[]data={"卤鸡爪又叫卤鸡脚，是以鸡爪作为主要食材的家常小菜。烹制时要注意鸡爪本身有胶质，所以卤好不要浸泡太久，免得卤汤变稠\n" +
        "营养价值:\n" +
        "鸡爪 也称“鸡掌”“鸡脚”“凤爪”“凤足”。多皮、筋，胶质大。常用于冷盘、煮汤，也宜于卤、酱。如：卤鸡爪、酱鸡爪。鸡爪还广为商家制作成冷藏真空包装食品。质地肥厚的还可煮熟后脱骨拌食，如：椒麻鸡掌、拆骨掌翅，皆脆嫩可口。鸡爪的营养价值颇高，含有丰富的钙质及胶原蛋白，多吃不但能软化血管，同时具有美容功效。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lu_ji_zhua);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(lu_ji_zhua.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
