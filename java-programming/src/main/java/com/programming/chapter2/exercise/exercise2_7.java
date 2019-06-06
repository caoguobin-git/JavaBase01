/***********************************************
 * File Name: exercise2_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 12:44
 ***********************************************/

package com.programming.chapter2.exercise;

import java.util.Scanner;

public class exercise2_7 {
    public static void main(String[] args) {
        long minute=new Scanner(System.in).nextLong();
        long totalYear=minute/(365*24*60);
        long totalDay=(minute-totalYear*365*24*60)/(24*60);
        System.out.println(totalYear);
        System.out.println(totalDay);
    }
}
