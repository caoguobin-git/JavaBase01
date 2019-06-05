/***********************************************
 * File Name: Server
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 04 06 2019 12:28
 ***********************************************/

package com.javabase.day15.day1503;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8895);
        System.out.println("服务器在8080端口启动");
        Socket socket = serverSocket.accept();
        System.out.println("客户端已连接");
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        for (int i=0;i<5;i++){
            char c= (char) is.read();
            System.out.println(c);
        }
        os.write("hello".getBytes());
        os.flush();
        os.close();
        is.close();
        socket.close();
        serverSocket.close();

    }
}
