package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class huang_dou_zhu_jiao extends AppCompatActivity {
private String[]data={"营养价值:\n" +
        "猪蹄：猪蹄对于经常四肢疲乏，腿部抽筋、麻木，消化道出血，失血性休克及缺血性脑病患者一定辅助疗效，它还有助于青少年生长发育和减缓中老年妇女骨质疏松的速度。适宜血虚者食用；适宜年老体弱者食用；适宜产后缺奶者食用；适宜腰脚软弱无力者食用；适宜痈疽疮毒久溃不敛者食用。黄豆：其中的大豆蛋白质和豆固醇能时显地改善和降低血脂和胆固醇，从而降低患心血管疾病的概率。大豆脂肪富含不饱和脂肪酸和大豆磷脂，有保持血管弹性、健脑和防止脂肪肝形成的作用。\n" +
        "猪蹄+黄豆:黄豆膳食纤维中的醛糖酸残基可与猪蹄中的矿物质合成螯合物而干扰或降低人体对这些元素的吸收。\n"+
"营养功效:\n" +
        "美容:\n" +
        "抗衰老 促进生长 改善冠心病\n" +
        "减轻女性更年期综合征症状 防止血管硬化 让头脑聪明 降糖、降脂 美白护肤 预防癌症 降低血脂 增强机体免疫功能\n" +
        "治疗甲状腺低下 利尿消肿 防治富贵病 减少放射性疾病 御寒 抗癌防癌\n" +
        "适宜人群:\n" +
        "动脉硬化和高血压病患者慎食\n" +
        "子宫肌瘤、乳腺癌患者忌食\n" +
        "脾胃虚弱者忌食 "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huang_dou_zhu_jiao);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(huang_dou_zhu_jiao.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
