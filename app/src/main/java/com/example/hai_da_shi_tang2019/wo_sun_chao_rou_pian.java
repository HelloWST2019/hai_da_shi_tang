package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class wo_sun_chao_rou_pian extends AppCompatActivity {
private String[]data={"莴笋炒肉是一道很好吃的家常菜，此菜咸香宜人，口感清脆。莴笋肉质细嫩，生吃热炒均相宜。常吃莴笋可增强胃液和消化液的分泌，增进胆汁的分泌。莴笋中的钾是钠的27倍，有利于促进排尿，维持水平衡，对高血压和心脏病患者有很大的裨益。莴笋中所含的氟元素，可参与牙釉质和牙本质的形成，参与骨骼的生长。莴笋中的含碘量高，这对人体的基础代谢和体格发育，会产生有利影响。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wo_sun_chao_rou_pian);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(wo_sun_chao_rou_pian.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
