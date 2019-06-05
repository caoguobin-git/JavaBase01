/***********************************************
 * File Name: GuessLetterGame
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 15:54
 ***********************************************/

package com.javabase.day07.day0703;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class GuessLetterGame extends GuessGame {
    @Override
    public String suiJi() {
        Character[] a=getSuiji();
        StringBuffer stringBuffer=new StringBuffer();
        for (Character character : a) {
            stringBuffer.append(character);
        }
        System.out.println(stringBuffer);
        return stringBuffer.toString();
    }

    private Character[] getSuiji() {
        Character[] result=new Character[5];
        LinkedList<Character> linkedList=new LinkedList<>();
        for (int i=0;i<26;i++){
            linkedList.add((char) ('A'+i));
        }
        for (int i=0;i<5;i++){
            result[i]=linkedList.remove(new SecureRandom().nextInt(linkedList.size()));
        }
        return result;
    }

    @Override
    public void tiShi() {
        System.out.println("已经生成了五个不重复的大写字母，请作答");
    }

    @Override
    public String biJiao(String c, String r) {
        if (c.length()!=5){
            System.out.println("wrong param");
            return null;
        }
        Map<Character,Integer> result=new HashMap<>();
        result.put('A',0);
        result.put('B',0);
        char[] input = c.toUpperCase().toCharArray();
        String random=r.toUpperCase();
        for (int i=0;i<random.length();i++){
            if (random.contains(String.valueOf(input[i])) && (i == random.indexOf(input[i]))){
                result.put('A', result.get('A')+1);
            }
            if (random.contains(String.valueOf(input[i])) && (i != random.indexOf(input[i]))){
                result.put('B', result.get('B')+1);
            }
        }
        if ("5A0B".equals(result.get('A')+"A"+result.get('B')+"B")){
            System.out.println("恭喜你猜对了");
        }

        return result.get('A')+"A"+result.get('B')+"B";
    }

    @Override
    public boolean caiDui(String j) {
        if ("5A0B".equals(j)){
            return true;
        }
        return false;
    }
}
