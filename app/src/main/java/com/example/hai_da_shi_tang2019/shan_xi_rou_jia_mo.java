package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class shan_xi_rou_jia_mo extends AppCompatActivity {
    private String[]data={"陕西有个白吉镇，这个地方的饼很好吃，很有特色，所以把这种馍叫白吉馍。白吉馍据称源自咸阳。是用上好面粉揉制后做成饼形，置铁铛板上略烤成型，放入炉膛侧立，上下隔着铁铛板的炭火烘烤，稍顷翻面，双面焦黄即可。我一直以为烹制食物，外焦里嫩是难得的境界。上品白吉馍揉制充分，火候恰到好处。制好的白吉馍形似\"铁圈虎背菊花心\",皮薄松脆，内心软绵。可单独食用，配腊汁肉同食味道更佳。\n" +
            "历史来源:\n" +
            "腊汁肉在战国时称\"寒肉\"。\"寒\"是\"韩\"谬音,指韩国。战国时期韩国位于现在秦晋豫交界地带,所制腊汁肉闻名遐迩。秦灭韩后,\"韩肉\"制法传进长安。做腊汁肉要选用猪上等硬肋肉,加盐,姜,桂皮,丁香,蔻仁,大香等20多种调料煮成。陈汤煨制,较少加水。现在西安最有名的腊汁肉当属樊记腊汁肉,历史已近百年。选肉考究,调料齐全,火候独到,故色泽红润,酥软香醇。食者有“肥肉吃了不腻口,瘦肉无渣满口油,不用牙咬肉自烂,食后余香久不散”的美誉。 " +
            ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shan_xi_rou_jia_mo);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(shan_xi_rou_jia_mo.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
