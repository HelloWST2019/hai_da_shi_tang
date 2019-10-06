package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class lu_zhu_ti extends AppCompatActivity {
private String[]data={"卤猪蹄是一种美食，主要材料有猪蹄，花生，香料，香菜等，是我国典型的传统熟肉制品，猪蹄营养丰富，含多种胶原蛋白，经常食用，对人体具有养颜、抗衰老的保健作用。加之其具有极佳的适口性和独特的风味，深受大家的喜爱。\n" +
        "营养价值:\n" +
        "猪蹄美味可口、营养丰富，其蛋白质含量很高。据食品营养专家分析，每100克猪蹄中含蛋白质15.8克，脂肪26.3克，碳水化合物1.7克。猪蹄还含有维生素A、B、C及一定量的钙、磷、铁、锌等营养物质，因此具有补血、润滑肌肤、强健腰腿的功效。猪蹄中的蛋白质水解后，所产生的胱氨酸、精氨酸等11种氨基酸的含量均与熊掌不相上下。\n" +
        "1、 猪蹄可延缓皮肤衰老\n" +
        "在人体皮肤组织中，胶原蛋白占到了70%，随着年龄的增加，胶原蛋白不断流失，造成皮肤干燥、出现皱纹。而猪蹄中大量的胶原蛋白可以促进皮肤细胞吸收和贮存水分，使细胞保持湿润状态，延缓皮肤衰老，防止皮肤干瘪起皱；同时增强皮肤的弹性和韧性，使面部皮肤显得丰满光泽。汉代名医张仲景有一个“猪肤方”，就指出猪蹄上的皮有“和血脉，润肌肤”的作用。英国有美容大师观察发现，经常吃猪蹄，能使面部长得匀称、丰满。\n" +
        "2、猪蹄可缓解神经衰弱及失眠\n" +
        "猪蹄中的胶原蛋白由众多的氨基酸组成，而其中每三个氨基酸中就有一个甘氨酸。食入猪蹄后，胶原蛋白在人体小肠中可被转化为大量的甘氨酸，这些氨基酸不仅能在体内参与合成胶原，而且它在大脑细胞中是一种中枢神经抑制性递质，对中枢神经有镇静作用。因此食用猪蹄有利于减轻中枢神经的过度兴奋，对焦虑及神经衰弱、失眠等有改善作用。 [1] \n" +
        "注意事项:\n" +
        "亚硝酸盐是肉制品加工过程中常用的添加剂，可使肉制品中的肌红蛋白与硝酸盐中分解出的一氧化氮结合，生成亚硝基肌红蛋白，出现较鲜红的颜色。亚硝酸盐兼有发色剂及防腐剂的性能，有利于肉类制品长期储存。亚硝酸盐并非人体所必需,摄入过量会使血液中Fe2 +转化为Fe3 + ,使正常血红蛋白转化为高铁血蛋白,失去携氧能力,出现中毒症状。体内的亚硝酸盐与胺类或酰胺类同时存在就可能形成致癌的亚硝基化合物。  "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lu_zhu_ti);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(lu_zhu_ti.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
