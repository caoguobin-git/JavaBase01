/***********************************************
 * File Name: exercise2_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 12:44
 ***********************************************/

package com.programming.chapter2.exercise;

import java.util.Scanner;

public class exercise2_17 {
    public static void main(String[] args) {

        /*

        C= 35.74 + 0.6215ta-35.75v0.16+0.4275/y

        * */
        Scanner input=new Scanner(System.in);
        double temp=input.nextDouble();
        int wind=input.nextInt();
        double result =35.74+0.6215*temp-35.75*Math.pow(wind, 0.16)+0.4275*temp*Math.pow(wind, 0.16);
        System.out.println(result);
    }
}
