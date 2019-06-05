/***********************************************
 * File Name: ChickenRabbit
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 13:00
 ***********************************************/

package com.javabase.day03;

public class ChickenRabbit {
    public static void main(String[] args) {
        for (int i=0,j=35;i<=35;i++,j--){
            if ((i*2+j*4)==94){
                System.out.println(i+"   "+j);
            }
        }
    }
}
