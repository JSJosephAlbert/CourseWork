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
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/*
Programmer: Joseph
Date: 4/12/20
Instructions: use rgb and opacity sliders to set desired color of the displayed circle
*/

public class Albert_Lab7b1 extends Application {
    private double red = 0;
    private double green = 0;
    private double blue = 0;
    private double opacity = 1;
    
    @Override
    public void start(Stage primaryStage) {
        FlowPane circlePane = new FlowPane();
        Circle circle = new Circle(100);
        circlePane.getChildren().add(circle);
        
        FlowPane sliderPane = new FlowPane();
        BorderPane borderPane = new BorderPane();
        
        Slider slRed = new Slider();
        slRed.setMax(1);
        slRed.setValue(0);
        slRed.valueProperty().addListener(e -> {
            red = slRed.getValue();
            circle.setFill(Color.color(red, green, blue, opacity));
        });
        
        Slider slGreen = new Slider();
        slGreen.setMax(1);
        slGreen.setValue(0);
        slGreen.valueProperty().addListener(e -> {
            green = slGreen.getValue();
            circle.setFill(Color.color(red, green, blue, opacity));
        });
        
        Slider slBlue = new Slider();
        slBlue.setMax(1);
        slBlue.setValue(0);
        slBlue.valueProperty().addListener(e -> {
            blue = slBlue.getValue();
            circle.setFill(Color.color(red, green, blue, opacity));
        });
        
        Slider slOpacity = new Slider();
        slOpacity.setMax(1);
        slOpacity.setValue(1);
        slOpacity.valueProperty().addListener(e -> {
            opacity = slOpacity.getValue();
            circle.setFill(Color.color(red, green, blue, opacity));
        });
        
        
        sliderPane.getChildren().addAll(new Label("Red: "),slRed,
                new Label("Green: "),slGreen,
                new Label("Blue: "),slBlue,
                new Label("Opacity: "),slOpacity);
        
        
        
        borderPane.setCenter(circlePane);
        borderPane.setBottom(sliderPane);
        
        
        Scene scene = new Scene(borderPane, 360, 250);
        
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
