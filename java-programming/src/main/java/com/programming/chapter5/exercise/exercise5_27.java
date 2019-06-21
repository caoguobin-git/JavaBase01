/***********************************************
 * File Name: exercise5_12
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 13 06 2019 11:16
 ***********************************************/

package com.programming.chapter5.exercise;


public class exercise5_27 {
    public static void main(String[] args) {
        int sum = 0;
        int control = 0;
        for (int i = 101; i <= 2100; i++) {

            if (judge(i)) {
                if (control % 10 == 0) {
                    System.out.println();
                }
                System.out.printf("%6d",i);
                control++;
                sum++;
            }
        }
        System.out.println();
        System.out.println(sum);
    }

    private static boolean judge(int i) {
        if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
            return true;
        }
        return false;
    }
}
