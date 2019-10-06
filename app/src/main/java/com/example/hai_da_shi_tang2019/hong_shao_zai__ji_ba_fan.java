package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hong_shao_zai__ji_ba_fan extends AppCompatActivity {
private String[]data={"仔鸡是一斤多重的小鸡，或未下过蛋的小母鸡。鸡肉蛋白质的含量比例较高，种类多，而且消化率高，很容易被人体吸收利用，有增强体力、强壮身体的作用。中医认为，鸡的全身都可入药。鸡肉有益五脏、补虚亏、健脾胃、强筋骨、活血脉、调月经和止白带等功效。\n" +
        "\n" +
        "鸡肉性平、温、味甘，入脾、胃经；\n" +
        "\n" +
        "可益气，补精，添髓；\n" +
        "\n" +
        "用于虚劳瘦弱、中虚食少、泄泻、头晕心悸、月经不调、产后乳少、消渴、水肿、小便数频、遗精、耳聋耳鸣等。\n" +
        "\n" +
        "磷脂\n" +
        "\n" +
        "鸡肉含有对人体生长发育有重要作用的磷脂类，是中国人膳食结构中脂肪和磷脂的重要来源之一。\n" +
        "\n" +
        "蛋白质\n" +
        "\n" +
        "而仔鸡的肉里含蛋白质较多，老鸡的肉里含蛋白质少。这是因为仔鸡的鸡肉占体重的60%左右，鸡肉的主要成分是蛋白质，所以仔鸡的肉营养价值高。再者仔鸡的肉里含弹性结缔组织极少，所以容易被人体的消化器官所吸收。仔鸡肉经蒸煮之后，鸡纤维便分离，变得细嫩、松软适口，而老鸡的鸡肉只占体重的40%左右，多数的脂肪和弹性结缔组织。弹性结缔组织是一种不溶于水弹性蛋白质，质地坚韧不易嚼碎，经160度高温蒸煮后会变成不可溶性的胶质，只能被人体吸收很少的一部分。  "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hong_shao_zai__ji_ba_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(hong_shao_zai__ji_ba_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
