/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogame1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/*
Programmer: Joseph
Date: 4/26/20
Instructions: click the first "bubble" to start game and click the "bubbles"
 */
public class BubblePop extends Application {

    public int bubbles = (int) ((Math.random() * 20) + 5);
    public int score;
    public int i = 1;
    public int health = 4;
    public boolean click = false;

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        //sets initial circle pos
        Label start = new Label("Start");
        start.setLayoutX(110);
        start.setLayoutY(90);
        start.setStyle("-fx-font: 24 arial;");
        
        Circle circle = new Circle(140, 135, 20);
        pane.getChildren().addAll(circle,start);

        //score label
        Label scoreLabel = new Label("Score: " + score);
        scoreLabel.setLayoutX(5);
        scoreLabel.setLayoutY(20);
        pane.getChildren().add(scoreLabel);

        //health label
        Label healthLabel = new Label("Health: ❤❤❤");
        healthLabel.setLayoutX(5);
        healthLabel.setLayoutY(5);
        pane.getChildren().add(healthLabel);

        pane.setOnMouseClicked(e -> {
            pane.getChildren().remove(start);
            circle.setOnMouseClicked(e2 -> {
                if (i < bubbles) {
                    i++;

                } //win state
                else {
                    pane.getChildren().remove(circle);
                    score *= health;
                    scoreLabel.setText("Score: " + score);
                    Label win = new Label("You Win!");
                    win.setStyle("-fx-font: 24 arial;");
                    win.setLayoutX(100);
                    win.setLayoutY(120);
                    pane.getChildren().add(win);
                }
                health++;
                score += 100;
                scoreLabel.setText("Score: " + score);
            });
            //randomizes circle pos radius and color
            circle.setCenterX(Math.random() * 275);
            circle.setCenterY(Math.random() * 225);
            circle.setRadius((Math.random() * 30) + 5);
            circle.setFill(Color.color(Math.random(), Math.random(), Math.random()));

            health--;
            if (health == 2) {
                healthLabel.setText("Health: ❤❤");
            } else if (health == 1) {
                healthLabel.setText("Health: ❤");
            } //loss state
            else if (health < 1) {
                healthLabel.setText("Health: ");
                pane.getChildren().remove(circle);
                Label lose = new Label("You Lose...");
                lose.setStyle("-fx-font: 24 arial;");
                lose.setLayoutX(100);
                lose.setLayoutY(120);
                pane.getChildren().add(lose);
            }

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
