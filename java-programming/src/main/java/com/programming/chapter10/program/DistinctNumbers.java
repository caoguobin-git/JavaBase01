/***********************************************
 * File Name: DistinctNumbers
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 21 06 2019 16:41
 ***********************************************/

package com.programming.chapter10.program;

import java.util.*;

public class DistinctNumbers {
    public static void main(String[] args) {
       String[] array={"red","blue","green"};
       ArrayList<String> list=new ArrayList<>(Arrays.asList(array));
       String[] array1=new String[list.size()];
       list.toArray(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        Collections.shuffle(list);
        System.out.println(list);

        Integer[] array2={3,5,4,8,1,5,1,5,6,74};
        ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(array2));
        System.out.println(list.isEmpty());
    }
}
