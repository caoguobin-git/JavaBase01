/***********************************************
 * File Name: TestBooleanOperators
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 16:14
 ***********************************************/

package com.programming.chapter3.program;

import java.util.Scanner;

public class TestBooleanOperators {
    public static void main(String[] args) {
        int a;
        Scanner input=new Scanner(System.in);
        while (true){
            a=input.nextInt();
            if (a%2==0&&a%3==0){
                System.out.println(a+"能被2和3整除！");
            }
            if (a%2==0||a%3==0){
                System.out.println(a+"能被2或3整除！");
            }
            if (a%2==0^a%3==0){
                System.out.println(a+"只能被2或3中的一个整除！");
            }
        }
    }
}
