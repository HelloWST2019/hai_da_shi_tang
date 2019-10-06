package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class qi_shan_sao_zi_mian extends AppCompatActivity {
private String[]data={"臊（sào）子面是中国陕西省特色传统面食、著名西府小吃，以宝鸡的岐山臊子面最为正宗。在陕西关中平原及甘肃陇东等地方流行。\n" +
        "臊子面历史悠久，其中含有配菜比如豆腐，鸡蛋等，做法简单。臊子就是肉丁的意思。对于陕西人来说，臊子面的配色尤为重要，黄色的鸡蛋皮、黑色的木耳、红色的胡萝卜、绿色的蒜苗、白色的豆腐等材料，既好看又好吃。\n" +
        "臊子面含有丰富的香甜、滑润淀粉、糖、蛋白质、钙、铁、磷、钾、镁等矿物质，有养心益肾、健脾厚肠的功效，还有硫胺素、核黄素，纤维，维生素A，和三种氨基酸等。\n" +
        "臊子面易于消化吸收，有改善贫血、增强免疫力、平衡营养吸收等功效。臊子面含有丰富的碳水化合物，能提供足够的能量，而且在煮的过程中会吸收大量的水，100克臊子面煮熟后会变成400克左右，因此能产生较强的饱腹感。此外，臊子面能够刺激人的思维活动，人的大脑和神经系统需要一种碳水化合物占50%的食品，面条就是人的大脑所需要的食品。硬质小麦含有B族维生素，它们对脑细胞有刺激作用，所以中午吃一碗营养搭配合理的面条是不错的选择。而早上应该吃些蛋白含量较高的食品，晚上吃面则不利于消化吸收。" +
        ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qi_shan_sao_zi_mian);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(qi_shan_sao_zi_mian.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
