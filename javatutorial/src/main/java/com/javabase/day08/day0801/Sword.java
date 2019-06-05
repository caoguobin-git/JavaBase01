/***********************************************
 * File Name: Sword
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 17:42
 ***********************************************/

package com.javabase.day08.day0801;

public class Sword implements Weapon {
    @Override
    public void kill() {
        System.out.println("耍🗡");
    }

    @Override
    public String getName() {
        return "倚天剑";
    }

    @Override
    public int getType() {
        return Weapon.TYPE_COLD;
    }
}
