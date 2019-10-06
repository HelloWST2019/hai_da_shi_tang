package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class mu_er_qing_cai extends AppCompatActivity {
private String[]data={"食用价值:\n" +
        "叶含有多种维生素和钙、铁，可做栽培蔬菜，也可观赏。全草供药用，为缓泻剂，有滑肠、散热、利大小便的功效；花汁有清血解毒作用，能解痘毒，外敷治痈毒及乳头破裂。果汁可作无害的食品着色剂。\n" +
        "木耳菜食疗主要作用：\n" +
        "木耳菜味甘、酸、性寒，归心、肝、脾、大肠、小肠经；\n" +
        "具有清热、解毒、滑肠、润燥、凉血、生肌的功效；\n" +
        "可用于治疗便秘、痢疾、疖肿、皮肤炎症等病。 "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mu_er_qing_cai);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(mu_er_qing_cai.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
