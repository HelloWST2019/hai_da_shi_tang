package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hong_shao_pai_gu_guo_zai extends AppCompatActivity {
    private String[]data={"锅仔:\n" +
            "一种菜品，颇似于砂锅，类似于火锅，但有不同于火锅，火锅要用底汤，锅仔却讲究原汁原味，一般不加多的涮料，味道比较专一。\n"+
    "排骨，指猪、牛、羊等动物剔肉后剩下的肋骨和脊椎骨，上面还附有少量肉类，可以食用，如：红烧排骨，是一道中国家常菜。\n" +
            "一般来说，只要我们提到排骨，指的都是猪排骨。猪排骨味道鲜美，也不会太过油腻。猪排骨除含蛋白质、脂肪、维生素外，还含有大量磷酸钙、骨胶原、骨粘蛋白等，可为幼儿和老人提供钙质。\n" +
            "小排——小排是指猪腹腔靠近肚腩部分的排骨，它的上边是肋排和子排，小排的肉层比较厚，并带有白色软骨。适合蒸、炸、烤，但是要剁小块。\n" +
            "子排——子排是指腹腔连接背脊的部位，它的下方是五花肉，片下的排骨长达30厘米，呈三角形斜切片状。子排的肉层很厚，隔着一层薄油还连了一块五花肉，油脂丰厚，肉质是所有排骨中最嫩的，适用于多种烹调方法和口味，只是口感略显油腻。适合炸、烤、红烧，长度以5～7厘米为宜。\n" +
            "大排——大排是里脊肉和背脊肉连接的部位，又称为肉排，多用于油炸，以肉片为主，但是带着排骨，除了增加分量让肉片面积显得更大外，油炸的时候也会增加大骨特有的香气，这也是炸肉排的特色。除了油炸，也可以卤大排，但是卤之前要经过煎或快速油炸的程序，作用是封住大骨的血水，免得烹调过程流出，影响肉片和汤汗的色泽。适合炸、卤，如果炸要切薄一点，如果卤要厚一点。\n" +
            "肋排——肋排是胸腔的片状排骨，肉层比较薄，肉质比较瘦，口感比较嫩，但是因为有一侧连接背脊，所以骨头会比较粗。由于肋排比较大，所以一些店家会把它分割成腔骨、子排等，让顾客选购。例如片状的烤肋排，就是选用中段的嫩排。剁小块后挑出肉层较厚的部分可以用来蒸、炸、红烧，大片的适合烤"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hong_shao_pai_gu_guo_zai);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(hong_shao_pai_gu_guo_zai.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
