package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class niurou extends AppCompatActivity {
private List<Niu>niuList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niurou);
        niuinit();
        NiuAdapter adapter=new NiuAdapter(niurou.this,R.layout.niu_item,niuList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
    public void niuinit(){
        Niu nr=new Niu("牛肉粉丝汤       12元","nr");
        Niu sp=new Niu(" ","sp");
        niuList.add(nr);
        Niu mes=new Niu("营养价值：牛肉含有丰富的蛋白质，氨基酸组成比猪肉更接近人体需要，能提高机体抗病能力，对生长发育及手术后、病后调养的人在补充失血、修复组织等方面物别适宜。寒冬食牛肉，有暖胃作用，为寒冬补益佳品。中医认为，牛肉有补中益气、滋养脾胃、强健筋骨、化痰息风、止渴止涎的功效。适用于中气下陷、气短体虚，筋骨酸软、贫血久病及面黄目眩之人食用。粉丝的营养成分主要是碳水化合物、膳食纤维、蛋白质、烟酸和钙、镁、铁、钾、磷、钠等矿物质。粉丝有良好的附味性，它能吸收各种鲜美汤料的味道，再加上粉丝本身的柔润嫩滑，更加爽口宜人，凉拌更佳。","mes");
        niuList.add(mes);
        Niu pa=new Niu(" ","pa");
        Niu ji=new Niu("食用禁忌：一般人皆可食用。孕妇少食或不食。 传统粉丝在加工制作过程中添加了明矾，明矾即硫酸铝钾。摄入过量的硫酸铝钾，会影响脑细胞的功能，从而影响和干扰人的意识和记忆功能，造成老年痴呆症，还可引起胆汁郁积性肝病，可导致骨骼软化，还可引起卵巢萎缩等病症。按照《食品添加剂使用标准GB2760-2011》规定：粉条不允许添加明矾。现阶段的粉丝加工，特别是知名品牌已经放弃明矾的使用，作坊生产的粉丝有不少仍然在使用明矾。食用粉丝后，不要再食油炸的松脆食品，如油条之类。因为油炸食品中含有的铝也很多，合在—起会使铝的摄入量大大超过每日允许的摄入量。","ji");
        niuList.add(pa);
        niuList.add(ji);
    }
}
