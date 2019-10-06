package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class la_zi_ji_kuai extends AppCompatActivity {
private String[]data={"菜品特色:\n" +
        "鸡肉蛋白质的含量较高，脂肪含量较低。此外，鸡肉蛋白质中富含全部必需氨基酸，其含量与蛋、乳中的氨基酸谱式极为相似，因此为优质的蛋白质来源。每100克去皮鸡肉中含有24克蛋白质、0.7克脂类物质，是几乎不含脂肪的高蛋白食品。鸡肉也是磷、铁、铜与锌的良好来源，并且富含维生素B12、维生素B6、维生素A、维生素D、维生素K等。鸡肉含有较多的不饱和脂肪酸—油酸（单不饱和脂肪酸）和亚油酸（多不饱和脂肪酸），能够降低对人体健康不利的低密度脂蛋白胆固醇。\n" +
        "鸡肉蛋白质含量较高，且易被人体吸收入利用，有增强体力，强壮身体的作用。\n"+
        "健康功效：\n" +
        "姜：降逆止呕、化痰止咳、散寒解表\n" +
        "鸡腿：温中、补精益髓、益气\n" +
        "八角：理气、止痛、温阳\n"
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_la_zi_ji_kuai);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(la_zi_ji_kuai.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
