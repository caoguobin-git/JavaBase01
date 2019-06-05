/***********************************************
 * File Name: day0401
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 13:12
 ***********************************************/

package com.javabase.day04;

import java.util.Scanner;

public class day0401 {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        boolean result = judge(x);
        if (result){
            System.out.println("Y");
        }else {
            System.out.println("N");
        }
    }

    private static boolean judge(int x) {
        double sqrt = Math.sqrt(x);
        for (int i=2;i<sqrt;i++){
            if (x%i==0){
                return false;
            }
        }
        return true;
    }
}
