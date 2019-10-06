package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class suan_la_tu_dou_si extends AppCompatActivity {
    private String[]data={"土豆丝是由土豆为主要食材做成的一道菜品，属于大众菜。常吃土豆能及时地给体内补充所需求的钾元素;土豆中的维生素C对大脑细胞具有保健作用。\n" +
            "中医认为引，土豆性平，有和胃、调中、健脾、益气之功效;能改善肠胃功能，对胃溃疡、十二脂肠溃疡、慢性胆囊炎、痔疮引起的便秘均有一定的疗效。土豆中还含有丰富的钾元素，可以有效地预防高血压。当人体过多地摄入盐分后，体内钠元素就会偏高，钾便呈现出不足而引起高血压。\n" +
            "土豆丝是由土豆为主要食材做成的一道菜品，属于大众菜。常吃土豆能及时地给体内补充所需求的钾元素;土豆中的维生素C对大脑细胞具有保健作用。\n" +
            "中医认为引，土豆性平，有和胃、调中、健脾、益气之功效;能改善肠胃功能，对胃溃疡、十二脂肠溃疡、慢性胆囊炎、痔疮引起的便秘均有一定的疗效。土豆中还含有丰富的钾元素，可以有效地预防高血压。当人体过多地摄入盐分后，体内钠元素就会偏高，钾便呈现出不足而引起高血压。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suan_la_tu_dou_si);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(suan_la_tu_dou_si.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter); }
}
