/***********************************************
 * File Name: exercise5_12
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 13 06 2019 11:16
 ***********************************************/

package com.programming.chapter5.exercise;


import java.util.Scanner;

public class exercise5_41 {
    public static void main(String[] args) {
        int sum=0;
        int max=-1;
        int input;
        Scanner scanner=new Scanner(System.in);
        while ((input=scanner.nextInt())!=0){
            if (input>max){
                max=input;
                sum=1;
            }else if (input==max){
                sum++;
            }
        }
        System.out.println(max);
        System.out.println(sum);
    }
}
