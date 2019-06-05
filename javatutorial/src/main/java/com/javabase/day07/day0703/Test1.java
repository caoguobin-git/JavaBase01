/***********************************************
 * File Name: Test1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 16:31
 ***********************************************/

package com.javabase.day07.day0703;

import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        String name =new Scanner(System.in).nextLine();
        String randomC=getRandomCharacter(name,3);
        System.out.println("结果");
        System.out.println(randomC+(100+new SecureRandom().nextInt(900)));
    }

    private static String getRandomCharacter(String name, int x) {
        LinkedList<Character> linkedList=new LinkedList<>();
        StringBuffer result=new StringBuffer();
        for (int i=0;i<name.length();i++){
            linkedList.add(name.charAt(i));
        }
        for (int i=0;i<x;i++){
            result.append(linkedList.remove(new SecureRandom().nextInt(linkedList.size())));
        }
        return result.toString();
    }
}
