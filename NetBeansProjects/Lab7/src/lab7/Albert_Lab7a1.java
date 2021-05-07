/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/*
Programmer: Joseph
Date: 4/12/20
Instructions: Left click to add circle, right click to remove circle. 
*/

public class Albert_Lab7a1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        pane.setOnMouseClicked(e -> {
            Circle circle = new Circle(e.getX(), e.getY(), 10);
            if (e.getButton() == MouseButton.PRIMARY) {
                pane.getChildren().add(circle);
            }
            circle.setOnMouseClicked(e2 -> {
                if (e2.getButton() == MouseButton.SECONDARY) {
                    pane.getChildren().remove(circle);
                }
            });

        });

        Scene scene = new Scene(pane, 300, 250);

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
