/***********************************************
 * File Name: Test001
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 04 06 2019 10:34
 ***********************************************/

package com.javabase.day11.day1104;

import java.util.HashMap;
import java.util.Scanner;

/*字符统计*/
public class Test001 {
    public static void main(String[] args) {
        String a =new Scanner(System.in).nextLine();
        HashMap<Character,Integer>result = countCharacter(a);
        System.out.println(result);
    }

    private static HashMap<Character, Integer> countCharacter(String a) {
        HashMap<Character,Integer> result =new HashMap<>();

        for (int i=0;i<a.length();i++){
            if (result.get(a.charAt(i))==null){
                result.put(a.charAt(i), 1);
            }else {
                result.put(a.charAt(i), result.get(a.charAt(i))+1);
            }
        }
        return result;
    }
}
