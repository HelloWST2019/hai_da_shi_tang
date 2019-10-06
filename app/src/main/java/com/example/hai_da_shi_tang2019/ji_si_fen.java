package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ji_si_fen extends AppCompatActivity {
private String[]data={"鸡丝粉是北海人的特色美食汤粉之一，受热爱程度极高，由越南华侨从越南引进的美味，主要原料有北海河粉、鸡肉丝等，营养方法美味爽口。\n" +
        "营养分析:\n" +
        "鸡肉蛋白质的含量比例较高，种类多，而且消化率高，很容易被人体吸收利用，有增强体力、强壮身体的作用。 \n" +
        "鸡肉含有对人体生长发肓有重要作用的磷脂类，是中国人膳食结构中脂肪和磷脂的重要来源之一。 \n" +
        "鸡肉也是磷、铁、铜与锌的良好来源，并且富含维生素B12、维生素B6、维生素A、维生素D、维生素K等。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ji_si_fen);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(ji_si_fen.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
