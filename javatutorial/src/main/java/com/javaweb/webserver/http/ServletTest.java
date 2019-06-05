/***********************************************
 * File Name: ServletTest
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 05 06 2019 9:17
 ***********************************************/

package com.javaweb.webserver.http;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringEscapeUtils;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.LinkedList;
import java.util.ResourceBundle;

public class ServletTest extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String date =new Date().toLocaleString();
        PrintWriter writer = servletResponse.getWriter();
        writer.println(date);
        writer.flush();

    }

    public static void main(String[] args) {
        ObjectMapper objectMapper=new ObjectMapper();
        ResourceBundle rb=ResourceBundle.getBundle("111");
        String data = rb.getString("data");
        System.out.println(data);
        Object linkedList = null;
        try {
            linkedList = objectMapper.readValue(data, Object.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(linkedList);

    }
}
