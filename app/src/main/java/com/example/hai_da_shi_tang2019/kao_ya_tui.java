package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class kao_ya_tui extends AppCompatActivity {
private String[]data={"饮食宜忌:\n" +
        "1、鸭肉营养丰富，特别适宜夏秋季节食用，既能补充过度消耗的营养，又可祛除暑热给人体带来的不适。\n" +
        "2、鸭肉性寒、味甘、咸，归脾、胃、肺、肾经；可大补虚劳、滋五脏之阴、清虚劳之热、补血行水、养胃生津、止咳自惊、消螺蛳积、清热健脾、虚弱浮肿；治身体虚弱、病后体虚、营养不良性水肿。\n" +
        "1、鸭肉忌与兔肉、杨梅、核桃、鳖、木耳、胡桃、大蒜、荞麦同食。\n" +
        "2、不应久食烟熏和烘烤的鸭肉，因其加工后可产生苯并芘物质，此物有致癌作用。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kao_ya_tui);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(kao_ya_tui.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
