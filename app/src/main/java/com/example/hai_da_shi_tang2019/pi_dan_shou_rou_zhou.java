package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class pi_dan_shou_rou_zhou extends AppCompatActivity {
private String[]data={"皮蛋瘦肉粥是一种在中国广东很常见的粥，以切成小块的皮蛋及咸瘦肉为配料。皮蛋瘦肉粥在香港很受欢迎，所有粥面专门店及中式酒楼都必有这种粥提供。香菇皮蛋瘦肉粥就是加了香菇的皮蛋瘦肉粥。\n" +
        "营养价值:\n" +
        "所谓老火粥呢?是将米,水,料一起熬煮,因为所加配料与米都要长时间的煲，所以才叫它老火粥。虽然煲老火粥和煲生滚粥粥底的方法差不多，但煲老火粥所选用的配料却一定要有浓厚的味道，并且经得起长时间煲煮。老火的皮蛋瘦肉粥是一大特色，它和生滚的皮蛋瘦肉粥不同，生滚用的是新鲜猪肉片，要求口感滑嫩，而老火皮蛋瘦肉粥却要求味道香浓\n" +
        ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pi_dan_shou_rou_zhou);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(pi_dan_shou_rou_zhou.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
