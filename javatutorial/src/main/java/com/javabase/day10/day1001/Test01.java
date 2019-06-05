/***********************************************
 * File Name: Test01
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 03 06 2019 11:37
 ***********************************************/

package com.javabase.day10.day1001;

import java.util.LinkedList;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String input = scanner.nextLine();
        System.out.println("请输入要查找的子串：");
        String child = scanner.nextLine();
        LinkedList<Integer> result = find(input, child);
        System.out.println(result);
    }

    private static LinkedList<Integer> find(String input, String child) {
        LinkedList linkedList = new LinkedList();
        int index=0;
        while (true){
            index=input.indexOf(child,index);
            if (index==-1){
                break;
            }
            linkedList.add(index);
            index++;
        }
        return linkedList;
    }
}
