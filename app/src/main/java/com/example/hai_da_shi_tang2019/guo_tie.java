package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class guo_tie extends AppCompatActivity {
private String[]data={"锅贴，是我国洛阳的一种著名传统小吃，全国其他地区皆有分布，主要属于煎烙馅类的小食品。制作精巧，味道可口。根据季节配以不同鲜蔬菜。锅贴的形状各地不同，一般是细长饺子形状，但天津锅贴类似褡裢火烧。\n" +
        "据传，北宋建隆三年春正月庚申初一，因皇太后丧事刚完，宋太祖不受百官朝贺新春，不思茶饭。午后独自在院中散步，忽然一股香气飘来，顿感心旷神怡，便寻着香气走到了御膳房，但见御厨正将没煮完的剩饺子放在铁锅内煎着吃，看到太祖进来大气不敢出。这时太祖几天也没好生进补，此时香味勾起了食欲，就让御厨铲几个尝尝，这一尝不要紧，直觉得焦脆软香，煞是好吃，一连吃了四、五个。后问这叫什么名字，御厨一时答不上来，太祖看了看用铁锅煎的饺子就随口说，那就叫锅贴吧。正月庚午十一太祖到迎春苑宴会射箭，宴请大臣时让御厨做了这道锅贴赏给大家享用，御厨们从口味到外形加以改进，众臣食后倍加赞赏。后来这道锅贴从宫中传到了民间，又经过历代厨师们的不断研究和改进，最终成为如今的锅贴。\n" +
        "煎饺区别编辑\n" +
        "有很多人分不清锅贴和煎饺的区别，认为它们是一样的，有些地方甚至把锅贴就叫做煎饺，但其实两者的制作方法是有本质区别的。\n" +
        "煎饺与锅贴最大的区别是煎饺需要先煎后煮，或者先煮后煎，总之都少不了煮这道工序（实际上很多地方的煎饺是生饺子直接煎，没有煮的过程）。并且煎饺是盖上锅盖一次成功的，而锅贴只能用煎，千万不能加水煮，期间需要不断转动锅子和揭开锅盖淋水，这是煎饺与锅贴最大的区别。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guo_tie);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(guo_tie.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
