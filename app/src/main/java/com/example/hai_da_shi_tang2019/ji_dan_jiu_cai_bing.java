package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ji_dan_jiu_cai_bing extends AppCompatActivity {
private String[]data={"韭菜药用价值：\n" +
        "功效\n" +
        "补肾；温中行气；散瘀；解毒。主肾虚阳痿；里寒腹痛；噎膈反胃；胸痹疼痛；衄血；吐血；尿血；痢疾；痔疮；痈疮肿毒；漆疮；跌打损伤。 [5] \n" +
        "①补肾温阳：韭菜性温，味辛，但无壮阳成份。\n" +
        "②益肝健胃：含挥发性精油及硫化物等特殊成分，散发独特的辛香气味，有助于疏调肝气，增进食欲，增强消化功能。\n" +
        "③行气理血：韭菜的辛辣气味有散瘀活血、行气导滞作用，适用于跌打损伤、反胃、肠炎、吐血、胸痛等症。\n" +
        "④润肠通便：含大量维生素和粗纤维，能增进胃肠蠕动，治疗便秘，预防肠癌。\n" +
        "药用禁忌\n" +
        "阴虚内热及疮疡、目疾患者均忌食。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ji_dan_jiu_cai_bing);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(ji_dan_jiu_cai_bing.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
