/***********************************************
 * File Name: exercise5_12
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 13 06 2019 11:16
 ***********************************************/

package com.programming.chapter5.exercise;


public class exercise5_40 {
    public static void main(String[] args) {
        int sum1=0;
        int sum2=0;
        for (int i=0;i<1000000;i++){
            if (Math.random()<0.5){
                sum1++;
            }else {
                sum2++;
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
