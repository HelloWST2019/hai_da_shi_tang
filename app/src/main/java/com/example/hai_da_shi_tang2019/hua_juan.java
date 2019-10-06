package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hua_juan extends AppCompatActivity {
private String[]data={"花卷是和包子、馒头类似的面食。是一种古老的中国面食，经典很家常的主食，可以做成椒盐、麻酱、葱油等各种口味。营养丰富，味道鲜美，做法简单。将面制成薄片拌好作料后卷成半球状，蒸熟即可。\n" +
        "相传三国时期，蜀国丞相诸葛亮率兵攻打南蛮，七擒七纵蛮将孟获，使孟获终于臣服。诸葛亮班师回朝，途中必须经过泸水。\n" +
        "军队车马准备渡江时，突然狂风大作，浪击千尺，鬼哭狼嚎，大军无法渡江。此时诸葛亮召来孟获问明原因。原来，两军交战，阵亡将士无法返回故里与家人团聚，故在此江上兴风作浪，阻挠众将士回程。大军若要渡江，必须用49颗蛮军的人头祭江，方可风平浪静。\n" +
        "诸葛亮心想：两军交战死伤难免，岂能再杀49条人命？他想到这儿，遂生一计，即命厨子以米面为皮，内包黑牛白羊之肉，捏塑出49颗人头。然后，陈设香案，洒酒祭江。\n" +
        "从此，在民间既有了“馒头”一说，诸葛亮也被尊奉为面塑行的祖师爷。明代郎瑛在其笔记《七修类稿》中记载：“馒头本名蛮头，蛮地以人头祭神，诸葛之征孟获，命以面包肉为人头以祭，谓之‘蛮头’，今讹而为馒头也。”\n" +
        "诸葛亮创始的馒头，毕竟里面加上了牛羊肉馅，工序复杂且花费较多。于是，后人便将做馅的工序省去，就成了馒头。而有馅的，则成为包子，捏有很多褶皱像花开一样的，就起名为“花卷”\n" +
        "营养价值:\n" +
        "面粉营养物质：主要是淀粉，其次还有蛋白质、脂肪、维生素、矿物质等。\n" +
        "面粉营养分析：面粉富含蛋白质、碳水化合物、维生素和钙、铁、磷、钾、镁等矿物质，有养心益肾、健脾厚肠、除热止渴的功效。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hua_juan);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(hua_juan.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
