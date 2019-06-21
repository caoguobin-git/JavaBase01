/***********************************************
 * File Name: Program6_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 20 06 2019 9:53
 ***********************************************/

package com.programming.chapter6.program;

public class Program6_1 {
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i, j);
        System.out.println(k);
    }

    private static int max(int i, int j) {
        return i > j ? i : j;
    }
}
