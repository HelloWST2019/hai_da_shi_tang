package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class gang_shi_ban_fen extends AppCompatActivity {
    private String[]data={"拌粉即“腌”即吃，食用虽方便，但原料（粉丝）的制作过程却颇为复杂。最为讲究的，要数是迈陈村所产的粉丝。先在清水中浸泡大米24小时，取出磨成粉后，用特制器具将水压干，煮米粉至半熟、捞起，放在石臼中舂软、拌和。然后，把米粉装进特制机具里，压出粉丝，经滚水中烫熟，再用冷水浸一两个钟头，捞起便成。粉丝在选料上也很考究，太差或太粘的米都不成。一些外地大米不易制作，只有徐闻本地出产的大米才是上等的原料，才能生产出上等的粉丝：丝细、色好、柔韧、不粘糊、不断丝。\n" +
            "食用方法:\n" +
            "徐闻拌粉是凉食粉，食用前，要先取出纯正的花生油用微火煮沸，待油发香即离火，在油中加进花生米、蒜泥、虾米等佐料，再将酱油加水煮沸。食用时，取粉丝盛于食具中，倒进酱油、花生油，加上油炸后的花生米、芝麻、蒜泥、虾米、等佐料，还可拌些经过炒熟的肉丝、酸菜、青菜等等，然后用筷子翻拌均匀就可食用。拌粉滑润可口，香味馋人，吃后口留余香，令人回味难忘！"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gang_shi_ban_fen);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(gang_shi_ban_fen.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
