/***********************************************
 * File Name: GuessNumberGame
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 15:52
 ***********************************************/

package com.javabase.day07.day0703;

import java.util.Random;

public class GuessNumberGame extends GuessGame {
    @Override
    public String suiJi() {
        return String.valueOf(new Random().nextInt(1000));
    }

    @Override
    public void tiShi() {
        System.out.println("已生成一个1000的随机数字");
    }

    @Override
    public String biJiao(String c, String r) {
        int a = Integer.parseInt(c);
        int b = Integer.parseInt(r);
        if(a>b) {
            return "大";
        } else if(a<b) {
            return "小";
        } else {
            return "right";
        }
    }

    @Override
    public boolean caiDui(String j) {
        if ("right".equals(j)){
            return true;
        }
        return false;
    }
}
