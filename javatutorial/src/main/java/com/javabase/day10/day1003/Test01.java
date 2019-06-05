/***********************************************
 * File Name: Test01
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 03 06 2019 11:57
 ***********************************************/

package com.javabase.day10.day1003;

public class Test01 {
    public static void main(String[] args) {
        String s0 = "abcdefghijklmnopqrstuvwxyz";
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        //系统时间毫秒值
        long t = System.currentTimeMillis();
        for(int i=0;i<10000;i++) {
            sb.append(s0);
        }
        t = System.currentTimeMillis()-t;
        System.out.println(t);
    }
}
