package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class lu_dou extends AppCompatActivity {
private String[]data={"营养配餐:\n" +
        "鸡蛋，味甘性平。具有滋阴润燥，养心安神，养血安胎，延年益寿之功。鸡蛋是大众喜爱的食品，鲜鸡蛋所含营养丰富而全面，营养学家称之为“完全蛋白质模式”，被人们誉为“理想的营养库”。\n" +
        "鲜鸡蛋含的蛋白质中，主要为卵蛋白（在蛋清中）和卵黄蛋白（主要在蛋黄中）。其蛋白质的氨基酸组成与人体组织蛋白质最为接近，因此吸收率相当高，可达99.7%。鲜鸡蛋含的脂肪，主要集中在蛋黄中。此外蛋黄还含有卵磷脂、维生素和矿物质等，这些营养素有助于增进神经系统的功能，所以，蛋黄是较好的健脑益智食物。经常食用，可增强记忆，防止老年人记忆力衰退。\n" +
        ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lu_dou);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(lu_dou.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);   }
}
