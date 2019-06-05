/***********************************************
 * File Name: StatementBatch
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 04 06 2019 14:28
 ***********************************************/

package com.javaweb.day02.day0201;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Enumeration;
import java.util.Random;
import java.util.ResourceBundle;

public class StatementBatch {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://39.106.33.181:3306/Test", "root", "root");
        connection.setAutoCommit(false);

        PreparedStatement preparedStatement = connection.prepareStatement("insert into user values (null,?,?)");
        for (int i=0;i<10;i++){
            preparedStatement.setString(1, String.valueOf(new Random().nextDouble()));
            preparedStatement.setString(2, String.valueOf(new Random().nextDouble()));
            preparedStatement.addBatch();
        }
        preparedStatement.executeBatch();
        connection.commit();
        preparedStatement.close();
        connection.close();

    }
}
