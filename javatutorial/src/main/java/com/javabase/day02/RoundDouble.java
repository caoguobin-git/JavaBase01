/***********************************************
 * File Name: RoundDouble
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 12:39
 ***********************************************/

package com.javabase.day02;

import java.util.Scanner;

public class RoundDouble {
    public static void main(String[] args) {
        double x = new Scanner(System.in).nextDouble();
        x=x*1000;
        int a = (int)x;
        System.out.println(a);
        if (a%10>=5){
            a+=(10-a%10);
        }else {
            a-=(a%10);
        }
        System.out.println(a/1000.0);

    }
}
