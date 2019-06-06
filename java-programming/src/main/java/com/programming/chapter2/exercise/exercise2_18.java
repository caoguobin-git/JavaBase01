/***********************************************
 * File Name: exercise2_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 12:44
 ***********************************************/

package com.programming.chapter2.exercise;

public class exercise2_18 {
    public static void main(String[] args) {
        System.out.println("a\tb\tpow(a,b)");
        for (int i=1;i<=5;i++){
            System.out.println(i+"\t"+(i+1)+"\t"+(int)Math.pow(i, i+1));
        }
    }
}
