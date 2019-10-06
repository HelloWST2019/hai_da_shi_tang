package com.example.hai_da_shi_tang2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class shitangxinxi extends AppCompatActivity {
    private String[] data = {"清真米饭", "清真面", "清真早餐", "海天苑蛋包饭", "海天苑铁板烧", "海天苑石锅拌饭", "海天苑麻辣香锅", "海天苑扒饭", "海天苑肉菜", "皮蛋瘦肉粥", "海天苑火腿炒饭", "牛肉粉丝汤", "海天苑小吃", "山东水饺", "黄焖鸡", "重庆小面", "港式米粉", "烧腊卤水套餐", "双拼饭", "小吃"};
    private List<food> foodList = new ArrayList<>();
    private void initFoods(){
        food mi = new food("清真米饭","mi");
        food mian = new food("清真面","mian");
        food zao = new food("清真早餐","zao");
        food dan = new food("海天苑蛋包饭","dan");
        food tie = new food("海天苑铁板烧","tie");
        food shi = new food("海天苑石锅拌饭","shi");
        food ma = new food("海天苑麻辣香锅","ma");
        food ba = new food("海天苑扒饭","ba");
        food rou = new food("西施秘制盖浇饭","rou");
        food pi = new food("皮蛋瘦肉粥","pi");
        food huo = new food("海天苑火腿炒饭","huo");
        food niu = new food("牛肉粉丝汤","niu");
        food xiao = new food("海天苑小吃","xiao");
        food shan = new food("山东水饺","shan");
        food haung = new food("黄焖鸡","haung");
        food chong = new food("重庆小面","chong");
        food guang = new food("港式米粉","guang");
        food shao = new food("烧腊卤水套餐","shao");
        food shuang = new food("双拼饭","shuang");
        food xiao2 = new food("小吃","xiaoer");
        foodList.add(mi);
        foodList.add(mian);
        foodList.add(zao);
        foodList.add(dan);
        foodList.add(tie);
        foodList.add(shi);
        foodList.add(ma);
        foodList.add(ba);
        foodList.add(rou);
        foodList.add(pi);
        foodList.add(huo);
        foodList.add(niu);
        foodList.add(xiao);
        foodList.add(shan);
        foodList.add(haung);
        foodList.add(chong);
        foodList.add(guang);
        foodList.add(shao);
        foodList.add(shuang);
        foodList.add(xiao2);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shitangxinxi);
        initFoods();
        foodAdapter adapter = new foodAdapter(shitangxinxi.this,R.layout.food_item,foodList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                food fo=foodList.get(i);
                Intent intent=new Intent();
                switch(fo.getNicheng()){
                case "mi":intent.setClass(shitangxinxi.this,mifan.class);
                break;
                    case "mian":intent.setClass(shitangxinxi.this,mian.class);
                    break;
                    case "zao":intent.setClass(shitangxinxi.this,zaocan.class);
                        break;
                    case "dan":intent.setClass(shitangxinxi.this,danbao.class);
                    break;
                    case "tie":intent.setClass(shitangxinxi.this,tieban.class);
                        break;
                    case "shi":intent.setClass(shitangxinxi.this,shiguo.class);
                        break;
                    case "niu":intent.setClass(shitangxinxi.this,niurou.class);
                    break;
                    case "ma":intent.setClass(shitangxinxi.this,mala.class);
                        break;
                    case "ba":intent.setClass(shitangxinxi.this,bafan.class);
                        break;
                    case "rou":intent.setClass(shitangxinxi.this,roucai.class);
                        break;
                    case "pi":intent.setClass(shitangxinxi.this,pidan.class);
                        break;
                    case "huo":intent.setClass(shitangxinxi.this,huotui.class);
                        break;
                    case "xiao":intent.setClass(shitangxinxi.this,xiaochi.class);
                        break;
                    case "shan":intent.setClass(shitangxinxi.this,shuijiao.class);
                        break;
                    case "haung":intent.setClass(shitangxinxi.this,huangmen.class);
                        break;
                    case "chong":intent.setClass(shitangxinxi.this,xiaomian.class);
                        break;
                    case "guang":intent.setClass(shitangxinxi.this,mifen.class);
                        break;
                    case "shao":intent.setClass(shitangxinxi.this,shaola.class);
                        break;
                    case "shuang":intent.setClass(shitangxinxi.this,shuang.class);
                        break;
                    case "xiaoer":intent.setClass(shitangxinxi.this,xiaochier.class);
                        break;

                }
                startActivity(intent);

            }
        });
        }
    }
