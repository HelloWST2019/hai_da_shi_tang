package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class bai_zhou extends AppCompatActivity {
    private String[]data={"白粥是广东省传统食俗，别称斋粥、米皇。广东粥中将没有放佐料的粥就称为白粥。上好的白粥，以丝苗白米明火煮数小时而成，讲求的是软、绵、滑，主要食用功效为滋补元气，止泻功效，生津液，畅胃气。老幼皆宜\n"+
    "营养功效:\n" +
            "白粥具有滋补元气，止泻功效，生津液，畅胃气的功效。白粥有清理胃肠、润泽肝腑、平肝散火的效果、如果是受得了清凉的青壮年，吃白粥的时候可以配合一些生菜，效力更好，选购新鲜鲜嫩的生菜切成丝状，将生菜丝放入碗底，冲入煲好的白粥，即可食用。\n" +
            "白粥既有清理胃肠热滞的效果，加上生菜的清热效果，收效自然更佳。我现在每天都喝一碗白粥，已经坚持半个月了，现在每天早上9点半准时跑厕所，原来突起难看的小肚楠也已经消下去了，真是意外的惊喜，后来才知道白粥的减肥效果更是佳，白粥还有美容的效果哦。真是一举多得啊．不过体寒的人就不适合喝白粥，白粥性凉。\n"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_zhou);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(bai_zhou.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
