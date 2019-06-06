/***********************************************
 * File Name: exercise2_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 12:44
 ***********************************************/

package com.programming.chapter2.exercise;

import java.util.Scanner;

public class exercise2_6 {
    public static void main(String[] args) {
        int a =new Scanner(System.in).nextInt();
        int sum=0;
//        String s = String.valueOf(a);
//        for (int i=0;i<s.length();i++){
//            sum+=Integer.parseInt(String.valueOf(s.charAt(i)));
//        }

        while (a>0){
            sum+=a%10;
            a=a/10;
        }
        System.out.println(sum);
    }
}
