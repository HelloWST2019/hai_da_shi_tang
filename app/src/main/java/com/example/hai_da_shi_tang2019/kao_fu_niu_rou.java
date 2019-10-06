package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class kao_fu_niu_rou extends AppCompatActivity {
private String[]data={"烤麸由生面筋经保温发酵后高温蒸制而成，色橙黄，松软而富弹性，有很多气孔，如海绵状。烤麸除作主料外，可与多种荤素原料组配，又称百搭菜。\n"+
"烤麸的功效:\n" +
        "和中 解热 益气 养血 止烦渴\n" +
        "烤麸营养小知识:\n" +
        "烤麸蛋白质含量丰富，属于高蛋白、低脂肪、低糖、低热量食物。\n" +
        "\n" +
        "烤麸相关人群:\n" +
        "一般人群均可食用，尤适宜体虚劳倦、内热烦渴时食用。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kao_fu_niu_rou);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(kao_fu_niu_rou.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
