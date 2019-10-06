package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class yu_wan_fen extends AppCompatActivity {
    private String[]data={"鱼丸又称“鱼包肉”，用鳗鱼、鲨鱼或者淡水鱼剁蓉，加甘薯粉(淀粉)搅拌均匀，再包以猪瘦肉或虾等馅制成的丸状食物，富有沿海特色风味小吃之一。并且鱼丸是温州、福州、闽南、广州、台湾、江西抚州一带经常烹制的特色传统名点，属于粤菜或闽菜系。亦名“水丸”，古时称“氽鱼丸”。因为它味道鲜美，多吃不腻，可作点心配料，又可作汤，是沿海人们不可少的海味佳肴。\n" +
            "食用指南:\n" +
            "1.一般人都可食用，如有特殊情况请遵医嘱\n" +
            "2.小心吞食，防止烫伤等\n" +
            "主要功效:\n" +
            "1. 鱼肉营养丰富，具有滋补健胃、利水消肿、通乳、清热解毒、止嗽下气的功效；\n" +
            "2. 鱼肉含有丰富的镁元素，对心血管系统有很好的保护作用，有利于预防高血压、心肌梗死等心血管疾病；\n" +
            "3. 鱼肉中富含维生素A、铁、钙、磷等，常吃鱼还有养肝补血、泽肤养发健美的功效。\n" +
            "饮食文化:\n" +
            "鱼丸的来历\n" +
            "根据稗史的记载，秦始皇好吃鱼，他统一全国做了皇帝后，每餐必要有鱼，但又不能有刺，如有鱼刺则赐厨师死，有好几个厨师为此丧命；而烧鱼肉汤，又怕有诅咒秦始皇“粉身碎骨”之嫌。有一天，某厨师制作御膳，见到鱼又胆怯又发狠，就用菜刀背砸鱼发泄。一下两下，砸着砸着，他惊奇地发现，鱼刺鱼骨竟自动露了出来，鱼肉成了鱼茸。正在这时，宫中传膳了，厨师急中生智，拣出鱼刺，顺手将鱼茸捏成丸子，不假思索就投入已烧沸的豹胎汤中，氽成了丸子。不一会儿，一个个色泽洁白，柔软晶莹，尝之鲜嫩的鱼丸浮于汤面上，并呈到了秦始皇面前。秦始皇一尝，极为称赞，下令给予奖赏。后来，这种做法从宫廷渐渐传到民间，称为“氽鱼丸”，也就是鱼丸。" +
            ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yu_wan_fen);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(yu_wan_fen.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);}
}
