/***********************************************
 * File Name: JieCheng
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 12:44
 ***********************************************/

package com.javabase.day03;

import java.math.BigDecimal;
import java.util.Scanner;

public class JieCheng {
    public static void main(String[] args) {
        long x = new Scanner(System.in).nextInt();
        BigDecimal a=new BigDecimal(x);
        BigDecimal result=jisuan(a);
        System.out.println(result);
    }

    private static BigDecimal jisuan(BigDecimal x) {
        if (x.compareTo(BigDecimal.valueOf(0))==0||x.compareTo(BigDecimal.valueOf(1))==0){
            return BigDecimal.valueOf(1);
        }
        return jisuan(x.subtract(BigDecimal.valueOf(1))).multiply(x);

    }
}
