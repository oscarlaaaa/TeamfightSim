package main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import calculations.*;
import champions.*;

//public class App extends Application {
//    
//    public static void main(String[] args) {
//        launch(args);
//    }
//    
//    @Override
//    public void start(Stage primaryStage) {
//        primaryStage.setTitle("Hello World!");
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
// 
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
//        
//        StackPane root = new StackPane();
//        root.getChildren().add(btn);
//        primaryStage.setScene(new Scene(root, 300, 250));
//        primaryStage.show();
//        
public class App {
    
    public static void main(String[] args) {
        

        
        Clock time1 = new Clock();
        time1.gameTime();
    }
    
    public void createProto() {
        Champion champ1 = new Champion("Tien Tran", 500, 500, 100);
        Champion champ2 = new Champion("Clsoccer101", 1000, 200, 200);
    }
}

