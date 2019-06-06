/***********************************************
 * File Name: exercise2_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 12:44
 ***********************************************/

package com.programming.chapter2.exercise;

import java.util.Scanner;

public class exercise2_13 {
    public static void main(String[] args) {
        double x=new Scanner(System.in).nextDouble();
        double sum=0;
        double rate=1.00417;
        for (int i =0;i<6;i++){
            sum+=x;
            sum*=rate;
        }
        System.out.println(sum);
    }
}
