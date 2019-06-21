/***********************************************
 * File Name: Test
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 21 06 2019 11:37
 ***********************************************/

package com.programming.chapter10.program;

import java.math.BigInteger;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String a = new Scanner(System.in).nextLine();
        StringBuilder sb=new StringBuilder(a);
        System.out.println(sb.capacity());
    }
}
