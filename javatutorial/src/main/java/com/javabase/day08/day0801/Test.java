/***********************************************
 * File Name: Test
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 31 05 2019 8:54
 ***********************************************/

package com.javabase.day08.day0801;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        long start = new Date().getTime();
        String a ="a";
        a+=a;
        StringBuffer sb=new StringBuffer();
        System.out.println(a);
        for (int i=0;i<100000;i++){
            sb.append("a");
        }
        long end=new Date().getTime();
        System.out.println(end-start);
    }
}
