/***********************************************
 * File Name: Gun
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 17:44
 ***********************************************/

package com.javabase.day08.day0801;

public class Gun implements Weapon {
    @Override
    public void kill() {
        System.out.println("开枪");
    }

    @Override
    public String getName() {
        return "AK47";
    }

    @Override
    public int getType() {
        return Weapon.TYPE_HOT;
    }
}
