package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class kao_ji_tui extends AppCompatActivity {
private String[]data={"烤鸡腿是餐桌上的一道美味，制作原料主要有棒棒腿、柠檬、酱油、酒等，因其肉质鲜嫩，酱香味道而深受欢迎。\n营养价值:\n" +
        "营养丰富，有滋补养身的作用。鸡肉对营养不良、畏寒怕冷、乏力疲劳、月经不调、贫血、虚弱等有很好的食疗作用。祖国医学认为，鸡肉有温中益气、补虚填精、健脾胃、活血脉、强筋骨的功效。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kao_ji_tui);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(kao_ji_tui.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
