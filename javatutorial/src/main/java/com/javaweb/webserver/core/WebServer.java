/***********************************************
 * File Name: SebServer
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 04 06 2019 14:59
 ***********************************************/

package com.javaweb.webserver.core;

import com.javabase.day15.day1503.Server;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebServer {
    private ServerSocket server;
    private final int port = 8666;
    private ExecutorService threadPool;

    public WebServer() {
        try {
            server = new ServerSocket(port);
            threadPool= Executors.newFixedThreadPool(100);
            System.out.println("服务器已启动，监听端口:" + port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {

        try {
            while (true) {
                Socket socket = server.accept();
                threadPool.execute(new ClientHandler(socket));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        WebServer server = new WebServer();
        server.start();
    }
}
