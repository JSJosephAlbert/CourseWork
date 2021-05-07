/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/*
Programmer: Joesph
Date: 4/5/20
Description: Simple calculator that can compute operations of addition subtraction
multiplication and division on two numbers. Most of this code is a modified version of the calculator 
from the video posted in the video notes posted on the course content. I tried 
to make this a night mode calc, but it just looks ugly now.
Instructions: Enter the two numbers you would like to do math on, then click the
button for the operation you would like to perform.
 */
public class albert_lab5b extends Application {

    @Override
    public void start(Stage primaryStage) {
        FlowPane pane = new FlowPane();
        pane.setHgap(3);

        TextField text1 = new TextField();
        text1.setStyle("-fx-background-color: LightBlue");
        TextField text2 = new TextField();
        text2.setStyle("-fx-background-color: LightBlue");
        TextField result = new TextField();
        result.setStyle("-fx-background-color: LightBlue");

        text1.setPrefColumnCount(3);
        text2.setPrefColumnCount(3);
        result.setPrefColumnCount(6);

        pane.getChildren().addAll(new Label("Number 1: "), text1,
                new Label("Number 2: "), text2,
                new Label("Result: "), result);

        HBox hBox = new HBox(5);

        Button btAdd = new Button("Add");
        btAdd.setStyle("-fx-background-color: LightBlue");

        Button btSub = new Button("Subtract");
        btSub.setStyle("-fx-background-color: LightBlue");

        Button btMult = new Button("Multiply");
        btMult.setStyle("-fx-background-color: LightBlue");

        Button btDiv = new Button("Divide");
        btDiv.setStyle("-fx-background-color: LightBlue");

        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(btAdd, btSub, btMult, btDiv);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(hBox);
        borderPane.setStyle("-fx-background-color: Grey");

        Scene scene = new Scene(borderPane, 250, 150);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();

        try {
            btAdd.setOnAction(e -> {
                result.setText(Double.parseDouble(text1.getText())
                        + Double.parseDouble(text2.getText()) + " ");
            });
            btSub.setOnAction(e -> {
                result.setText(Double.parseDouble(text1.getText())
                        - Double.parseDouble(text2.getText()) + " ");
            });
            btMult.setOnAction(e -> {
                result.setText(Double.parseDouble(text1.getText())
                        * Double.parseDouble(text2.getText()) + " ");
            });
            btDiv.setOnAction(e -> {
                result.setText(Double.parseDouble(text1.getText())
                        / Double.parseDouble(text2.getText()) + " ");
            });
        }
        //Doesn't work. I'm not really sure why.
        catch (java.lang.NumberFormatException ex) {
            Alert errorAlert = new Alert(AlertType.ERROR);
            errorAlert.setHeaderText("Input not valid");
            errorAlert.setContentText("Input must be a numeral");
            errorAlert.showAndWait();
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
