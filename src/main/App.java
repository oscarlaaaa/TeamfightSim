package main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
import javafx.geometry.Pos;


import calculations.*;

public class App extends Application {
    
    double SCENE_HEIGHT = 720;
    double SCENE_WIDTH = 1280;
    
    public static void main(String[] args) {
        launch(args);

        }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("TFTUWU by Oscar La");
        

        Button btn = new Button("hello friends");
        
        
        Text text = new Text(20, 20, "aaaa");
        text.setFont(Font.font("verdana", FontWeight.BOLD, 
                FontPosture.REGULAR, 50));
        
        StackPane p = new StackPane();

        StackPane.setAlignment(hexBackground(), Pos.TOP_CENTER);
        //StackPane.setAlignment(btn, Pos.BOTTOM_CENTER);
        //StackPane.setAlignment(text, Pos.TOP_CENTER);
        
        //p.setPrefSize(SCENE_WIDTH, SCENE_HEIGHT);
        p.getChildren().add(hexBackground());
        //p.getChildren().add(text);
        //p.getChildren().add(btn);

        
        
        Group group = new Group(p);
        
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
        
        
        primaryStage.setScene(scene);
        primaryStage.setWidth(SCENE_WIDTH);
        primaryStage.setHeight(SCENE_HEIGHT);
        
        primaryStage.show();
        
        
    }
    
    private Group hexBackground() {
        Group group = new Group();
        
        for (double i=0; i<7; i++) {
            for (int n=0; n<8; n++) {
                if (n % 2 == 0) {
                group.getChildren().add(createCircle(i, n, Color.BLUE));
                } else {
                group.getChildren().add(createCircle(i+0.5, n, Color.GREEN));
                }
            }
        }
        
        Line centerLine = new Line(0, 175, 400, 175);
        group.getChildren().add(centerLine);
        
        return group; 
    }
    
    private Circle createCircle(double x, int y, Color c) {
        Circle a = new Circle((x * 50), (y * 50), 25, c);
        return a;
    }
}

        


