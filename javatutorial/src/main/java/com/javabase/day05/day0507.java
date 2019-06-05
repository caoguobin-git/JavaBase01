/***********************************************
 * File Name: day0507
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 14:27
 ***********************************************/

package com.javabase.day05;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Arrays;

public class day0507 {
    public static void main(String[] args) {
        int[] a = getArray(5000);
        int[] b = getArray(10000);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        int[] result = guibing(a, b);
        System.out.println(Arrays.toString(result));
    }

    private static int[] guibing(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0, j = 0,k=0; k<result.length;k++ ) {
            if (i>=a.length){
                System.arraycopy(b, j, result, k, result.length-k);
                break;
            }
            if (j>=b.length){
                System.arraycopy(a, i, result, k, result.length-k);
                break;
            }
            if (a[i]<b[j]){
                result[k]=a[i];
                i++;
            }else{
                result[k]=b[j];
                j++;
            }

        }
        return result;
    }

    private static int[] getArray(int i) {
        int[] result = new int[i];
        for (int j = 0; j < i; j++) {
            result[j] = new SecureRandom().nextInt(10000);
        }
        Arrays.sort(result);
        return result;
    }
}
