/***********************************************
 * File Name: OrderTwoCities
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 13 06 2019 9:35
 ***********************************************/

package com.programming.chapter4.program;

import java.util.Scanner;

public class OrderTwoCities {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first city:");
        String city1=scanner.nextLine();
        System.out.println("Enter the second city:");
        String city2=scanner.nextLine();
        if (city1.compareToIgnoreCase(city2)<0){
            System.out.println(city1);
            System.out.println(city2);
        }else {
            System.out.println(city2);
            System.out.println(city1);
        }
    }
}
