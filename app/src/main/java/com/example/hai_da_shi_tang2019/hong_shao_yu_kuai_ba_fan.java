package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hong_shao_yu_kuai_ba_fan extends AppCompatActivity {
private String[]data={"草鱼又称鲩鱼，与青鱼，鳙鱼，鲢鱼并称中国四大淡水鱼。草鱼以草为食，故北方饲养草鱼也较多。草鱼背部的颜色为黑褐色、鳞片边缘为深褐色，胸、腹鳍为灰黄色，侧线平直，肉白嫩，骨刺少，适合切花刀作菊花鱼等造型菜。\n" +
        "1. 草鱼含有丰富的不饱和脂肪酸，对血液循环有利，是心血管病人的良好食物；\n" +
        "2. 草鱼含有丰富的硒元素，经常食用有抗衰老、养颜的功效，而且对肿瘤也有一定的防治作用；\n" +
        "3. 对于身体瘦弱、食欲不振的人来说，草鱼肉嫩而不腻，可以开胃、滋补。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hong_shao_yu_kuai_ba_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(hong_shao_yu_kuai_ba_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
