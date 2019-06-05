/***********************************************
 * File Name: day0406
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 13:29
 ***********************************************/

package com.javabase.day04;

public class day0406 {
    public static void main(String[] args) {
        int a = 16;
        int b = 24;
        System.out.println(getBig(a, b));
    }

    private static int getBig(int a, int b) {
        int min = a > b ? b : a;
        for (int i = min; i >= 1; i--) {
            if (a%i==0&&b%i==0){
            return i;
            }
        }
        return 1;
    }
}
