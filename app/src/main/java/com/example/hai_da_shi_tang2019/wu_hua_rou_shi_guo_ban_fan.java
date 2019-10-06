package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class wu_hua_rou_shi_guo_ban_fan extends AppCompatActivity {
    private String[]data={"五花肉（又称肋条肉、三层肉）位于猪的腹部，猪腹部脂肪组织很多，其中又夹带着肌肉组织，肥瘦间隔，故称“五花肉”。这部分的瘦肉也最嫩且最多汁。\n"+
            "五花肉一直是一些代表性中菜的最佳主角，如济南把子肉、梅菜扣肉、南乳扣肉、东坡肉、回锅肉、卤肉饭、瓜仔肉、粉蒸肉等等。它的肥肉遇热容易化，瘦肉久煮也不柴。\n" +
            "营养价值:\n" +
            "肉类含蛋白质丰富，一般在10-20%之间。瘦肉比肥肉含蛋白质多。肉类食品含蛋白质是优质蛋白质，不仅含有的必需氮基酸全面、数量多，而且比例恰当，接近于人体的蛋白质，容易消化吸收。 [2] \n" +
            "肉类中脂肪含量平均在10-30%左右，主要是各种脂肪酸和甘油三脂。还有少量卵磷脂、胆固醇、游离脂肪酸及脂溶性色素。肉类脂肪可提供较多的热量，如100克肥猪肉可提供热量830千卡。\n" +
            "肉类约含有1%左右无机盐，瘦肉中较多，特别是脏器内含量很丰富。如100克猪肝中含铁为25毫克，牛肝含5毫克。\n" +
            "肉类还有较多的维生素B1、B2、尼克酸等，如猪肉(肥瘦)每100克含维生素B1 0.53毫克、B2 0.12毫克、尼克酸4.2毫克。脏器含量更高，尤其是肝脏，每100克猪肝约含维生素B2　2.11毫克，比肌肉中多15-20倍，尼克酸含故为16.2毫克，比肌肉多4-5倍。牛、羊肝中的维生素B1含量也比肌肉组织中多5-6倍。此外肝脏中还含有叶酸和维生素B1B2及维生素A和D，比如每100克猪肝含维生素A8700国际单位、羊肝为29900国际单位。\n" +
            "肉类中含糖量较低，平均只有1-5%。按照中医的理论，猪肉性能微寒、有解热功能，补肾气虚弱。\n" +
            "肉类经烹调后，可制成多种多样的美味佳肴，又有浓郁的香味和鲜美的味道，可大大提高食欲。\n" +
            "猪肉含有丰富的优质蛋白质和必需的脂肪酸，并提供血红素（有机铁）和促进铁吸收的半胱氨酸，能改善缺铁性贫血。\n" +
            "不适用的人群\n" +
            "湿热痰滞内蕴者慎服；肥胖、血脂较高者不宜多食。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wu_hua_rou_shi_guo_ban_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(wu_hua_rou_shi_guo_ban_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
