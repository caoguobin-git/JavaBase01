/***********************************************
 * File Name: Day0505
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 14:09
 ***********************************************/

package com.javabase.day05;

import java.util.Scanner;

public class Day0505 {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        long result =jisuan(x);
        System.out.println(result);
    }

    private static long jisuan(int x) {
        if (x==1||x==2){
            return 1;
        }
        return jisuan(x-2)+jisuan(x-1);
    }
}
