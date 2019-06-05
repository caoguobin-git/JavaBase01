/***********************************************
 * File Name: Soldier
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 14:48
 ***********************************************/

package com.javabase.day06.day0601;

import java.security.SecureRandom;

public class Soldier {

    static  int count;
    int id;
    int blood=100;
    public Soldier(){
        System.out.println("执行了构造方法！");
        count++;
    }
    public void go(){
        System.out.println(id+"号士兵前进！");
    }
    public void attack(){
        if (blood==0){
//            System.out.println("这是"+id+"号士兵的实体");
            return;
        }
        blood-=new SecureRandom().nextInt(30);
        if (blood<0){
            blood=0;
            System.out.println(id+"号士兵阵亡了");
            count--;
            return;
        }
        System.out.println(id+"号士兵进攻！");
        System.out.println("血量："+blood);
    }
}
