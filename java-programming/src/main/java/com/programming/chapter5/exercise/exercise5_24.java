/***********************************************
 * File Name: exercise5_12
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 13 06 2019 11:16
 ***********************************************/

package com.programming.chapter5.exercise;


public class exercise5_24 {
    public static void main(String[] args) {
       double sum=0;
       for (int i=1;i<=97;i+=2){
           sum+=(double) i/(i+2);
       }
        System.out.println(sum);
    }
}
