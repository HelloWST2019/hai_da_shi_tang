package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class wawa extends AppCompatActivity {
private String[]data={"食用功效:\n" +
        "1、增强抵抗力：娃娃菜为身体增强抵抗力，既有预防感冒及消除疲劳的功效。\n" +
        "2、解渴利尿：娃娃菜热量也较低，含有β-胡萝卜素、铁、镁，能提升钙质吸收所需的成分，另外娃娃菜中的钾能将盐分排出体外有利尿作用。\n" +
        "3、通利肠胃：过炖煮后的娃娃菜有助于消化，因此最适合肠胃不佳和或病患者食用。\n" +
        "4、促进消化：娃娃菜能促进肠壁蠕动、帮助消化，防止大便干燥，保持大便通畅的功效，也能预防矽肺（由于长期呼吸道吸入硅石粉尘，而引起肺广泛纤维化的一种疾病，以呼吸短促为主要症状)乳腺癌、肠癌等疾病。\n" +
        "\n" +
        "适用人群:\n" +
        "\n" +
        "一般人群均可食用。\n" +
        "\n" +
        "禁忌人群:\n" +
        "\n" +
        "肠炎患者忌食。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wawa);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(wawa.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
