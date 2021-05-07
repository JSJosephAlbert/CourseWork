/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/*
programmer: joseph
date: 3/22/20
description: displays an empty 10x10 board of button and a 10x10 board with 
randomly selected 0s or 1s
*/
public class albert_lab5a extends Application {

    @Override
    public void start(Stage stage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        int count = 0;
        while (count < 10) {
            for (int i = 0; i < 10; i++) {
                pane.add(new Button("  "), count, i + 1);   
            }
            count++;
        }

        pane.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(pane);

        stage.setScene(scene);
        
        stage.show();
        
        
        GridPane pane2 = new GridPane();
        pane2.setAlignment(Pos.CENTER);
        int count2 = 0;
        while (count2 < 10) {
            for (int i = 0; i < 10; i++) {
                int random = (int)(Math.random() * 2);
                String s = String.valueOf(random);
                pane2.add(new Button("" + s), count2, i + 1);   
            }
            count2++;
        }
         pane2.setPadding(new Insets(10, 10, 10, 10));

        Scene scene2 = new Scene(pane2);

        Stage stage2 = new Stage(); 
        stage2.setScene(scene2);
        stage2.show();
        
    } 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
