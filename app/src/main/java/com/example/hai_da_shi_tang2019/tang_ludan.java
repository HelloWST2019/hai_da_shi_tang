package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class tang_ludan extends AppCompatActivity {
    private String[]data={"汤，是大量的水和各种煮熟蔬菜、肉类以及一些其他的佐料经长时间的文火慢炖，从而味道外泄，和水混合在一起，便形成了美味的汤。不含防腐剂。\n" +
            "大量水分和长时间的烹调使汤混合了很多滋味和香味成分。由调味不同，汤可以有开胃、正菜、补充水分、解腻等功效。本身味道很淡的食品如豆腐、米粉、鱼翅多配鲜汤一起食用。\n" +
            "一些不适合直接食用的下脚料通过汤，特别是熬制清汤，被充分利用。例如北京烤鸭会经常配有用鸭骨架制的汤。\n" +
            "中国菜上汤可能在进餐过程中的任何时间，西餐则在一开头，开胃菜之后上汤。日本和朝鲜半岛则是边吃饭边喝汤。\n"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tang_ludan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(tang_ludan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);  }
}
