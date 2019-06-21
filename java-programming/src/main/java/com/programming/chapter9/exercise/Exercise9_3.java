/***********************************************
 * File Name: Exercise9_3
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 21 06 2019 9:35
 ***********************************************/

package com.programming.chapter9.exercise;

import java.util.Date;

public class Exercise9_3 {
    public static void main(String[] args) {
        Date date=new Date(1000);
        System.out.println(date.toString());
        date.setTime(10000);
        System.out.println(date.toString());
        date.setTime(100000);
        System.out.println(date.toString());
        date.setTime(1000000);
        System.out.println(date.toString());
        date.setTime(10000000);
        System.out.println(date.toString());
        date.setTime(100000000);
        System.out.println(date.toString());
        date.setTime(100000000000L);
        System.out.println(date.toString());
    }
}
