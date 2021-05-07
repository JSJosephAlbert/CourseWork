/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/*
Programmer: Joesph
Date: 4/5/20
Description: Displays three random heiroglyphs.
Instructions: Start app. Click refresh to display three differnt glyphs.
 */
public class albert_lab5a extends Application {

    private Pane pane = new HBox(10);

    @Override
    public void start(Stage primaryStage) {

        pane.setPadding(new Insets(5, 5, 5, 5));
        for (int i = 0; i < 3; i++) {
            Image image = new Image("pics/" + (int) (Math.random() * 60) + ".png");
            pane.getChildren().add(new ImageView(image));
        }

        Button btRefresh = new Button("Refresh");
        btRefresh.setOnAction(e -> refresh());
        pane.getChildren().add(0, btRefresh);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowImage");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void refresh() {
        pane.getChildren().remove(1, 3);
        //If the 2 in this loop header is changed to 3 you will be sent into a
        //confused depression. 
        for (int i = 0; i < 2; i++) {
            try{
            Image image = new Image("pics/" + (int) (Math.random() * 60) + ".png");
            pane.getChildren().add(new ImageView(image));}
            catch(Exception ex){
                
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
