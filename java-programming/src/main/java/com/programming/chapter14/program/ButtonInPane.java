/***********************************************
 * File Name: ButtonInPane
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 24 06 2019 16:22
 ***********************************************/

package com.programming.chapter14.program;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane stackPane=new StackPane();
        stackPane.getChildren().add(new Button("OK"));
        Scene scene=new Scene(stackPane,200,50);
        primaryStage.setTitle("Button in pane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
