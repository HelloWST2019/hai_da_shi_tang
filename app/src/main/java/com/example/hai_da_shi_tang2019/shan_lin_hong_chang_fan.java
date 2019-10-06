package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class shan_lin_hong_chang_fan extends AppCompatActivity {
    private String[]data={"红肠，也称里道斯，是一种原产于俄罗斯、立陶宛，用猪肉、淀粉、大蒜等材料加工制作的香肠。因颜色火红得名。味道醇厚、鲜美。中东铁路修建后，由沙俄引进中国，成为东北的哈尔滨、佳木斯、七台河、满洲里等地特产，以哈尔滨所产红肠最为著名。是中国著名特产之一，在全国各地均有销售。\n" +
            "历史起源:\n" +
            "1913年，哈尔滨因中东铁路的修建而逐渐繁荣起来。来自不同地域的人们，在这里融合、发展，中西合璧、兼容并蓄的城市性格逐步形成。就在此时，英商马前氏投资5.5万英镑，在哈尔滨建立当时中国最大的畜产品加工企业——“滨江物产英国进出口有限公司”，主要经营畜禽屠宰及肉类加工，是哈埠地区最早形成的三大知名企业之一收购家鸡、家鸭、野鸡进行加工，俗称“鸡鸭公司”，这就是“哈肉联”的前身。公司引进俄籍大技师爱金宾斯的红肠加工技术，建成灌肠厂房，生产出哈尔滨“第一根红肠”，标志着“哈肉联红肠”的诞生，成为中国最早的肉灌制品加工企业。第一批红肠上市正值春节临近，一经推出，就被中国百姓和各国侨民抢购一空。\n" +
            "在那个动乱的年代，滨江物产英国进出口有限公司也是几经易主。1941年转为日本商人经营，1945年由苏联红军接管，1947年收归国有，曾是解放战争和抗美援朝的重要军需食品生产基地。1958年，企业正式命名为“哈尔滨肉类联合加工厂”。\n" +
            "近百年来，哈肉联历经创始期、计划经济的辉煌期、市场经济初期的低谷期、机制转换期、企业变革的转折期。1978年改革开放后，由于生猪（猪肉）、肉灌制品放开经营，企业陷入低谷。1997年，在政府的支持下，哈肉联对企业进行大规模的改革，成立了大众食品集团。2004年，企业完成改制，全面退出国有，与江苏雨润产业集团实行战略重组，组建了“哈尔滨大众肉联集团有限公司”。哈尔滨肉联红肠依旧飘香东北大地。\n" +
            "外地来哈尔滨的客人返回家时都想带点什么东西送给亲人朋友？多数人的选择是“哈尔滨红肠”。哈尔滨红肠是哈尔滨有名的行业品牌之一，而最能代表哈尔滨红肠的则是百年品牌“哈肉联红肠”。作为中华老字号、黑龙江省非物质文化遗产、中国欧式肉灌制品第一家的“哈肉联红肠”，在哈尔滨人及外地人眼中已经成为哈尔滨食品的代表。" +
            ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shan_lin_hong_chang_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(shan_lin_hong_chang_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
