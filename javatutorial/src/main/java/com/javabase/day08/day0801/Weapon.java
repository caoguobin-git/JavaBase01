/***********************************************
 * File Name: Weapon
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 17:40
 ***********************************************/
package com.javabase.day08.day0801;

public interface Weapon {
    int TYPE_COLD=0;
    int TYPE_HOT=1;
    int TYPE_NUCLEAR=2;
    void kill();
    String getName();
    int getType();
}
