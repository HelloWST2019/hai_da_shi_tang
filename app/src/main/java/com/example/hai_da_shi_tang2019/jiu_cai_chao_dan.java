package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class jiu_cai_chao_dan extends AppCompatActivity {
private String[]data={"营养价值:\n" +
        "韭菜的含水量很高（85%），能量较低。它是铁、钾和维生素A的上等来源，也是维生素C的一般来源。韭菜还有刺激食欲的作用。韭菜含有较多的粗纤维，能增进胃肠蠕动，有效预防习惯性便秘和肠癌，有“洗肠草”之称。 \n" +
        "韭菜含有挥发性精油及含硫化合物，具有促进食欲的作用。同时，可能有助于血脂的调节，适量进食对高血压、冠心病、高血脂等有一定益处。它含有硫化合物，具有一定杀菌消炎作用。\n" +
        "春季食用有益健康。初春时节的韭菜品质最佳，晚秋的次之，夏季的最差。 \n" +
        "多食会上火且不易消化，因此阴虚火旺和胃肠虚弱的人不宜多食，推荐量为每人每次约1两。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jiu_cai_chao_dan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(jiu_cai_chao_dan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter); }
}
