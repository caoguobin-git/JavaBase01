/***********************************************
 * File Name: ShowCircle
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 24 06 2019 16:24
 ***********************************************/

package com.programming.chapter14.program;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle=new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.BLUE);

        Pane pane=new Pane();
        pane.getChildren().add(circle);
        Scene scene=new Scene(pane,200,200);
        primaryStage.setTitle("Show Circle");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
