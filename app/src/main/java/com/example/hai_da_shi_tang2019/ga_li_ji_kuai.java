package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ga_li_ji_kuai extends AppCompatActivity {
private String[]data={"咖喱（也写作咖哩）是由多种香料调配而成的酱料，常见于印度菜、泰国菜和日本菜等菜系，一般伴随肉类和饭一起吃。咖哩是一种多样变作及特殊地调过味的菜肴，最有名的是印度和泰国的咖喱烹饪方法，咖哩已经在亚太地区成为主流的菜肴之一。除了茶以外，咖哩是少数的真正泛亚的菜肴或饮料。印度口味是以混合各方的风格而做出含有异国风情菜肴而闻名的咖喱菜谱\n" +
        "营养价值:\n" +
        "营养分析:\n" +
        "1.咖喱的主要成分是姜黄粉、川花椒、八角、胡椒、桂皮、丁香和芫荽籽等含有辣味的香料，能促进唾液和胃液的分泌，增加胃肠蠕动，增进食欲；\n" +
        "2.咖喱能促进血液循环，达到发汗的目的；\n" +
        "3. 美国癌症研究协会指出，咖喱所含的姜黄素具有激活肝细胞并抑制癌细胞的功能；\n" +
        "4.咖喱还具有协助伤口愈合、预防老年痴呆症的作用；\n" +
        "5.咖喱可以改善便秘，有益于肠道健康。\n" +
        "防癌作用:\n" +
        "咖喱在东南亚及南亚诸多国家的食谱中是不可或缺的作料。美国研究人员又发现咖喱的新用途——可以防癌。\n" +
        "美国芝加哥洛约拉大学医学中心的研究人员发现，咖喱中含有一种姜黄色素的化学物质，可以阻止癌细胞增殖，对预防癌症、特别是白血病效果明显。另外，姜黄色素还可以消除吸烟和加工食品对身体产生的有害作用。研究还发现，咖喱中含的其他成分孜然芹和胡荽等都对心脏有益。 [4] \n" +
        "美国科学家的新近研究显示，由咖喱原料高度提纯而成的姜黄素，可调节炎症因子、肿瘤转移因子、生长因子、蛋白激酶、癌蛋白等数十个靶点，逆转肿瘤进程。利用姜黄素可能实现天然靶向抗癌药物的突破，大大降低靶向药物治疗费用。 [5] \n" +
        "美国亚利桑那大学医学院教授苏尼尔·派博士介绍说,癌症是细胞信号通道调节异常而引起的细胞无限制增殖疾病。调节异常的信号通道分子可以作为抗癌药物的特征标靶,这被称为靶向治疗。超过90%的癌症患者死亡是因恶性肿瘤转移到重要器官引起的,但很多基因工程靶向药物由于作用靶点较单一,仍将目标锁定在原发肿瘤的靶点上,癌细胞往往很快出现耐药性,有时靶向药物所引起的毒副作用甚至比肿瘤本身更大。 [6] \n" +
        "派教授称，在临床治疗中已将姜黄素应用于1000多例癌症患者，这些患者多为手术、放化疗等传统治疗效果不佳，或传统治疗后肿瘤复发、转移的患者，包括胰腺癌、肠癌、肺癌、乳腺癌、肝癌患者等。采用姜黄素与营养饮食支持、心理干预、家庭支持系统建设等结合的方式治疗，患者病情可以逆转。 [5] \n" +
        "预防痴呆\n" +
        "据杜克大学的动物试验显示咖喱中的姜黄素可以使实验鼠大脑中的淀粉样蛋白分解，还能预防这种蛋白的生成。而大脑中大量淀粉样蛋白的沉积正是老年痴呆的主因，则每星期吃1—3次咖喱可预防老年痴呆。\n" +
        "养生功效:\n" +
        "一、增进食欲：咖喱的主要成分是姜黄粉、川花椒、八角、胡椒、桂皮、丁香和芫荽籽等含有辣味的香料，能促进唾液和胃液的分泌，增加胃肠蠕动，增进食欲。\n" +
        "二、促进发汗：咖喱能促进血液循环，达到发汗、祛湿的目的。\n" +
        "三、抗癌：美国癌症研究协会指出，咖喱所含的姜黄素具有激活肝细胞并抑制癌细胞的功能。\n" +
        "四、促进伤口愈合：咖喱还具有协助伤口愈合、预防老年痴呆症的作用。\n" +
        "五、改善便秘：咖喱可以改善便秘，有益于肠道健康。 [7] \n" +
        "六、体内消毒：大部分香辛料与胃液中的酸液共同结合后具有消毒、灭菌的效果。\n" +
        "七、活血止痛：咖喱中的姜黄具有行气、活血、止痛的作用，对风湿肩臂酸痛、胸肋疼痛、妇女经痛等有很好的疗效。\n" +
        "八、预防老年痴呆：意大利及美国的科学家发现，吃咖喱有助防止老人痴呆症，因为咖喱油中的姜黄能防止老化及刺激酵素的活动，防止脑部退化。\n" +
        "九、降低餐后胰岛素反应：研究论文证实咖喱可以帮助降低餐后胰岛素反应。\n" +
        "十、预防肥胖：咖喱能促进能量代谢，使人消耗更多的热量，促进脂肪氧化，从而有利于预防肥胖。\n" +
        "适宜人群:\n" +
        "一般人群均可食用咖喱。\n" +
        "胃炎、溃疡病患者少吃。\n" +
        "鸡肉中医价值：\n" +
        "中医认为，鸡肉味甘，性微温。能温中补脾，益气养血，补肾益精。\n" +
        "蜜酱鸡腿------天然肉石\n" +
        "蜜酱鸡腿------天然肉石\n" +
        "鸡肉含有维生素C、E等，蛋白质的含量比例较高，种类多，而且消化率高，很容易被人体吸收利用，有增强体力、强壮身体的作用，另外含有对人体生长发育有重要作用的磷脂类，是中国人膳食结构中脂肪和磷脂的重要来源之一。鸡肉对营养不良、畏寒怕冷、乏力疲劳、月经不调、贫血、虚弱等有很好的食疗作用。祖国医学认为，鸡肉有温中益气、补虚填精、健脾胃、活血脉、强筋骨的功效。\n" +
        "鸡的品种很多，但作为美容食品，以乌鸡为佳。其性味甘温，含有蛋白质、脂肪、硫胺素、核黄素、尼克酸、维生素A，维生素C、胆甾醇、钙、磷、铁等多种成分。\n" +
        "乌鸡入肾经，具有温中益气、补肾填精、养血乌发、滋润肌肤的作" +
        "用。凡虚劳羸瘦、面瘦、面色无华、水肿消渴、产后血虚乳少者，可将之作食疗滋补之品。鸡肝性味甘微温，能养血补肝，凡血虚目暗、夜盲翳障者可多食之。另外能养心安神、滋阴润肤。若脱发过多，或遗精、白带过多，可用鸡蛋二只，加首乌同煮食之。鸡肉能让秀发亮起来，每周至少应该吃3次。蛋黄油具有清热解毒，收敛生肌的作用。外擦患处可治疗婴儿湿疹，乳头皲裂、冻疮溃烂、水火烫伤、口腔溃疡等症。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ga_li_ji_kuai);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(ga_li_ji_kuai.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter); }
}
