package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class san_xian_pai_tiao extends AppCompatActivity {
private String[]data={"三鲜:\n" +
        "三鲜分地三鲜、树三鲜、水三鲜。地三鲜即蚕豆、苋菜、黄瓜（一说是苋菜、元麦，蚕豆，也有说是苋菜、蚕豆、蒜苗）；树三鲜即樱桃、枇杷、杏子（一说是梅子、杏子、樱桃，也有说是梅子、樱桃、香椿头）；水三鲜即海蛳、河鲀、鲥鱼（一说是鲥鱼、鲳鱼、黄鱼，也有说是鲥鱼、银鱼、子鲚鱼）。\n"+
"主要营养成分:蛋白质，维生素。主要食用功效：清热解肺，促进消化。\n"+
        "地三鲜的营养价值:\n" +
        "土豆:土豆是低热能、多维生素和微量元素的食物,是理想的减肥食品。每100克土豆含钾高达300毫克。专家认为,每周吃5～6个土豆可使中风几率下降40%。同时土豆对辅助治疗消化不良、习惯性便秘、神疲乏力、慢性胃痛、关节疼痛、皮肤湿疹等症有良好效果,是胃病和心脏病患者的优质保健食品,还可以降脂降糖,美容、抗衰老等。\n" +
        "茄子(绿皮):茄子是老百姓餐桌上十分常见的家常蔬菜,它的皮中含有丰富的维生素E和维生素P,这是其他蔬菜所不能比的,维生素P可软化微细血管,防止小血管出血,对高血压、动脉硬化、咯血、及坏血病患者均有益。茄子中所含的维C和皂草甙,具有降低胆固醇的功效。此外,茄子所含的B族维生素对痛经、慢性胃炎及肾炎水肿等有一定辅助治疗作用。\n" +
        "青椒:青椒果实中含有极其丰富的营养,维C含量比茄子、番茄都高,其中芬芳辛辣的辣椒素,能增进食欲、帮助消化,含有的抗氧化维生素和微量元素,能增强人的体力,缓解因工作生活压力造成的疲劳。其中还有丰富的维生素K,可以防治坏血病,对牙龈出血、贫血、血管脆弱有辅助治疗作用。其特有的味道和所含的辣椒素有刺激唾液和胃液分泌的作用,能增进食欲,帮助消化,促进肠蠕动,防止便秘。\n"+
        "地三鲜的宜忌人群:\n" +
        "地三鲜除了营养均衡,容易被人体吸收外,还具有治疗胃癌,抵抗衰老和降低胆固醇含量和保护心脏,心血管的功效,对缓解身体疲劳有一定的效果,不过虽为炒菜,但是一些人是不能吃地三鲜的。比如脾胃虚寒的朋友就建议少吃这道菜了。\n" +
        "脾胃虚寒者忌食\n" +
        "高血压、急慢性肾炎、肝炎、夜盲症、近视眼患者适宜脾胃虚寒、月经期间不宜进食。"+
        "排条，指猪、牛、羊等动物剔肉后剩下的肋骨和脊椎骨，上面还附有少量肉类，可以食用"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_san_xian_pai_tiao);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(san_xian_pai_tiao.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
