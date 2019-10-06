package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class yinshi extends AppCompatActivity {
    private List<Yin>yinList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yinshi);
        yinInit();
        YinAdapter adapter=new YinAdapter(yinshi.this,R.layout.yin_item,yinList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
    public void yinInit(){
        Yin mes=new Yin("（1）常吃宵夜，会得胃病，因为胃得不到休息\n" +
                "（2）一个星期只能吃4颗蛋，吃太多对身体不好\n" +
                "（3）鸡屁股和脖子淋巴较多，含有致癌物，不吃较好\n" +
                "（4）饭后吃水果是错误的观念，应是饭前吃水果\n"+
                "（5）喝豆浆时不要加鸡蛋及红糖，也不要喝太多\n" +
                "（6）空腹时不要吃蕃茄，最好饭后吃\n" +
                "（7）早上醒来喝一杯水预防结石\n" +
                "（8）睡前三小时吃东西会胖\n" +
                "（9）少喝奶茶，因为高热量、高油，长期饮用易罹患高血压、糖尿病等疾病\n" +
                "（10）刚出炉的面包不宜马上食用\n" +
                "（11）每天十杯水，膀胱癌不会来\n" +
                "（12）一天咖啡喝太多易导致失眠、胃痛\n" +
                "（13）少吃多油脂的食物\n" +
                "（14）下午五点后大餐少吃，因为身体不需那么多能量\n" +
                "（15）10种吃了会快乐的食物：深海鱼，香蕉，葡萄柚，全麦面包，菠菜，大蒜，南瓜，低脂牛奶，鸡肉，樱桃\n" +
                "（16）每天喝酒不要超过一杯，因为酒精会抑制制造抗体的B细胞，增加细菌感染的机会\n" +
                "（17）酸梅具有防止老化作用，希望青春永驻及肝火旺盛者宜多食用\n" +
                "（18）香鸡排、麻辣锅、油腻食物、调味过重的料理是脱发诱因 \n"+
                "（19）帮助头发生长多食用包心菜、蛋、豆类，少吃甜食（尤其是果糖）\n" +
                "（20）每天一杯柠檬汁、柳橙汁，不但可以美白还可以淡化黑斑\n" +
                "（21）一天一个苹果才能让自己有个干干净净的肺\n" +
                "（22）食品中的黄曲毒素、亚硝酸类物皆具有致癌性\n" +
                "（23）减少食用盐腌、烟熏及烧烤的食物\n" +
                "（24）每天摄取新鲜的蔬菜与水果\n" +
                "（25）每天摄取富含高纤维的五谷类及豆类\n" +
                "（26）每天摄取均衡的饮食，不过量\n" +
                "（27）维持理想体重不过胖\n" +
                "（28）正确饮食习惯：早上吃的像皇帝，中午吃的像平民，晚上吃的像乞丐");
        yinList.add(mes);
    }
}
