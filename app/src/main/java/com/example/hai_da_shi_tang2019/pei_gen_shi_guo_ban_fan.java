package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class pei_gen_shi_guo_ban_fan extends AppCompatActivity {
    private String[]data={"主要功效:\n" +
            "培根有健脾、开胃、祛寒、消食等主要功效。\n" +
            "禁忌:\n" +
            "1.脾胃虚寒的泄泻下痢之人，不宜多食；\n" +
            "2.老年人、胃肠溃疡患者禁食；\n" +
            "3.患有急慢性肾炎者忌食；\n" +
            "4.凡浮肿、水肿、腹水者忌食；\n" +
            "4.感冒未愈、湿热泄痢、积滞未尽、腹胀痞满者和十二指肠溃疡患者忌食。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pei_gen_shi_guo_ban_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(pei_gen_shi_guo_ban_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
