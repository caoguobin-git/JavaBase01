/***********************************************
 * File Name: ListenerTest
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 05 06 2019 9:49
 ***********************************************/

package com.javaweb.webserver.http;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerTest {
    public static void main(String[] args) {
        /* 需求: 运行程序弹出一个窗口, 窗口中有一个
         * 按钮, 点击按钮可以在控制台打印
         * "Hello Listener!" */
        //1.创建一个窗口
        JFrame frame = new JFrame();
        //2.设置窗口的大小
        frame.setSize(250, 200);
        //3.设置窗口的位置
        frame.setLocation(350, 270);
        //5.创建一个按钮, 将按钮添加到窗口中
        JButton btn = new JButton("别点我~!");
        frame.add(btn);
        //6.创建一个监听器
        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello Listener!");
            }
        };
        ActionListener actionListener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e);
            }
        };
        //7.注册监听(将监听器添加到按钮上,监听按钮)
        btn.addActionListener(listener);
        btn.addActionListener(actionListener);
        /* 在将监听器注册到按钮上之后, 监听器就会一直
         * 监听着按钮, 直到按钮被点击了, 产生了"按钮被
         * 点击"事件, 就会立即通知监听器, 监听器就会
         * 立即调用指定的方法来处理该事件. */
        //4.将窗口设置为显示状态
        frame.setVisible(true);
    }
}
