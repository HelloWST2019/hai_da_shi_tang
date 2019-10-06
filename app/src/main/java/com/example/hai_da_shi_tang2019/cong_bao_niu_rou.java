package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class cong_bao_niu_rou extends AppCompatActivity {
String[]data={"菜品特色:\n" +
        "大葱是温通阳气的养生佐料，适合与肉类同烹，可去除荤腥、膻味，并消除菜肴中的油腻感。将大葱切段，与腌入味的牛肉片爆炒成菜后，牛肉不仅香辣嫩滑，还有一股淡淡的葱香味，让人开胃，而且常食此菜还有补虚养身、健脾和减肥瘦身之效。\n"+
"食用须知:\n" +
        "1、牛柳先用刀背拍松，再逆着纹理切成薄片，吃时口感会松软嫩滑；如果想要牛柳有嚼劲，可顺着牛肉的纹理切薄片，加入嫩肉粉腌制一下，便可烹调。\n" +
        "2、子姜与生姜相比，辣味较轻，且清香味浓，有开胃消食的功效，用来腌制牛肉可起到提香去腥的作用。\n" +
        "3、大葱一般只食用葱白部分，葱青遗弃不用，大葱经猛火爆炒后，辛辣味会降低，甜味会完全释出，且葱香味极浓。\n" +
        "4、牛肉炒熟后，加入少许米醋调味，具有软化肉质的作用，还可以增加菜肴的香味，不宜用白醋代之，否则成菜酸味会较重。\n" +
        "5、注:如果牛肉较老可加一点黄酒"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cong_bao_niu_rou);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(cong_bao_niu_rou.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
