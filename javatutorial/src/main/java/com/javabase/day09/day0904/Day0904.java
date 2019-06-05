/***********************************************
 * File Name: Day0904
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 31 05 2019 9:00
 ***********************************************/

package com.javabase.day09.day0904;

import java.util.Scanner;

public class Day0904 {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        String a =new Scanner(System.in).nextLine();
        if (judge(a)){
            System.out.println("是！");
        }else {
            System.out.println("不是！");
        }

    }

    private static boolean judge(String a) {
        for (int i=0,j=a.length()-1;i<=j;i++,j--){
            if (a.charAt(i)!=a.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
