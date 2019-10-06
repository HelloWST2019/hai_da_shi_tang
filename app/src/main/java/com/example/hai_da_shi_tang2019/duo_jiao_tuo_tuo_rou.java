package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class duo_jiao_tuo_tuo_rou extends AppCompatActivity {
private String[]data={"坨坨肉，彝语称“乌色色脚”， 意思是猪肉块块。因其每一块肉的重量均在二三两上下，成“坨”状，故名。是迪庆彝族的主要煮肉形式，将猪肉或羊、牛肉砍好，用冷水煮熟，不下任何佐料，包括盐；肉熟后捞起，再撒蒜水，盐及花椒等即可食用。吃时需用双手拿肉。其味非常鲜美，因煮时不能烂炖，而是看“火候”，“火候”一到即熟，“火候”不到则肉生，“火候”稍过则肉硬，因此，一般人不会做。且要趁热即食；所以，一般情况下不易做此道菜。要有心品尝坨坨肉，一要碰上彝人喜庆节日如火把节（农历6月24日）或办事；二要到宾馆餐厅订做。[1]坨坨肉是小凉山彝族人民吃肉食的基本制作方法。在制作上，不论猪、牛、羊，宰杀后均连骨带肉切成如拳头船大小的块块，用清水煮至八成熟，便捞入簸箕内，撒上盐巴来回簸荡，使盐渗入即可食用。吃时除放盐外，不放任何佐料，也不用碗筷，直接用手取而食之。吃时佐以小凉山土法腌制的一种干酸菜汤（有克油腥的作用），将砣砣肉抓在手上，边啃边嚼，由于这种肉做法特别，又不是很肥，吃起来越嚼越香，越吃越胃口开。坨坨肉制作的诀窍是掌握适当的火候，火候不到不熟，过迟肉绵。彝族制作的坨坨肉，既鲜又香，别有风味，特别是选用四五斤重的仔猪肉制成，更是清脆可口，是他们用来待客的佳品。所以，砣砣肉如今已成为小凉山的一道很有名气的风味菜。彝家人吃肉常以吃大块肉为快。凉山的彝家人都喜欢将牛肉、羊肉、猪肉砍成拳头大上的坨坨块状（彝族人认为肉越大坨代表主人越好客），再用清水煮熟后食用。彝家有这样的饮食习俗，大凡有客人到来，主人须让砧板(指宰杀牛、羊、猪等专用的大菜板)沾血，现杀牲畜待客方为好客的表现。最尊贵的客人来临，以打牛(即杀牛不用刀，以斧背击其头部而毙之，故称为“打牛”)待之为最尊敬，杀羊、猪、鸡等顺序逐步次之。在他们的饮食观念中认为，请客人吃饭，用野生动物肉款待，不为请客招待，只属吃便饭。招待贵客时，打牛宰羊的主人须以牛、羊板(牛、羊肩骨成扇状有许多瘦肉都分)敬赠客人；杀猪者须以半边猪头赠送客人；杀鸡者就餐时以鸡头敬客(当众食之)。客人所得牛、羊板，半边头等可以带回去，也可由客人转赠他人。" +
        "剁椒,又名剁辣子、坛子辣椒、七姊妹剁椒、七星椒剁椒，是以红鲜七姊妹辣椒、食盐等为原料制成的一种可以直接食用的辣椒制品，味辣而鲜咸，口感偏重。\n" +
        "剁辣椒是贵州的特色食品，可出坛即食，也可当作佐料做菜。 一般来说，正宗贵州剁辣椒无水多油，颜色暗红，口感不酸。只有在湘西，尤其是湘西南一带的剁辣椒，才带有当地特色的酸味，因为湘西人既“无辣不欢”，又“无酸不入口”。因此当地的剁辣椒为“酸剁辣椒”。剁椒是贵州、湖南、湖北、四川等地爱吃的一种用辣椒腌制成的咸菜，可直接食用，也可加工成菜品等。可以用灯笼椒（菜辣椒）或朝天椒已成熟变红的辣椒为原料制作，湖南主要盛产的一种小米椒，小米椒就是七姊妹辣椒（也叫小朝天椒），剁碎了以后加盐、大蒜、生姜拌匀，放大缸里腌一段时间，就成了色香味俱全、生物保鲜、不含防腐剂的纯天然绿色食品。" +
        "营养价值:\n" +
        "市场上广受欢迎的剁椒多为张家界的剁辣椒，是采用张家界地区盛产辣椒最有名的沅古坪七姊妹辣椒为主要原料，与蒜头、食用茶油、食盐、花椒等配料，承民间秘方和传统手工艺精制而成的一种可以直接食用的辣椒制品。其富含丰富的蛋白质和多种微量元素，色、香、味俱全，生物保鲜，不含防腐剂，为纯天然绿色食品，有着“辣口不辣心，含火不上火”的美誉。因为其口感好，广受土家人及游人欢迎。在家里做面条时，调上一点剁椒，味道会马上变得鲜美可口。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duo_jiao_tuo_tuo_rou);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(duo_jiao_tuo_tuo_rou.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
