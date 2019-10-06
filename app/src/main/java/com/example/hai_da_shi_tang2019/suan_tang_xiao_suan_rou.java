package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class suan_tang_xiao_suan_rou extends AppCompatActivity {
private String[]data={"酸汤是一道菜品，制作原料主要有大白菜、青菜、野生西红柿等。酸汤具有开胃健脾之功效，根据实际需要，还可加葱、洋葱、芥菜、芫荽等提鲜增香除异味。\n"+
"营养价值:\n" +
        "贵州酸汤中含有一定量的酒石酸、苹果酸、乳酸、乙酸、柠檬酸和少量的丁二酸。矿物质主要是钙、磷、铁、锌等。其中钙和磷的含量较高，而且在以下要介绍的几种酸汤中的含量相对稳定。人体内矿物质主要存在于骨骼中，它起着维持骨骼刚性的作用。因此，苗族酸汤丰富的钙、磷、铁等对保持神经、肌肉的兴奋性以及维持肌体的酸碱平衡具有重要的作用。难怪贵州当地的人讲“三天不吃酸，走路打蹿蹿”，是有一定科学依据的。\n" +
        "并非所有具有酸味的食品都是酸性食品，苗族酸汤菜就是酸性和碱性相对平衡的食品。首先，苗族酸汤中的乳酸是自发酵产生的，而乳酸在体内燃烧后变成水和二氧化碳，依据此，可以认为苗族酸汤是中性食品。第二，酸汤中含有丰富的钙、铁等碱性成分，而在酸汤鱼中含有丰富的酸性成分(如磷和蛋白质等),它们在体内形成酸性物质，可降低血液的Ph值。第三，苗族酸汤食品中的蔬菜，由于含有钙、镁等元素,在体内代谢后则生产碱性物质，能阻止血液等向酸性变化。因此,贵州酸汤属中性食品。\n"+
"酸肉 （布依族腌酸肉）:\n" +
        "贵州、湖南、江西一带的少数民族的一种独特食肉方法，即用多种家禽、家畜生鲜肉腌制酸肉，其味道鲜美独特，香气宜人清爽上口，食之不腻，增进食欲。是当地家家户户和饭店、招待所常备待客的最佳地方民族风味菜。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suan_tang_xiao_suan_rou);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(suan_tang_xiao_suan_rou.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
