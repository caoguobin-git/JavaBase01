/***********************************************
 * File Name: Exercise9_3
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 21 06 2019 9:35
 ***********************************************/

package com.programming.chapter9.exercise;

import java.util.Date;
import java.util.Random;

public class Exercise9_4 {
    public static void main(String[] args) {
        Random random=new Random(1000);
        int control=0;
        for (int i=0;i<50;i++){
            System.out.printf("%3d",random.nextInt(100));
            control++;
            if (control%10==0) {
                System.out.println();
            }
        }
    }
}
