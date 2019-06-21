/***********************************************
 * File Name: LargeFactorial
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 21 06 2019 11:43
 ***********************************************/

package com.programming.chapter10.program;

import java.math.BigInteger;

public class LargeFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(500000));
    }

    private static BigInteger factorial(int x) {
        BigInteger result=BigInteger.ONE;
        for (int i=1;i<=x;i++){
            result=result.multiply(new BigInteger(i+""));
        }
        return result;
    }
}
