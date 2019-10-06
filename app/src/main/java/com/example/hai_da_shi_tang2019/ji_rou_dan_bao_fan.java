package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ji_rou_dan_bao_fan extends AppCompatActivity {
private String[]data={"蛋包饭是日本一种比较普通且很受青睐的主食，由蛋皮包裹炒饭而成的菜肴。一般是将鸡蛋煎成厚薄均匀的蛋皮，再放上炒好的炒饭、韩式辣椒酱、番茄酱、色拉油和其他各种材料包好制成。 蛋包饭不论是在韩国，日本或台湾，都是相当受到欢迎的料理，不只是一道家庭料理，也有餐厅供应，甚至还有专卖店专卖。在中国大陆地区也有部分餐厅出售。\n"+
"鸡肉中医价值：\n" +
        "中医认为，鸡肉味甘，性微温。能温中补脾，益气养血，补肾益精。\n" +
        "鸡肉含有维生素C、E等，蛋白质的含量比例较高，种类多，而且消化率高，很容易被人体吸收利用，有增强体力、强壮身体的作用，另外含有对人体生长发育有重要作用的磷脂类，是中国人膳食结构中脂肪和磷脂的重要来源之一。鸡肉对营养不良、畏寒怕冷、乏力疲劳、月经不调、贫血、虚弱等有很好的食疗作用。祖国医学认为，鸡肉有温中益气、补虚填精、健脾胃、活血脉、强筋骨的功效。\n" +
        "鸡的品种很多，但作为美容食品，以乌鸡为佳。其性味甘温，含有蛋白质、脂肪、硫胺素、核黄素、尼克酸、维生素A，维生素C、胆甾醇、钙、磷、铁等多种成分。\n" +
        "乌鸡入肾经，具有温中益气、补肾填精、养血乌发、滋润肌肤的作用。凡虚劳羸瘦、面瘦、面色无华、水肿消渴、产后血虚乳少者，可将之作食疗滋补之品。鸡肝性味甘微温，能养血补肝，凡血虚目暗、夜盲翳障者可多食之。另外能养心安神、滋阴润肤。若脱发过多，或遗精、白带过多，可用鸡蛋二只，加首乌同煮食之。鸡肉能让秀发亮起来，每周至少应该吃3次。蛋黄油具有清热解毒，收敛生肌的作用。外擦患处可治疗婴儿湿疹，乳头皲裂、冻疮溃烂、水火烫伤、口腔溃疡等症。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ji_rou_dan_bao_fan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(ji_rou_dan_bao_fan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
