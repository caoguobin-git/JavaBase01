/***********************************************
 * File Name: exercise5_12
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 13 06 2019 11:16
 ***********************************************/

package com.programming.chapter5.exercise;


import java.util.Scanner;

public class exercise5_51 {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      String str1=scanner.nextLine();
      String str2=scanner.nextLine();
      int sum=0;
      for (int i=0;i<(str1.length()<str2.length()?str1.length():str2.length());i++){
          if (str1.charAt(i)==str2.charAt(i)){
              sum++;
          }else {
              System.out.println(sum);
              break;
          }
      }
    }
}
