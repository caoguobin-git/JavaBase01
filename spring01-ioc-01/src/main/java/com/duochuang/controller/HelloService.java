/***********************************************
 * File Name: HelloService
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 05 06 2019 13:51
 ***********************************************/

package com.duochuang.controller;
/*spring入门测试*/
public class HelloService {
    public void hello(String msg){
        System.out.println(msg);
    }

    public void born(){
        System.out.println("i'm born");
    }

    public void destory(){
        System.out.println("I'm destroyed");
    }
}
