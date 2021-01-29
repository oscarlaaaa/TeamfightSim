package main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import calculations.*;


public class App extends Application {
    
    public static void main(String[] args) {
        launch(args);

        }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("TFTUWU by Oscar La");
        Button btn = new Button();
        Text text = new Text(20, 20, "aaaa");
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
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        root.getChildren().add(text);
        StackPane.setAlignment(text, Pos.TOP_CENTER);
        primaryStage.setScene(new Scene(root, 1000, 700));
        primaryStage.show();
    }
}
        


