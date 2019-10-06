package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class xi_hong_shi_ji_dan_mian extends AppCompatActivity {
    private String[]data={"西红柿鸡蛋面是一道家常面食，原材料有西红柿、鸡蛋、面粉、盐、味精、香油、老姜片 、葱花、香菜、花生油、酱油、花椒粉、柿子椒、香菇等。\n" +
            "营养与作用\n" +
            "西红柿越红营养越高.西红柿中主要的营养就是维生素，其中最重要、含量最多的就是胡萝卜素中的一种一番茄红素。当今这几年来，科学家已证明西红柿具有独特的抗氧化能力，可以清除人体内导致衰老和疾病的自由基；预防心血管疾病的发生；阻止前列腺的癌变进程，并有效地减少胰腺癌、直肠癌、喉癌、口腔癌、乳腺癌等癌症的发病危险。\n" +
            "营养含量\n" +
            "西红柿富含番茄红素，人体血浆中番茄红素含量越高，前列腺癌、肺癌、冠心病的发病率就越低。番茄红素的含量与西红柿中可溶性糖的含量是负相关的关系，也就是说，越是不甜的西红柿，其中番茄红素含量越高。此外，夏天生产的西红柿中番茄红素含量比较高，这主要是因为夏天阳光充沛、光照时间长，会让番茄红素的含量大大增加；而冬天温室大棚里种植的西红柿，番茄红素的含量比较低。黄色品种的西红柿中番茄红素含量很少。红色品种的西红柿则含量较高。一般来说，西红柿颜色越红，番茄红素含量越高，未成熟和半成熟的青色西红柿番茄红素含量相对较低，西红柿做熟后比生吃更有利于营养吸收。\n" +
            "此外，西红柿还含有香豆酸和氯原酸，它们在人体内有消除致癌物的作用"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xi_hong_shi_ji_dan_mian);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(xi_hong_shi_ji_dan_mian.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
