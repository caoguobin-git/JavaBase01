/***********************************************
 * File Name: Exercise7_23
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 20 06 2019 16:38
 ***********************************************/

package com.programming.chapter7.exercise;


import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise7_35 {

    public static void main(String[] args) {
        String[] words={"word","program","thinking"};
        String word="program";
        Set set=new HashSet();
       int wrongTime= guessWord(word,set);
        disPlayWord(word, set);
        System.out.println(wrongTime);

    }

    private static int guessWord(String word, Set set) {
        int wrongTime=0;
        Scanner scanner=new Scanner(System.in);
        while (!judge(word,set)){
            disPlayWord(word, set);
            char charInput=scanner.nextLine().charAt(0);
            if (set.contains(charInput)){
                System.out.println(charInput+" all ready in the word!");
                continue;
            }
            if (judgeInput(word,charInput)){
                set.add(charInput);
            }else {
                wrongTime++;
            }
        }
        return wrongTime;
    }

    private static boolean judgeInput(String word, char charInput) {
        boolean result=false;
        for (int i=0;i<word.length();i++){
            if (word.charAt(i)==charInput){
                result=true;
            }
        }
        return result;
    }

    private static boolean judge(String word, Set set) {
        boolean result=true;
        for (int i=0;i<word.length();i++){
            if (!set.contains(word.charAt(i))){
                result=false;
            }
        }
        return result;
    }

    private static void disPlayWord(String word, Set set) {
        for (int i=0;i<word.length();i++){
            if (set.contains(word.charAt(i))){
                System.out.print(word.charAt(i));
            }else {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
