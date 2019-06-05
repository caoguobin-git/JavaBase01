/***********************************************
 * File Name: Dog
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 15:28
 ***********************************************/

package com.javabase.day07.day0701;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    public Dog(String name, int full, int happy) {
        super(name, full, happy);
    }

    @Override
    public String cry() {
        return "bark~~~~";
    }


}
