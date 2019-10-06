package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class kao_bao_zi extends AppCompatActivity {
private String[]data={"烤包子（维语叫“萨木萨”）和薄皮包子（维语叫“Gox garda”）是维吾尔族喜爱的食品之一。做烤包子得用新鲜羊肉，最好选择肥瘦均匀的羊腿肉，太瘦的肉不太适宜做馅，口感太柴，一般得肥瘦各一半。\n" +
        "烤包子主要是在馕坑烤制。包子皮用死面擀薄，四边折合成方形。包子馅用羊肉丁、羊尾巴油丁、洋葱、孜然粉(孜然，是新疆地产的一种香料，带有特殊的香味，可以提香去膻，是制作羊肉菜肴时的调味佳品)、精盐和胡椒粉等原料，加入少量水，拌匀而成。把包好的生包子贴在馕坑里，十几分钟即可烤熟，皮色黄亮，入口皮脆肉嫩，味鲜油香。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kao_bao_zi);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(kao_bao_zi.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
