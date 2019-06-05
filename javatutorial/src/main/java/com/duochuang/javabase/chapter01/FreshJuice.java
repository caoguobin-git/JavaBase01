/***********************************************
 * File Name: FreshJuice
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 19 04 2019 15:44
 ***********************************************/

package com.duochuang.javabase.chapter01;

public class FreshJuice {
    enum FreshJuiceSize {SMALL, MEDIUM, LARGE}
    FreshJuiceSize size;
}
class FreshJuiceTest{
    public static void main(String[] args) {
        FreshJuice juice=new FreshJuice();
        juice.size= FreshJuice.FreshJuiceSize.LARGE;
    }
}
