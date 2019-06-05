/***********************************************
 * File Name: Puppy
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 19 04 2019 16:26
 ***********************************************/

package com.duochuang.javabase.chapter01;

import java.lang.reflect.Constructor;

public class Puppy {
    public Puppy(String name) {
        System.out.println("name="+name);
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Puppy puppy=new Puppy("tommy");
        Class<?> aClass = Class.forName("com.duochuang.javabase.chapter01.Puppy");
    }
}
