/***********************************************
 * File Name: MaxOfThree
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 12:37
 ***********************************************/

package com.javabase.day02;

public class MaxOfThree {
    public static void main(String[] args) {
        int a = 1;
        int b = 41;
        int c = 35;
        int x = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        System.out.println(x);
    }
}
