/***********************************************
 * File Name: Nuclear
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 17:45
 ***********************************************/

package com.javabase.day08.day0801;

public class Nuclear implements Weapon {
    @Override
    public void kill() {
        System.out.println("hong~~~~~~~~~~");
    }

    @Override
    public String getName() {
        return "核武器";
    }

    @Override
    public int getType() {
        return Weapon.TYPE_NUCLEAR;
    }
}
