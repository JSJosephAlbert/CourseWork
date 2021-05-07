/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
Programmer: Joseph
Date: 4/12/20
Instructions: Enter rectangle size and position and click "create" to display them. 
*/
public class Albert_Lab7b2 extends Application {

    private double x1;
    private double y1;
    private double h1;
    private double w1;
    private double x2;
    private double y2;
    private double h2;
    private double w2;

    @Override
    public void start(Stage primaryStage) {
        FlowPane textPane = new FlowPane();
        Pane rectPane = new Pane();
        BorderPane pane = new BorderPane();

        TextField xPos1 = new TextField();
        TextField yPos1 = new TextField();
        TextField xPos2 = new TextField();
        TextField yPos2 = new TextField();
        TextField height1 = new TextField();
        TextField width1 = new TextField();
        TextField height2 = new TextField();
        TextField width2 = new TextField();
        Button btCreate = new Button("Create");
        

        textPane.getChildren().addAll(new Label(" X Position 1: "), xPos1,
                new Label(" Y Position 1: "), yPos1,new Label(" X Position 2: "), xPos2,
                new Label(" Y Position 2: "), yPos2 , new Label(" Height 1: "),
                height1, new Label(" Width 1: "), width1,new Label(" Height 2: "),
                height2, new Label(" Width 2: "), width2, btCreate);
        

        btCreate.setOnAction(e -> {
            
           x1 = Double.parseDouble(xPos1.getText());
           y1 = Double.parseDouble(yPos1.getText());
           h1 = Double.parseDouble(height1.getText());
           w1 = Double.parseDouble(width1.getText());
           x2 = Double.parseDouble(xPos2.getText());
           y2 = Double.parseDouble(yPos2.getText());
           h2 = Double.parseDouble(height2.getText());
           w2 = Double.parseDouble(width2.getText());
           
           Rectangle rect1 = new Rectangle(x1,y1,w1,h1);
           rect1.setFill(Color.RED);
           Rectangle rect2 = new Rectangle(x2,y2,w2,h2);
           rect2.setFill(Color.BLUE);
           
           if(rect1.intersects(rect2.getLayoutBounds())){
               Alert alert = new Alert(Alert.AlertType.INFORMATION);
               alert.setContentText("Rectangles Intersect");
               alert.show();
           }
           
           rectPane.getChildren().addAll(rect1,rect2);
           
        });
        pane.setCenter(rectPane);
        pane.setBottom(textPane);
        Scene scene = new Scene(pane, 450, 500);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
