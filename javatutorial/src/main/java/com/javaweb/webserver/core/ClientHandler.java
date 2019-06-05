/***********************************************
 * File Name: ClientHandler
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 04 06 2019 15:15
 ***********************************************/

package com.javaweb.webserver.core;

import java.io.*;
import java.net.Socket;
import java.util.Date;

public class ClientHandler implements Runnable {
    private Socket socket;
    private InputStream inputStream;
    private OutputStream outputStream;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = bufferedReader.readLine();
            String fileName=line.split(" ")[1];
            File file=new File("E:\\workspace\\idea\\JavaBase\\javatutorial\\src\\main\\webapp\\WEB-INF\\pages\\html\\"+fileName);
            byte[] buff=new byte[(int) file.length()];
            //抽取响应代码
            PrintStream ps =
                    new PrintStream(
                            socket.getOutputStream());
            //拼接状态行
            ps.println("HTTP/1.1 200 OK");
            //拼接响应头，响应类型：网页
            ps.println("Content-Type:text/html");
            //拼接响应头，响应数据的长度
            String data = new Date().toLocaleString();
            ps.println("Content-Length:" + file.length());
            //空白行
            ps.println();
            //真要显示的数据
            BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
            bis.read(buff);
            ps.write(buff);
            ps.flush();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
