package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class zi_bu_niu_rou_dao_xiao_mian extends AppCompatActivity {
private String[]data={"关于刀削面有一个古老的传说：蒙古族人入主中原后，建立元朝。为防止汉人造反起义，他们将家家户户的金属全部没收，并规定10户用厨刀一把，切菜做饭轮流使用，用后再交回蒙古人保管。一天中午，一位老婆婆和好面后，让老汉去取刀，结果刀被别人取走，老汉只好返回。\n" +
        "在出蒙古人的大门时，老汉的脚被一块薄铁皮碰了一下，他顺手捡起来揣在怀里。回家后，锅开得直响，全家人等刀切面条吃，可是刀没取回来，老汉急得团团转，忽然想起怀里的铁皮，就取出来说：就用这个铁皮切面吧！\n" +
        "老婆婆一看，铁皮薄而软，嘟囔着说：“这样软的东西怎能切面条？”老汉气愤地说：“切不动就砍。”“砍”字提醒了老婆。\n" +
        "她把面团放在一块木板上，左手端起，右手持铁片，站在开水锅边“砍”面，一片片面叶落入锅内，煮熟后捞到碗里，浇上卤汁让老汉先吃，老汉边吃边说：“好得很，好得很，以后不用再去取厨刀切面了。”这样一传十，十传百，传遍了晋中大地。\n" +
        "\n"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zi_bu_niu_rou_dao_xiao_mian);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(zi_bu_niu_rou_dao_xiao_mian.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);    }
}
