package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class douya extends AppCompatActivity {
private String[]data={"营养价值:\n⒈豆芽中含有丰富的维生素C，可以治疗坏血病；⒉它还有清除血管壁中胆固醇和脂肪的堆积、防止心血管病变的作用；\n" +
        "⒊绿豆芽中还含有核黄素，对口腔溃疡的人很适合食用；\n" +
        "⒋它还富含膳食纤维，是便秘患者的健康蔬菜，有预防消化道癌症(食道癌、胃癌、直肠癌）的功效；\n" +
        "⒌豆芽的热量很低，而水分和纤维素含量很高，常吃豆芽，可以达到减肥的目的"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_douya);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(douya.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
