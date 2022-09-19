package com.example.fxlesssson2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class FlowPane extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        Label lbl = new Label("Hello");
        Button btn = new Button("Click");

        javafx.scene.layout.FlowPane root = new javafx.scene.layout.FlowPane();
        root.getChildren().addAll(lbl, btn);
        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);

        stage.setTitle("Layout in JavaFX");

        stage.show();
    }
}