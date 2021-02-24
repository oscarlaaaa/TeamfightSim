package main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


import calculations.*;

public class App extends Application {
    
    final double SCENE_HEIGHT = 720;
    final double SCENE_WIDTH = 1000;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("TFTUWU by Oscar La");
        

        Button btn = new Button("hello friends");
        
        
        Text text = new Text(20, 20, "aaaa");
        Text text2 = new Text(20, 20, "bbbb");
        Text text3 = new Text(20, 20, "penis");
        Text text4 = new Text(20, 20, "aaaaa");
        Text text5 = new Text(20, 20, "aazzzzaa");
        
        text.setFont(Font.font("verdana", FontWeight.BOLD, 
                FontPosture.REGULAR, 50));
        
        
        StackPane p = new StackPane();
        p.prefHeight(SCENE_HEIGHT);
        p.prefWidth(SCENE_WIDTH);
        p.getChildren().add(Hex.hexField());

        GridPane g = new GridPane();
        GridPane.setMargin(g, (new Insets(10, 10, 10, 10)));
        g.add(p, 3, 2, 2, 2);
        
        Group group = new Group(g);
        
        btn.setText("Start simulation");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Starting combat...");
                Clock time1 = new Clock();
                // starts the incremental program
                time1.gameTime();  
                
            }
        });
        
        Scene scene = new Scene(group);
        scene.setOnMousePressed(new EventHandler<MouseEvent>() 
        {
          @Override
          public void handle(MouseEvent event) {
            System.out.println(event.getSceneX());
            System.out.println(event.getSceneY());
          }
        });
        
        primaryStage.setScene(scene);
        primaryStage.setWidth(SCENE_WIDTH);
        primaryStage.setHeight(SCENE_HEIGHT);
        
        primaryStage.show();
        
    }
}

        


