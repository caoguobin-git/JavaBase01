/***********************************************
 * File Name: exercise5_12
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 13 06 2019 11:16
 ***********************************************/

package com.programming.chapter5.exercise;


public class exercise5_23 {
    public static void main(String[] args) {
        final int a=50000;
        double sum1=0;
        double sum2=0;
        for (int i=1;i<=a;i++){
            sum1+=1.0/i;
        }
        for (int i=a;i>=1;i--){
            sum2+=1.0/i;
        }
        System.out.println(sum1);
        System.out.println(sum2);

    }
}
