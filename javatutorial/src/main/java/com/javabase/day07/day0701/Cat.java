/***********************************************
 * File Name: Cat
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 15:26
 ***********************************************/

package com.javabase.day07.day0701;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    public Cat(String name, int full, int happy) {
        super(name, full, happy);
    }

    @Override
    public String cry() {
        return "miu~~";
    }
}
