/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import static javafx.scene.input.KeyCode.UP;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/*
Programmer: Joseph
Date: 4/12/20
Instructions: Press and hold arrow key to draw in the direction of the 
corresponding arrow key 
*/

public class Albert_Lab7a2 extends Application {

    double bX = 150;
    double bY = 150;
    double eX = 150;
    double eY = 150;
    double segment = 2;

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Line line = new Line(bX, bY, eX, eY);
        line.setStrokeWidth(2);
        line.setStroke(Color.RED);
        pane.getChildren().add(line);

        line.setOnKeyPressed(e -> {
            if (e.getCode().isArrowKey()) {
                switch (e.getCode()) {

                    case DOWN:
                        bY += segment;
                        eY = bY;
                        Line line2 = new Line(bX, bY, eX, eY);
                        line2.setStrokeWidth(2);
                        line2.setStroke(Color.GREEN);
                        pane.getChildren().add(line2);
                        break;

                    case UP:
                        bY -= segment;
                        eY = bY;
                        Line line3 = new Line(bX, bY, eX, eY);
                        line3.setStrokeWidth(2);
                        line3.setStroke(Color.GREEN);
                        pane.getChildren().add(line3);
                        break;

                    case LEFT:
                        bX -= segment;
                        eX = bX;
                        Line line4 = new Line(bX, bY, eX, eY);
                        line4.setStrokeWidth(2);
                        line4.setStroke(Color.GREEN);
                        pane.getChildren().add(line4);
                        break;

                    case RIGHT:
                        bX += segment;
                        eX = bX;
                        Line line5 = new Line(bX, bY, eX, eY);
                        line5.setStrokeWidth(2);
                        line5.setStroke(Color.GREEN);
                        pane.getChildren().add(line5);
                        break;

                    default:

                        break;
                }
            }
        });

        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
        line.requestFocus();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
