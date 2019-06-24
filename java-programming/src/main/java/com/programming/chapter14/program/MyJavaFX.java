/***********************************************
 * File Name: MyJavaFX
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 24 06 2019 15:57
 ***********************************************/

package com.programming.chapter14.program;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX  extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btOK=new Button("OK");
        Scene scene=new Scene(btOK,200,250);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
