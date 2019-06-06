/***********************************************
 * File Name: exercise1_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 10:32
 ***********************************************/

package com.programming.chapter1.exercise;

import java.util.Scanner;

public class exercise1_7 {
    public static void main(String[] args) {
        int length=new Scanner(System.in).nextInt();
        int x=1;
        double result=0;
        for (int i=0,j=1;i<length;i++,j+=2){
            result+=(x*1.0/j);
            x=-x;
        }
        System.out.println(result*4);

    }
}
