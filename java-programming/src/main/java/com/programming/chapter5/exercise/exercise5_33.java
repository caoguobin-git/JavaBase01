/***********************************************
 * File Name: exercise5_12
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 13 06 2019 11:16
 ***********************************************/

package com.programming.chapter5.exercise;


public class exercise5_33 {
    public static void main(String[] args) {
        for (int i = 1; i < 10000; i++) {
            if (judge(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean judge(int x) {
        int sum = 0;
        for (int i = 1; i < x; i++) {
            sum += x % i == 0 ? i : 0;
        }
        return sum == x;
    }

}
