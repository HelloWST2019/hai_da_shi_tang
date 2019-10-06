package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class tu_dou_niu_rou extends AppCompatActivity {
private String[]data={"食用须知:\n" +
        "牛肉含有丰富的蛋白质，每100克牛肉中含量达20.1克，比猪肉多3.3%。牛肉的氨基酸组成比猪肉更接近于人体需要，蛋白质生物价高达79，也比猪肉高。能提高机体抗病能力，对生长发育、手术后、病后调养的人，在补充失血、修复组织等方面特别适宜。如果您经常感到疲倦、注意力不集中、眼睛容易充血红肿、恶心、头晕、脱发和贫血等，那么很可能缺乏赖氨酸，您的餐桌上就要增加牛肉了。\n" +
        "牛肉所含脂肪比猪肉少88.6%，在牛肉脂肪酸构成中：饱和脂肪酸比猪肉少85%；另外，牛肉中含胆固醇为58(mg/100g），而猪肉却为81，牛肉中的胆固醇比猪肉少28.4%。血液中脂肪和胆固醇过量会促使动脉中斑块的形成，而斑块会阻塞动脉，妨碍全身的血液正常流动，引起心脏病的发作，所以，牛肉对于中老年人预防动脉粥样硬化，减少高脂血症、心脑血管疾病及中风的发病率比猪肉要好得多。\n" +
        "牛肉中所含的铁和锌也都很多，注意菜肴的搭配才能提高铁和锌的生物利用率。如红烧牛肉土豆这道菜，牛肉中富含铁和锌，土豆中含有维生素C，维生素C可促进牛肉中铁和锌的吸收，提高其生物利用率。因此，在吃富含铁、锌的瘦牛肉时，一定要搭配些富含维生素C的食物，如深绿色蔬菜、红辣椒、菜花、豆芽、鱼籽和鱼脑、柑橘类水果、猕猴桃、柚子等。做到荤与素、干与稀搭配适宜，主食、副食缺一不可，定会收到事半功倍的效果。\n" +
        "土豆主要营养是淀粉 .牛肉含有丰富的蛋白质 如果是光吃这一道菜 没有维生素c 纤维素 是不科学的\n" +
        "土豆牛肉的搭配如果说不合理的话，只能说这道菜所含的热量相对比较高了，高蛋白，高糖，常吃容易发胖。再有纤维素含量少，不太容易消化。如果再加些西红柿一些炖，应该说还是搭配比较合理的一道菜。\n" +
        "牛肉的功效:\n" +
        "牛肉含有丰富的蛋白质，氨基酸组成比猪肉更接近人体需要，能提高机体抗病能力，对生长发育及手术后、病后调养的人在补充失血、修复组织等方面物别适宜。寒冬食牛肉，有暖胃作用，为寒冬补益佳品。中医认为，牛肉有补中益气、滋养脾胃、强健筋骨、化痰息风、止渴止涎的功效。适用于中气下陷、气短体虚，筋骨酸软、贫血久病及面黄目眩之人食用。\n" +
        "土豆牛肉功效:\n" +
        "日常食之气血、健脾胃、补虚弱。和胃调中，健脾益气。特别是胃寒者可以起到保健作用。\n" +
        "牛肉可以增加人体所需热量及能量，适合运动员、健美者使用，土豆能有效改善睡眠"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tu_dou_niu_rou);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(tu_dou_niu_rou.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
