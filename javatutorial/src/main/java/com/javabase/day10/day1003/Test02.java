/***********************************************
 * File Name: Test02
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 03 06 2019 16:42
 ***********************************************/

package com.javabase.day10.day1003;


public class Test02 {
    public static void main(String[] args){
        String a ="asdsdfasdf";
        StringBuilder sb=new StringBuilder();
        long startTime=System.currentTimeMillis();
        for (int i=0;i<10000000;i++){
            sb.append(a);
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
