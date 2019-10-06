package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class kai_wei_suan_la_fen extends AppCompatActivity {
private String[]data={"开胃：中医分析：\n" +
        "中医认为，脾胃为后天之本，胃主受纳水谷，脾主运化水谷，而饮食、药物的吸收运化，都与脾胃有密切关系，脾胃不好，不仅影响营养吸收和身体健康，而且，还会导致疾病。中医所说的胃不受纳是指胃口不开，胃气闭塞：患者常见食欲不振，消化不良，疲倦无力等脾虚症状：如果此时用补脾之药，虽对症，但会加重胃气闭塞，使病情难以缓解，因此，必先开胃以助受纳。当患者食欲正常，再给予补益之药才能充分吸收利用，恢复健康。导致胃不受纳的原因很多，故开胃的方法也多：常用的主要有芳香开胃和养阴开胃。芳香开胃法用于寒湿秽浊之邪，阻滞胃气所致之证，症见食欲不振，脘闷腹胀，厌油腻饮食，口淡不渴，舌淡苔白且腻。养阴开胃法常用于胃阴不足者，症见不思饮食，胃中嘈杂，口干欲饮，大便干结，舌红．舌中心光无苔。可用洛神花、乌梅等组方为洛乌汤，代茶饮，有开胃、增进食欲、止痛等作用。\n" +
        "酸辣粉起源于四川川西一带，是四川省、重庆市、贵州省等地的传统特色小吃，属于川菜、渝菜、贵州小吃。其特点是麻、辣、鲜、香、酸且油而不腻。 酸辣粉主粉由红薯，红苕，豌豆按比例调和，然后由农家用传统手工漏制而成。酸辣粉源于西南民间，取食材至当地手工制作的红薯粉，味以突出酸辣为主而得名。\n" +
        "菜品特色:\n" +
        "养血驻颜，祛病延年的木耳凉拌酸辣粉。炎热的夏季，吃一碗美味营养的凉拌酸辣粉，那真是一种享受。给大家介绍凉拌木耳酸辣粉的做法。木耳---口感细嫩，味道鲜美，风味特殊，是一种营养丰富的著名食用菌；可素可荤，不但为菜肴大添风采，而且能养血驻颜，祛病延年。"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kai_wei_suan_la_fen);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(kai_wei_suan_la_fen.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
