/***********************************************
 * File Name: Test
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 15:29
 ***********************************************/

package com.javabase.day07.day0701;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("选择宠物：");
        System.out.println("1. 猫");
        System.out.println("2. 狗");
        System.out.print("选择：");
        int c = new Scanner(System.in).nextInt();
        if(c != 1 && c != 2) {
            return;
        }

        System.out.print("宠物的名字：");
        String n = new Scanner(System.in).nextLine();
        Pet pet;
        if(c == 1) {
            pet = new Cat(n);
            play(pet);
        } else {
            pet = new Dog(n);
            play(pet);
        }

    }

    private static void play(Pet pet) {


        while(true) {
            //按回车继续
            new Scanner(System.in).nextLine();
            double d = Math.random();//[0,1)
            if(d<0.333) {
                pet.feed();
            } else if(d<0.666) {
                pet.play();
            } else {
                pet.punish();
            }
        }
    }
}
