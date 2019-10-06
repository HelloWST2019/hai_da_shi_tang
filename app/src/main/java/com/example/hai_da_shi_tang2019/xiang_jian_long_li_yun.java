package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class xiang_jian_long_li_yun extends AppCompatActivity {
    private String[]data={"龙利鱼属鲽形目、舌鳎科、舌鳎属，俗称子板鱼、鳎目、鳎米，是一种暖温性近海大型底层鱼类，终年生活栖息在中国近海海区，具广温、广盐和适应多变的环境条件的特点，适温范围3.5—32℃，最适水温14—24℃，适盐范围14-33‰。半滑舌鳎自然资源量少，味鲜鲜美，出肉率高，口感爽滑，鱼肉久煮而不老，无腥味和异味，属于高蛋白，营养丰富，历来为中国沿海广大消费者待客的上等佳品，深受广大消费者青睐，目前活鱼价格很高。加之，半滑舌鳎生长速度快，食物层次低，能耐低氧，病害少，适合在目前养殖大菱鲆、牙鲆的大棚内养殖。\n" +
            "营养价值:\n" +
            "据营养专家称，龙利鱼作为优质海洋鱼类，其脂肪中含有不饱和脂肪酸，具有抗动脉粥样硬化之功效，对防治心脑血管疾病和增强记忆颇有益处。\n" +
            "同时据营养测定，龙利鱼中的欧米加－3脂肪酸，可以抑制眼睛里的自由基，防止新血管的形成，降低晶体炎症的发生，这就是它又被称为“护眼鱼肉”的原因。所以它还特别适合整天面对电脑的上班族作为健康保健品。 [1] \n" +
            "食用功效:\n" +
            "抗动脉硬化\n" +
            "　　防治心脑血管疾病\n" +
            "　　增强记忆\n" +
            "　　保护视力"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiang_jian_long_li_yun);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(xiang_jian_long_li_yun.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
