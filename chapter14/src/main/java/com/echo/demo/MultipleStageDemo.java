package com.echo.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * 显示两个舞台
 */
public class MultipleStageDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(new Button("OK"), 200, 250);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage stage = new Stage();
        Scene scene1 = new Scene(new Button("New stage"), 100, 100);
        stage.setTitle("Second stage");
        stage.setScene(scene1);
        stage.show();
    }
}
